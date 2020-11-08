package sample;

public class test {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int v: test) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println();

        for (int i=0; i < test.length; i++) {
            for (int j=i+1; j < test.length; j++) {
                if (test[i] == test[j]) {
                    System.out.print(test[i] + " = " + test[j] + ", ");
                }
            }
        }
    }
}
