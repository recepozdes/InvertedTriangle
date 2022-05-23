import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Çizmek istediğiniz ters üçgenin yüksekliğini giriniz : ");
	        int n = sc.nextInt();
	        for(int i=n;i>0;i--){
                for(int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){

                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
