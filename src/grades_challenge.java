import java.util.Scanner;

public class grades_challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("How many grades: ");
        int qty = input.nextInt();
        double grades[] = new double[qty];
        double media = 0;

        for (int i = 0; i < grades.length; i++){
            System.out.printf("Nota "+i+": ");
            grades[i] = input.nextDouble();
            media += grades[i];
        }

        System.out.println("Media: "+ media/grades.length);

    }
}
