package cesar.bank.entidades;


import lombok.Data;

@Data

public class Conta {

    private String numero;
    private double saldo;
    private Cliente cliente;



    public void Creditar(double valor){
        saldo +=valor;

    }
    public void Debitar(double valor){
        saldo -= valor;
    }
}
