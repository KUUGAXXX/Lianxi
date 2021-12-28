package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class KK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            TreeSet<Integer> set = new TreeSet<Integer>();
            int n = Integer.parseInt(line.split("")[0]);
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    String line1 = br.readLine();
                    set.add(Integer.parseInt(line1.split("")[0]));
                }
            }
            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
}