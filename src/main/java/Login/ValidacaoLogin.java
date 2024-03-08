package Login;

import Login.MetodoLogin;

import java.util.Scanner;

public class ValidacaoLogin {
    public static void main(String[] args) {
        MetodoLogin metodo = new MetodoLogin();

        String user = "";
        String email = "";
        String senha = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Usuário:");
        user = input.nextLine();

        System.out.println("E-mail:");
        email = input.nextLine();

        System.out.println("Senha:");
        senha = input.nextLine();


        if(metodo.validacaoLogin(user, email, senha)){
            System.out.println("Logado!");
        } else {
            System.out.println("Usuário ou e-mail invalido");
        }

    }
}
