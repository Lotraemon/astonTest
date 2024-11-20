import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n" + "������� 1:");
        printThreeWords();

        System.out.println("\n" + "������� 2:");
        checkSumSign();

        System.out.println("\n" + "������� 3:");
        printColor();

        System.out.println("\n" + "������� 4:");
        compareNumbers();

        System.out.println("\n" + "������� 5:");
        System.out.println(checkBetweenTenTwenty(2,15));

        System.out.println("\n" + "������� 6:");
        showPositiveOrNegative(0);

        System.out.println("\n" + "������� 7:");
        System.out.println(checkNegativeNumb(-5));

        System.out.println("\n" + "������� 8:");
        printWord("Test",4);

        System.out.println("\n" + "������� 9:");
        System.out.println(isLeapYear(2024));

        System.out.println("\n" + "������� 10:");
        int[] array = {1,1,0,1,0,0,0,1,0,1,1};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1) {
             array[i] = 0;
            }
            else
                array[i] = 1;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("\n" + "������� 11:");
        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++){
            array100[i] = i + 1;
        }
        System.out.println(Arrays.toString(array100));

        System.out.println("\n" + "������� 12:");
        int[] array1 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array1.length; i++){
            if (array1[i] < 6){
                array1[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("\n" + "������� 13:");
        int[][] matrix = new int[33][33];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (i == j || i + j == matrix.length - 1){
                    matrix[i][j] = 1;
                }
                else
                    matrix[i][j] = 88;
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n" + "������� 14");
        System.out.println(Arrays.toString(createArray(10,4)));


    }
    //������� 1
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //������� 2
    static void checkSumSign(){
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0){
            System.out.println("����� �������������");
        }
        else
            System.out.println("����� �������������");
    }

    //������� 3
    static void printColor(){
        int value = 101;
        if (value <= 0) {
            System.out.println("�������");
        } else if (0 < value && value <= 100){
            System.out.println("������");
        }
        else
            System.out.println("�������");
    }

    //������� 4
    static void compareNumbers(){
        int a = 1;
        int b = 2;
        if (a >= b){
            System.out.println("a >= b");
        }
        else
            System.out.println("a < b");
    }

    //������� 5
    static boolean checkBetweenTenTwenty(int a, int b){
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    //������� 6
    static void showPositiveOrNegative(int a){
        if (a < 0){
            System.out.println("����� " + a + " - �������������");
        }
        else System.out.println("����� " + a + " - �������������");
    }

    //������� 7
    static boolean checkNegativeNumb(int a){
        if (a < 0){
            return true;
        }
        else
            return false;
    }

    //������� 8
    static void printWord(String s, int a){
        for (int i = 0; i < a; i++){
            System.out.println(s);
        }
    }

    //������� 9
    static boolean isLeapYear(int i){
        return i % 4 == 0 || i % 100 == 0 || i % 400 == 0;
    }

    //������� 14
    static int[] createArray (int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }
}