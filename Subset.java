import java.util.*;
public class Subset
{
    public static void subset(int i,int arr[],List<Integer> newarr){
       if(i==arr.length){
           System.out.print(newarr);
           return;
       }
       newarr.add(arr[i]);
       subset(i+1,arr,newarr);
       newarr.remove(newarr.size()-1);
       subset(i+1,arr,newarr);
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	subset(0,arr,new ArrayList<>());
	}
}
