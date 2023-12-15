import java.util.Scanner;
// ANSWER NO !
// to find the even number sum from 1 to 10
class EvenNumberSum {
    public static void main(String[] args) {
        // i initilize the sum with zero;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            // checking if the number is even
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        // printing out the number
        System.out.print(sum);
    }
}
// ANSWER NO 2
// you can use this person class with any main method i am not using to avoid confusion because there will be 5 answers 
class Person {
    // defining the parameters
    // private so no-one can access them outside this class
    private String name;
    private int age;

    // constructor to assign values to the parameter
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method to display info
    public void displayinfo() {
        System.out.print("Name-" + name + " " + "Age-" + age + " ");
    }
}
// ANSWER NO 3
class ReverseString {
    public static String ReverseStrings(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            // accesing each element of the string and reversing its position
            ans = str.charAt(i) + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        // taking tht input using scanner
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        // passing the input to the reverse function
        String reverseString = ReverseStrings(input);
        // printing out the reverse string
        System.out.print(reverseString);
        s.close();
    }
}
// ANSWER NO 4
class MergeSort {
    //merge sort function passing the value arr and left and right
    public static void mergeSort(int[] input) {
        // base case if input lenght is <1 return
        if(input.length<=1){
		return ;
	}
    // creating new arrays in with half the size
		int[] a= new int[input.length/2];
		int[] b = new int[input.length-a.length];
        // copying content of array into new arrays
	for (int i = 0; i < input.length/2 ; i++) {
        // half here 
		a[i]=input[i];
	}
	for (int i = input.length/2; i < input.length; i++) {
		// half here
        b[i-input.length/2]=input[i];
	}
    // calling merge sort on both recursively
	mergeSort(a);
	mergeSort(b);
    // now merging both the function
merge(a,b,input );
	
    }
    // method to merge the sorted array
    public static void merge(int[]s1, int[]s2, int[] s3){
// initilizing three pointer
// one for s1
// one for s2
// ans one for the input one via s3
int i=0;
int j =0;
int k =0;
while(i<s1.length && j <s2.length){
    // checking if s1 is smaller than the s2
if(s1[i]<=s2[j]){
	s3[k]=s1[i];
	k++;
	i++;
}
// cheking if the s1 is bigger than the s2
else if(s1[i]>s2[j]){
	s3[k]=s2[j];
	k++;
	j++;
}
}
if(i<s1.length){
	while(i<s1.length){
	s3[k]=s1[i];
	k++;
	i++;
}
}
if(j<s2.length){
	while(j<s2.length){
	s3[k]=s2[j];
	k++;
	j++;
}
}
}
// method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // array give that is to be sorted
        int[] arrayToSort = { 12, 5, 23, 8, 17, 9 };
        // passing array to the function with left and right
        mergeSort(arrayToSort);
        // printing the array
        printArray(arrayToSort);
    }
}