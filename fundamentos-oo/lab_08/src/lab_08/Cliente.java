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
public class Cliente extends Pessoa{
           
    private int codigo;
        
    public Cliente(int codigo, String nome, Data nascimento) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("-------------------------------------------------");
        System.out.println("Codigo:" + this.codigo);
        System.out.println("Tipo de cadastro: Cliente" );
        System.out.println("Nome:" + getNome());
        System.out.println("Nascimento:" + getNascimento().getData());
        System.out.println("-------------------------------------------------");
    }

}
