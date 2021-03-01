package com.main;
import java.util.*;
public class Dij_Algo {
     public int minDistance(int dist[],Boolean b[]) {
    	int min=Integer.MAX_VALUE ,index=-1; 
    	for(int x=0;x<5; x++) {
    		if(b[x]==false && dist[x]<=min)
    		{
    			min=dist[x];
    			index=x;
    		}
    		
    	}
    	return index;
     }
	public void printGraph(int dist[],int x) {
		System.out.println("distance from source to destination is");
	for(int i=0; i<5; i++) {
		System.out.println(i+"-----"+dist[i]);
	}
	}
	public void dijkastra(int graph[][], int src) {
		
		int dist[]=new int [5];
		Boolean b[]=new Boolean[5];
		for(int i=0; i<5; i++)
		{
			dist[i]=Integer.MAX_VALUE;
			b[i]=false;
		}
		dist[0]=0;
		for (int count=0; count<5;  count++)
		{
			int u= minDistance(dist,b);
			b[u]=true;
			for(int x=0; x<5; x++) {
				if(b[x]&&graph[u][x]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][x]<dist[x]){
					dist[x]=dist[u]+graph[u][x];
				}
			}
			printGraph(dist,5);
		}
	}
	
	public static void main(String[] args) {
		int graph[][]= new int[][] {{0,3,0,0,5},
			                        {0,0,8,5,3},
			                        {0,0,0,0,0},
			                        {0,0,2,0,0},
			                        {0,3,0,4,0}};
			                        
			                        
			                                             
	
	  Dij_Algo p =new  Dij_Algo();
  	p. dijkastra(graph,0);	 
	
	}
	}


