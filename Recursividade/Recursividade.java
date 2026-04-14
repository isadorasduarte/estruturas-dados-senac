public class Recursividade {

    public static int somaRecursiva(int n){
        if(n<=0){
            return 0;
        }
        return n+somaRecursiva(n-1);
    }

    public static int somaIterativa(int n){
        int soma=0;
        for (int i = 1; i <= n; i++) {
            soma+=i;
            
        }
        return soma;
    }

    public static void main(String[] args) {
        
        int resultado= somaRecursiva(500);
        System.out.println("Soma Recursiva "+resultado);

        int resultado1= somaIterativa(500);
        System.out.println("Soma Iterativa "+resultado1);


    }

}
