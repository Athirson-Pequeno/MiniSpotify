package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Playlist {

    private List<Midia> midia = new ArrayList<Midia>();
    private String titulo;
    private Usuario usuario;

    public Playlist(String titulo, Usuario usuario) {
        this.titulo = titulo;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Midia> getMidia() {
        return midia;
    }

    public void addMidiaAPlaylist(Midia midia) {
        this.midia.add(midia);
    }

    public void removeMidiaAPlaylist(Midia midia) {
        this.midia.remove(midia);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "midia=" + midia +
                ", titulo='" + titulo + '\'' +
                ", usuario=" + usuario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Playlist playlist)) return false;
        return Objects.equals(midia, playlist.midia) && Objects.equals(titulo, playlist.titulo) && Objects.equals(usuario, playlist.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(midia, titulo, usuario);
    }

    public int getDuracao(){
        int duracaoTotal = 0;

        for (Midia media : midia) {
            duracaoTotal+= media.getDuracao();
        }

        return duracaoTotal;
    }

    public void exibirMusicas(){
        for (Midia media : midia) {
            System.out.println(media);
        }
    }
}
