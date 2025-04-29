
package controller;

/**
 *
 * @author Ana Júlia Oliveira e Ana Carolina Pereira
 */

import model.Peça;
import repository.PecaRepository;
import java.util.List;

public class PecaController {
    private PecaRepository pecaRepository;
    
    public PecaController() {
        this.pecaRepository = new PecaRepository();
    }

    public void adicionarPeca(String nome, int quantidade, double preco) {
        Peça peca = new Peça(0, nome, quantidade, preco);
        pecaRepository.adicionarPeca(peca);
    }

    public List<Peça> listarPecas() {
        return pecaRepository.listarPecas();
    }

    public void atualizarPeca(Peça peca) {
        pecaRepository.atualizarPeca(peca);
    }

    public void removerPeca(int id) {
        pecaRepository.removerPeca(id);
    }
}
