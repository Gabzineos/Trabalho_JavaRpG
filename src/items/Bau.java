package items;

import personagem.Personagem;

public class Bau extends Item {

    private int xp;
    private int coins;

    public Bau() {
        super("Baú");
        xp = 50;
        coins = 100;
    }

    @Override
    public void usar(Personagem personagem) {

        System.out.println(
                personagem.getNome()
                        + " abriu o baú!"
        );

        System.out.println(
                "Ganhou " + xp + " XP e "
                        + coins + " HeroCoins."
        );
    }
}