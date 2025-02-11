///PRINT THE SUBSETS OF THE ARRAY WHOSE SUM IS S///


import java.util.*;


public class SubSum{
    public static void subset(int i,int s,int arr[],int sum,List<Integer> newarr){
       if(i==arr.length){
           if(s==sum) System.out.println(newarr);
           return;
       }
       newarr.add(arr[i]);
       s+=arr[i];
       subset(i+1,s,arr,sum,newarr);
       newarr.remove(newarr.size()-1);
       s-=arr[i];
       subset(i+1,s,arr,sum,newarr);
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int sum=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	subset(0,0,arr,sum,new ArrayList<>());
	}
}