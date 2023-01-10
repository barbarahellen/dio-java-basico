public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;

        if (mediaFinal < 5)
            System.out.println("REPROVADO");
        else if (mediaFinal == 5)
            System.out.println("PROVA FINAL");
        else
            System.out.println("APROVADO");
    }
        
}
