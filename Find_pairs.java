import java.util.*;
public class Find_pairs 
{
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in); 
     int N=sc.nextInt();
     int arr[]=new int[N];
     int M=sc.nextInt();
     int arr1[]=new int[M];
     int key=sc.nextInt();
     for(int i=0;i<N;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     for(int i=0;i<M;i++)
     {
    	 arr1[i]=sc.nextInt();
     }
     for (int i = 0; i < N; i++) 
      for (int j = 0; j < M; j++) 
      if (arr[i] + arr1[j] == key) 
       System.out.println(arr[i] + " " + arr1[j]); 
     sc.close();
	}
}
