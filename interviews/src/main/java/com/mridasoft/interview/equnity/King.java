package com.mridasoft.interview.equnity;

import java.util.*;

import static java.util.Arrays.asList;

public class King implements Piece {

    static Map<Integer, List<Integer>> ALLOWED_MOVES = new HashMap<>();
    static {
        ALLOWED_MOVES.put(0,asList(7,8,9));
        ALLOWED_MOVES.put(1,asList(2,4,5));
        ALLOWED_MOVES.put(2,asList(3,4,5,6));
        ALLOWED_MOVES.put(3,asList(2,4,5,6));
        ALLOWED_MOVES.put(4,asList(1,2,5,7,8));
        ALLOWED_MOVES.put(5,asList(1,2,3,4,6,7,8,9));
        ALLOWED_MOVES.put(6,asList(2,3,5,8,9));
        ALLOWED_MOVES.put(7,asList(0,4,5,8));
        ALLOWED_MOVES.put(8,asList(0,4,5,6,7,9));
        ALLOWED_MOVES.put(9,asList(0,8,5,6));
    }


    public static long calcLegalPhoneNumbers(int start, int positionsLeft, String seq, Set<String> numbers) {
        if(positionsLeft==1) {
            numbers.add(seq+start);
            return 1;
        }

        long subCount = 0;
        for(Integer i :  ALLOWED_MOVES.get(start)) {
            subCount = subCount + calcLegalPhoneNumbers(i,positionsLeft-1, seq + start, numbers);
        }

        return subCount;
    }

    public static void main(String[] args) {
       Set<String> numbers = new HashSet<>();
       long n =  King.calcLegalPhoneNumbers(0,10,"", numbers);
        System.out.println("****" + numbers.size() + " , "+ n);

        //for(String s : numbers)
            //System.out.println(s);
    }

}
