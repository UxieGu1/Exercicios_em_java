//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
//igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
//informações. O login é terra e a senha é plana

package loopwhile;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String usuario;
        String senha;

        while(true){
            System.out.println("Digite seu nome de usuário: ");
            usuario = ler.next();
            System.out.println("Digite sua senha: ");
            senha = ler.next();

            if (usuario == senha) {
                System.out.print("Erro: A senha não pode ser igual ao nome de usuário!");
            }else if (usuario == "terra" && senha == "plana"){
                System.out.println("Login feito com sucesso!");
                break;
            }else{
                System.out.println("Erro: Nome de usuário ou senha incorretos!");
            }

        }
    }
}
