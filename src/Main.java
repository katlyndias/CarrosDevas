import java.util.Scanner;

public class Main {
    // vamos chamar de Main a classe que tem o método main, alguns lugares chamam de application

    /* enunciado que ele passou */

    // TODO: Implementar regras
    // A velocidade máxima do nosso carro é de 100 km/h
    // Não existe velocidade negativa

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        // Atributos
        // new - criamos um objeto
        Carro carroDevas = new Carro("Azul","Ferrari","296 GTB");


        int escolha;


        while(carroDevas.ligado){ // enquanto o carro estiver ligado
            mostrarMenu();
            escolha = entrada.nextInt(); //Entrada do usuário


            if(escolha == 1){
                carroDevas.acelerar(10);
            } else if (escolha == 2) {
                carroDevas.frear();
            } else if (escolha == 3){
                carroDevas.mostrarEstadoAtual();
            } else if (escolha == 0){
                //TODO implementar método desligar
                carroDevas.desligar();
            } else {
                System.out.println("Escolha inválida");
            }
        }

        entrada.close();
    }


    public static void mostrarMenu(){
        System.out.println();
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Acelerar");
        System.out.println("2 - Frear");
        System.out.println("3 - Estado atual");
        System.out.println("0 - Desligar");
    }
    //static: para quando não instaciamos um objeto, exemplo para calculadora, não preciso criar objetos calculadora porque ela vai ser padrão para todo mundo
    //static vc usa então quando a classe vai utilizar

    //diferença de metodo e funcao
    // no dia a dia ninguem faz questao
    // mas a funcao geralmente não tá associada a uma classe - é solta
    //

}
