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
