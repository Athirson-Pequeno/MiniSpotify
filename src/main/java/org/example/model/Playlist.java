package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Playlist {

    private List<Midia> midias = new ArrayList<>();
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

    public List<Midia> getMidias() {
        return midias;
    }

    public boolean addMidiaAPlaylist(Midia midia) {
        if (midia instanceof Musica || midia instanceof Podcast) {
            midias.add(midia);
            return true;
        } else {
            System.out.println("Somente músicas e podcasts podem ser adicionados à playlist.");
            return false;
        }
    }

    public boolean removeMidiaAPlaylist(int index) {
        try {
            midias.remove(index);
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean removeMidiaAPlaylist(Midia midia) {
        try {
            midias.remove(midia);
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getDuracao(){
        int duracaoTotal = 0;

        for (Midia media : midias) {
            duracaoTotal+= media.getDuracao();
        }

        return duracaoTotal;
    }

    public void exibirMusicas(){
        for(int i = 0; i < midias.size(); i++){
            System.out.println(i + " - " + midias.get(i));
        }
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "midias=" + midias +
                ", titulo='" + titulo + '\'' +
                ", usuario=" + usuario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Playlist playlist)) return false;
        return Objects.equals(midias, playlist.midias) && Objects.equals(titulo, playlist.titulo) && Objects.equals(usuario, playlist.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(midias, titulo, usuario);
    }

}
