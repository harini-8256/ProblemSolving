package recursion;
import java.util.*;
public class TowerOfHonai {
  static void towerOfHanoi(int n, char from_rod,char to_rod, char aux_rod)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                           + from_rod + " to rod "
                           + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoi(n, 'A', 'C',  'B');
        scanner.close();
    }

}

