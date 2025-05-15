package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Musica> midias;

    public Catalogo() {
        midias = new ArrayList<>();
        gerarMusicas();
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

    public List<Musica> getMusicas() {
        return midias;
    }

    public void exibirCatalogo() {
        for (Musica midia : midias) {
            System.out.println(midia);
        }
    }
}
