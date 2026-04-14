import java.util.Scanner;
public class Exercicio {

    public static void main(String[] args) {
        double [] faturamento= new double [5];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < faturamento.length; i++) {
        System.out.print("Digite o faturamento " + (i + 1) + ": ");
        faturamento[i] = sc.nextDouble();
    }

    sc.close();

    double soma=0;
    double maiorValor=faturamento[0];
    double menorValor=faturamento[0];
    int indiceMaior=0;
    int indiceMenor=0;
    int acimaMedia=0;

    for (int i = 0; i < faturamento.length; i++) {
        soma = soma+ faturamento[i];

        if(faturamento[i]>maiorValor){
            maiorValor=faturamento[i];
            indiceMaior=i;
        }

        if(faturamento[i]<menorValor){
            menorValor=faturamento[i];
            indiceMenor=i;
        }
    }

    double media = soma / faturamento.length;

    for(int i=0; i<faturamento.length;i++){
        if(faturamento[i]>media){
            acimaMedia++;
        }

    }

    System.out.println("Total do dia: "+ soma);
    System.out.println("Media por caixa: "+ media);
    System.out.println("Maior venda: "+"Caixa " + (indiceMaior+1)+ " com "+ maiorValor);
    System.out.println("Menor venda: "+"Caixa " + (indiceMenor+1)+ " com "+ menorValor);
    System.out.println("Acima da média foram: "+ acimaMedia);

    }

}
