package geekForGeeksQuestions;

public class NthFromEnd {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = 5;
		int fast = 0;
		int slow = 0;
		for(int i = 0 ; i < n ; i++) {
			if (n > arr.length) {
				System.out.println("Not a valid number!");
				return;
			}
			fast++;
		}
		while(fast < arr.length) {
			slow += 1;
			fast += 1;
		}
		System.out.println(arr[slow]);
	}

}
