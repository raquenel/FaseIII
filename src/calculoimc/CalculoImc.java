package calculoimc;

import javax.swing.JFrame;
import telas.PainelPrincipal;

/**
 *
 * @author Abdel
 */
public class CalculoImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("--Calculadora De IMC--");
        PainelPrincipal painel = new PainelPrincipal();
        
        //Define atributos da tela
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(500, 500);
        janela.add(painel);
        janela.setVisible(true);
        
    }
    
}
