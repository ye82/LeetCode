package DataStructure;
import java.util.*;

public class DanDiaoStack {
    public static void main(String[] args) {
        int[] t = {73,74,75,71,69,72,76,73};
        int[] a = dailyTemperatures(t);
        for(int n:a) {
            System.out.print(n + " ");
        }
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[]res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int p = stack.pop();
                res[p] = i - p;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }
        return res;
    }
}
