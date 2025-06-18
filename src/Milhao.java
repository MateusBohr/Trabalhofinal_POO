import java.util.List;
import java.util.Scanner;

public class Milhao extends Jogo {
    Arquivo arquivo = new Arquivo();
    Jogador premio;
    GerenciadorDePerguntas gerenciadorDePerguntas = new GerenciadorDePerguntas();
    Scanner scanner = new Scanner(System.in);
    List<PerguntasRespostas> perguntas = gerenciadorDePerguntas.getPerguntas();

    public Milhao(Jogador jogador) {
        this.jogador = jogador;
    }

    @Override
    public void jogar() {
        boolean acertou = true;
        System.out.println("=======================================================");
        System.out.println("BEM VINDO AO SHOW DO MILHÃO!!!!!!!!!!!!!");
        System.out.println("=======================================================");
        for (int i = 0; i < perguntas.size(); i++) {
            PerguntasRespostas p = perguntas.get(i);

            System.out.println("\nPergunta " + (i + 1) + ":");
            System.out.println(p.getPergunta());

            List<String> alternativas = gerenciadorDePerguntas.getAlternativasEmbaralhadas(p);
            for (int j = 0; j < alternativas.size(); j++) {
                System.out.println((j + 1) + " - " + alternativas.get(j));
            }

            System.out.print("Escolha a alternativa correta (1-4): ");
            int respostaUsuario = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha
            if (respostaEscolhida.equals(p.getAlternativaCorreta())) {
                System.out.println("Resposta correta!");
                jogador.pontuar(i+1);
                System.out.println("Prêmio atual: " + jogador.getPremio());
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Você juntou um prêmio de: " + jogador.getPremio());
                System.out.println("Fim do jogo. Obrigado por participar!");
                break;
            }
        }
        }
    @Override
    public void resultado(){
        arquivo.gerarRanking(jogador);
    }
}
