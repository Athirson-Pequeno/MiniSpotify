package org.example.model;

public class Musica extends Midia{

    private Genero genero;
    public Musica(String titulo, String artista, Genero genero, int duracao) {
        super(titulo, artista, duracao);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String formatarDuracao(int totalSegundos) {
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    @Override
    public String toString() {
        return "———————————————————————————————————————————————————————————————————————————————————————————————————————\n"+ "»  "+super.getTitulo() + " - " + super.getArtista() + "\n Duração: " + formatarDuracao(super.getDuracao()) + ", Tipo: " + this.getClass().getSimpleName() + ", Genero: " + this.getGenero();
    }
}
