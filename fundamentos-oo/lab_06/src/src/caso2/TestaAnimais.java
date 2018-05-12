/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import caso1.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunoinf_2
 */
public class TestaAnimais {
        
  public static void main(String[] args) {
       percorre();
    }
  
    private static void percorre() {
        List<Animal> lista = getLista();

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).som());
        }
    }
    
    private static List<Animal> getLista() {
        List<Animal> lista = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                lista.add(new Boi());

            } else if (i % 3 == 0) {
                lista.add(new Cachorro());

            } else {
                lista.add(new Sapo());
            }
        }

        return lista;
    }
      
}
