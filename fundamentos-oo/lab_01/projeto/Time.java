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
public class Time {

    private Jogador[] jogadores = new Jogador[23];
    private String nome;
    private int quantidadeJogadores = 0;

    private int golsSofridos = 0;
    private int golsRealizados = 0;
    
    private int canhotos = 0;

    public String getNome() {
        return nome;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incluiJogador(String nomeJog, int idade, float peso, boolean canhoto) {
        if (quantidadeJogadores < jogadores.length) {
            Jogador novoJogador = new Jogador(nomeJog,peso,idade,canhoto);
     
            jogadores[quantidadeJogadores] = novoJogador;
            quantidadeJogadores++;
        } else {
            System.out.println("\nNao pode ser incluido mais jogadores!");
        }
    }

    public float calcularPesoMedioTime() {
        float pesoMedio = 0;

        for (int i = 0; i < jogadores.length; i++) {
            pesoMedio = (pesoMedio + jogadores[i].getPeso());
        }
        pesoMedio = pesoMedio / jogadores.length;

        return pesoMedio;
    }
    
     public int calcularCanhotos() {
   
        for (int i = 0; i < jogadores.length; i++) {
           if(jogadores[i].isCanhoto()) {
               this.canhotos ++;
           }
        }
        return this.canhotos;
     }

    public float calcularIdadeMedioTime() {
        float idadeMedia = 0;

        for (int i = 0; i < jogadores.length; i++) {
            idadeMedia = (idadeMedia + jogadores[i].getIdade());
        }
        idadeMedia = idadeMedia / jogadores.length;

        return idadeMedia;
    }

    public void realizarGol(Time time) {
        this.golsRealizados++;
        time.sofrerGol();
    }

    public void sofrerGol() {
        this.golsSofridos++;
    }

    public int getGolsSofridos() {
        return this.golsSofridos;
    }

    public int getGolsRealizados() {
        return this.golsRealizados;
    }

}
