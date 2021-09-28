package cesar.bank;

import cesar.bank.entidades.CPFUtil;
import cesar.bank.entidades.Cliente;
import cesar.bank.entidades.Conta;
import cesar.bank.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList();

        while (true){
            Conta conta = new Conta();
            System.out.println("Conta criada com sucesso!");
            System.out.println(conta);

            System.out.println("Digite os dados do CLIENTE");

            System.out.println("Digite o NOME do cliente:");
            String nome = teclado.next();

            System.out.println("Digite o CPF do cliente:");
            String cpf = teclado.next();

            while (!CPFUtil.isCPFvalido(cpf)){
                System.out.println("CPF INVÁLIDO! DIGITE NOVAMENTE");
                cpf = teclado.next();
            }
            System.out.println("Digite o valor do DEPOSÍTO INICIAL:");
            conta.Creditar(teclado.nextDouble());

            Cliente cliente = new Cliente(nome,cpf,conta);
            cliente.setConta(conta);
            clientes.add(cliente);






        }


    }




}
