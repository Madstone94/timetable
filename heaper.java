import java.util.Random;
/**
 * Write a description of class heaper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heaper
{
   long time;
   minHeap heap = new minHeap();
   Random rand = new Random();
   public void creator50()
   {
       int list[] = new int[50000];
       for (int i = 0;i < 50000;i++)
       {
         list[i]= rand.nextInt();
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i < 50000;i++)
       {
         heap.add(list[i]);
       }
       long end = System.currentTimeMillis();
       time = end - start;
   }
   public void creator100()
   {
       int list[] = new int[100000];
       for (int i = 0;i < 100000;i++)
       {
         list[i]= rand.nextInt();
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i < 100000;i++)
       {
         heap.add(list[i]);
       }
       long end = System.currentTimeMillis();
       time = end - start;
   }
   public void creator150()
   {
       int list[] = new int[150000];
       for (int i = 0;i < 150000;i++)
       {
         list[i]= rand.nextInt();
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i < 150000;i++)
       {
         heap.add(list[i]);
       }
       long end = System.currentTimeMillis();
       time = end - start;
   }
   public void creator200()
   {
       int list[] = new int[200000];
       for (int i = 0;i < 200000;i++)
       {
         list[i]= rand.nextInt();
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i < 200000;i++)
       {
         heap.add(list[i]);
       }
       long end = System.currentTimeMillis();
       time = end - start;
   }
   public void creator250()
   {
       int list[] = new int[250000];
       for (int i = 0;i < 250000;i++)
       {
         list[i]= rand.nextInt();
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i < 250000;i++)
       {
         heap.add(list[i]);
       }
       long end = System.currentTimeMillis();
       time = end - start;
   }
   public void creator300()
   {
       int list[] = new int[300000];
       for (int i = 0;i < 300000;i++)
       {
         list[i]= rand.nextInt();
       }
       long start = System.currentTimeMillis();
       for (int i = 0;i < 300000;i++)
       {
         heap.add(list[i]);
       }
       long end = System.currentTimeMillis();
       time = end - start;
   }
   public long time()
   {
       return time;
   }
}