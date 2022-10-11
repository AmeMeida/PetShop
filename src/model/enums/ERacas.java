package model.enums;

public enum ERacas {
    GATO(1, "Gato"),
    CACHORRO(2, "Cachorro"),
    AVE(3, "Ave");

    private int cod;
    private String nome;

    private ERacas(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }
}
