package entities;

public class FuncionarioTerceirizado extends Funcionario {
    
    private Double cobrancaAdicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional){
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }

    public void setCobrancaAdicional(Double cobrancaAdicional){
        this.cobrancaAdicional = cobrancaAdicional;
    }

    public Double getCobrancaAdicional(){
        return cobrancaAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + cobrancaAdicional * 1.10;
    }

}
