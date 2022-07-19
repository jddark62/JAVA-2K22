/*
 * A group of MIT friends decide to run the Boston Marathon.
 */
import java.util.Scanner;

/**
 * twelve
 */
public class twelve {

    //findFastest method
    public static int findFastest(int[] times) {
        int fastest = times[0];
        int indexOfFastest = 0;
        int time = 0;

        for (int i = 0; i < times.length; i++) {
            time = times[i];

            if (time < fastest) {
                fastest = time;
                indexOfFastest = i;
            }
        }
        return indexOfFastest;
    }
    //findSecondFastest method
    public static int findSecondFastest(int[] times) {
        int fastest = findFastest(times);
        int secondFastest = times[0];
        int indexOfSecondFastest = 0;
        int time = 0;
        for (int i = 0; i < times.length; i++) {
            time = times[i];
            if (i == fastest) {
                continue;
            }
            if (time < secondFastest) {
                secondFastest = time;
                indexOfSecondFastest = i;
            }
        }
        return indexOfSecondFastest;
    }
    public static void main(String[] args) {
        String[] names = 
		{
			"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
	        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
	        "Aaron", "Kate"
	    };
		
		int[] times = 
		{
	        341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
	        343, 317, 265
		};

        int indexOfFastest = findFastest(times);
		
		System.out.println("The fastest person was " + names[indexOfFastest] + " with a time of " + times[indexOfFastest] + " minutes.");
		
		int indexOfSecondFastest = findSecondFastest(times);
		
		System.out.println("The second fastest person was " + names[indexOfSecondFastest] + " with a time of " + times[indexOfSecondFastest] + " minutes.");
    }
}