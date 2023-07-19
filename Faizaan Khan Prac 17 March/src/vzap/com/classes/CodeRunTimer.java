package vzap.com.classes;

public class CodeRunTimer {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            char ch = 'A';
            while (ch <= 'Z') {
                System.out.print(ch + " ");
                ch++;
            }
        }
        long endTime = System.currentTimeMillis();
        long oTime = endTime - startTime;
        System.out.println("Time to complete task: " + oTime + " milliseconds");
    }
}

