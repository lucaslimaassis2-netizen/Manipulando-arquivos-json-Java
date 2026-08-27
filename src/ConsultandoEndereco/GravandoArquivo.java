package ConsultandoEndereco;

import java.io.FileWriter;
import java.io.IOException;

public class GravandoArquivo {

    public void gravando(String cep) throws IOException {
        FileWriter escrita = new FileWriter("endereço.json");
        escrita.write(cep);
        escrita.close();
    }
}
