package chapter1;



import java.util.*;



import java.util.Scanner;

public class PrintHourGlass {


	public static int max=0;
	public static void printHourGlass(int[][] arr ){
		
		for(int i=0;i<6;i++){
        	
        	for(int j=0;j<6;j++){
        		
        		if((6-i)>=3 && (6-j)>=3){
        			//System.out.println("------------------");
        			printGlass(i, j, arr);
        			
        			
        			//System.out.println("------------------");
        			
        		}
        	}
        	
        }
		
	}
	
	public static void printGlass(int i,int j,int[][] arr){
		int sum=0;
		int index1=0;
		int index2=0;
		for(;index1<3;index1++){
			index2=0;
			for(;index2<3;index2++){
				
			//	System.out.println("index 1 2 "+index1+"-"+index2);
				if((index1==1 && index2==0)|| (index1==1 && index2==2)){
					//System.out.print(" ");
				}else{
					//System.out.print(arr[i+index1][j+index2]+" ");
					sum=sum+arr[i+index1][j+index2];
				}
			}
			
			//System.out.println();
			
		}
		
		if(max<sum){
			max=sum;
		}
	}

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args)  {
	       
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	           // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }

	        /*for(int i=0;i<6;i++){
	        	
	        	for(int j=0;j<6;j++){
	        		System.out.print(arr[i][j]+" ");
	        	}
	        	System.out.println();
	        }

	        System.out.println();*/
	        
	        printHourGlass(arr);
	        
	        System.out.println(max);
	        
	        scanner.close();
	    }
	}
