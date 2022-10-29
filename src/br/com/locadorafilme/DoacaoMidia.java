package br.com.locadorafilme;

import java.util.Random;

public class DoacaoMidia {
    public static void main(String[] args) {

        Midia midia = pegarMidiaAleatoria();
        midia.darPlay();

    }

    public static void assistirFilme(Dvd dvd) {
        dvd.legenda(dvd.getPossuiLegenda(), dvd.getIdioma());
        dvd.legenda(dvd.getPossuiLegenda());
    }

    public static Midia pegarMidiaAleatoria() {
        Dvd dvd1 = new Dvd("001", 12.00, "Divertidamente", "Inglês",
                true, "Português");
        Dvd dvd2 = new Dvd("002", 12.00, "Minha Mãe é uma Peça", "Portugues",
                false, "Inglês");
        Dvd dvd3 = new Dvd("003", 12.00, "As Branquelas", "Inglês",
                true, "Espanhol");

        Cd cd1 = new Cd("101", 10.00, "As Quatro Estações", "Sandy & Junior", 14);
        Cd cd2 = new Cd("102", 15.00, "Oops!... I Did It Again", "Britney Spears", 12);
        Cd cd3 = new Cd("103", 17.90, "Bang!", "Anitta", 16);

        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(5);

        switch (valorAleatorio) {
            case 0:
                return dvd1;
            case 1:
                return dvd2;
            case 2:
                return dvd3;
            case 3:
                return cd1;
            case 4:
                return cd2;
            default:
                return cd3;
        }
    }
}