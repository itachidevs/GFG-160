//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends




class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length;
        List<Integer> result = new ArrayList<>();
        // A hash to store the element and the count of the element 
        //in key value pairs
        HashMap<Integer,Integer> frequencies=new HashMap<>();
        // A loop to run throught the array
       for (int i=0;i<n;i++)
       {
           //getting frequency
           int frequency=frequencies.getOrDefault(nums[i],0);
           //Storing freqency of every element
           frequencies.put(nums[i],frequency+1);
       }
       //Iterating through the every key value pair
       for(Map.Entry<Integer,Integer> pair:frequencies.entrySet())
       {
           int element=pair.getKey();
           int count=pair.getValue();
           //checking if count is greater than n/3
           if(count>(n/3))
           {
               result.add(element);
           }
           //checking to swap the elements
           if(result.size()==2 && result.get(0)>result.get(1))
           {
               int temp=result.get(0);
               result.set(0,result.get(1));
               result.set(1,temp);
           }
       }
        return result;
    }
}
