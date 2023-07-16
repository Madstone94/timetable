import java.util.Random;
public class QuickSort
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
      this.quickSort(list);
  }
  public void creator100()
  {
     int list[] = new int[100000];
      for (int i = 0;i < 100000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.quickSort(list);
  }
  public void creator150()
  {
     int list[] = new int[150000];
      for (int i = 0;i < 150000;i++)
      {
          list[i]= rand.nextInt();
      }
      this.quickSort(list);
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
      this.quickSort(list);
      long end = System.currentTimeMillis();
  }
  public void quickSort(int[] list)
  {
    this.quickSort(list, 0, list.length - 1);
  }
  private void quickSort(int[] list, int first, int last)
  {
    if (last > first)
    {
      int pivotIndex = partition(list, first, last);
      partition(list, first, pivotIndex - 1);
      partition(list, pivotIndex + 1, last);
    }
  }
  /** Partition the array list[first..last] */
  private int partition(int[] list, int first, int last) 
   {
    int pivot = list[first]; // Choose the first element as the pivot
    int low = first + 1; // Index for forward search
    int high = last; // Index for backward search
    while (high > low)
    {
      // Search forward from left
      while (low <= high && list[low] <= pivot)
        low++;
      // Search backward from right
      while (low <= high && list[high] > pivot)
        high--;
      // Swap two elements in the list
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }
    while (high > first && list[high] >= pivot)
      high--;
    // Swap pivot with list[high]
    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      time = end - start;
      return high;
    }
    else
    {
      time = end - start;
      return first;
    }
  }
}
