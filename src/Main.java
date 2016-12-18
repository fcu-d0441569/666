import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		Search search1 = new Search();
		System.out.println("請輸入搜尋條件:");
		
		while(true){
		str = scan.next();
		search1.search(str);
		}
	}
}
