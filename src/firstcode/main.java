package firstcode;

class main {
    public static void main(String[] args) {
        //start to all main Java functions

        int n = 5;
        int foo[]; // NEW WAY TO WRITE ARRAY: 1) declare array with (type) name[];
        foo = new int[5]; //2) to allocate storage, write name = new (type)[size];
        int i = 0; /* **for some reason I cannot declare i in the for loop;
	                    should not be a problem since it works in C. */

        for (i = 0; i < 5; i++) {
            foo[i] = i;
        }
        // **Code asks to fill array from 0 to 4; can be done with for loop

        int m = 100;
        int bar[];
        bar = new int[100];
        for (i = 0; i < 100; i++) {
            bar[i] = i;
        }

        System.out.println("The total number of even numbers in foo are: " + countEvenNum(foo, n) + "\n");
        System.out.println("The total number of even numbers in bar are: " + countEvenNum(bar, m) + "\n");

		/*same process for printing in C, just instead of
		having a variable and then declaring it after the
		string, you add it inbetween strings w/o " " */
    }

    public static int countEvenNum(int[] arr, int size) {
        //**no changes to be made due to same type Syntax
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            } else {
            }
        }
        return count;
    }
}