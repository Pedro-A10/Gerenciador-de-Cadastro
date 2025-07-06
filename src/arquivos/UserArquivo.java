package arquivos;

import cadastro.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserArquivo {

    public static void salvarListaUser(List<User> users, String caminhoArquivo) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (User user : users) {
                wr.write(user.toString());
                wr.newLine();
            }
        }catch (IOException e) {
            System.err.println("Erro ao salvar!");
            e.printStackTrace();
        }
    }
}