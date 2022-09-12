import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате уууу");
        int yeare = scanner.nextInt();

        if (yeare % 400 == 0) {
            System.out.println("Количество дней 366");

        } else if (yeare % 100 == 0) {
           System.out.println("Количество дней 365");

        } else if (yeare % 4 ==0){
            System.out.println("Количество дней 366");

        }else {
            System.out.println("Количество дней 365");
        }


    }
}
