public class SistemaGerenciamento {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento("Vendas", 1, "São Paulo");
        Departamento departamento2 = new Departamento("TI", 2, "Rio de Janeiro");

        Empregado empregado1 = new Empregado("João", 1, "Vendedor", 3000.0, departamento1);
        Empregado empregado2 = new Empregado("Maria", 2, "Analista", 4000.0, departamento2);

        departamento1.adicionarEmpregado(empregado1);
        departamento2.adicionarEmpregado(empregado2);

        System.out.println("Empregados do departamento " + departamento1.getNome() + ":");
        for (Empregado empregado : departamento1.obterEmpregados()) {
            System.out.println(empregado.getNome() + " - " + empregado.getCargo());
        }

        System.out.println("\nEmpregados do departamento " + departamento2.getNome() + ":");
        for (Empregado empregado : departamento2.obterEmpregados()) {
            System.out.println(empregado.getNome() + " - " + empregado.getCargo());
        }

        empregado1.atualizarInformacoes("João da Silva", "Supervisor", 3500.0);

        empregado2.transferirParaDepartamento(departamento1);

        System.out.println("\nEmpregados do departamento " + departamento1.getNome() + " após transferência:");
        for (Empregado empregado : departamento1.obterEmpregados()) {
            System.out.println(empregado.getNome() + " - " + empregado.getCargo());
        }

        System.out.println("\nEmpregados do departamento " + departamento2.getNome() + " após transferência:");
        for (Empregado empregado : departamento2.obterEmpregados()) {
            System.out.println(empregado.getNome() + " - " + empregado.getCargo());
        }
    }
}
