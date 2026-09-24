package personagem;

public class Mago extends Personagem {

    private int ataqueEspada;
    private int ataqueMagia;

    public Mago(String nome) {
        super(nome, 80, 120, 15);

        this.ataqueEspada = 15;
        this.ataqueMagia = 40;
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

        int custoMana = 20;

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

    public int getAtaqueMagia() {
        return ataqueMagia;
    }
}