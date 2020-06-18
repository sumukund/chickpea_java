/****************************
 * Sudarsna Mukund
 * Recording Sort
 * ITC 2100
 * Northeastern University
 *****************************/


import java.util.*;

public class RecordingSort{
 
    // MAIN METHOD
    public static void main (String[] args){
        Recording[] list = new Recording[5];

        Scanner input = new Scanner(System.in);

// Initialize the variables
        int x = 0;
// CREATE THE ARRAY FEEL THE ARRAY BECOME THE ARRAY
        for (x = 0; x < list.length; ++x){
            int y = x + 1;

            System.out.println("Enter song number " + y + "'s title: ");
            String title = input.nextLine();

            System.out.println("Enter song number " + y + "'s artist: ");
            String artist = input.nextLine();

            System.out.println("Enter runtime of number " + y + " in seconds, no spaces or dashes please!: ");
            String runtimeStr = input.nextLine();

            int runtime = Integer.parseInt(runtimeStr);

            list[x] = new Recording(title, artist, runtime);
		}
		
        int methodSort;

        do {
            System.out.println(" Enter the number that corresponds to your choice: " + 
            "\n How would you like to sort? \n 1 - Title \n 2 - Artist \n 3 - Runtime \n ");
            methodSort = input.nextInt();

            if (methodSort > 0 && methodSort < 4) {
				int a, b;
				int maxValue = list.length - 1;

/*bubble sort logic explained simply
 *
 * for when a is less than maxValue (4), 
 * and when b is less than maxValue (4), 
 * create a new int c which is b + 1 ( the next one up) 
 * and then SORT */

				for (a = 0; a < maxValue; ++a) {
					for (b = 0; b < maxValue; ++b) {
						int c = b + 1;
						
// title bubble sort
						if (methodSort == 1) {
							if (list[b].getTitle().compareTo(list[c].getTitle()) > 0) {
								
								Recording temp = list[b];
								list[b] = list[c];
                                list[c] = temp;
                                
// add to the temp. Sort the temp and compare
							}
						} 
// artist bubble sort
						else if (methodSort == 2) {
				
							if (list[b].getArtist().compareTo(list[c].getArtist()) > 0) {
								
								Recording temp = list[b];
								list[b] = list[c];
                                list[c] = temp;
// the same logic as above
							}
						} 
// runtime SORT!
						else if (methodSort == 3) {
							// if the list at the integer b is greater than the next one then it goes about reordering. 
							if (list[b].getRuntime() > list[c].getRuntime()) {
						
								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						}
					}
				}
			}
			else {
				System.out.println(" you must input 1, 2, or 3. ");
			}
		} while (methodSort < 1 || methodSort > 3); // continues the loop while less than one and more than 3 (invalid)
		
		
		System.out.println();

		for (x = 0; x < list.length; x++) {
			System.out.println("Song: title: " + list[x].getTitle() + ". artist: " + list[x].getArtist() + ". runtime: "
					+ list[x].getRuntime() + " seconds.");
		}
		input.close();

        }

    }


