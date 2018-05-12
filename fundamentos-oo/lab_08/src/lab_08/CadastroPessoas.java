/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alunoinf_2
 */
public class CadastroPessoas {
    private int qtdAtual;
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public CadastroPessoas() {
    }
    
    
    
    public void cadastraPessoa(Pessoa pess){
        this.pessoas.add(pess);
        this.qtdAtual++;
    }
    
    public void imprimeCadastro(){
        for (Iterator<Pessoa> iterator = pessoas.iterator(); iterator.hasNext();) {
            Pessoa next = iterator.next();
            next.imprimeDados();
        }
    }
    
}
