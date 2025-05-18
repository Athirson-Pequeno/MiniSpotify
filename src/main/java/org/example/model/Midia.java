package org.example.model;

import java.util.Objects;

public abstract class Midia {

    private String titulo;
    private String artista;
    private int duracao;

    public Midia(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
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
        return duracao == midia.duracao && Objects.equals(titulo, midia.titulo) && Objects.equals(artista, midia.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, duracao);
    }

    public String formatarDuracao(int totalSegundos) {
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    @Override
    public String toString() {
        String texto = "———————————————————————————————————————————————————————————————————————————————————————————————————————\n"+ "»  "+titulo + " - " + artista + " - " + formatarDuracao(duracao);
        return texto;
    }
}
