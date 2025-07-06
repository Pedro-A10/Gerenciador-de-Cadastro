package arquivos;

import cadastro.Produto;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProdutoArquivo {

    public static void salvarListaProduto(List<Produto> produtos, String caminhoArquivoProduto) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(caminhoArquivoProduto))) {
            for (Produto produto : produtos) {
                wr.write(produto.toString());
                wr.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar!");
            e.printStackTrace();
        }
    }
}
