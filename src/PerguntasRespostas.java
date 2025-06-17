import java.util.ArrayList;

public class PerguntasRespostas {
    private String pergunta;
    private ArrayList<String> listaDeAlternativas;
    private String alternativaCorreta;

    public PerguntasRespostas(String pergunta, ArrayList<String> listaDeAlternativas, String alternativaCorreta) {
        this.pergunta = pergunta;
        this.listaDeAlternativas = listaDeAlternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public ArrayList<String> getListaDeAlternativas() {
        return listaDeAlternativas;
    }

    public void setListaDeAlternativas(ArrayList<String> listaDeAlternativas) {
        this.listaDeAlternativas = listaDeAlternativas;
    }

    public String getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(String alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }
}
