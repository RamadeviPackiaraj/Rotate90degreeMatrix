import java.util.Scanner;
public class Rotate90Degree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row Value:");
        int rows=sc.nextInt();
        System.out.println("Enter the Colomn Value:");
        int cols=sc.nextInt();
        
        
        int[][] Matrix=new int[rows][cols];
        System.out.println("Enter the Matrix Values:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
       
       int[][] rotate=Rotate90degree(Matrix,rows,cols);
       
       System.out.println("The 90 Degree Rotated Matrix:");
       
       for(int i=0;i<cols;i++){
           for(int j=0;j<rows;j++){
            System.out.print(rotate[i][j]+" ");           }
           System.out.println();
       }
        sc.close();
    }
    public static int[][] Rotate90degree(int[][] Matrix,int rows,int cols){
        int[][] rotate=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                rotate[j][rows-1-i]=Matrix[i][j];
            }
        }
        return rotate;
    }
}