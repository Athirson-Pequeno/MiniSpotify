package org.example.service;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogo {
    private List<Midia> midias;

    public Catalogo() {
        midias = new ArrayList<>();
        gerarMusicas();
        gerarPodcasts();
        gerarAudioBooks();
    }

    private void gerarMusicas() {
        midias.add(new Musica("Die with Smile", "Lady Gaga, Bruno Mars", Genero.POP, 210));
        midias.add(new Musica("APT.", "Bruno Mars, ROSÉ", Genero.POP, 195));
        midias.add(new Musica("Espresso", "Sabrina Carpenter", Genero.POP, 180));
        midias.add(new Musica("Flowers", "Miley Cyrus", Genero.POP, 210));
        midias.add(new Musica("Birds of a Feather", "Billie Eilish", Genero.POP, 200));
        midias.add(new Musica("Calm Down", "Selena Gomez, Rema", Genero.POP, 230));
        midias.add(new Musica("Feels Like I'm Falling in Love", "Coldplay", Genero.ROCK, 220));
        midias.add(new Musica("As It Was", "Harry Styles", Genero.POP, 180));
        midias.add(new Musica("Beautiful Things", "Benson Boone", Genero.POP, 210));
        midias.add(new Musica("Water", "Tyla", Genero.POP, 200));
        midias.add(new Musica("Snap (Italian)", "Rosa Linn, Alfa", Genero.POP, 190));
        midias.add(new Musica("Too Sweet", "Hozier", Genero.ROCK, 210));
        midias.add(new Musica("A Bar Song", "Shaboozey", Genero.ROCK, 220));
        midias.add(new Musica("Geedy", "Tate McRae", Genero.POP, 200));
        midias.add(new Musica("Blinding Lights", "The Weeknd", Genero.POP, 210));
        midias.add(new Musica("Move", "Adam Port, Stryv, Malachii, Orso", Genero.POP, 230));
        midias.add(new Musica("Lose Control", "Teddy Swims", Genero.POP, 220));
        midias.add(new Musica("Save Your Tears", "The Weeknd", Genero.POP, 210));
        midias.add(new Musica("Watermelon Sugar", "Harry Styles", Genero.POP, 200));
        midias.add(new Musica("Illusion", "Dua Lipa", Genero.POP, 210));
        midias.add(new Musica("Anna Júlia", "Los Hermanos", Genero.ROCK, 180));
        midias.add(new Musica("Rua Augusta", "Ronnie Cord", Genero.ROCK, 210));
        midias.add(new Musica("A Noite do Meu Bem", "Dolores Duran", Genero.MPB, 200));
        midias.add(new Musica("Você Não Soube Me Amar", "Blitz", Genero.ROCK, 220));
        midias.add(new Musica("Disritmia", "Martinho da Vila", Genero.MPB, 230));
        midias.add(new Musica("Último Desejo", "Aracy de Almeida", Genero.MPB, 210));
        midias.add(new Musica("O Mar", "Dorival Caymmi", Genero.MPB, 240));
        midias.add(new Musica("Casa no Campo", "Elis Regina", Genero.MPB, 250));
        midias.add(new Musica("Tico-Tico no Fubá", "Ademilde Fonseca", Genero.CLASSICA, 180));
        midias.add(new Musica("Felicidade", "Caetano Veloso", Genero.MPB, 200));
        midias.add(new Musica("2001", "Os Mutantes", Genero.ROCK, 210));
        midias.add(new Musica("A Flor e o Espinho", "Nelson Cavaquinho", Genero.MPB, 220));
        midias.add(new Musica("Sá Marina", "Wilson Simonal", Genero.MPB, 230));
        midias.add(new Musica("Meu Mundo e Nada Mais", "Guilherme Arantes", Genero.MPB, 240));
        midias.add(new Musica("Nervos de Aço", "Paulinho da Viola", Genero.MPB, 250));
        midias.add(new Musica("O Barquinho", "Maysa", Genero.MPB, 260));
        midias.add(new Musica("Rosa", "Orlando Silva", Genero.MPB, 270));
        midias.add(new Musica("Ideologia", "Cazuza", Genero.ROCK, 280));
        midias.add(new Musica("Sossego", "Tim Maia", Genero.MPB, 290));
        midias.add(new Musica("Que País é Este", "Legião Urbana", Genero.ROCK, 300));
        midias.add(new Musica("Vapor Barato", "Gal Costa", Genero.MPB, 310));
        midias.add(new Musica("Maracatu Atômico", "Nação Zumbi", Genero.ROCK, 320));
        midias.add(new Musica("Cais", "Milton Nascimento", Genero.MPB, 330));
        midias.add(new Musica("Aquarela do Brasil", "Ary Barroso", Genero.MPB, 340));
        midias.add(new Musica("Eu Sei Que Vou Te Amar", "Tom Jobim", Genero.MPB, 350));
        midias.add(new Musica("Como Uma Onda", "Lulu Santos", Genero.MPB, 360));
        midias.add(new Musica("Hallelujah", "Jeff Buckley", Genero.ROCK, 370));
        midias.add(new Musica("Another Brick in the Wall", "Pink Floyd", Genero.ROCK, 380));
        midias.add(new Musica("Hotel California", "Eagles", Genero.ROCK, 390));
        midias.add(new Musica("Wonderwall", "Oasis", Genero.ROCK, 400));
        midias.add(new Musica("Smells Like Teen Spirit", "Nirvana", Genero.ROCK, 410));
        midias.add(new Musica("Back In Black", "AC/DC", Genero.ROCK, 420));
        midias.add(new Musica("Paint It Black", "The Rolling Stones", Genero.ROCK, 430));
        midias.add(new Musica("Purple Haze", "Jimi Hendrix", Genero.ROCK, 440));
        midias.add(new Musica("Sweet Child O' Mine", "Guns N' Roses", Genero.ROCK, 450));
        midias.add(new Musica("Bohemian Rhapsody", "Queen", Genero.ROCK, 460));
        midias.add(new Musica("We Will Rock You", "Queen", Genero.ROCK, 470));
        midias.add(new Musica("Highway to Hell", "AC/DC", Genero.ROCK, 480));
        midias.add(new Musica("Let It Be", "The Beatles", Genero.ROCK, 490));
        midias.add(new Musica("Hey Jude", "The Beatles", Genero.ROCK, 500));
        midias.add(new Musica("Born to Run", "Bruce Springsteen", Genero.ROCK, 510));
        midias.add(new Musica("The Sound of Silence", "Simon & Garfunkel", Genero.ROCK, 520));
        midias.add(new Musica("Imagine", "John Lennon", Genero.ROCK, 530));
        midias.add(new Musica("All Along the Watchtower", "The Jimi Hendrix Experience", Genero.ROCK, 540));
        midias.add(new Musica("Knocking on Heaven's Door", "Bob Dylan", Genero.ROCK, 550));
        midias.add(new Musica("Viva La Vida", "Coldplay", Genero.ROCK, 560));
        midias.add(new Musica("Rolling in the Deep", "Adele", Genero.POP, 570));
        midias.add(new Musica("Someone Like You", "Adele", Genero.POP, 580));
        midias.add(new Musica("Shape of You", "Ed Sheeran", Genero.POP, 590));
        midias.add(new Musica("Blinding Lights", "The Weeknd", Genero.POP, 600));
        midias.add(new Musica("Uptown Funk", "Mark Ronson ft. Bruno Mars", Genero.POP, 610));
        midias.add(new Musica("Stay", "Justin Bieber & The Kid LAROI", Genero.POP, 620));
        midias.add(new Musica("Levitating", "Dua Lipa", Genero.POP, 630));
        midias.add(new Musica("Don't Start Now", "Dua Lipa", Genero.POP, 640));
        midias.add(new Musica("Save Your Tears", "The Weeknd", Genero.POP, 650));
        midias.add(new Musica("Good 4 U", "Olivia Rodrigo", Genero.POP, 660));
        midias.add(new Musica("Watermelon Sugar", "Harry Styles", Genero.POP, 670));
        midias.add(new Musica("Kiss Me More", "Doja Cat", Genero.POP, 680));
        midias.add(new Musica("Montero (Call Me By Your Name)", "Lil Nas X", Genero.POP, 690));
        midias.add(new Musica("Industry Baby", "Lil Nas X & Jack Harlow", Genero.POP, 700));
        midias.add(new Musica("Bad Habits", "Ed Sheeran", Genero.POP, 710));
        midias.add(new Musica("Peaches", "Justin Bieber ft. Daniel Caesar, Giveon", Genero.POP, 720));
        midias.add(new Musica("Levitating", "Dua Lipa", Genero.POP, 730));
        midias.add(new Musica("The Box", "Roddy Ricch", Genero.POP, 740));
        midias.add(new Musica("Shivers", "Ed Sheeran", Genero.POP, 750));
        midias.add(new Musica("Save Your Tears", "The Weeknd", Genero.POP, 760));
        midias.add(new Musica("Happier", "Ed Sheeran", Genero.POP, 770));
        midias.add(new Musica("Sicko Mode", "Travis Scott", Genero.POP, 780));
        midias.add(new Musica("I Gotta Feeling", "Black Eyed Peas", Genero.POP, 790));
        midias.add(new Musica("Rolling in the Deep", "Adele", Genero.POP, 800));
        midias.add(new Musica("Eye of the Tiger", "Survivor", Genero.ROCK, 810));
        midias.add(new Musica("We Are the Champions", "Queen", Genero.ROCK, 820));
        midias.add(new Musica("Toxic", "Britney Spears", Genero.POP, 830));
        midias.add(new Musica("Hit Me Baby One More Time", "Britney Spears", Genero.POP, 840));
        midias.add(new Musica("Stronger", "Kanye West", Genero.POP, 850));
        midias.add(new Musica("Dynamite", "BTS", Genero.POP, 860));
        midias.add(new Musica("Smooth", "Santana ft. Rob Thomas", Genero.ROCK, 870));
        midias.add(new Musica("Sweet Dreams", "Eurythmics", Genero.POP, 880));
        midias.add(new Musica("Take On Me", "A-ha", Genero.POP, 890));
        midias.add(new Musica("Rolling Stone", "The Rolling Stones", Genero.ROCK, 900));
        midias.add(new Musica("Let It Be", "The Beatles", Genero.ROCK, 910));
        midias.add(new Musica("Knockin' on Heaven's Door", "Bob Dylan", Genero.ROCK, 920));
        midias.add(new Musica("My Heart Will Go On", "Celine Dion", Genero.POP, 930));
        midias.add(new Musica("Total Eclipse of the Heart", "Bonnie Tyler", Genero.POP, 940));
        midias.add(new Musica("I Will Always Love You", "Whitney Houston", Genero.POP, 950));
        midias.add(new Musica("Take Me to Church", "Hozier", Genero.ROCK, 960));
        midias.add(new Musica("Dancing Queen", "ABBA", Genero.POP, 970));
        midias.add(new Musica("Stayin' Alive", "Bee Gees", Genero.POP, 980));
        midias.add(new Musica("Bad Romance", "Lady Gaga", Genero.POP, 990));
        midias.add(new Musica("Funky Town", "Lipps Inc.", Genero.POP, 1000));
        midias.add(new Musica("Bohemian Rhapsody", "Queen", Genero.ROCK, 1010));
        midias.add(new Musica("Like a Prayer", "Madonna", Genero.POP, 1020));
        midias.add(new Musica("I Want to Hold Your Hand", "The Beatles", Genero.ROCK, 1030));
        midias.add(new Musica("Imagine", "John Lennon", Genero.ROCK, 1040));
        midias.add(new Musica("Hey Jude", "The Beatles", Genero.ROCK, 1050));
        midias.add(new Musica("Don't Stop Believin'", "Journey", Genero.ROCK, 1060));
    }

    private void gerarPodcasts() {
        midias.add(new Podcast("Café da Manhã", "Folha de S.Paulo & Nexo Jornal", 1200));
        midias.add(new Podcast("NerdCast", "Jovem Nerd", 3600));
        midias.add(new Podcast("Mamilos", "B9", 2700));
        midias.add(new Podcast("O Assunto", "Globo News", 900));
        midias.add(new Podcast("Projeto Humanos", "Ivan Mizanzuk", 1800));
        midias.add(new Podcast("Xadrez Verbal", "Rabiscando o Mundo", 2400));
        midias.add(new Podcast("AntiCast", "AntiCast Produções", 3600));
        midias.add(new Podcast("SciCast", "Podcast Brasil", 1800));
        midias.add(new Podcast("Dragões de Garagem", "Dragões de Garagem", 2100));
        midias.add(new Podcast("História em Meia Hora", "RdioCast", 2100));
        midias.add(new Podcast("Mano a Mano", "Mano Brown", 3600));
        midias.add(new Podcast("Saia Justa", "GNT", 2700));
        midias.add(new Podcast("Folha Ponto a Ponto", "Folha de S.Paulo", 1200));
        midias.add(new Podcast("O Nome Disso é Mundo", "Sociedade Brasileira de Psicologia", 1500));
        midias.add(new Podcast("RapaduraCast", "RapaduraCast", 3600));
        midias.add(new Podcast("Cultura Pop", "Cultura FM", 1800));
        midias.add(new Podcast("Essa História..., Produzida pela Rádio Novelo", "Rádio Novelo", 2700));
        midias.add(new Podcast("PodSquad", "PodSquad", 3000));
        midias.add(new Podcast("Filhos da Pátria", "PodTV", 1800));
        midias.add(new Podcast("FrankenCast", "Frankenstein Studio", 2400));
        midias.add(new Podcast("Lado B da História", "Lado B", 2100));
        midias.add(new Podcast("Crítica Literária", "Leitura Brasileira", 1500));
        midias.add(new Podcast("Tecnocast", "Tecnoblog", 3600));
        midias.add(new Podcast("Loop Matinal", "Loop Infinito", 900));
        midias.add(new Podcast("Mindcast", "Montsegur Academy", 2700));
        midias.add(new Podcast("PodPah", "PodPah", 4200));
        midias.add(new Podcast("Imagina Juntas", "Dani Noce", 2400));
        midias.add(new Podcast("Confins do Universo", "Confins", 3600));
        midias.add(new Podcast("Boa Noite Internet", "Arte 1", 1800));
        midias.add(new Podcast("Jornada Literária", "Biblioteca Sonora", 2100));
        midias.add(new Podcast("Tô Pensando em", "Portal 66", 2700));
        midias.add(new Podcast("Meu Nome é Boni", "GNT", 3000));
        midias.add(new Podcast("Escriba", "Escriba Studio", 1500));
        midias.add(new Podcast("Turma da Mônica Cast", "Maurício de Sousa Produções", 1800));
        midias.add(new Podcast("Mamilos Jr.", "B9 Kids", 1200));
        midias.add(new Podcast("Beyond The Toys", "Autêntica", 3600));
        midias.add(new Podcast("PodDelas", "Portal Delas", 2400));
        midias.add(new Podcast("Reflexões Noturnas", "Noite & Cia", 2700));
        midias.add(new Podcast("Caixa de Histórias", "Historiamor", 1800));
        midias.add(new Podcast("Ciência Todo Dia", "C2D", 2100));
        midias.add(new Podcast("Sarau Virtual", "Arte Sonora", 3000));
        midias.add(new Podcast("Relendo Clássicos", "Clássicos & Companhia", 2700));
        midias.add(new Podcast("Mind The Product Brasil", "mtpbrasil", 3600));
        midias.add(new Podcast("Grátis & Pago", "Economia Hoje", 2400));
        midias.add(new Podcast("Astronomia pelo Brasil", "Observatório Nacional", 1800));
        midias.add(new Podcast("Editoras Independentes", "Livro Livre", 2100));
        midias.add(new Podcast("Cinema em Crise", "Crítica Cinematográfica BR", 3000));
        midias.add(new Podcast("Teatro Hoje", "Palco & Tela", 1800));
        midias.add(new Podcast("Moda e Sociedade", "Trama Cultural", 2700));
        midias.add(new Podcast("Grandes Planos", "Fotografia BR", 1500));

    }

    private void gerarAudioBooks() {
        midias.add(new AudioBook("O Alquimista", "Paulo Coelho", 28800));
        midias.add(new AudioBook("Grande Sertão: Veredas", "João Guimarães Rosa", 54000));
        midias.add(new AudioBook("Dom Casmurro", "Machado de Assis", 32400));
        midias.add(new AudioBook("Memórias Póstumas de Brás Cubas", "Machado de Assis", 30000));
        midias.add(new AudioBook("Vidas Secas", "Graciliano Ramos", 27600));
        midias.add(new AudioBook("Capitães da Areia", "Jorge Amado", 36000));
        midias.add(new AudioBook("Iracema", "José de Alencar", 25200));
        midias.add(new AudioBook("Os Sertões", "Euclides da Cunha", 60000));
        midias.add(new AudioBook("O Cortiço", "Aluísio Azevedo", 28800));
        midias.add(new AudioBook("Auto da Compadecida", "Ariano Suassuna", 18000));
        midias.add(new AudioBook("A Hora da Estrela", "Clarice Lispector", 19800));
        midias.add(new AudioBook("Felicidade Clandestina", "Clarice Lispector", 16200));
        midias.add(new AudioBook("Ensaio Sobre a Cegueira", "José Saramago", 39600));
        midias.add(new AudioBook("O Primo Basílio", "Eça de Queirós", 33000));
        midias.add(new AudioBook("Senhora", "José de Alencar", 30000));
        midias.add(new AudioBook("A Menina que Roubava Livros", "Markus Zusak", 42000));
        midias.add(new AudioBook("A Arte da Guerra", "Sun Tzu", 14400));
        midias.add(new AudioBook("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 52200));
        midias.add(new AudioBook("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 12600));
        midias.add(new AudioBook("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 32400));
        midias.add(new AudioBook("O Hobbit", "J.R.R. Tolkien", 43200));
        midias.add(new AudioBook("Memórias de um Sargento de Milícias", "Manuel Antônio de Almeida", 19200));
        midias.add(new AudioBook("A Moreninha", "Joaquim Manuel de Macedo", 21000));
        midias.add(new AudioBook("O Guarani", "José de Alencar", 30000));
        midias.add(new AudioBook("O Ateneu", "Raul Pompeia", 28800));
        midias.add(new AudioBook("A Cartomante", "Machado de Assis", 6000));
        midias.add(new AudioBook("O Pagador de Promessas", "Dias Gomes", 24000));
        midias.add(new AudioBook("Chico Rei", "Bernardo Guimarães", 20400));
        midias.add(new AudioBook("O Mágico de Oz", "L. Frank Baum", 25200));
        midias.add(new AudioBook("O Nome da Rosa", "Umberto Eco", 54000));
        midias.add(new AudioBook("Os Lusíadas", "Luís de Camões", 72000));
        midias.add(new AudioBook("Encontro Marcado", "Fernando Sabino", 18000));
        midias.add(new AudioBook("Minha Vida de Solteiro", "Jonathan Littell", 36000));
        midias.add(new AudioBook("A Metamorfose", "Franz Kafka", 10200));
        midias.add(new AudioBook("O Mundo de Sofia", "Jostein Gaarder", 46800));
        midias.add(new AudioBook("Crime e Castigo", "Fiódor Dostoiévski", 60000));
        midias.add(new AudioBook("1984", "George Orwell", 39600));
        midias.add(new AudioBook("Admirável Mundo Novo", "Aldous Huxley", 36000));
        midias.add(new AudioBook("Jane Eyre", "Charlotte Brontë", 54000));
        midias.add(new AudioBook("Romeu e Julieta", "William Shakespeare", 15000));
        midias.add(new AudioBook("O Morro dos Ventos Uivantes", "Emily Brontë", 43200));
        midias.add(new AudioBook("O Conde de Monte Cristo", "Alexandre Dumas", 90000));
        midias.add(new AudioBook("Os Miseráveis", "Victor Hugo", 120000));
        midias.add(new AudioBook("A Cabana", "William P. Young", 39600));
        midias.add(new AudioBook("O Código Da Vinci", "Dan Brown", 43200));
        midias.add(new AudioBook("A Cabana", "William P. Young", 39600));
        midias.add(new AudioBook("Extraordinário", "R.J. Palacio", 20400));
        midias.add(new AudioBook("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 12600));
        midias.add(new AudioBook("A Culpa é das Estrelas", "John Green", 25800));
        midias.add(new AudioBook("O Segredo", "Rhonda Byrne", 19800));
    }

    public List<Midia> getMidias() {
        return midias;
    }

    public void exibirCatalogo() {
        for (Midia midia : midias) {
            System.out.println(midia);
        }
    }

    public List<Midia> buscarMidiaPorTitulo(String titulo) {
        return getMidias().stream().filter(midia -> midia.getTitulo().equalsIgnoreCase(titulo)).collect(Collectors.toList());
    }

    public List<Midia> buscarMidiaPorArtista(String artista) {
        return getMidias().stream().filter(midia -> midia.getArtista().equalsIgnoreCase(artista)).collect(Collectors.toList());
    }

    public List<Midia> buscarMidiaPorGenero(Genero genero) {
        return getMidias().stream()
                .filter(midia ->  midia instanceof Musica)
                .map(midia -> (Musica) midia)
                .filter(midia -> midia.getGenero().equals(genero))
                .collect(Collectors.toList());
    }
}
