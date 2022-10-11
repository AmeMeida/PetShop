package model.enums;

public enum EServicos {
    BANHO(1, "Banho"),
    TOSA(2, "Tosa"),
    VETERINARIO(3, "Veterinário"),
    CASTRACAO(4, "Castração");

    private int cod;
    private String name;
    
    private EServicos(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }
    
    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }
}
