
/**
 * test the completion time of a series of sorts.
 * 
 * @author Matthew Stone
 * 11/21/16
 * Co Sci 452
 * 
 */
public class main
{
  public static void main(String[] args)
  {
        System.out.println("NOTE: This program generates a randomized array for each sort, as each sort demands a different data type.");
        System.out.println("Due to this, the program very slowly prints the results out line by line.");
        System.out.println("           " + "Selection Sort" + "   " + "Bubble Sort" + "   " + "Merge Sort" + "   " + "Quick Sort" + "   " + "Heap Sort");
        SelectionSort selection = new SelectionSort();
        selection.creator50();
        BubbleSort bubble = new BubbleSort();
        bubble.creator50();
        MergeSort merge = new MergeSort();
        merge.creator50();
        MergeSort quick = new MergeSort();
        quick.creator50();
        heaper heap = new heaper();
        heap.creator50();
        System.out.println("50,000" + "         " + selection.time() + "            " + bubble.time() + "            " + merge.time() + "            " + quick.time() + "            " + heap.time());
        selection.creator100();
        bubble.creator100();
        merge.creator100();
        quick.creator100();
        heap.creator100();
        System.out.println("100,000" + "        " + selection.time() + "            " + bubble.time() + "            " + merge.time() + "           " + quick.time() + "            " + heap.time());
        selection.creator150();
        bubble.creator150();
        merge.creator150();
        quick.creator150();
        heap.creator150();
        System.out.println("150,000" + "        " + selection.time() + "           " + bubble.time() + "           " + merge.time() + "           " + quick.time() + "            " + heap.time());
        selection.creator200();
        bubble.creator200();
        merge.creator200();
        quick.creator200();
        heap.creator200();
        System.out.println("200,000" + "        " + selection.time() + "           " + bubble.time() + "           " + merge.time() + "           " + quick.time() + "            " + heap.time());
        selection.creator250();
        bubble.creator250();
        merge.creator250();
        quick.creator250();
        heap.creator250();
        System.out.println("250,000" + "        " + selection.time() + "           " + bubble.time() + "           " + merge.time() + "           " + quick.time() + "            " + heap.time());
        selection.creator300();
        bubble.creator300();
        merge.creator300();
        quick.creator300();
        heap.creator300();
        System.out.println("300,000" + "        " + selection.time() + "           " + bubble.time() + "           " + merge.time() + "           " + quick.time() + "            " + heap.time());
  }
}

