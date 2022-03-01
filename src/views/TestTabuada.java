package views;

import model.Tabuada;

import java.util.Scanner;

public class TestTabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Tabuada tb = new Tabuada();

        System.out.println("Digite um valor para calcular a tabuada:");
        tb.valor = ler.nextInt();

        for (int multiplicador = 1; multiplicador<=10; multiplicador++){
            System.out.println(tb.gerarTabuada(multiplicador));
        }
    }
}
