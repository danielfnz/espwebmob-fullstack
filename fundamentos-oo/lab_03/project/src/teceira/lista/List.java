/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teceira.lista;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alunoinf_2
 */
public class List {

    private ArrayList list;

    private int maxSize = 0;

    public List() {
        this.list = new ArrayList<Cidade>();
    }

    public List(int maxSize) {
        this.list = new ArrayList<Cidade>();
        this.maxSize = maxSize;
    }
        
    public ArrayList getList() {
        return list;
    }

    public void adiciona(Cidade cidade) {
        if (this.list.size() < this.maxSize) {
            this.list.add(cidade);
        }
    }

    public void remove(int position) {
        this.list.remove(position);
    }

    public void getMaiorCidadeAcidentes() {
        if (list.size() != 0) {

            int maiorValor = 0;
            int codigoCidade = 0;
            String nomeCidade = "";

            Iterator<Cidade> listInterator = list.iterator();
            while (listInterator.hasNext()) {
                Cidade it = listInterator.next();
                if (it.getNumeroAcidentes() > maiorValor) {
                    maiorValor = it.getNumeroAcidentes();
                    codigoCidade = it.getCodigo();
                    nomeCidade = it.getNome();
                }
            }
            System.out.println("Maior cidade com acidentes : COD:" + codigoCidade + " - " + nomeCidade + ": " + maiorValor);
        } else {
            System.out.println("A lista de cidades está vazia!");
        }
    }

    public void getMenorCidadeAcidentes() {
        if (list.size() != 0) {

            int menorValor = 999999999;
            int codigoCidade = 0;
            String nomeCidade = "";

            Iterator<Cidade> listInterator = list.iterator();
            while (listInterator.hasNext()) {
                Cidade it = listInterator.next();
                if (it.getNumeroAcidentes() < menorValor) {
                    menorValor = it.getNumeroAcidentes();
                    codigoCidade = it.getCodigo();
                    nomeCidade = it.getNome();
                }
            }

            System.out.println("Menor cidade com acidentes : COD:" + codigoCidade + " - " + nomeCidade + ": " + menorValor);
        }
    }

    public void getMediaVeiculosPasseios() {
        if (list.size() != 0) {

            int quantidadeVeiculos = 0;

            Iterator<Cidade> listInterator = list.iterator();
            while (listInterator.hasNext()) {
                Cidade it = listInterator.next();
                quantidadeVeiculos += it.getNumeroVeiculos();
            }

            System.out.println("Media de veiculos: " + quantidadeVeiculos / list.size());
        }
    }

    public void getMediaAcidentesGO() {
        int quantidadeAcidentes = 0;
        int cidades = 0;

        if (list.size() != 0) {
            Iterator<Cidade> listInterator = list.iterator();
            while (listInterator.hasNext()) {
                Cidade it = listInterator.next();

                if (it.getEstado() == "GO") {
                    cidades++;
                    quantidadeAcidentes = it.getNumeroAcidentes();
                }
            }
            System.out.println("Media de acidentes em GO: " + quantidadeAcidentes / cidades);
        }
    }

}
