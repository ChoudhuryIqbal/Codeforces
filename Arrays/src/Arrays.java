import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * the question of this problem will be found here"http://codeforces.com/contest/572/problem/A"
 * @author Nafees_Iqbal
 *
 */
public class Arrays {
	int k,m;
	static int [] A;
	static int[] B;
	static int numA;
	static int numB;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int k=Integer.parseInt(input.next());
		int m=Integer.parseInt(input.next());
		
		 numA=Integer.parseInt(input.next());
		 numB=Integer.parseInt(input.next());
		A=new int[k];
		B=new int[m];
		//System.out.println(A.length);
	A=readNumsFromCommandLine();
	//System.out.println(A.length);
	//System.out.println(A[1]);
	B=readNumsFromCommandLine();
		
		
		int loop=B.length;
		boolean found=true;
		for(int i=0;i<numA;i++){
			for(int j=loop-numB;j<loop;j++){
				while( found){
				if(A[i]>=B[j]){
					//System.out.println("YES");
					//found=false;
					found=false;
					System.out.println();
				}
				else{
					//System.out.println("NO");
					found=false;
					System.out.println("YES");
				}
				}
			}
		}
		
		

	}
	public static int [] readNumsFromCommandLine() {
		Scanner sc=new Scanner(System.in);

		 String inputty = sc.nextLine();
		    StringTokenizer strToken = new StringTokenizer(inputty);
		    int count = strToken.countTokens();
		    //Reads in the numbers to the array
		    //System.out.println("Count: " + count);
		    int[] arr = new int[count];

		    for(int x = 0;x < count;x++){
		        arr[x] = Integer.parseInt((String)strToken.nextElement());
		    }
			return arr;
    }

}
