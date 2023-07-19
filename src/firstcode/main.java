package firstcode;

class main {
    public static void main(String[] args) {
        //start to all main Java functions

        int n = 5;
        int engineer[]; // NEW WAY TO WRITE ARRAY: 1) declare array with (type) name[];
        engineer = new int[5]; //2) to allocate storage, write name = new (type)[size];
        int i = 0; /* **for some reason I cannot declare i in the for loop;
	                    should not be a problem since it works in C. */

        for (i = 0; i < 5; i++) {
            engineer[i] = i;
        }
        // **Code asks to fill array from 0 to 4; can be done with for loop

        int m = 100;
        int gaming[];
        gaming = new int[100];
        for (i = 0; i < 100; i++) {
            gaming[i] = i;
        }

        System.out.println("The total number of even numbers in engineer are: " + countEvenNum(engineer, n) + "\n");
        System.out.println("The total number of even numbers in gaming are: " + countEvenNum(gaming, m) + "\n");

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