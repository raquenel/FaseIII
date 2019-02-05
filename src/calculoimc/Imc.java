package calculoimc;

/**
 *
 * @author Abdel
 */
public class Imc {
    
    /**
     Calcula o IMC;
     */
    
    public double calcular(double peso, double altura){
        
        return peso / (altura * altura);
        
    }
    
    /**
     Retorna a situação do IMC;
     */
    
    public String situation (double imc){
        
        String situacao = "";
        
        if (imc < 18.5) {
            
            situacao = "Abaixo do Peso!";
            
        } else if (imc >= 18.5 && imc < 24.9){
            
            situacao = "Peso Normal!";
            
        } else if (imc >= 24.9 && imc <= 29.9){
            
            situacao = "Sobrepeso!";
            
        } else if (imc >= 30 && imc < 35){
            
            situacao = "Obesidade Grau 1!";
            
        } else if (imc >= 35 && imc < 40){
        
        situacao = "Obesidade Severa!";
        
        } else if (imc >40){
            
            situacao = "Obesidade Mórbida!!!";
            
        }
        
        return situacao;
    }
    
}
