public class First {
   void m1(int i){
	i++;
	System.out.println(i);
}
    
    
    public static void main(String[] args){
        First obj = new First();
	obj.m1(10);
    }
}