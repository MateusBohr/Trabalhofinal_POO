public class Jogador {
    //Armazena dados do jogador e de sua jogatina atual
    private String nome;
    private double premio =0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setPremio(double premio){
        this.premio=premio;
    }

    public double getPremio() {
        return premio;
    }

    //public double pontuar(){

    //}
}
