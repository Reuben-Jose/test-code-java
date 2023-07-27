//July 17th 2023: Reuben Jose: Assignment 1
//Most comments here are for personal reference; ones that describe the program are marked with "**".

public class Main //"public class" is the start of all files; after it MUST be the file name
{
    public static void main(String[] args) {
        //start to all main Java functions

        int n = 5;
        int woo[]; // NEW WAY TO WRITE ARRAY: 1) declare array with (type) name[];
        woo =  new int[5]; //2) to allocate storage, write name = new (type)[size];
        int i = 0; /* **for some reason I cannot declare i in the for loop;
	                    should not be a problem since it works in C. */

        for( i = 0; i < 5; i++){
            woo[i] = i;
        }
        // **Code asks to fill array from 0 to 4; can be done with for loop

        int m = 100;
        int bar[];
        bar = new int[100];
        for(i = 0; i < 100; i++){
            bar[i] = i;
        }

        System.out.println("The total number of even numbers in woo are: " + countEvenNum(woo, n) +"\n");
        System.out.println("The total number of even numbers in bar are: "+ countEvenNum(bar, m) +"\n");
		
		/*same process for printing in C, just instead of 
		having a variable and then declaring it after the 
		string, you add it inbetween strings w/o " " */
    }

    public static int countEvenNum(int[] arr, int size){
        //**no changes to be made due to same type Syntax
        int count = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{
            }
        }
        return count;
    }

}
