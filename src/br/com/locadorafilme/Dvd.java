package br.com.locadorafilme;

public class Dvd extends Midia{
    private String idioma;
    private Boolean possuiLegenda;
    private String idiomaLegenda;

    @Override
    public void darPlay() {
        super.darPlay();
        System.out.println("Filme " + getNome() + " iniciado.");
    }

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

    public void legenda(Boolean ligar, String idioma){
        if(ligar == true){
            setIdiomaLegenda(getIdiomaLegenda());
            System.out.println("A legenda está em " + getIdiomaLegenda() + ".");
        } else {
            System.out.println("O DVD está sem legenda.");
        }
    }

    public void legenda(Boolean ligarDesligar){
        if(getPossuiLegenda() == true){
            System.out.println("A legenda está ligada.");
        }else{
            System.out.println("A legenda está desligada.");
        }
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