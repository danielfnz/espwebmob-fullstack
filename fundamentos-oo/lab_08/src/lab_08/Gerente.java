/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author Alunoinf_2
 */
public class Gerente extends Funcionario {
    private String area;

    public Gerente(String area, double salario, String nome, Data nascimento) {
        super(salario, nome, nascimento);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    private double calculaImposto(){
        return getSalario() - (getSalario() * 0.05);
    }
    
    public void imprimeDados(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nome:" + getNome());
        System.out.println("Tipo de cadastro:  Gerente");
        System.out.println("Nascimento:" + getNascimento().getData());
        System.out.println("Area:" + this.area);
        System.out.println("Salario:" + this.calculaImposto());
        System.out.println("-------------------------------------------------");
    }
}
