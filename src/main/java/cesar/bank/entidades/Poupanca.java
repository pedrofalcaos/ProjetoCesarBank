package cesar.bank.entidades;

public class Poupanca extends Conta {
    public void renderJuros(double salario){

        salario = salario*1.005;
    }
}
