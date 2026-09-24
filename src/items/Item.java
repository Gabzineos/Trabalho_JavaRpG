package items;

import personagem.Personagem;

public abstract class Item {

    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    protected Item() {
    }

    public String getNome() {
        return nome;
    }

    public abstract void usar(Personagem personagem);
}