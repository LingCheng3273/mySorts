import java.util.ArrayList;
public class SortDriver{
    public static void main(String [] args){

	ArrayList glen = new ArrayList<Integer>();

	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	MySorts.bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	MySorts.shuffle(glen);
	System.out.println( "ArrayList glen after shuffling:\n" + glen );
	MySorts.bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	/*
	ArrayList coco = MySorts.populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	MySorts.bubbleSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	*/

	/*
    	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = MySorts.bubbleSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	*//*
      	ArrayList coco = MySorts.populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = MySorts.bubbleSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	System.out.println( coco );*/
	
	/*============================================
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  MySorts.selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  	
	  ============================================*/
	/*============================================

	  ArrayList coco = MySorts.populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  MySorts.selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );

	  ============================================*/
	/*

	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
 	  ArrayList glenSorted = MySorts.selectionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = MySorts.populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = MySorts.selectionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );*/

    }

}
