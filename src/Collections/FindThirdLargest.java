package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThirdLargest {
public static void main(String[] args) {
	int a[]= {1,3,4,45,100,88,192, -8, 333};

	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(4);
	list.add(45);
	list.add(100);
	list.add(88);
	list.add(192);
	list.add(-8);
	list.add(333);
	//list.add(90);
	int largest = Integer.MIN_VALUE;
	int secLargest = Integer.MIN_VALUE;
	int thirdLargest= Integer.MIN_VALUE;
	for(int i=0; i<list.size(); i++)
	{
	 if(list.get(i)> largest) {
		 thirdLargest=secLargest;
		 secLargest=largest;
		 
	 largest = list.get(i);
	 }
	 else if(list.get(i)> secLargest) {
		 thirdLargest=secLargest;
	 secLargest = list.get(i);
	 }
	 else if(list.get(i)> thirdLargest) {
	 thirdLargest = list.get(i);
	 }
	 
	 
	 
	}
	System.out.println(thirdLargest);
	System.out.println(largest);
	System.out.println(secLargest);
}
}
