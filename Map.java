 import java.util.*; 
class Map
{
public static void main(String args[])
{ 
HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

for(int i=0;i<arr.length;i++) 
{
int key;
key=arr[i];
if(h.containsKey(key)) 
h.put(key,h.get(key)+1); 
else 
h.put(key,1);
} 
for(Integer i:h.keySet())
{if(h.get(i)>1)
System.out.println(i+"="+h.get(i)+" "); 
}
}
}
