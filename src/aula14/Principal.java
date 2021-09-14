package aula14;

public class Principal {
    public static void main(String[] args) {
        Capitao capitao1 = new Capitao("Marco", "Kant", "0001");
        Veleiro v1 = new Veleiro(capitao1, 100.00, 50.00, 2010, 5.20, 5);
        Iate i1 = new Iate(capitao1, 300.00, 50.00, 2020, 8.00, 4);
        Iate i2 = new Iate(capitao1, 500.00, 50.00, 2010, 7.50, 2);

        System.out.println(" O Iate"+i1.comparar(i2)+ "é maior");
        System.out.println("O veleiro 1 tem" + v1.getQtdMastro()+ "mastros");
        System.out.println("O nome do Capitão é:"+capitao1.getNome());
    }
}
