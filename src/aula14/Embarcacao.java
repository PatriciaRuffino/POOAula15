package aula14;

public class Embarcacao {
    private Capitao capitao;
    private Double precoBase;
    private Double precoAdicional;
    private int anoFab;
    private Double comprimento;

    public Embarcacao(Capitao capitao, Double precoBase, Double precoAdicional, int anoFab, Double comprimento) {
        this.capitao = capitao;
        this.precoBase = precoBase;
        this.precoAdicional = precoAdicional;
        this.anoFab = anoFab;
        this.comprimento = comprimento;
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public void setCapitao(Capitao capitao) {
        this.capitao = capitao;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public Double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(Double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }
    public Double valorAluguel(){
        if(getAnoFab()>2020){
          return this.precoBase + this.precoAdicional;
        }else{
            return this.precoBase;
        }

    }
}
