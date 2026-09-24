package personagem;

import items.Item;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Item> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public void adicionar(Item item) {
        itens.add(item);

        System.out.println(
                item.getNome() + " foi adicionado ao inventário."
        );
    }

    public void listar() {

        if (itens.isEmpty()) {
            System.out.println("Inventário vazio.");
            return;
        }

        System.out.println("=== INVENTÁRIO ===");

        for (int i = 0; i < itens.size(); i++) {

            System.out.println(
                    (i + 1) + " - " + itens.get(i).getNome()
            );
        }
    }

    public void usarItem(int indice, Personagem personagem) {

        if (indice < 0 || indice >= itens.size()) {
            System.out.println("items.Item inválido.");
            return;
        }

        Item item = itens.get(indice);

        item.usar(personagem);

        itens.remove(indice);
    }
}