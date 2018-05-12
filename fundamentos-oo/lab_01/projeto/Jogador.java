/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocc2015.pkg2.lista01;

/**
 *
 * @author maratona
 */
public class Jogador {
    private String nome;
    private float peso;
    private int idade;
    private int golsRealizados = 0;
    private boolean canhoto;

    public Jogador(String nome, float peso, int idade, boolean canhoto) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.canhoto = canhoto;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGolsRealizados() {
        return this.golsRealizados;
    }

    public void setGolsRealizados(int golsRealizados) {
        this.golsRealizados = golsRealizados;
    }

    public boolean isCanhoto() {
        return this.canhoto;
    }

    public void setCanhoto(boolean canhoto) {
        this.canhoto = canhoto;
    }

}
