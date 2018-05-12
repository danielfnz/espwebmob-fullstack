/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca1;

/**
 *
 * @author Alunoinf_2
 */
public class Comissionado extends Funcionario{
    
    private double totalVendas;
    private double percentualComissao;

    public Comissionado(double totalVendas, double percentualComissao, String nome, String sobrenome, double salarioFixo) {
        super(nome, sobrenome, salarioFixo);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }


    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    
    public double calculaRenda(){
        return getSalarioFixo() + (this.totalVendas * this.percentualComissao);
    }
    
    @Override
    public void mostraDados() {
        System.out.println("-------------------------------------------------");
           System.out.println("Nome:" + getNome() + " "+ getSobrenome());
        System.out.println("Cargo:" + this.getClass().getSimpleName());
        System.out.println("Salário:" + getSalarioFixo() + (this.totalVendas * this.percentualComissao));
        System.out.println("-------------------------------------------------");
    }
}
