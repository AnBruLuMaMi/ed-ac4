package ac4.ex01.a;

import ac4.ex01.a.Pessoa;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}
