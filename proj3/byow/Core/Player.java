package byow.Core;

import byow.TileEngine.TETile;
import byow.TileEngine.Tileset;

import java.io.Serializable;

public class Player implements Serializable {
    int x;
    int y;

    int lightRadius;

    int lightPick = 0;

    TETile[][] world;

    int moves;

    public Player(int x, int y, TETile[][] world) {
        this.x = x;
        this.y = y;
        this.lightRadius = 10;
        this.moves = 0;
        this.world = world;
    }

    public void mover(int dx, int dy) {
        if (!world[x + dx][y + dy].equals(Tileset.WALL)) {
            this.x += dx;
            this.y += dy;
            this.moves++;
        } else {
            System.out.println("Ouch! hit a wall");
        }
    }
}
