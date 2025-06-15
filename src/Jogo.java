import java.util.ArrayList;
import java.util.List;

public abstract class Jogo {
    //Classe abstrata que tem partes genericas do jogo
    Jogador jogador;
    List<PerguntasRespostas> perguntasUsadas = new ArrayList<>();

    public abstract void iniciarJogo();
    public abstract void fimDeJogo();
    public abstract void resultado();
}
