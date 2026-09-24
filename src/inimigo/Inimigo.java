package inimigo;

import personagem.Personagem;

public class Inimigo {

    private String nome;
    private int hp;
    private int dano;

    public Inimigo(String nome, int hp, int dano) {
        this.nome = nome;
        this.hp = hp;
        this.dano = dano;
    }

    public int calcularDano() {
        return dano;
    }

    public void atacar(Personagem personagem) {

        int danoCausado = calcularDano();

        System.out.println(
                nome + " atacou causando "
                        + danoCausado + " de dano!"
        );

        personagem.receberDano(danoCausado);
    }

    public void receberDano(int dano) {

        hp -= dano;

        if (hp < 0) {
            hp = 0;
        }
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }
}