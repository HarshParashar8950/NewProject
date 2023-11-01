package array;

public class reverseofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=32145;
		int position =1;
		int ans=0;
		while(n!=0) {
			int digit=n%10;
			int invd=position;
			int invp = digit;
			
			
			
			ans=ans+invd*(int)Math.pow(10,invp-1);
			position++;
			n=n/10;
		}
		
		System.out.println(ans);

	}

}
