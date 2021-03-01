package com.main;

public class Merge_sort {
    
    static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 

 

        int L[] = new int[n1];
        int R[] = new int[n2];
 

 

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            
            int m = (l + r) / 2;
 
            
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            
            merge(arr, l, m, r);
        }
    }
 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        
    	int i=0;
    	int arr1[]=new int[10000];
    	
    	int arr2[]=new int[10000];
    	
    	int arr3[]=new int[10000];
    	
    	int arr4[]=new int[10000];
    	
    	
    	for (i=0;i<10000;i++) {
    		int x=(int)(Math.random()*1000000);
    	}
    	int y=4587563;
    	for (i=0;i<10000;i++) {
    		arr2[i]=y;
    	}
    	int z=245986;
    	for (i=0;i<10000;i++) {
    		arr3[i]=z;
    		z=z-1;
    	}
    	int a=5748692;
    	for (i=0;i<10000;i++) {
    		arr4[i]=a;
    		a=a+1;
    	}
    	for(i=0;i<=15;i++) {
        long start1, start2, start3, start4, end1, end2, end3, end4;
        
        start1 = System.currentTimeMillis();
        sort(arr1, 0, arr1.length - 1);
        end1 = System.currentTimeMillis();
        
        start2 = System.currentTimeMillis();
        sort(arr2, 0, arr2.length - 1);
        end2 = System.currentTimeMillis();
        
        start3 = System.currentTimeMillis();
        sort(arr3, 0, arr3.length - 1);
        end3 = System.currentTimeMillis();
        
        start4 = System.currentTimeMillis();
        sort(arr4, 0, arr4.length - 1);
        end4 = System.currentTimeMillis();
        
        System.out.println("time for random numbers : "+ (end1-start1)+" ms");
        System.out.println("time for same numbers : "+ (end2-start2)+" ms");
        System.out.println("time for descending sorted numbers : "+ (end3-start3)+" ms");
        System.out.println("time for ascending sorted numbers : "+ (end4-start4)+" ms");
    	  
    }
    }
 

}