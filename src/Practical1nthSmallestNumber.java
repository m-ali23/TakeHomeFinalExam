import java.util.Scanner;

public class Practical1nthSmallestNumber {

	public static void main(String[] args) {
		int input;
        int[] arraylist = new int[500]; // object of array.
 
        random(arraylist); // generate random numbers.
        arraySort(arraylist); // Sorting numbers.
 
        do{
            System.out.print("Enter a number between 1 and 500: ");
            Scanner sc = new Scanner(System.in);
            input   = sc.nextInt();                 
        }while(input < 1 || input > 500);
 
        // convert random numbers to string.
        String result ="";
            for (int j = 0; j < arraylist.length; j++) {
                result += " " + arraylist[j];
            }
 
        System.out.println("The random Numbers are:" + result);// Print all random number.
 
        // Print user entered number.
        if(input == 1){
            System.out.println("The " + input + "st smallest number is: " + findNthSmallestNumber(input,arraylist));
        }else if(input == 2){
            System.out.println("The " + input + "nd smallest number is: " + findNthSmallestNumber(input,arraylist));
        }else if(input == 3){
            System.out.println("The " + input + "rd smallest number is: " + findNthSmallestNumber(input,arraylist));
        }else{
            System.out.println("The " + input + "th smallest number is: " + findNthSmallestNumber(input,arraylist));
        } 
        
    } // End of main method.
 
    //method below find random number
    public static void random(int[] arraylist){
        for(int i=0; i < arraylist.length; i++){
            arraylist[i]    = (int) (Math.random() * 100);  
        }
    } // End of random method.
 
    //Array sorting method
    public static void arraySort(int [] arraylist){
        int temp;   
        for (int i=1; i<arraylist.length; i++){
            for(int j=0; j < arraylist.length-i; j++){
                if (arraylist[j] > arraylist [j+1]){
                    temp = arraylist [j];
                    arraylist [j] = arraylist [j+1];
                    arraylist [j+1] = temp;
                }
            }
        }
    } // End of arraySort method.
 
    //This method will find nth smallest number.
    public static int findNthSmallestNumber(int n, int[] numbers){
        return numbers[n-1];
    } // End of findNthSmallesNumber method.
 
// End of class.
	}

	


