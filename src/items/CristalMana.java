package items;

import personagem.Personagem;

public class CristalMana extends Item {

    private int quantidadeMana;

    public CristalMana() {
        super("Cristal de Mana");
        quantidadeMana = 25;
    }

    @Override
    public void usar(Personagem personagem) {

        personagem.recuperarMana(quantidadeMana);

        System.out.println(
                personagem.getNome()
                        + " recuperou "
                        + quantidadeMana
                        + " de mana."
        );
    }
}