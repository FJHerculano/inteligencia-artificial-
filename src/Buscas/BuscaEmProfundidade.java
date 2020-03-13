
package Buscas;

import java.util.Stack;
import nos.Nos;


public class BuscaEmProfundidade {
    
private Stack<Nos> pilhaNos;   

private int valorBusca;

public BuscaEmProfundidade(int valorBusca){
    this.pilhaNos = new Stack<>();
    this.valorBusca = valorBusca;
}

public boolean IsResultadoBusca(Nos no){
    return no.getValor() == valorBusca;
}

public void buscar(Nos no){
    this.pilhaNos.add(no);
    if(IsResultadoBusca(no)){
        //exibe o caminho
    }else{
        //expandir os próximos nós esquerda e direita
        if(no.getNoEsquerda() != null){
            // tem nó da esquerda
            this.buscar(no.getNoEsquerda());
            }else if(no.getNoDireita() != null){
                //tem nó da direira
                this.buscar(no.getNoDireita());
            }
    }
    this.pilhaNos.pop(); 
    
}


}
