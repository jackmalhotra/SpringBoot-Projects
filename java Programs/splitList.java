
/*
Write a Code for the below requirement Sample Inputs & Outputs
Input :
List1 = [1,2,3,4,5,6,7,8,9,10] and Split_Value = 3
Expected Output is (Split Like this)
[[1,2,3],[4,5,6],[7,8,9],[10]]

Input :
List1 = [1,2,3,4,5,6,7,8,9,10] and Split_Value = 5
Expected Output is (Split Like this)
[[1,2,3,4,5],[6,7,8,9,10]]
*/

import java.util.*;
import java.util.stream.Collectors;


public class splitList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       

        int splitValue = 3;
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i += splitValue) {
            result.add(new ArrayList<>(list.subList(i, Math.min(i + splitValue, list.size()))));
        }
        System.out.println(result); 

    }

}