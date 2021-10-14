public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel gerente = new Cliente();
        Gerente g1 = new Gerente();

        g1.setNome("Joao");
        g1.setCpf("48769588821");
        g1.setSalario(2500.0);
        g1.setSenha(2222);
        System.out.println(g1.getCpf());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());

        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);
    }
}
