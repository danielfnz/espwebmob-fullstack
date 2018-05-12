/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author Alunoinf_2
 * 
 */
public class Filme extends Locadora{
    
  private String diretor;

    public Filme(String diretor, String titulo, int ano, int duracao, String comentarios) {
        super(titulo, ano, duracao, comentarios);
        this.diretor = diretor;
    }
  
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
  

    @Override
    public void mostraDados() {
        System.out.println("Filme - "+ getTitulo()+ " diretor: "+ this.diretor+  " ano: "+ getAno() + " duracao: "+ getDuracao() + " comentarios: " + getComentarios());
        
    }
    
    
}
