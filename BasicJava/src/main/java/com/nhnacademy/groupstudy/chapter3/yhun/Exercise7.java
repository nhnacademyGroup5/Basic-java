package com.nhnacademy.groupstudy.chapter3.yhun;

public class Exercise7 {

    public static void main(String[] args) {

        System.out.println("three people : " + birthOfthreePeople());
        System.out.println("random choice : " + randomChoice());
        System.out.println("birth all count : " + allBirth());

    }

    static int randomChoice(){
        int[] birth = new int[365];

        for(int i=0; i<365; i++){
            int idx = randomNumber();
            birth[idx]++;
        }

        return birthCount(birth);
    }
    static int birthOfthreePeople(){
        int[] birth = new int[365];
        int count = 0;

        while (true){
            int idx = randomNumber();
            count++;
            birth[idx]++;

            if(birth[idx] > 2){
                break;
            }
        }

        return count;
    }

    static int allBirth(){
        int[] birth = new int[365];
        int count = 0;

        while (true){
            int idx = randomNumber();
            count++;
            birth[idx]++;

            if(allCheck(birth)){
                break;
            }
        }
        return count;
    }

    static int birthCount(int[] arr){
        int count = 0;
        for (int i : arr){
            if(i != 0) count++;
        }
        return count;
    }
    static boolean allCheck(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }

    static int randomNumber(){
        return (int)(Math.random()*365);
    }
}
