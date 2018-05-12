/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teceira.lista;

/**
 *
 * @author Alunoinf_2
 */
public class Cidade {
        
        private int codigo;
        private String nome;
        private String estado;
        private int numeroVeiculos;
        private int numeroAcidentes;

    public Cidade(int codigo, String nome, String estado, int numeroVeiculos, int numeroAcidentes) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
        this.numeroVeiculos = numeroVeiculos;
        this.numeroAcidentes = numeroAcidentes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroVeiculos() {
        return numeroVeiculos;
    }

    public void setNumeroVeiculos(int numeroVeiculos) {
        this.numeroVeiculos = numeroVeiculos;
    }

    public int getNumeroAcidentes() {
        return numeroAcidentes;
    }

    public void setNumeroAcidentes(int numeroAcidentes) {
        this.numeroAcidentes = numeroAcidentes;
    }
           
}
