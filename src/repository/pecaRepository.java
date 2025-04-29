
package repository;

import model.Peça;
import java.util.ArrayList;
import java.util.List;

public class PecaRepository {
    private List<Peça> pecas = new ArrayList<>();
    private int idCounter = 1;

    public void adicionarPeca(Peça peca) {
        peca.setId(idCounter++);
        pecas.add(peca);
    }

    public List<Peça> listarPecas() {
        return pecas;
    }

    public void atualizarPeca(Peça peca) {
        for (int i = 0; i < pecas.size(); i++) {
            if (pecas.get(i).getId() == peca.getId()) {
                pecas.set(i, peca);
                break;
            }
        }
    }

    public void removerPeca(int id) {
        pecas.removeIf(peca -> peca.getId() == id);
    }
}