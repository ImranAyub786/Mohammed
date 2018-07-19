
public class blackjack2 {
	
	public static void blackjack2() {
			}

	public int blackjack(int a, int b) {
		if  (a > 21) {
			if ( b > 21) {
			return 0;
			}
			return b;
		}
		
		else if(b>21) return a;
		return (b);
					
		
	}

	}

