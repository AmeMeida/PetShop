package model;

import model.enums.EServicos;

public class Servico {
    private int codAnimal;
    private EServicos tipoServico;

    public Servico(int codAnimal, EServicos tipoServico) {
        setCodAnimal(codAnimal);
        setTipoServico(tipoServico);
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = Animal.checkCodigo(codAnimal);
    }

    public EServicos getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(EServicos tipoServico) {
        if (tipoServico == null)
            throw new IllegalArgumentException("O tipo do serviço não pode estar vazio.");
        
        this.tipoServico = tipoServico;
    }
}
