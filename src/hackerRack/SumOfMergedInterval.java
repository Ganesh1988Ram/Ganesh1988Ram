package hackerRack;

import java.util.ArrayList;

public class SumOfMergedInterval {
	
	public static void main(String[] args) {
	    int [][] intervals = {{1,5},{10, 12},{1, 5},{16, 19},{5, 11}};
	    System.out.println(sumIntervals(intervals));
	}

	public static int sumIntervals(int [][] intervals) {
	    ArrayList<Integer> values = new ArrayList<>();
	    for (int [] row : intervals) {
	        for (int k = row[0]; k < row[1]; k++) {
	            if (!values.contains(k)) {
	                values.add(k);
	            }
	        }
	    }
	    System.out.println(values.toString());
	    return values.size();
	    
	}

}


/*
 public static int sumIntervals(int[][] intervals) {
        return intervals == null ? 0 : (int) Arrays.stream(intervals)
            .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]))
            .distinct()
            .count();
    }




*/