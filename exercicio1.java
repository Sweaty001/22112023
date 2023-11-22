import java.util.Scanner;

public class MyClass {
 
        public static void main(String args[]) {
            String vUserName = "teste";
            String vPass = "teste";
            
            Scanner texto1 = new Scanner(System.in);
            System.out.println("Insira seu login");
            String userName = texto1.nextLine();
            
            Scanner texto2 = new Scanner(System.in);
            System.out.println("Insira sua senha");
            String pass = texto2.nextLine();
      
            if(userName == vUserName && pass == vPass){
                System.out.println("Bem vindo ao sistema");
            } else {
                System.out.println("Usuário ou senha incorreta");
            }
            System.out.println("Usuário válido: " + vUserName);
            System.out.println("Usuário digitado: " + userName);
            System.out.println("Senha válida: " + vPass);
            System.out.println("Senha digitada: " + pass);
    }
    
}

