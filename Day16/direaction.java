// Question 1

// You have a Given route containing 4 directions (E, W, N, S)
// find the shortest path of the Given direction.

// 		"WNEENESENNN";

package Day16;

import java.util.*;

public class direaction {

    public static int shortestPath(String path) {
        int x = 0;
        int y = 0;

        // find the shortest path
        int l = path.length();

        for (int i = 0; i < l; i++) {
            char dir = path.charAt(i);
            // System.out.println(dir);

            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;

            } else if (dir == 'N') {
                y++;

            } else {
                y--;
            }

        }

        int x2 = x * x;
        int y2 = y * y;

        int result = (int) Math.sqrt(x2 + y2);
        return result;

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        int result = shortestPath(path);
        System.out.println("Shortest Path :" + result);

    }
}
