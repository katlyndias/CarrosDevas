// Domain
// Toda classe no java herda da classe Object


public class Carro {
    //Atributos
    private String cor; //só vai poder alterar da forma que o método especifica
    private String marca;
    private String modelo;
    private boolean ligado;
    private int velocidade;
    private int numSerie;

    // construtor - sempre que precisamos criar um objeto vamos utilizar um construtor
    // nome do construtor é igual ao da classe


    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado; // como não colocou dentro do parênteses, não poderá alterar como ele começa
        this.velocidade = velocidade; // como não colocou dentro do parênteses, não poderá alterar como ele começa
    }


    //Ações
    public void acelerar(int velocidade) {
        if (velocidade < 1) {
            System.out.println("Velocidade inválida");
        } else {
            this.velocidade += 10;
            System.out.println("Você acelerou e a velocidade é " + this.velocidade);
        }
    }
    public void frear(){
        this.velocidade -=10;
        System.out.println("Você freou e a velocidade é " + velocidade);
    }

    public void mostrarEstadoAtual(){
        System.out.println("O estado atual do carro é:");
        System.out.println("Cor:" + this.cor);
        System.out.println("Marca" + this.marca);
        System.out.println("Modelo" + this.modelo);
        System.out.println("Velocidade atual" + this.velocidade);

    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        System.out.println("Você desligou o carro!");
        this.ligado = false;
    }

    // getters and setters
    // get e set
    public String getCor(){
        return this.cor;
    }

    public boolean getLigado(){ //para boolean pode ser isLigado em vez de getLigado
        return this.ligado;
    }

    // quando nao tenho metodo especifico mas quero alterar uso o set
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void set


}
