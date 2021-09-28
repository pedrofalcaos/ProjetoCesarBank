package cesar.bank.entidades;

import java.util.Random;
import lombok.Data;

@Data

public class Conta {

    private String numero;
    private double saldo;
    private Cliente cliente;

    public Conta(){

        numero = gerarNumero();
        saldo =0;
    }



    public void Creditar(double valor){
        saldo +=valor;

    }
    public void Debitar(double valor){
        saldo -= valor;
    }
    private String gerarNumero(){
        return String.valueOf(new Random().nextInt());
    }
}

