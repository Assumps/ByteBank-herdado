public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Joao");
        String nome = g1.getNome();
        g1.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();






        EditorVideo ev = new EditorVideo();
        ev.setSalario(200.0);
        
        controle.registra(g1);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }

}
