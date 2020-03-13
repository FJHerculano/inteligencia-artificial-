
package nos;


public class Nos {
private int valor;
private Nos noEsquerda;    
private Nos noDireita;

public Nos(int valor){
    this.valor = valor;
} 

    public Nos getNoEsquerda() {
        return noEsquerda;
    }

    public Nos getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(Nos noDireita) {
        this.noDireita = noDireita;
    }

    public void setNoEsquerda(Nos noEsquerda) {
        this.noEsquerda = noEsquerda;
    }
    

    public int getValor(){
    return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
        }
