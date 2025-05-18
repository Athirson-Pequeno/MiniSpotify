package org.example.service;

import org.example.model.*;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Catalogo catalogo = new Catalogo();
    private static final GerenciarPlaylists gerenciarPlaylists = new GerenciarPlaylists();
    private static final Cadastro cadastro = new Cadastro();
    private static Usuario usuarioLogado = null;

    public static void mostrarMenu() {
        int opcao;

        do {
            System.out.println("\n====== MENU PRINCIPAL ======");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Login");
            System.out.println("3. Criar playlist");
            System.out.println("4. Adicionar mídia à playlist");
            System.out.println("5. Remover mídia da playlist");
            System.out.println("6. Visualizar minhas playlists");
            System.out.println("7. Exibir músicas de uma playlist");
            System.out.println("8. Ver catálogo de mídias");
            System.out.println("9. Pesquisar mídias");
            System.out.println("10. Sair da conta atual");
            System.out.println("0. Fechar programa");

            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> login();
                case 3 -> criarPlaylist();
                case 4 -> adicionarMidiaAPlaylist();
                case 5 -> removerMidiaDaPlaylist();
                case 6 -> visualizarPlaylists();
                case 7 -> exibirMusicasDePlaylist();
                case 8 -> verCatalogo();
                case 9 -> pesquisarMidia();
                case 10-> logout();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Usuario novoUsuario = new Usuario(nome, email);
        cadastro.cadastrarUsuario(novoUsuario);
        usuarioLogado = novoUsuario;
        System.out.println("Usuário cadastrado e logado com sucesso. Bem vindo " + novoUsuario.getNome() + "!");
    }

    private static void login() {

        if(cadastro.getUsuarios().isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
            cadastrarUsuario();
        }

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        usuarioLogado = cadastro.getUsuarios().stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);

        if (usuarioLogado != null) {
            System.out.println("Login realizado com sucesso. Bem-vindo, " + usuarioLogado.getNome() + "!");
        } else {
            System.out.println("Usuário não encontrado.");
            login();
        }
    }

    private static void criarPlaylist() {
        verificarLogin();
        System.out.print("Nome da nova playlist: ");
        String nome = scanner.nextLine();
        gerenciarPlaylists.criarPlaylist(nome, usuarioLogado);
        System.out.println("Playlist criada com sucesso.");
    }

    private static void adicionarMidiaAPlaylist() {
        verificarLogin();

        List<Playlist> minhasPlaylists = gerenciarPlaylists.buscarPlaylistsPorUsuario(usuarioLogado);
        if (minhasPlaylists.isEmpty()) {
            System.out.println("Você não tem playlists.");
            return;
        }

        exibirPlaylists(minhasPlaylists);
        int index = lerInteiro("Escolha o número da playlist: ");
        if (index >= 0 && index < minhasPlaylists.size()) {
            Playlist playlist = minhasPlaylists.get(index);

            List<Midia> midias = catalogo.getMidias().stream().filter(midia -> midia instanceof Musica || midia instanceof Podcast).toList();
            for (int i = 0; i < midias.size(); i++) {
                System.out.println(i + " - " + midias.get(i));
            }

            int midiaIndex = lerInteiro("Escolha o número da mídia para adicionar: ");
            if (midiaIndex >= 0 && midiaIndex < midias.size()) {
                Midia midiaEscolhida = midias.get(midiaIndex);
                if (playlist.addMidiaAPlaylist(midiaEscolhida)) {
                    System.out.println("Mídia adicionada com sucesso.");
                } else {
                    System.out.println("Não foi possível adicionar a mídia.");
                }
            } else {
                System.out.println("Índice de mídia inválido.");
            }
        } else {
            System.out.println("Índice de playlist inválido.");
        }
    }

    private static void removerMidiaDaPlaylist() {
        verificarLogin();

        List<Playlist> minhasPlaylists = gerenciarPlaylists.buscarPlaylistsPorUsuario(usuarioLogado);
        if (minhasPlaylists.isEmpty()) {
            System.out.println("Você não tem playlists.");
            return;
        }

        exibirPlaylists(minhasPlaylists);
        int index = lerInteiro("Escolha o número da playlist: ");
        if (index >= 0 && index < minhasPlaylists.size()) {
            Playlist playlist = minhasPlaylists.get(index);
            playlist.exibirMusicas();

            int midiaIndex = lerInteiro("Escolha o número da mídia para remover: ");
            if (playlist.removeMidiaAPlaylist(midiaIndex)) {
                System.out.println("Mídia removida com sucesso.");
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.println("Índice de playlist inválido.");
        }
    }

    public static String formatarDuracao(int totalSegundos) {
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    private static void visualizarPlaylists() {
        verificarLogin();

        List<Playlist> minhasPlaylists = gerenciarPlaylists.buscarPlaylistsPorUsuario(usuarioLogado);
        if (minhasPlaylists.isEmpty()) {
            System.out.println("Você não tem playlists.");
            return;
        }

        for (Playlist playlist : minhasPlaylists) {
            System.out.println("\nPlaylist: " + playlist.getTitulo());
            System.out.println("Duração total: " + formatarDuracao(playlist.getDuracao()));
        }
    }

    private static void exibirMusicasDePlaylist() {
        verificarLogin();

        List<Playlist> minhasPlaylists = gerenciarPlaylists.buscarPlaylistsPorUsuario(usuarioLogado);
        if (minhasPlaylists.isEmpty()) {
            System.out.println("Você não tem playlists.");
            return;
        }

        exibirPlaylists(minhasPlaylists);
        int index = lerInteiro("Escolha o número da playlist: ");
        if (index >= 0 && index < minhasPlaylists.size()) {
            Playlist playlist = minhasPlaylists.get(index);
            playlist.exibirMusicas();
        } else {
            System.out.println("Índice de playlist inválido.");
        }
    }

    private static void verCatalogo() {
        List<Midia> midias = catalogo.getMidias();
        System.out.println("\n--- Catálogo de Mídias ---");
        for (Midia midia : midias) {
            System.out.println(midia);
        }
    }

    private static void pesquisarMidia() {
        List<Midia> midias = catalogo.getMidias();
        System.out.println("\n--- Escolha uma opção de pesquisa ---");
        System.out.println("1 - Pesquisar por título");
        System.out.println("2 - Pesquisar por artista");
        System.out.println("3 - Pesquisar por gênero");

        int escolha = lerInteiro("Digite sua opção: ");
        switch (escolha) {
            case 1 -> {
                System.out.print("Digite o título: ");
                String nome = scanner.nextLine();
                catalogo.buscarMidiaPorTitulo(nome).forEach(System.out::println);
            }
            case 2 -> {
                System.out.print("Digite o nome do artista: ");
                String nome = scanner.nextLine();
                catalogo.buscarMidiaPorArtista(nome).forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Escolha o gênero:");
                for (int i = 0; i < Genero.values().length; i++) {
                    System.out.println((i + 1) + " - " + Genero.values()[i]);
                }

                int generoIndex = lerInteiro("Número do gênero: ");
                if (generoIndex >= 1 && generoIndex <= Genero.values().length) {
                    Genero genero = Genero.values()[generoIndex - 1];
                    catalogo.buscarMidiaPorGenero(genero).forEach(System.out::println);
                } else {
                    System.out.println("Gênero inválido.");
                }
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void verificarLogin() {
        if (usuarioLogado == null) {
            System.out.println("Você precisa estar logado.");
            login();
        }
    }

    private static void logout() {
        if (usuarioLogado == null) {
            System.out.println("Você não está logado.");
        } else {
            System.out.println("Logout efetuado. Até logo, " + usuarioLogado.getNome() + "!");
            usuarioLogado = null;
        }
    }

    private static void exibirPlaylists(List<Playlist> playlists) {
        for (int i = 0; i < playlists.size(); i++) {
            System.out.println(i + " - " + playlists.get(i).getTitulo());
        }
    }

    private static int lerInteiro(String mensagem) {
        int valor = -1;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensagem);
                valor = Integer.parseInt(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        return valor;
    }
}
