public class Aula02{
    public static void main(String[] args) throws Exception {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // AND
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));

        // OR
        System.out.println("b2 || b3: " + (b2 || b3));
        System.out.println("b2 || b4: " + (b2 || b4));

        // XOR
        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b4 ^ b1: " + (b4 ^ b1));
         
        // NOT
        System.out.println(!b1);
        System.out.println(!b2);

        /* 
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        */
        
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int qtdDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (qtdDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = qtdDependentes >= mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebe auxílio = " + recebeAuxilio);


    }
}
