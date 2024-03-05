package exerc1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exerc1 {
//    Scanner scanner = new Scanner(System.in);
//
//    private  String dateBirthString;
//    private LocalDate dataInicial = LocalDate.parse(dateBirthString,  DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//    private LocalDate dataFinal = LocalDate.now();
//
//    public void lerIdade(){
//
//        System.out.println("Digite sua data de nascimento em yyyy-mm-dd \n" + "Ex: 2000-11-25" );
//
//        dateBirthString = scanner.nextLine();
//    }
//
//    public Long converterIdadeParaDias(){
//        Long ageInDays = ChronoUnit.DAYS.between(dataInicial, dataFinal);
//        return ageInDays;
//    }

//    public  Long justNumbers(){
//        StringBuilder digitos = new StringBuilder();
//        char[] letras = ageString.toCharArray();
//
//        for(char letra : letras){
//            if (Character.isDigit(letra)){
//                digitos.append(letra);
//            }
//        }
//
//        if (digitos.isEmpty()){
//            return null;
//        }
//
//        return Long.parseLong(digitos.toString());
//    }




    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String dateBirthString;

        System.out.println("Digite sua data de nascimento em yyyy-mm-dd \n" + "Ex: 17-05-2005" );
        dateBirthString = scanner.nextLine();

        LocalDate dataInicial = LocalDate.parse(dateBirthString,  DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate dataFinal = LocalDate.now();


        Long ageInDays = ChronoUnit.DAYS.between(dataInicial, dataFinal);

        System.out.println("Dias:" + ageInDays);



    }

}

