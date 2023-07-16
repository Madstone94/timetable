public class BubbleSort
{
  long time;
  public long time()
  {
      return time;
  }
  public void creator50()
  {
      int list[] = new int[50000];
      for (int i = 0;i < 50000;i++)
      {
          list[i]= 50000-i;
      }
      this.bubbleSort(list);
  }
  public void creator100()
  {
     int list[] = new int[100000];
      for (int i = 0;i < 100000;i++)
      {
          list[i]= 100000-i;
      }
      this.bubbleSort(list);
  }
  public void creator150()
  {
     int list[] = new int[150000];
      for (int i = 0;i < 150000;i++)
      {
          list[i]= 150000-i;
      }
      this.bubbleSort(list);
  }
  public void creator200()
  {
     int list[] = new int[200000];
      for (int i = 0;i < 200000;i++)
      {
          list[i]= 200000-i;
      }
      this.bubbleSort(list);
  }
  public void creator250()
  {
     int list[] = new int[250000];
      for (int i = 0;i < 250000;i++)
      {
          list[i]= 250000-i;
      }
      this.bubbleSort(list);
  }
  public void creator300()
  {
     int list[] = new int[300000];
      for (int i = 0;i < 300000;i++)
      {
          list[i]= 300000-i;
      }
      this.bubbleSort(list);
  }
  /** Bubble sort method */
  public void bubbleSort(int[] list)
  {
    long start = System.currentTimeMillis();
    boolean needNextPass = true;
    for (int k = 1; k < list.length && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < list.length - k; i++) {
        if (list[i] > list[i + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          
          needNextPass = true; // Next pass still needed
        }
      }
    }
    long end = System.currentTimeMillis();
    time = end - start;
  }
}
