package br.com.locadorafilme;

public class DoacaoMidia {
    public static void main(String[] args) {

        Dvd dvdPlayer = new Dvd("001", 12.00, "Divertidamente", "Inglês",
                true, "Português");


        System.out.println(dvdPlayer);
        dvdPlayer.darPlay();
        dvdPlayer.legenda(true, dvdPlayer.getIdioma());
        dvdPlayer.legenda(true);

        Midia cd = new Cd(
                "002",
                10.00,
                "As Quatro Estações",
                "Sandy & Junior",
                14
                );



        System.out.println(cd);
        cd.darPlay();


    }
}







/*
Essa classe deve conter método pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca

aleatória

Esse classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda

Método main: O main deve pegar uma midia aleatoria e dar o play
 */
