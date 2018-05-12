/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author Alunoinf_2
 */
public class Jogo extends Locadora{

    public Jogo(String qtdJogadores, String plataforma, String titulo, int ano, int duracao, String comentarios) {
        super(titulo, ano, duracao, comentarios);
        this.qtdJogadores = qtdJogadores;
        this.plataforma = plataforma;
    }
    
    private String qtdJogadores;
    private String plataforma;

    public String getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(String qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
     public String plataformaJogo(){
        return getPlataforma();
    }
   
    @Override
    public void mostraDados() {
         System.out.println("Jogo - "+ getTitulo()+ " Plataforma: "+ this.plataforma+  " Quantidade de jogadores: "+ this.qtdJogadores + " ano: "+ getAno() + " duracao: "+ getDuracao() + " comentarios: " + getComentarios());
        
         System.out.println("Plataforma: "+this.plataforma);
    }
          
}
