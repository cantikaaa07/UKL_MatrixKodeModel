
package ukl_matrixkodemodel_cantika;


public class UKL_MatrixKodeModel_Cantika {

    
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 5; 
        int total = 0;
        int[][] matrix = new int[n][n];
        System.out.println("Matrix 5 kolom");
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b; 
            }
            System.out.println();
        }
        for (int i= n-1; i>=0; i--) {
            for (int j=0; j<=i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);
                
                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }
        System.out.println("Jumlah: " + total);
    }
    }
    

