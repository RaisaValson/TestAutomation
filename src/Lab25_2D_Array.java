public class Lab25_2D_Array {
    public static void main(String[] args) {
        int[][]  dMatrix = {
                {3, 5, 7},
                {8, 10, 12},
                {6, 11, 4}
        };

        for(int i=0;i<dMatrix.length;i++){
            for(int j=0;j<dMatrix.length;j++){
                    System.out.print(dMatrix[i][j]);
                    System.out.print(" ");
                }
            System.out.println(" ");
            }
        }
    }

