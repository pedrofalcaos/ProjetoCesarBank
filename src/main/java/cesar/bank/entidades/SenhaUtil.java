package cesar.bank.entidades;

public class SenhaUtil {

    public void SenhaValida(String senha) {

        if (senha.length() >= 6) {
            System.out.println("SENHA VÁLIDA!");
        } else {
            System.out.println("SENHA INVÁLIDA!");
        }

    }
}
