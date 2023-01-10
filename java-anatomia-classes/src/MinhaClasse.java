public class MinhaClasse {
    // corpo da classe

    public static void main(String[] args) {
        // corpo do método main 
        String primeiroNome = "bárbara";
        String segundoNome = "hellen";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }

}

