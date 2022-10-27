package br.com.locadorafilme;

public class DoacaoMidia {
    public static void main(String[] args) {

        Dvd dvdPlayer = new Dvd("001", 12.00, "Divertidamente", "Inglês",
                true, "Português");

        Midia cd = new Cd("002", 10.00, "As Quatro Estações", "Sandy & Junior", 14);

        //printando os objetos com Override
        System.out.println(dvdPlayer);
        System.out.println(cd);

        //printando os darPlay dos filhos
        dvdPlayer.darPlay();
        cd.darPlay();

        //printando os métodos com mesmo nomes
        //dvdPlayer.legenda(true, dvdPlayer.getIdiomaLegenda());
        //dvdPlayer.legenda(true);

        //chamando o métodp assistirFilme
        assistirFilme(dvdPlayer);

    }

    public static void assistirFilme(Dvd dvd) {
        dvd.legenda(dvd.getPossuiLegenda(), dvd.getIdioma());
        dvd.legenda(dvd.getPossuiLegenda());
    }
}







/*
Essa classe deve conter método pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca

aleatória

Esse classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda

Método main: O main deve pegar uma midia aleatoria e dar o play
 */
