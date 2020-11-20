package gravardados;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class GerenciaDeDados {

    public static void criarPastas(){
    
    File f = new File("C:/Users/Suporte/Documents/NetBeansProjects/dados_de_imc");
    
    f.mkdirs();
    
    }
    
    public static void salvar(String dados) throws IOException {
        String conteudoTxt = "";
        String linha = "";
        
        linha = dados;
        
        conteudoTxt = conteudoTxt + linha + "\n";
        
        
        ManipulacaoDeArquivo arquivo
                = new ManipulacaoDeArquivo("C:/Users/Suporte/Documents/NetBeansProjects/dados_de_imc",
                        "cadastro_de_imc.txt");
        arquivo.gravar(conteudoTxt);
    }

}
