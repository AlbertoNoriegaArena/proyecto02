package es.santander.ascender;

public class Pepe {
    
    public int suma=0;

 
    public int sumar(int numero1, int numero2){
        
        suma= numero1 + numero2;

        return suma;
    }

    public int operar(int numero1, int numero2, char operacion){
            
            int resultado =0;
    
            switch (operacion) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    resultado = numero1 / numero2;
                    break;
                default:
                    break;
            }
    
            return resultado;
        }
    
  

}
