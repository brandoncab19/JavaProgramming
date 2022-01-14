package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer element of integer array
    public static void eachElement(int[] arr){

        for (int each : arr){
            System.out.println(each);
        }

    }

    // prints each double element of double array
    public static void eachElement(double[] arr){

        for (double each : arr){
            System.out.println(each);
        }

    }
    
    // prints each char element of String array
    public static void eachElement(String[] arr){

        for (String each : arr){
            System.out.println(each);
        }

    }

    // prints each char element of char array
    public static void eachElement(char[] arr){

        for (char each : arr){
            System.out.println(each);
        }

    }


    // returns the max number of int array
    public static int maxNum (int[] arr){
        /*
        int max = arr[0];

        for (int each : arr) {
            if(each > max){
                max = each;
            }
        }
        return max;
         */ // another way of getting the same result
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    // returns the max number of double array
    public static double maxNum (double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }


    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {
            if(each == element){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }

        return result;
    }

    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }

    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }

    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if( each.equals(element) ){
                result = true;
            }
        }

        return result;
    }


    // adds an element to an array. returns new array
    public static int[] addElement (int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0; // using this i since for each loop doesn't have index numbers in the for each loop
        // this can be the index of the variable
        for (int each : array){
            result[i++] = each;
        }

        result[i] = element; // adding the int number given to the new array.

        return result;
    }

    public static double[] addElement (double[] array, double element){

        double[] resultNewArray = new double[array.length + 1];

        int i = 0; // remains the same as a reg array because it's the index number of the array
        for (double each : array){
            resultNewArray[i++] = each;
        }
        // resultNewArray[resultNewArray.length-1] = element; --- another way of adding the additonal element
        resultNewArray[i] = element;

        return resultNewArray;
    }

    public static String[] addElement (String[] array, String element){

        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element;

        return result;
    }

    public static char[] addElement (char[] array, char element){

        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element;

        return result;
    }


    //returns the frequency of the given element from the given integer array
    public static int freqOfElement (int[] arry, int element){
        
        int count = 0;

        for (int each : arry) {
            if(each == element){
                count++;
            }
        }
        
        
        return count;
    }

    public static int freqOfElement (double[] arry, double element){

        int count = 0;

        for (double each : arry) {
            if(each == element){
                count++;
            }
        }


        return count;
    }

    public static int freqOfElement (char[] arry, char element){

        int count = 0;

        for (char each : arry) {
            if(each == element){
                count++;
            }
        }


        return count;
    }

    public static int freqOfElement (String[] arry, String element){

        int count = 0;

        for (String each : arry) {
            if(each == element){
                count++;
            }
        }


        return count;
    }


    // returns the unique elements of the array as a new array
    public static int[] uniqueElement (int[] arry){

        int[] result = {}; //new int[0]

        for (int each : arry) {

            if(ArraysUtility.freqOfElement(arry,each) == 1) { //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    public static double[] uniqueElement (double[] arry){

        double[] result = {}; //new double[0]

        for (double each : arry) {

            if(ArraysUtility.freqOfElement(arry,each) == 1) { //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    public static char[] uniqueElement (char[] arry){

        char[] result = {}; //new char[0]

        for (char each : arry) {

            if(ArraysUtility.freqOfElement(arry,each) == 1) { //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    public static String[] uniqueElement (String[] arry){

        String[] result = {}; //new String[0]

        for (String each : arry) {

            if(ArraysUtility.freqOfElement(arry,each) == 1) { //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }


    // removes index from array and prints new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0; // representing the index of the new array(result)
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    public static double[] removeElement(double[] arry, int index){

        if(index < 0 || index > arry.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[arry.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < arry.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = arry[i];
        }

        return result;
    }

    public static char[] removeElement(char[] arry, int index){

        if(index < 0 || index > arry.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[arry.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < arry.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = arry[i];
        }

        return result;
    }

    public static String[] removeElement(String[] arry, int index){

        if(index < 0 || index > arry.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[arry.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < arry.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = arry[i];
        }

        return result;
    }


    // merges two arrays and prints a new array
    public static int[] merge2Arrays (int[] arry1, int[] arry2){
        /*
        int[] arry3 = new int[arry1.length + arry2.length];

        int i = 0;
        for (int each : arry1) {
            arry3[i++] = each;
        }

        for (int each : arry2) {
            arry3[i++] = each;
        }

        return arry3;
         */
        int[] result ={};

        for (int each : arry1) {
            result = ArraysUtility.addElement(result,each);
        }

        for (int each : arry2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static double[] merge2Arrays (double[] arry1, double[] arry2){
        /*
        double[] arry3 = new double[arry1.length + arry2.length];

        int i = 0;
        for (char each : arry1) {
            arry3[i++] = each;
        }

        for (char each : arry2) {
            arry3[i++] = each;
        }

        return arry3;
         */
        double[] result ={};

        for (double each : arry1) {
            result = ArraysUtility.addElement(result,each);
        }

        for (double each : arry2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static char[] merge2Arrays (char[] arry1, char[] arry2){
        /*
        char[] arry3 = new char[arry1.length + arry2.length];

        int i = 0;
        for (char each : arry1) {
            arry3[i++] = each;
        }

        for (char each : arry2) {
            arry3[i++] = each;
        }

        return arry3;
         */
        char[] result ={};

        for (char each : arry1) {
            result = ArraysUtility.addElement(result,each);
        }

        for (char each : arry2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static String[] merge2Arrays (String[] arry1, String[] arry2){
        /*
        String[] arry3 = new String[arry1.length + arry2.length];

        int i = 0;
        for (String each : arry1) {
            arry3[i++] = each;
        }

        for (String each : arry2) {
            arry3[i++] = each;
        }

        return arry3;
         */
        String[] result ={};

        for (String each : arry1) {
            result = ArraysUtility.addElement(result,each);
        }

        for (String each : arry2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;
    }

    
    // reverses the given array. returns you in new array
    public static int[] reverseArray (int[] arry) {

        int[] result = new int[arry.length];

        int j = 0;
        for (int i = arry.length - 1; i >= 0; i--) {
            result[j++] = arry[i];
        }

        return result;
    }

    public static double[] reverseArray (double[] arry) {

        double[] result = new double[arry.length];

        int j = 0;
        for (int i = arry.length - 1; i >= 0; i--) {
            result[j++] = arry[i];
        }

        return result;
    }

    public static char[] reverseArray (char[] arry) {

        char[] result = new char[arry.length];

        int j = 0;
        for (int i = arry.length - 1; i >= 0; i--) {
            result[j++] = arry[i];
        }

        return result;
    }

    public static String[] reverseArray (String[] arry) {

        String[] result = new String[arry.length];

        int j = 0;
        for (int i = arry.length - 1; i >= 0; i--) {
            result[j++] = arry[i];
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // replaces element at given index and returns new element in the array
    public static int[] replacElement (int[] arry, int index, int newElement){
            if(index < 0 || index > arry.length-1){
                System.err.println("Invalid index");
                System.exit(0);
            }

            arry[index] = newElement;
            
            return arry;
    }

    public static double[] replacElement (double[] arry, int index, double newElement){
        if(index < 0 || index > arry.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }

        arry[index] = newElement;

        return arry;
    }

    public static char[] replacElement (char[] arry, int index, char newElement){
        if(index < 0 || index > arry.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }

        arry[index] = newElement;

        return arry;
    }

    public static String[] replacElement (String[] arry, int index, String newElement){
        if(index < 0 || index > arry.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }

        arry[index] = newElement;

        return arry;
    }
    
    
    // replaces all elements matching with the given element with a new element  
    public static int[] replaceAllElement (int[] arry, int oldElement, int newElement){

        for (int i = 0; i < arry.length; i++) {

            if(arry[i] == oldElement){
                arry[i] = newElement;
            }
        }

        return arry;
    }

    public static double[] replaceAllElement (double[] arry, double oldElement, double newElement){

        for (int i = 0; i < arry.length; i++) {

            if(arry[i] == oldElement){
                arry[i] = newElement;
            }
        }

        return arry;
    }

    public static char[] replaceAllElement (char[] arry, char oldElement, char newElement){

        for (int i = 0; i < arry.length; i++) {

            if(arry[i] == oldElement){
                arry[i] = newElement;
            }
        }

        return arry;
    }

    public static String[] replaceAllElement (String[] arry, String oldElement, String newElement){

        for (int i = 0; i < arry.length; i++) {

            if(arry[i].equalsIgnoreCase(oldElement)){
                arry[i] = newElement;
            }
        }

        return arry;
    }
    
}