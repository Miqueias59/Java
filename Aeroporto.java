

public class Aeroporto {

    public static void main(String[] args) {
        String classMala = args[0];
        String pesoMala = args[1];

        boolean ehNumeroPesoMala = pesoMala.matches ("\\-?\\d+(\\.\\d+)?");

        if(ehNumeroPesoMala &&  (classMala.equals("M") || classMala.equals("P"))){
            Double peso = Double.parseDouble(pesoMala);
            if ((classMala.equals("M") && peso >10) || (classMala.equals("P") && peso >23)){
                System.out.println("A bagagem não está dentro do limite de peso permitido para a categoria: " + classMala);
            } else {
                System.out.println("A bagagem está dentro da categoria " + classMala + " com o peso de "+  peso + "Kg");
            }
        } else {
            System.out.println("Entrada Invalida");
        }
    }

}
