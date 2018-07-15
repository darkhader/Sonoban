

import java.util.Random;
import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) {
        String[][] map = {
                {"G", "*", "y", "*"},
                {"*", "*", "*", "*"},
                {"x", "*", "P", "*"},
                {"*", "*", "*", "*"}
        };

        Scanner scanner = new Scanner(System.in);
        int ex = 2;
        int ey = 2;
        int playerX = 2;
        int playerY = 2;

        while (true) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[j][i] + " ");
                }
                System.out.println();
            }

            System.out.println("Nhap ky tu ban phim: ");
            String key = scanner.next();
            map[ex][0] = "*";
            map[0][ey] = "*";
            map[0][0] = "G";
            map[playerX][playerY] = "*";
            Random rd = new Random();
            switch (key) {
                case "w":

                    playerY -= 1;
                    ex += rd.nextInt(3) - 1;
                    ey += rd.nextInt(3) - 1;
                    break;
                case "s":
                    playerY += 1;
                    ex += rd.nextInt(3) - 1;
                    ey += rd.nextInt(3) - 1;
                    break;
                case "a":
                    playerX -= 1;
                    ex += rd.nextInt(3) - 1;
                    ey += rd.nextInt(3) - 1;
                    break;
                case "d":
                    playerX += 1;
                    ex += rd.nextInt(3) - 1;
                    ey += rd.nextInt(3) - 1;
                    break;
            }
            if (ey == -1) {
                ey = map.length - 1;
            }
            if (ey == map.length) {
                ey = 0;
            }
            if (ex == -1) {
                ex = map.length - 1;
            }
            if (ex == map.length) {
                ex = 0;
            }
            if (playerY == -1) {
                playerY = map.length - 1;
            }
            if (playerY == map.length) {
                playerY = 0;
            }
            if (playerX == -1) {
                playerX = map.length - 1;
            }
            if (playerX == map.length) {
                playerX = 0;
            }
            if (playerX == ex && playerY == 0) {
                System.out.println("thua");
                break;
            }
            if (playerX == 0 && playerY == ey) {
                System.out.println("thua");
                break;
            }
            if(playerX ==0 && playerY ==0){
                System.out.println("Win");
                break;
            }
            map[playerX][playerY] = "P";
            map[ex][0] = "x";
            map[0][ey] = "y";

        }
    }

}
