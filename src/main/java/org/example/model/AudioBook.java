package org.example.model;

public class AudioBook extends Midia{
    public AudioBook(String titulo, String artista, int duracao) {
        super(titulo, artista, duracao);
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
        String texto = "———————————————————————————————————————————————————————————————————————————————————————————————————————\n"+ "»  "+super.getTitulo() + " - " + super.getArtista() + "\n Duração: " + formatarDuracao(super.getDuracao()) + " - Tipo: " + this.getClass().getSimpleName();
        return texto;
    }
}
