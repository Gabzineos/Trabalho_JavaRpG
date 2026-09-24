package personagem;

public abstract class Personagem implements IAtacante {

    private String nome;
    private int hp;
    private int hpMax;
    private int mana;
    private int manaMax;
    private int ataque;

    public Personagem(String nome, int hpMax, int manaMax, int ataque) {
        this.nome = nome;
        this.hpMax = hpMax;
        this.hp = hpMax;
        this.manaMax = manaMax;
        this.mana = manaMax;
        this.ataque = ataque;
    }

    public void receberDano(int dano) {

        if (dano < 0) {
            dano = 0;
        }

        hp -= dano;

        if (hp < 0) {
            hp = 0;
        }
    }

    public void curar(int quantidade) {

        if (quantidade < 0) {
            return;
        }

        hp += quantidade;

        if (hp > hpMax) {
            hp = hpMax;
        }
    }

    public void recuperarMana(int quantidade) {

        if (quantidade < 0) {
            return;
        }

        mana += quantidade;

        if (mana > manaMax) {
            mana = manaMax;
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

    public int getHpMax() {
        return hpMax;
    }

    public int getMana() {
        return mana;
    }

    public int getManaMax() {
        return manaMax;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void gastarMana(int quantidade) {

        if (quantidade > 0) {
            mana -= quantidade;

            if (mana < 0) {
                mana = 0;
            }
        }
    }
}