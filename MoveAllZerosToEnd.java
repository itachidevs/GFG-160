

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here\
        int n=arr.length;
        int j = n-1;
       int k=0;
        int[] temp = new int[n];
        
    
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
               temp[k]=arr[i];
               k++;
            }
            else
            {
                temp[j]=arr[i];
                j--;
                // System.out.println(temp[j]);
            }
              
            } 
            
            
           for(int i=0;i<temp.length;i++)
           {
            //   System.out.println(temp[i]);
              arr[i]=temp[i];
           }
        }
        
    }