
package principal;

import Buscas.BuscaEmProfundidade;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import nos.Nos;


public class Buscas {
    public static void main(String[] args) {
        Nos no0 = new Nos(0);
        Nos no1 = new Nos(1);
        Nos no2 = new Nos(2);
        Nos no3 = new Nos(3);
        Nos no4 = new Nos(4);
        Nos no5 = new Nos(5);
        Nos no6 = new Nos(6);
        
        no0.setNoEsquerda(no1);
        no0.setNoDireita(no2);
        
        no1.setNoEsquerda(no3);
        no1.setNoDireita(no4);
        
        no2.setNoEsquerda(no5);
        no2.setNoDireita(no6);
       
        BuscaEmProfundidade bep = new BuscaEmProfundidade(6);
        
        bep.buscar(no0);
    }
    
}
