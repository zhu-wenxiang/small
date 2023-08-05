package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get the budget and quantity
        //sort the result of price*(importance index)
        //get the biggest and it's appliance util the total price > budget
        // 注意 hasNext 和 hasNextLine 的区别
        int i = 0, j = 0;
        int[][] user = new int[6][3];
        int total = 0, totalCost = 0;
        //col[0] is satis amount,col[1] is total cost with appliance,col[2] indicates appliance
        int[][] satisCost = new int[5][3];
        int[] userInput=new int[17];
        int rowrow=0;
        // // while (in.hasNextLine()) {
        //     while (in.hasNextInt()) { // 注意 while 处理多个 case
        //         userInput[rowrow++]= in.nextInt();
        //     }
        // //     in.nextLine();
        // // }
        for (int k = 0; k < userInput.length; k++) {
            userInput[k]=in.nextInt();
        }
        //Arrays.toString(userInput);
        for(int ii=0;ii<userInput.length;ii++){
            if(ii>=2){
                user[(ii-1)/3][(ii-2)%3]=userInput[ii];
            }else{
                user[ii/2][ii]=userInput[ii];
            }
        }
        for(int iii=1;iii<user.length;iii++){
                satisCost[iii - 1][0] = user[iii][0] * user[iii][1];
                satisCost[iii - 1][1] = user[iii][0];
                satisCost[iii - 1][2] = user[iii][2];
        }
        for (int row = 0; row < satisCost.length; row++) {
            if (satisCost[row][2] > 0) {
                satisCost[satisCost[row][2] - 1][0] += satisCost[row][0];
                satisCost[satisCost[row][2] - 1][1] += satisCost[row][1];
            }
        }
        //sort the satisCost array

        Arrays.sort(satisCost);
        int rr=0;
        while (totalCost < user[0][0]) {
           if(satisCost[rr][2]>0)
                continue;
            total+=satisCost[rr][0];
            totalCost+=satisCost[rr][1];
        }
        System.out.println(total);
    }
}
