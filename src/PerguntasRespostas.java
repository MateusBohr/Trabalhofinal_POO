import java.util.ArrayList;

public class PerguntasRespostas {
    private String pergunta;
    ArrayList <String> listaDePerguntas = new ArrayList<>();
    private String alternativaCorreta;

    public PerguntasRespostas(String pergunta, ArrayList<String> listaDePerguntas, String alternativaCorreta){
        this.alternativaCorreta=alternativaCorreta;
        this.pergunta = pergunta;
        this.listaDePerguntas = listaDePerguntas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public ArrayList<String> getListaDePerguntas() {
        return listaDePerguntas;
    }

    public String getAlternativaCorreta() {
        return alternativaCorreta;
    }
    }