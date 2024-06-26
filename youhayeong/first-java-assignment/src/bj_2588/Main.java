package bj_2588;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        sb.append(a * (b % 10)).append("\n");
        sb.append(a * (b / 10 % 10)).append("\n");
        sb.append(a * (b / 100)).append("\n");
        sb.append(a * b);

        System.out.println(sb);

        br.close();
    }
}