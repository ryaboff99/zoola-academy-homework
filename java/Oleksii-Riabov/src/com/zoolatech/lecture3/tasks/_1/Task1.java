package com.zoolatech.lecture3.tasks._1;

/**
 * Design classes that represent an orchestra, musicians and musical instruments
 * (at least 3 different one). Each instrument has a name and a method to print
 * a unique sound of the instrument. Each musician has a name and an associated
 * instrument which he plays. It should be possible to distinguish two musicians.
 * A musician should also have a method which should print his/her name and the
 * name of an instrument. Then it needs to make the instrument sound. It should
 * be possible to add/remove musicians from/to the orchestra. When the add/remove
 * action is performed, the orchestra needs to print the action name + name of
 * the musician. The orchestra should also have a method which commands all
 * musicians to play the music. Inside of the main method, create a couple of
 * instances of all classes and play the music.
 */

public class Task1 {
    public static void main(String[] args) {
        Musician yura = new Musician("Yura", new Instrument("violin", "view-view-view"));
        Musician bogdan = new Musician("Bogdan", new Instrument("cello", "uuw-uuw-uuw"));
        Musician alex = new Musician("Alex", new Instrument("percussion", "bom-bom-tun-tun"));
        Musician edik = new Musician("Edik", new Instrument("vocal", "Wir sind des Geyers schwarzer Haufen..."));

        Orchestra haufen = new Orchestra();
        haufen.add(yura);
        haufen.add(bogdan);
        haufen.add(alex);
        haufen.add(edik);
        System.out.println();

        haufen.play();
        System.out.println();

        haufen.remove(yura);
        haufen.remove(bogdan);
        haufen.remove(alex);
        haufen.remove(edik);
        System.out.println();

        Musician tormentor  = new Musician("Tormentor", new Instrument("electric guitar", "dzhy-dzhy-dzhy"));
        Musician kingOvHell = new Musician("King ov Hell", new Instrument("bass guitar", "pom-pom-pom"));
        Musician erichsen = new Musician("Erichsen", new Instrument("drums", "tu-tu-tic"));
        Musician gaahl = new Musician("Gaahl", new Instrument("harsh vocals", "Go! Tide thy float I am guilt and I am god..."));

        Orchestra gorgoroth = new Orchestra();
        gorgoroth.add(tormentor);
        gorgoroth.add(kingOvHell);
        gorgoroth.add(erichsen);
        gorgoroth.add(gaahl);
        System.out.println();

        gorgoroth.play();
        System.out.println();

        gorgoroth.remove(tormentor);
        gorgoroth.remove(kingOvHell);
        gorgoroth.remove(erichsen);
        gorgoroth.remove(gaahl);
    }
}
