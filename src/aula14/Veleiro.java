package aula14;

public class Veleiro extends Embarcacao{
    private int qtdMastro;


    public Veleiro(Capitao capitao, Double precoBase, Double precoAdicional, int anoFab, Double comprimento, int qtdMastro) {
        super(capitao, precoBase, precoAdicional, anoFab, comprimento);
        this.qtdMastro=qtdMastro;
    }

    public int getQtdMastro() {
        return qtdMastro;
    }

    public void setQtdMastro(int qtdMastro) {
        this.qtdMastro = qtdMastro;
    }
}
