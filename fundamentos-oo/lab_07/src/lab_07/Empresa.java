/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alunoinf_2
 */
public class Empresa {

    private String nome;
    private List<Funcionario> pessoas;

    public Empresa() {
        this.pessoas = new ArrayList<Funcionario>();
    }

    public List<Funcionario> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Funcionario> pessoas) {
        this.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addPessoa(Funcionario pessoa) {
        this.pessoas.add(pessoa);
    }

    public double calculaFolha() {
        double renda = 0;
        for (Iterator<Funcionario> iterator = pessoas.iterator(); iterator.hasNext();) {
            Funcionario next = iterator.next();
            renda += next.calculaRenda();
        }
        return renda;
    }

    public void mostraDados() {
        double renda = 0;
        for (Iterator<Funcionario> iterator = pessoas.iterator(); iterator.hasNext();) {
            Funcionario next = iterator.next();
            next.mostraDados();
        }
    }

    public void calculaQntHoristas() {
        int qntHoristas = 0;

        for (Iterator<Funcionario> iterator = pessoas.iterator(); iterator.hasNext();) {
            Funcionario next = iterator.next();
            if (next instanceof Horista) {
                qntHoristas++;
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Quantidade de funcionários horistas: " + qntHoristas);
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public void calculaQntComissionados() {
        int qntComissionados = 0;

        for (Iterator<Funcionario> iterator = pessoas.iterator(); iterator.hasNext();) {
            Funcionario next = iterator.next();
            if (next instanceof Comissionado) {
                qntComissionados++;
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Quantidade de funcionários comissionados: " + qntComissionados);
        System.out.println("-------------------------------------------------");
    }
}
