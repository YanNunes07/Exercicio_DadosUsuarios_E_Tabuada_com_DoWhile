package model;

public class Tabuada {
    public int valor;

    public String gerarTabuada(int multiplicador){
        return this.valor + " X "+multiplicador+" = " + this.valor*multiplicador;
    }
}
