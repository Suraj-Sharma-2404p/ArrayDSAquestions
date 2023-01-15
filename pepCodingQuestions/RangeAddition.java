package pepCodingQuestions;
import java.util.Scanner;

public class RangeAddition {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int[] getModifiedArray(int length, int[][] queries) {
        int[] result = new int[length];
        for (int querie = 0; querie < queries.length; querie++) {
			int st = queries[querie][0];
			int end = queries[querie][1];
			int incre = queries[querie][2];
			
			result[st] += incre;
			if(end+1 < length) {
				result[end+1] -= incre;
			}
		}
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
			sum += result[i];
			result[i] = sum;
		}
		return result;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();

        int nq = scn.nextInt();
        
        int[][] queries = new int[nq][3];

        for(int q = 0; q < nq; q++) {
            queries[q][0] = scn.nextInt();
            queries[q][1] = scn.nextInt();
            queries[q][2] = scn.nextInt();
        }


        int[] res = getModifiedArray(length, queries);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

// inputs
//12
//4
//2 6 4
//0 5 3
//1 4 -2
//6 9 1
//output
//3 1 5 5 5 7 5 1 1 1 0 0 
