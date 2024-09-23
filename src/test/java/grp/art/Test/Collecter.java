package grp.art.Test;

import java.util.Arrays;

public class Collecter {

	public static void main(String[] args) {
   int[] ar= {1,234,456,567,34,4,0,67};
   
   Arrays.sort(ar);
   System.out.println("Minimum Array is "+ar[0]+" Maximum Array is "+ar[ar.length-1]);
   
	}

}
