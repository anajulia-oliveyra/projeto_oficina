
package controller;

/**
 *
 * @author Ana Júlia Oliveira e Ana Carolina Pereira
 */

import model.Peca;
import repository.PecaRepository;
import java.util.List;

public class PecaController {
    private PecaRepository pecaRepository;
    
    public PecaController() {
        this.pecaRepository = new PecaRepository();
    }

    public void adicionarPeca(String nome, int quantidade, double preco) {
        Peca peca = new Peca(0, nome, quantidade, preco);
        pecaRepository.adicionarPeca(peca);
    }

    public List<Peca> listarPecas() {
        return pecaRepository.listarPecas();
    }

    public void atualizarPeca(Peca peca) {
        pecaRepository.atualizarPeca(peca);
    }

    public void removerPeca(int id) {
        pecaRepository.removerPeca(id);
    }
}
