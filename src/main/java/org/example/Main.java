package org.example;

import org.example.model.Catalogo;
import org.example.model.Playlist;
import org.example.model.Usuario;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Pedro","pe@gmail.com");
        Playlist playlist = new Playlist("Casa", usuario);

        Catalogo catalogo = new Catalogo();

        playlist.addMidiaAPlaylist(catalogo.getMusicas().get(new Random().nextInt(catalogo.getMusicas().size())));
        playlist.addMidiaAPlaylist(catalogo.getMusicas().get(new Random().nextInt(catalogo.getMusicas().size())));
        playlist.addMidiaAPlaylist(catalogo.getMusicas().get(new Random().nextInt(catalogo.getMusicas().size())));
        playlist.addMidiaAPlaylist(catalogo.getMusicas().get(new Random().nextInt(catalogo.getMusicas().size())));
        playlist.addMidiaAPlaylist(catalogo.getMusicas().get(new Random().nextInt(catalogo.getMusicas().size())));
        playlist.addMidiaAPlaylist(catalogo.getMusicas().get(new Random().nextInt(catalogo.getMusicas().size())));


        System.out.println(playlist.getDuracao());

        playlist.exibirMusicas();

    }
}