
package Array_demo;

/**
 *
 * @author Masud Rana
 */
public class JaggedArray {
    
    public static void main(String[] args){
        
        int num[][]=new int [3][];
        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[2];
        
        int count=0;
        for (int i = 0; i < num.length; i++) 
            for(int j=0;j<num[i].length;j++)
                num[i][j]=count++;
        
        for (int i=0;i<num.length;i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
            
        }
            
        
        
        //declaring a 2D array with odd columns
        /*int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        //initializing a jagged array
        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;
 
        //printing the data of a jagged array
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }*/
    }
}

