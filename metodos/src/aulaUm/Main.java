package aulaUm;
public class Main {
    public static void main(String[] args) {
        // calculadora
        System.out.println("exercício calculadora:");
        
        Calculadora.soma(12,25);
        Calculadora.subtracao(9,1.8);
        Calculadora.divisao(25, 5);
        Calculadora.multiplicacao(5,2.5);

        // mensagem
        System.out.println("\nexercício mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);
        Mensagem.obterMensagem(29);

        //empréstimo
        System.out.println("\nexercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
      
    }
}
