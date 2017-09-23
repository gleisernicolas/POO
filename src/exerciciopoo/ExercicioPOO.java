package exerciciopoo;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ExercicioPOO {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int escolha;

        System.out.println("------Menu ------");
        System.out.println("1- Exercicio 1");
        System.out.println("2- Exercicio 2");
        System.out.println("3- Exercicio 3");
        System.out.println("4- Exercicio 4");
        System.out.println("5- Exercicio 5");
        System.out.println("6- Exercicio 6");
        System.out.println("7- Exercicio 7");
        System.out.println("8- Exercicio 8");
        System.out.println("9- Exercicio 9");
        System.out.println("10- Exercicio 10");
        System.out.println("----------------");
        System.out.println("Escolha uma opção:");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1: //saber qual dia da semana estamos
                Date d = new Date();
                Calendar c = new GregorianCalendar();
                c.setTime(d);
                String nome = "";
                int dia = c.get(c.DAY_OF_WEEK);
                switch (dia) {
                    case Calendar.SUNDAY:
                        nome = "Domingo - Promoçao de almoço e sobremesas";
                        break;
                    case Calendar.MONDAY:
                        nome = "Segunda - Dia de Dormir";
                        break;
                    case Calendar.TUESDAY:
                        nome = "Terça - Dia de comprar seu carro 0KM";
                        break;
                    case Calendar.WEDNESDAY:
                        nome = "Quarta - Promoçao de Cerveja e porções";
                        break;
                    case Calendar.THURSDAY:
                        nome = "Quinta - Promoçao de porções";
                        break;
                    case Calendar.FRIDAY:
                        nome = "Sexta - Promoçao de Cerveja";
                        break;
                    case Calendar.SATURDAY:
                        nome = "sábado - Dia de Promoçao de Pizza";
                        break;
                }
                System.out.println(nome);
                break;

            case 2: //saber q dia é hj e colocar no formato brasileiro
                Date d1 = new Date();
                String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d1);
                System.out.println(dStr);
                break;

            case 3: //qnts dias a pessoa vivveu
                Scanner userInput = new Scanner(System.in);

                System.out.println("Digite a data de hoje");
                System.out.print("Ano: ");
                int todayYear = userInput.nextInt();
                System.out.print("Mês: ");
                int todayMonth = userInput.nextInt();
                System.out.print("Dia: ");
                int todayDay = userInput.nextInt();

                // Java has January as month 0. Let's not require that the user know.
                Calendar today = new GregorianCalendar(todayYear, todayMonth - 1,
                        todayDay);

                System.out.println("Digite a data do seu aniversario");
                System.out.print("Ano de Nascimento: ");
                int yearBorn = userInput.nextInt();
                System.out.print("Mês: ");
                int monthBorn = userInput.nextInt();
                System.out.print("Dia: ");
                int dayBorn = userInput.nextInt();
                Calendar born = new GregorianCalendar(yearBorn, monthBorn - 1, dayBorn);

                double diff = today.getTimeInMillis() - born.getTimeInMillis();
                diff = diff / (24 * 60 * 60 * 1000); // hours in a day, minutes in a hour,
                // seconds in a minute, millis in a
                // second.
                System.out.println("Você viveu " + Math.round(diff) + " dias");

                break;

            case 4: //separar data por dia, mes e ano
                Date data = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(data);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                System.out.println("Day: " + day);
                System.out.println("Month: " + month);
                System.out.println("Year: " + year);
                break;

            case 5://verifica se a data é valida
                System.out.println("Digite uma data:");
                String s = "01/08/2009";
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                df.setLenient(false); // aqui o pulo do gato
                try {
                    df.parse(s);
                    // data válida
                    System.out.println("Data válida");
                } catch (ParseException ex) {
                    // data inválida
                    System.out.println("Data inválida: " + ex);
                }

        }

    }
}
