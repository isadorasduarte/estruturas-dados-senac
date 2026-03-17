public class EstruturadeDados {
    
    public static void main(String[] args) {

        int [] numeros = new int[8];
        int tamanho = 0;

        int[] novosValores = {10, 20, 30, 40};

     tamanho = inserirVarios(numeros, tamanho, novosValores);

    tamanho= inserirNoFim(numeros, tamanho, 40);
    tamanho= inserirNoFim(numeros, tamanho, 50);
    tamanho= inserirNoFim(numeros, tamanho, 60);

    int maior = buscaMaior(numeros, tamanho);
    System.out.println("Maior valor: " + maior);

 
     }
     public static int inserirNoFim(int [] array, int tamanho, int valor){
    
        if (valor<0){
                System.out.println("Valor negativo não é permitido " + valor);
                return tamanho;
        }

        array[tamanho]= valor;
        return tamanho+1;
    }
    
    public static int estaCheio (int [] array, int tamanho, int valor){
        if(tamanho>=array.length){
            System.out.println("Ta cheio "+ valor);
            return tamanho;
        } 
        return tamanho;
    }

    public static boolean estaVazio(int tamanho) {
        if (tamanho == 0) {
            System.out.println("Está vazio");
            return true;
        }
        return false;
    }

    public static int buscaMaior(int[] array, int tamanho){
        if (tamanho == 0) {
            System.out.println("Array está vazio");
            return -1; 
        }
    
        int maior = array[0]; 
    
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
    
        return maior;
    }

    public static int inserirVarios(int[] array, int tamanho, int[] valores) {

        for (int i = 0; i < valores.length; i++) {
    
            
            if (valores[i] < 0) {
                System.out.println("Valor negativo não permitido: " + valores[i]);
            }
            
            if (tamanho >= array.length) {
                System.out.println("Array cheio " + tamanho);
            }
    
            array[tamanho] = valores[i];
            tamanho++;
        }
    
        return tamanho;
    }

    }
                
               
            

 
     

