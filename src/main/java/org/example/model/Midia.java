package org.example.model;

import java.util.Objects;

public abstract class Midia {

    private String titulo;
    private String artista;
    private Genero genero;
    private int duracao;

    public Midia(String titulo, String artista, Genero genero, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Midia midia)) return false;
        return duracao == midia.duracao && Objects.equals(titulo, midia.titulo) && Objects.equals(artista, midia.artista) && genero == midia.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, genero, duracao);
    }

    @Override
    public String toString() {
        return "Midia{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero=" + genero +
                ", duracao=" + duracao +
                '}';
    }
}
