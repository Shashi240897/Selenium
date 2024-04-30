package Arrayss;

public class AvgString {

	public static void main(String[] args) {
		int num[]=new int[5];
		num[0]=21;
		num[1]=22;
		num[2]=23;
		num[3]=24;
		num[4]=25;
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
        double avg=sum/num.length;
        System.out.println(avg);
	}

}
