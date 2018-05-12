/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author Alunoinf_2
 */
public class TelaCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa cliente = new Cliente(24, "Daniel cliente", new Data(05, 03, 1993));
        Pessoa funcionario = new Funcionario(200.00, "Daniel Funcionario", new Data(05, 03, 1993));
        Pessoa gerente = new Gerente("Daniel gerente", 200.00, "Financeiro", new Data(05, 03, 1993));
    
    
        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(gerente);
        cadastro.cadastraPessoa(funcionario);
        
        cadastro.imprimeCadastro();
    }
  

}
