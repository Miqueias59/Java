
public class StringMethod {
    public static void main(String[] args) {
        String phrase = "This is an example sentence for counting characters and words";

        String sentenceOne = "String methods test part one" ;
        String sentenceTwo = " String methods test part two" ;

        int characterNumber = phrase.length();
        int wordsNumber = phrase.split("\\s+").length;





        System.out.println("Número de caracteres: " + wordsNumber);
        System.out.println("Número de caracteres: " + characterNumber);
        System.out.println(sentenceOne.indexOf("one"));
        System.out.println(sentenceOne.toUpperCase());
        System.out.println(sentenceOne.toLowerCase());
        System.out.println(sentenceOne.indexOf(sentenceTwo));



        }
    }