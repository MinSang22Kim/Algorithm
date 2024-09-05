import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        checkTimeComplexity(n);
    }

    private static void checkTimeComplexity(long n) {

        System.out.println(n*n*n);
        System.out.print(3);
    }
}
