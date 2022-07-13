public class Main {
    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        contaBanco p2 = new contaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("CP");


        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}