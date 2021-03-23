package chapter5;

public class Squares {
    public static void main(String[] args) {
        int[][] squares = {
                { 1, 1 },
                { 2, 4 },
                { 3, 9 },
                { 4, 16 },
                { 5, 25 },
                { 6, 36 },
                { 7, 49 },
                { 8, 64 },
                { 9, 81 },
                { 10, 100 }
        };

        for (int a = 0; a < squares.length; a++) {
            for (int b = 0; b < squares[a].length; b++) {
                if(b < squares[a].length - 1) System.out.print(squares[a][b] + ", ");
                else System.out.println(squares[a][b]);
            }
        }
    }
}
