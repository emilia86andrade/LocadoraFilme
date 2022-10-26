package br.com.locadorafilme;

public abstract class Midia {
    private String codigo;
    private Double preco;
    private String nome;

    public void darPlay() {
        System.out.println("Dando o play na mídia " + getNome());
    }

    public Midia(String codigo, Double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Midia {" +
                "codigo='" + codigo + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}





/*
Criar classe Pai chamada Midia

Atributos:

codigo : String
preco : Double
nome : String
Métodos

darPlay()
construtor(todos os argumentos)
get() e set()
 */