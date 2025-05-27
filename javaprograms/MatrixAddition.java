import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String[] args) 
    {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        n = s.nextInt();
        if (p == m && q == n) 
        {
            int mat1[][] = new int[p][q];
            int mat2[][] = new int[m][n];
            int result[][] = new int[m][n];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    mat1[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    mat2[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        result[i][j] = mat1[i][j] + mat2[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition would not be possible");
        }
    }
}