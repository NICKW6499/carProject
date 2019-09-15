package com.company;

public class Main {

    public static void main(String[] args) {
	int array[][]={{2,2,2},{2,2,0}};
	for(int i=0;i<2;i++){
	    for(int j=0;j<3;j++){
	        if(array[i][j]==0&&j==2)
	            System.out.print(array[i][j]);
        }
    }
    }
}
