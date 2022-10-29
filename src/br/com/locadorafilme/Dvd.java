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

    public void legenda(Boolean ligar, String idioma) {
        setIdiomaLegenda(idioma);
        System.out.println("O idioma da legenda foi atualizado para " + getIdiomaLegenda() + ".");
        if (ligar) {
            setPossuiLegenda(ligar);
            System.out.println("A legenda foi ligada.");
        }
    }

    public void legenda(Boolean ligarDesligar) {
        setPossuiLegenda(ligarDesligar);
        if (ligarDesligar) {
            System.out.println("A legenda está ligada.");
        } else {
            System.out.println("A legenda está desligada.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIdioma = " + idioma +
                "\nPossui Legenda = " + possuiLegenda +
                "\nIdioma da Legenda = " + idiomaLegenda + "\n";
    }
}