/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunoinf_2
 */
public class Main {

    public static void main(String[] args) {

        Locadora locadora = new Locadora() {
            @Override
            public void mostraDados() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        Filme item1 = new Filme("Diretor1", "Branca de neve", 1994, 60, "filme infato juvenil!");
        Filme item2 = new Filme("Diretor1", "Sharp Touch", 1994, 60, "filme infato juvenil!");
        Filme item3 = new Filme("Diretor1", "The Silent Window", 1994, 60, "filme infato juvenil!");
        Filme item4 = new Filme("Diretor1", "Academy of Soaring", 1994, 60, "filme infato juvenil!");

        CD item5 = new CD("Artista1", "30", "The Spark's Soul", 1994, 60, "comentarios");
        CD item6 = new CD("Artista2", "30", "The Lost Sword", 1994, 60, "comentarios");
        CD item7 = new CD("Artista3", "30", "Vision of Thoughts", 1994, 60, "comentarios");

        Jogo item8 = new Jogo("3", "Sony", "x-Man", 1994, 60, "jogo bao");
        Jogo item9 = new Jogo("5", "x-Box", "PagSeguro", 1994, 60, "jogo bao 2");
        Jogo item10 = new Jogo("7", "PlayStation", "Dota", 1994, 60, "jobo bao 3");

        locadora.addItem(item1);
        locadora.addItem(item2);
        locadora.addItem(item3);
        locadora.addItem(item4);
        locadora.addItem(item5);
        locadora.addItem(item6);
        locadora.addItem(item7);
        locadora.addItem(item8);
        locadora.addItem(item9);
        locadora.addItem(item10);

        locadora.percorrer();
    }

}
