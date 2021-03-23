package chapter5;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] cube = {
                {
                        {1, 2, 3, 4},
                        {6, 9, 12}
                },
                {
                        {4, 8, 16, 32, 64},
                        {11, 13, 17, 19}
                },
                {
                        {0, -1, -2, -3, -4, -5, -6},
                        {100, 1000, 10000}
                }
        };

        for (int a = 0; a < cube.length; a++) {
            for (int b = 0; b < cube[a].length; b++) {
                for (int c = 0; c < cube[a][b].length; c++) {
                    if(c < cube[a][b].length - 1) System.out.print(cube[a][b][c] + ", ");
                    else System.out.println(cube[a][b][c]);
                }
            }
        }
    }
}
