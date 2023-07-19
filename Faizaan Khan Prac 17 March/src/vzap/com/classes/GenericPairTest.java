package vzap.com.classes;

import java.util.Scanner;

public class GenericPairTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pairs<String> firstPairA = new Pairs<>();
        System.out.print("Enter first value for FirstPairA: ");
        String firstValue = scanner.nextLine();
        System.out.print("Enter second value for FirstPairA: ");
        String secondValue = scanner.nextLine();
        firstPairA.setFirstValue(firstValue);
        firstPairA.setSecondValue(secondValue);
        System.out.println("FirstPairA: " + firstPairA.toString());

        System.out.print("Enter first value for PairStringB: ");
        firstValue = scanner.nextLine();
        System.out.print("Enter second value for PairStringB: ");
        secondValue = scanner.nextLine();
        Pairs<String> pairStringB = new Pairs<>(firstValue, secondValue);
        System.out.println("PairStringB: " + pairStringB.toString());


        if (firstPairA.equals(pairStringB)) {
            System.out.println("FirstPairA and PairStringB are equal.");
        } else {
            System.out.println("FirstPairA and PairStringB are not equal.");
        }
    }
}
