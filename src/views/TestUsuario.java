package views;

import model.Usuario;

import java.util.Scanner;

public class TestUsuario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Digite o nome");
        usuario.setNome(ler.nextLine());
        do {
            System.out.println("Digite o cpf");
            usuario.setCpf(ler.nextLine());
            if (usuario.getCpf().length() !=11){
                System.out.println("CPF invalido");
            }
        }while (usuario.getCpf().length() !=11);

        do {
            System.out.println("Digite o telefone");
            usuario.setTelefone(ler.nextLine());
            if (usuario.getTelefone().length() !=11){
                System.out.println("telefone invalido");
            }
        }while (usuario.getTelefone().length() !=11);

        do {
            System.out.println("Digite o rg");
            usuario.setRg(ler.nextLine());
            if (!(usuario.getRg().length() >= 6 && usuario.getRg().length()<=10)){
                System.out.println("RG invalido");
            }
        }while (usuario.getRg().length() !=11);

        do {
            System.out.println("Digite um numero par");
            usuario.setCodigo(ler.nextInt());
            if (!(usuario.getCodigo() %2 == 1)){
                System.out.println("Digite novamente");
            }
        }while (usuario.getCodigo() %2 == 1);
    }

}
