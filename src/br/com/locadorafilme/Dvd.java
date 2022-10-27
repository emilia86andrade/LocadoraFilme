package br.com.locadorafilme;

public class Dvd extends Midia {
    private String idioma;
    private Boolean possuiLegenda;
    private String idiomaLegenda;

    public Dvd(String codigo, Double preco, String nome, String idioma, Boolean possuiLegenda, String idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Boolean getPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(Boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    @Override
    public void darPlay() {
        System.out.println("Filme " + getNome() + " iniciado.");
    }

    public boolean legenda(Boolean ligar, String idioma) {
        if (ligar == true && getPossuiLegenda() == true) {
            System.out.println("O idioma da legenda foi atualizado para " + getIdiomaLegenda() + ".");
        } else {
            System.out.println("O DVD está sem legenda.");
        }
    return false;
    }

    public boolean legenda(Boolean ligarDesligar) {
        if (getPossuiLegenda() == true && ligarDesligar == true) {
            System.out.println("A legenda está ligada.");
        } else {
            System.out.println("A legenda está desligada.");
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIdioma = " + idioma +
                "\nPossui Legenda = " + possuiLegenda +
                "\nIdioma da Legenda = " + idiomaLegenda;
    }
}





/*
Atributos:

idioma : String
possuiLegenda : boolean
idiomaLegenda : String
Métodos

sobrescrever darPlay(): exibir a mensagem "filme iniciado"
construtor(todos os argumentos)
get() e set()
legenda(boolean ligar, String idioma) : liga a legenda e atualiza o idioma da legenda
legenda(boolean ligarDesligar) : apenas atualiza a variável possuiLegenda

 */