package aula14;

public class Iate extends Embarcacao implements Comparable{
    private int qtsCabine;


    public Iate(Capitao capitao, Double precoBase, Double precoAdicional, int anoFab, Double comprimento, int qtsCabine) {
        super(capitao, precoBase, precoAdicional, anoFab, comprimento);
        this.qtsCabine=qtsCabine;

    }

    public int getQtsCabine() {
        return qtsCabine;
    }

    public void setQtsCabine(int qtsCabine) {
        this.qtsCabine = qtsCabine;
    }

    @Override
    public int comparar(Object o) {
        Iate aComparar = (Iate)o; {
        if(qtsCabine>aComparar.getQtsCabine()){
            return 1;
        }else if(qtsCabine< aComparar.getQtsCabine()) {
            return -1;
        }else{
            return 0;
        }
            }
        }

    }

