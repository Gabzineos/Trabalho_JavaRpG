package cenario;

import personagem.Personagem;

public class Portal {

    private boolean ativado;

    public Portal() {
        ativado = false;
    }

    public void ativar() {
        ativado = true;
    }

    public boolean estaAtivado() {
        return ativado;
    }

    public void entrar(Personagem personagem) {

        if (!ativado) {
            System.out.println("O portal ainda não está ativado!");
            return;
        }

        System.out.println(
                personagem.getNome()
                        + " entrou no portal!"
        );

        System.out.println("🏆 Vitória!");
    }
}