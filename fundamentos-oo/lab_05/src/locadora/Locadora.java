/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alunoinf_2
 */
public abstract class Locadora {
   
    private List<Locadora> items = new ArrayList<Locadora>();
        
    private String titulo;
    private int ano;
    private int duracao;
    private String comentarios;
    private String plataforma;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public  Locadora(String titulo, int ano, int duracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
        this.comentarios = comentarios;
    }

    public Locadora() {
        
    }
    
    public abstract void mostraDados();
    
    public void percorrer(){
        for (Iterator<Locadora> iterator = items.iterator(); iterator.hasNext();) {
            Locadora next = iterator.next();
            next.mostraDados();
        }
    }
    
    public void addItem(Locadora item){
        this.items.add(item);
    }
    
    

}
