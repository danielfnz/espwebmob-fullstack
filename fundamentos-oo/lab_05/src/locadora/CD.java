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

public class CD extends Locadora{
    private String artistas;
    private String qtdFaixas;

    public CD(String artistas, String qtdFaixas, String titulo, int ano, int duracao, String comentarios) {
        super(titulo, ano, duracao, comentarios);
        this.artistas = artistas;
        this.qtdFaixas = qtdFaixas;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public String getQtdFaixas() {
        return qtdFaixas;
    }
    
    public void setQtdFaixas(String qtdFaixas) {
        this.qtdFaixas = qtdFaixas;
    }

    @Override
    public void mostraDados() {
        System.out.println("CD - "+ getTitulo()+ " artista: "+ this.artistas+ " faixas: "+ this.qtdFaixas + " ano: "+ getAno() + " duracao: "+ getDuracao() + " comentarios: " + getComentarios());
        
    }
    
    
    
}
