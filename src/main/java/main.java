import com.coder.solution.Solution5;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        solution5.push(1);
        solution5.push(2);
        solution5.push(3);
        System.out.println(solution5.pop());
        System.out.println(solution5.pop());
        solution5.push(4);
        System.out.println(solution5.pop());
        solution5.push(5);
        System.out.println(solution5.pop());
    }
}
