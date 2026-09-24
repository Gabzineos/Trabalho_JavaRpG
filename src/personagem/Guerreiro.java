package personagem;

public class Guerreiro extends Personagem {

    private int ataqueEspada;
    private int ataqueMagia;

    public Guerreiro(String nome) {
        super(nome, 120, 40, 25);

        this.ataqueEspada = 25;
        this.ataqueMagia = 10;
    }

    @Override
    public void atacar(Personagem alvo) {

        System.out.println(
                getNome() + " atacou com a espada causando "
                        + ataqueEspada + " de dano!"
        );

        alvo.receberDano(ataqueEspada);
    }

    public void atacarComMagia(Personagem alvo) {

        int custoMana = 10;

        if (getMana() < custoMana) {
            System.out.println("Mana insuficiente!");
            return;
        }

        gastarMana(custoMana);

        System.out.println(
                getNome() + " lançou uma magia causando "
                        + ataqueMagia + " de dano!"
        );

        alvo.receberDano(ataqueMagia);
    }

    public int getAtaqueEspada() {
        return ataqueEspada;
    }

    public int getAtaqueMagia() {
        return ataqueMagia;
    }
}