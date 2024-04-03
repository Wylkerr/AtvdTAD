public class Empregado {
    private String nome;
    private int id;
    private String cargo;
    private double salario;
    private Departamento departamento;

    public Empregado(String nome, int id, String cargo, double salario, Departamento departamento) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void atualizarInformacoes(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void transferirParaDepartamento(Departamento novoDepartamento) {
        this.departamento.removerEmpregado(this);
        novoDepartamento.adicionarEmpregado(this);
        this.departamento = novoDepartamento;
    }

    public Departamento obterDepartamento() {
        return departamento;
    }

}
