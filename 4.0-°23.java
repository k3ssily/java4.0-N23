public class Animal {

    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
public class Mamifero extends Animal {

    public Mamifero(String nome){
        super(nome);
    }

    public String tipo(){
        return "Mamífero";
    }
}
public class Marsupial extends Mamifero {

    public Marsupial(String nome){
        super(nome);
    }

    public String info(){
        return getNome() + " é um marsupial.";
    }
}

public class Main {
    public static void main(String[] args) {

        Marsupial m = new Marsupial("Canguru");

        System.out.println(m.info());
    }
}
