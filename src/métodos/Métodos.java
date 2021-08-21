package métodos;

public class Métodos {
       
//Crie um Método que retorne a soma de dois valores recebidos como parâmetros.
   
    static int soma(int n1, int n2){
        return n1 + n2;
    }
      
//Crie um Método que retorne a multiplicação de dois valores recebidos como parâmetros.
    
    static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }
    
  



    public static void main(String[] args) {
        
        soma(2, 5);
        multiplicar(2, 5);
        
        System.out.println(soma(2, 5));
        System.out.println(multiplicar(2, 5));
    }
}

//quanto return --> precisa colocar o tipo antes do nome do método
//quanto NÃO USA RETURN --> void