public class Restaurante {


    public static void main(String[] args) {
        String amigos = args[0];
        String valoConta = args[1];

        boolean amigosEhNumero = amigos.matches ("[0-9]*?[1-9][0-9]*");
        boolean valorContaEhNumero = valoConta.matches("\\-?\\d+(\\.\\d+)?");

        if (amigosEhNumero && valorContaEhNumero) {
            Integer numAmigos = Integer.parseInt(amigos);
            Double totalConta = Double.parseDouble(valoConta);

            Double ValorIndividual = totalConta/numAmigos;

            System.out.println(ValorIndividual);
        } else {
            System.out.println("Entrada Inválida");
        }
    }
}
