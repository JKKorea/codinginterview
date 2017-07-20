package codinginterview;

public class Painter {
	public static void paint(int[][] image, int x, int y, int newC) {
        paintRec(image, x, y, newC, image[y][x]);
    }

    private static void paintRec(int[][] image, int x, int y, int newC, int targetC){
        if(y<0 || x<0 || y>=image.length || x>=image[0].length){
            return;
        }
        if(image[y][x]==newC || image[y][x] !=targetC){
            return;
        }

        image[y][x] = newC;
        paintRec(image, x+1, y, newC, targetC);
        paintRec(image, x, y+1, newC, targetC);
        paintRec(image, x-1, y, newC, targetC);
        paintRec(image, x, y-1, newC, targetC);

    }
}
