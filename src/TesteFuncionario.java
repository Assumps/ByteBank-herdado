public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();

        funcionario.setNome("Joao Vitor");
        funcionario.setCpf("487-695-888-21");
        funcionario.setSalario(4500.0);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getBonificacao());

    }
}
