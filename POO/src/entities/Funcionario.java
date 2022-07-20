package entities;

public class Funcionario {
    
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Funcionario(){

    }

    public Funcionario(String nome, Integer horas, Double valorPorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setHoras(Integer horas){
        this.horas = horas;
    }

    public Integer getHoras(){
        return horas;
    }

    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public Double getValorPorHora(){
        return valorPorHora;
    }

    public double pagamento(){
        return horas * valorPorHora;
    }
}
