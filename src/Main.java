import cenario.Portal;
import inimigo.Inimigo;
import items.Armadilha;
import items.Bau;
import items.CristalMana;
import items.OrbeVida;
import personagem.Guerreiro;
import personagem.Inventario;
import personagem.Mago;
import personagem.Personagem;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== LABIRINTO 3D ===");

        Guerreiro guerreiro = new Guerreiro("Arthur");
        Mago mago = new Mago("Merlin");

        System.out.println("\n=== PERSONAGENS ===");

        mostrarPersonagem(guerreiro);
        mostrarPersonagem(mago);

        System.out.println("\n=== COMBATE ===");

        Inimigo inimigo = new Inimigo(
                "Goblin",
                100,
                15
        );

        guerreiro.atacar(inimigoPersonagem(inimigo));

        System.out.println("\n=== INVENTÁRIO ===");

        Inventario inventario = new Inventario();

        inventario.adicionar(new CristalMana());
        inventario.adicionar(new OrbeVida());
        inventario.adicionar(new Bau());

        inventario.listar();

        System.out.println("\n=== USANDO ITEM ===");

        inventario.usarItem(0, guerreiro);

        System.out.println("\n=== ARMADILHA ===");

        Armadilha armadilha = new Armadilha();
        armadilha.usar(guerreiro);

        System.out.println(
                "HP atual: " + guerreiro.getHp()
        );

        System.out.println("\n=== PORTAL ===");

        Portal portal = new Portal();

        portal.entrar(guerreiro);

        portal.ativar();

        portal.entrar(guerreiro);
    }

    public static void mostrarPersonagem(Personagem personagem) {

        System.out.println(
                personagem.getNome()
                        + " | HP: "
                        + personagem.getHp()
                        + "/"
                        + personagem.getHpMax()
                        + " | Mana: "
                        + personagem.getMana()
                        + "/"
                        + personagem.getManaMax()
        );
    }

    public static Personagem inimigoPersonagem(Inimigo inimigo) {

        return new Personagem(
                inimigo.getNome(),
                inimigo.getHp(),
                0,
                inimigo.calcularDano()
        ) {
            @Override
            public void atacar(Personagem alvo) {
                inimigo.atacar(alvo);
            }
        };
    }
}