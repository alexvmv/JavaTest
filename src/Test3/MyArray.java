package Test3;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int x = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = x;

        if (myArray.length % 2 == 1 && myArray.length != 1) {

            System.out.println(myArray[0]+ myArray[myArray.length / 2]);
        }

        else {
            System.out.println("Среднего элемента нет");
        }

    }
}
