package Arrayss;

public class SearchGivenNo {

	public static void main(String[] args) {
		int []num=new int[4];
		num[0]=21;
		num[1]=22;
		num[2]=23;
		num[3]=24;
		int count=0;
		
		int no=6;
		for(int i=0;i<num.length;i++) {
			if(num[i]==no) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Yes 6 is present");
		}
		else {
			System.out.println("No 6 is not presentg");
		}

	}

}
