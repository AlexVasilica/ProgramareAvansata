package com;

public class Problem {
    Problem(int n)
    {
        int[][] matrix = new int[n][n];
        matrix[0][0] = 2;
        matrix[0][1] = 3;
        matrix[0][2] = 5;
        matrix[1][0] = 2;
        matrix[1][1] = 4;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 6;
        matrix[2][2] = 9;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
