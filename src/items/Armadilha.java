package items;

import personagem.Personagem;

public class Armadilha extends Item {

    private int dano;

    public Armadilha() {
        super("items.Armadilha");
        dano = 20;
    }

    @Override
    public void usar(Personagem personagem) {

        try {
            causarDano(personagem);
        } catch (TrapDamageException e) {
            System.out.println(e.getMessage());
        }
    }

    private void causarDano(Personagem personagem)
            throws TrapDamageException {

        personagem.receberDano(dano);

        throw new TrapDamageException(
                personagem.getNome()
                        + " caiu em uma armadilha e perdeu "
                        + dano + " HP!"
        );
    }
}