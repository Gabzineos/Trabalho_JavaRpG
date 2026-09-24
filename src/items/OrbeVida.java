package items;

import personagem.Personagem;

public class OrbeVida extends Item {

    private int quantidadeVida;

    public OrbeVida() {
        super("Orbe de Vida");
        quantidadeVida = 20;
    }

    @Override
    public void usar(Personagem personagem) {

        personagem.curar(quantidadeVida);

        System.out.println(
                personagem.getNome()
                        + " recuperou "
                        + quantidadeVida
                        + " HP."
        );
    }
}