
import java.util.*;

public class CircularGame {

    public static int findTheWinner(int n, int k) {
        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        int index = 0;
        while (players.size() > 1) {
            index = (index + k - 1) % players.size();
            players.remove(index);
        }
        return players.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }
}
