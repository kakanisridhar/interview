package com.mridasoft.interview.equnity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Pawn implements Piece {

    static Map<Integer, List<Integer>> ALLOWED_MOVES = new HashMap<>();
    {

    }


    public static int calcLegalPhoneNumbers(int start, int positionsLeft) {
        if(positionsLeft==0)
            return 1;

        if(start==1 || start==2 || start==3){
            return 1 + Queen.calcLegalPhoneNumbers(start,positionsLeft-1);
        }

        int subCount = 0;
        for(Integer i :  ALLOWED_MOVES.get(start)) {
            subCount = subCount + calcLegalPhoneNumbers(i,positionsLeft-1);
        }

        return 1 + subCount;
    }

}
