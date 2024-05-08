import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1,2,3
        {
            int[] first = new int[3];
            first[0] = 1;
            first[1] = 2;
            first[2] = 3;
            for (int i = 0; i < first.length; i++) {
                if (i == first.length - 1) {
                    System.out.println(first[i]);
                    break;
                }
                System.out.print(first[i] + ", ");
            }
            for (int i = first.length - 1; i >= 0; i--) {
                System.out.print(first[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            //Задача 4
            System.out.println();
            for (int i = 0; i < first.length; i++) {
                if (i % 2 == 0) {
                    first[i] += 1;
                }
            }
            System.out.println(Arrays.toString(first));
            System.out.println();
        }
        {
            double[] second = {1.57, 7.654, 9.986};
            for (int i = 0; i < second.length; i++) {
                if (i == second.length - 1) {
                    System.out.println(second[i]);
                    break;
                }
                System.out.print(second[i] + ", ");
            }
            for (int i = second.length - 1; i >= 0; i--) {
                System.out.print(second[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        {
            int[] third = new int[]{2, 4, 16, 32, 64, 128, 256, 512};
            for (int i = 0; i < third.length; i++) {
                if (i == third.length - 1) {
                    System.out.println(third[i]);
                    break;
                }
                System.out.print(third[i] + ", ");
            }
            for (int i = third.length - 1; i >= 0; i--) {
                System.out.print(third[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
        }
    }
}