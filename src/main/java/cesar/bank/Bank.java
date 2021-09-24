package cesar.bank;

import cesar.bank.entidades.Cliente;
import cesar.bank.entidades.Conta;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cliente cliente = new Cliente("Pedro","108");
        System.out.println("Crie uma senha: ");
        cliente.setSenha(teclado.next());
        cliente.verificaSenha(cliente.getSenha());


    }




}
