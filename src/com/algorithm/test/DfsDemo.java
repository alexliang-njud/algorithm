package com.algorithm.test;

class DfsDemo{
	static int max_x=5;
	static int max_y=5;
	static int[][] map= new int[max_x][max_y];
	static int[][] next={{0,1},{1,0},{-1,0},{0,-1}};//行走方向
	static boolean[][] mark=new boolean[max_x][max_y];
	static int min_step=9999;
	
	public static void main (String[] args){
		map[3][2]=100;
		int x=0,y=0,step=1;
		dfs(x,y,step);
		System.out.println(min_step);
		
	}
	private static int dfs(int a,int b,int step){
		//已经到达目的
		if(map[a][b]==100){
			min_step =Math.min(step,min_step);
		}
		for(int i=0;i<next.length;i++){
			int next_x= a + next[i][0];
			int next_y= b + next[i][1];
			
			if (next_x==map.length||next_y==map.length||next_x==-1||next_y==-1||mark[next_x][next_y]){
				continue;
			}
			
			mark[next_x][next_y]=true; step++;
			dfs(next_x,next_y,step);
			mark[next_x][next_y]=false;
		}
		return min_step;
	}
}