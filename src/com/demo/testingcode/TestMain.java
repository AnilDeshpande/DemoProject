package com.demo.testingcode;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] array  = new int []{1,2,3,4,5,6,7,8,9,10};
        System.out.print("Input Array: ");
        for(int num: array){
            System.out.print(num+"\t");
        }

        System.out.print("\n");

        System.out.print("Output Array: ");
        try{
            int [] returnedArray = rotate(array,4);
            for(int num: returnedArray){
                System.out.print(num+"\t");
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.print("\n");
    }

    public static int [] rotate(int [] inputarray, int rotationIndex) throws Exception{
        if(rotationIndex>inputarray.length){
            throw new Exception("Rotation index larger than array length, can't rorate");
        }else if(rotationIndex == 0 || rotationIndex == inputarray.length){
            return inputarray;
        }else{
            int [] tempArray = new int[inputarray.length];
            for(int i= rotationIndex, j=0 ; i > 0 ; i--,j++) {
                tempArray[j] = inputarray[inputarray.length-i];
            }

            for(int i=0, j = rotationIndex ; j < inputarray.length; i++, j++){
                tempArray[j] = inputarray[i];
            }
            return tempArray;
        }
    }
}
