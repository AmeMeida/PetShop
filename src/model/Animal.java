package model;

public class Animal {
    private int codigo;
    private String tutor;
    private String nome;
    private String raca;    
    
    public Animal(int codigo, String tutor, String nome, String raca) {
        setCodigo(codigo);
        setTutor(tutor);
        setNome(nome);
        setRaca(raca);
    }

    public static String checkString(String val, String message) {
        if (val.trim().isEmpty())
            throw new IllegalArgumentException(message + " não deve estar vazio.");

        return val.trim();
    }

    public static int checkCodigo(int codigo) {
        if (codigo <= 0)
            throw new IllegalArgumentException("Código de animal inválido.");

        // TODO Garantir que só haja um código igual.
        return codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = checkCodigo(codigo);
    }

    public static String checkTutor(String tutor) {
        return checkString(tutor, "Tutor");
    }

    public String getTutor() {
        return this.tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public static String checkNome(String nome) {
        return checkString(nome, "Nome");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = checkNome(nome);
    }

    public static String checkRaca(String raca) {
        return checkString(raca, "Raça");
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = checkRaca(raca);
    }

}
