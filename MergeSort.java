import java.util.Random;
public class MergeSort
{
  long time;
  long start;
  long end;
  Random rand = new Random();
  public long time()
  {
      return time;
  }
  public void creator50()
  {
      int list[] = new int[50000];
      for (int i = 0;i < 50000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.timer(list);
  }
  public void creator100()
  {
     int list[] = new int[100000];
      for (int i = 0;i < 100000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.timer(list);
  }
  public void creator150()
  {
     int list[] = new int[150000];
      for (int i = 0;i < 150000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.timer(list);
  }
  public void creator200()
  {
     int list[] = new int[200000];
      for (int i = 0;i < 200000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.timer(list);
  }
  public void creator250()
  {
     int list[] = new int[250000];
      for (int i = 0;i < 250000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.timer(list);
  }
  public void creator300()
  {
     int list[] = new int[300000];
      for (int i = 0;i < 300000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.timer(list);
  }
  public void timer(int[] list)
  {
      long start = System.currentTimeMillis();
      this.mergeSort(list);
      long end = System.currentTimeMillis();
      time = end - start;
  }
  /** The method for sorting the numbers */
  public void mergeSort(int[] list)
  {
    if (list.length > 1)
    {
      // Merge sort the first half
      int[] firstHalf = new int[list.length / 2];
      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
      mergeSort(firstHalf);
      // Merge sort the second half
      int secondHalfLength = list.length - list.length / 2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(list, list.length / 2,
        secondHalf, 0, secondHalfLength);
      mergeSort(secondHalf);
      // Merge firstHalf with secondHalf into list
      merge(firstHalf, secondHalf, list);
    }
  }
  /** Merge two sorted lists */
  public void merge(int[] list1, int[] list2, int[] temp) {
    int current1 = 0; // Current index in list1
    int current2 = 0; // Current index in list2
    int current3 = 0; // Current index in temp
    while (current1 < list1.length && current2 < list2.length) {
      if (list1[current1] < list2[current2])
        temp[current3++] = list1[current1++];
      else
        temp[current3++] = list2[current2++];
    }
    while (current1 < list1.length)
      temp[current3++] = list1[current1++];
    while (current2 < list2.length)
      temp[current3++] = list2[current2++];
  }
}
