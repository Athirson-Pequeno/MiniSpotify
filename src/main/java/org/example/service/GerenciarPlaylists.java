package org.example.service;

import org.example.model.Playlist;
import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciarPlaylists {

    private List<Playlist> playlists = new ArrayList<>();

    public void criarPlaylist( String titulo, Usuario usuario) {
        Playlist playlist = new Playlist(titulo, usuario);
        playlists.add(playlist);
    }

    public List<Playlist> buscarPlaylistsPorUsuario(Usuario usuario) {
        return playlists.stream().filter(playlist -> playlist.getUsuario().equals(usuario)).collect(Collectors.toList());
    }
}
