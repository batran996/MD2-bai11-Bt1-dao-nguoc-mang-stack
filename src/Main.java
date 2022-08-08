import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("nhap loai mang mong muon \n 1: String \n 2: kieu so");
//        b = scanner.nextInt();
        b = Integer.parseInt(scanner.nextLine());
        if (b !=1 && b !=2){
            System.out.println("nhap sai kieu");
            return;
        }else {
            System.out.println("nhap vao so phan tu mang arr");
//            a = scanner.nextInt();
            a= Integer.parseInt(scanner.nextLine());
            Object[] array = new Object[a];
            System.out.println("nhap vao mang");
            for (int i = 0; i < a; i++) {
                if (b ==1){
                    System.out.print("array["+i+"] = ");
                    array[i] = scanner.nextLine();

                }else{
                    System.out.print("array["+i+"] = ");
                    array[i] = scanner.nextInt();

                }
            }
            System.out.println(Arrays.toString(array));

            Stack<Object> stack = new Stack<>();
            for (int i = 0; i < a; i++) {
                stack.push( array[i]);
            }
            System.out.println("sau khi push vao stack");
            System.out.println(stack);
            for (int i = 0; i < array.length; i++) {
                array[i] = stack.pop();
            }
            System.out.println("push lai vao mang array " + Arrays.toString(array));
        }


    }
}