package Task1;

public class Main {
    public static void main(String[] args) {
        methodA(0);
    }
    private static void methodA(int i){
        if(i == 0){
            System.out.print("J");
            methodB(i+1);
        } else if(i == 5) {
            System.out.print("r");
            methodB(i+1);
        } else {
            System.out.print("v");
            methodB(i+1);
        }

    }
    private static void methodB(int i){
        if(i < 5) {
            System.out.print("a");
            if(i < 3){
                methodC(i+1);
            } else {
                methodD(i+1);
            }
        } else if(i < 8) {
            System.out.print("s");
            methodC(i+1);
        } else {
            System.out.print("t");
        }
    }
    private static void methodC(int i){
        if(i == 2|| i == 9) {
            System.out.print("v");
            methodB(i+1);
        } else {
            System.out.print("j");
            methodD(i+1);
        }


    }
    private static void methodD(int i){
        if(i == 4){
            System.out.print("e");
            methodA(i+1);
        } else {
            System.out.print("o");
            methodA(i+1);
        }

    }
}