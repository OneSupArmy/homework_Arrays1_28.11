import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1 - Ex 1
        byte[] arrayInt11 = new byte[3];
        arrayInt11[0] = 1;
        arrayInt11[1] = 2;
        arrayInt11[2] = 3;
        //Task 1 - Ex 2
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};
        //Task 1 - Ex 3
        String[] arrayInt13 = {"Hello", "new", "world"};
        //Task 2 - Ex 1,2,3
        for (int i = 0; i < arrayInt11.length; i++) {
            if (i == arrayInt11.length - 1) {
                System.out.println(arrayInt11[i]);
            } else {
                System.out.print(arrayInt11[i] + ", ");
            }
        }
        for (float element: arrayFloat) {
            if (element == arrayFloat[arrayFloat.length - 1]) {
                System.out.print(element + "\n");
            } else {
                System.out.print(element + ", ");
            }
        }
        String array13Print = Arrays.toString(arrayInt13);
        System.out.println(array13Print + "\n");
        //Task 3 - Ex 1,2,3
        for (int i = arrayInt11.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayInt11[i]);
            } else {
                System.out.print(arrayInt11[i] + ", ");
            }
        }
        for (int i = arrayFloat.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.println(arrayFloat[i]);
            } else {
                System.out.print(arrayFloat[i] + ", ");
            }
        }
        for (int i = arrayInt13.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.println(arrayInt13[i] + "\n");
            } else {
                System.out.print(arrayInt13[i] + ", ");
            }
        }
        //Task 4
        for (int i = 0; i < arrayInt11.length; i++) {
            arrayInt11[i] = arrayInt11[i] % 2 != 0 ? (byte)(arrayInt11[i] + 1) : arrayInt11[i];
            if (i == arrayInt11.length - 1) {
                System.out.println(arrayInt11[i]);
            } else {
                System.out.print(arrayInt11[i] + ", ");
            }
        }
    }
}
