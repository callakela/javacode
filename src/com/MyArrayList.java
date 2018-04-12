import java.util.Arrays;

public class MyArrayList<T> {
	
	Object[]  data;
	
	 int actualsize;
	 
	 public MyArrayList(int size){
		 
		 data=new Object[size];
		 actualsize=0;
		 
	 }
	 
	 public void addElment(T element ){
		 
		 if(data.length-actualsize<5) {
			 
			 increaseSize();
			 
		 }
		 
		 data[actualsize++]=element;
		 
		
	 }
	 
	 public Object getElement(int index) {
		 
		 Object element=null;
		 
		 if(index>actualsize) {
			 
			 throw new ArrayIndexOutOfBoundsException();
		 }else {
			 
			 element =data[index];
		 }
		 
		 return element;
	 }
	 
	 
	 public Object removeElement(int index) {
		 Object obj;
		 
          if(index>actualsize) {
			 
			 throw new ArrayIndexOutOfBoundsException();
		 }else {
			 
			  obj=data[index];
			 data[index]=null;
			 int temp=index;
			 while (temp<actualsize) {
				 data[temp]=data[temp+1];
				 data[temp+1]=null;
				 temp++;
			 }
			 
			 actualsize--;
			 System.out.println(": "+obj);
			 
		 }
		 
		 return obj;
	 }
	 
	 private void  increaseSize() {
		 
		 data=Arrays.copyOf(data, data.length*2);
		 
	 }
	 
	 public int size(){
			return actualsize;
		}
	 public static void main(String ... args) {
		 
		 MyArrayList mal = new MyArrayList(5);
			mal.addElment(new Integer(2));
			mal.addElment(new Integer(5));
			mal.addElment(new Integer(1));
			mal.addElment(new Integer(23));
			mal.addElment(new Integer(14));
			
			for(int i=0;i<mal.size();i++){
				System.out.print(mal.getElement(i)+" ");
			}
		 
			mal.addElment(new Integer(29));
			System.out.println("Element at Index 5:"+mal.getElement(5));
			System.out.println("List size: "+mal.size());
			System.out.println("Removing element at index 2: "+mal.removeElement(2));
			for(int i=0;i<mal.size();i++){
				System.out.print(mal.getElement(i)+" ");
			}
	 }

}
