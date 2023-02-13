import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = scan.nextInt();
            list.add(num);
        }
        int queries = scan.nextInt();
        for(int i = 0; i < queries; i++){
            String query = scan.next();
            if(query.equals("Insert")){
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            }
            else{
                int toRemove = scan.nextInt();
                list.remove(toRemove);
            }
        }
        int length = list.size();
        for(int i = 0; i < length; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
