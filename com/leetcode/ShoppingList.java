package com.leetcode;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get the budget and quantity
        //sort the result of price*(importance index)
        //get the biggest and it's appliance util the total price > budget
        // 注意 hasNext 和 hasNextLine 的区别
        int budget = 0, amount = 0;
        int[][] user = new int[5][3];
        int total = 0, totalCost = 0;
        //col[0] is satis amount,col[1] is total cost with appliance,col[2] indicates appliance
        int[][] satisCost = new int[5][3];
        int[] userInput = new int[17];
        //int rowrow=0;
        // // while (in.hasNextLine()) {
        //     while (in.hasNextInt()) { // 注意 while 处理多个 case
        //         userInput[rowrow++]= in.nextInt();
        //     }
        // //     in.nextLine();
        // // }
        //while (in.hasNext()) {
            for (int k = 0; k < userInput.length; k++) {
                userInput[k] = in.nextInt();
            }
        System.out.println(Arrays.toString(userInput));
        //Arrays.toString(userInput);
//        for (int i = 2; i < userInput.length; i++) {
//            user[(i - 2) / 3][(i - 2) % 3] = userInput[i];
//        }
//        Arrays.toString(user);

        //sort the satisCost array

        //     Arrays.sort(satisCost);
        //     int rr=0;
        //     while (totalCost < budget) {
        //        if(satisCost[rr][2]>0)
        //             continue;
        //         total+=user[rr][0];
        //         totalCost+=satisCost[rr][1];
        //     }
        //     System.out.println(total);
    }
}
