
public class arrays {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        String value;
        double product;
        System.out.println("Please enter how many numbers you want to process");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Please enter a value");
            value = sc.nextLine();
        }
        product = (i * i);
        //If i did know what the correct product formula is I would write:
        System.out.println("The product is" + product);
        
    }