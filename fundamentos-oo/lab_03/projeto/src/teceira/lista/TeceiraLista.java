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
public class TeceiraLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new List(5);

        list.adiciona(new Cidade(0, "Goiania", "GO", 78787, 5454));
        list.adiciona(new Cidade(1, "Ceres", "GO", 55555, 121));
        list.adiciona(new Cidade(2, "AP. Goiania", "GO", 78787872, 5555));
        list.adiciona(new Cidade(3, "Mineiros", "GO", 9235, 452));
        list.remove(2);

        list.getMaiorCidadeAcidentes();
        list.getMenorCidadeAcidentes();
        list.getMediaVeiculosPasseios();
        list.getMediaAcidentesGO();
    }

}
