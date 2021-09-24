package cesar.bank.entidades;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Cliente {
    private String nome;
    private String cpf;
    private  String senha;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void verificaSenha(String senha) {
        if (senha.length() > 6) {
            System.out.println("A senha tem mais de seis digitos");

        } else if (senha.length() < 6) {
            System.out.println("A senha tem menos de seis digitos");
        } else {
            System.out.println("A senha tem seis digitos");
        }
    }


}
