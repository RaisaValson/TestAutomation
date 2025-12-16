public class Lab27_RightTriangle {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
