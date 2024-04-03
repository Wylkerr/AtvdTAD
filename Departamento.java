import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private String nome;
    private int id;
    private String localizacao;
    private List<Empregado> empregados;

    public Departamento(String nome, int id, String localizacao) {
        this.nome = nome;
        this.id = id;
        this.localizacao = localizacao;
        this.empregados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void removerEmpregado(Empregado empregado) {
        empregados.remove(empregado);
    }

    public List<Empregado> obterEmpregados() {
        return empregados;
    }

}
