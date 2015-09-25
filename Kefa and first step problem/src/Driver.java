
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	
		private  int count;
		ArrayList <Integer> sequence=new ArrayList<Integer>();

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		

	
	public static void main(String[] args) {
	
		Driver k=new Driver();
		Scanner  input=new Scanner(System.in);
		
		k.setCount(input.nextInt());
	
		
		Scanner list=new Scanner(System.in);
		
		
		
		String s=list.nextLine();
	
		
		for (int i=0;i<s.length();i++){
			
			int we=Integer.parseInt(s.substring(i, i+1));
			k.sequence.add(we);
			we++;
			
		}
		
	
		System.out.println(findNumber(k.sequence,k.getCount()));

	}

	private static  int findNumber(ArrayList<Integer> p,int l) {

		
		int answer=1;
		int index=0;
		int first=p.get(0);
		int max=1;
		for(int i=0;i<l-1;i++){
			index++;
			if(first<=p.get(index)){
				answer++;
				first=p.get(index);
			}
			if(answer>max){
				max=answer;
			}
			if(first>p.get(index)){
				answer=0;
				
			}
			
			
		}
		return max;
		
	}

	
}
