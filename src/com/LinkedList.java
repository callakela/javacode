
public class LinkedList {
	
	    protected Node start;
	    protected Node end ;
	    public int size;
	    
	    public LinkedList()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    
	    boolean isEmpty() {
	    	
	    	return size == 0 ?true:false;
	    }
	    
	    
	    public void insertAtStart(int val) {
	    	
	    	Node npt= new Node(val,null,null);
	    	
	    	if(start==null) {
	    		
	    		start=npt;
	    		end=start;
	    	}else {
	    		
	    		start.setPrev(npt);
	    		npt.setNext(start);
	    		start = npt;
	    	}
	    	size++;
	    }

	    public void insertAtEnd(int val) {
	    	
	    	Node nptr= new Node(val,null,null);
	    	if(start == null)
	        {
	            start = nptr;
	            end = start;
	        }else {
	        	
	        	 nptr.setPrev(end);
	             end.setNext(nptr);
	             end = nptr;
	        }
	    	
	    }
	    
	    public void insertAtPos(int val , int pos) {
	    	
	    	Node nptr = new Node(val, null, null);    
	        if (pos == 1)
	        {
	            insertAtStart(val);
	            return;
	        }   
	        
	        Node ptr=start;
	        for (int i = 2; i <=size; i++) {
	        	
	        	if (i == pos) {
	        		
	        		Node temp =ptr.getNext(); 
	        		
	        		ptr.setNext(nptr);
	        		nptr.setPrev(ptr);
	        		nptr.setNext(temp);
	        		temp.setPrev(nptr);
	        		
	        	}
	        	
	        	ptr = ptr.getNext();     
				
			}
	        
	        
	    }
	    
	    public void deleteAtPos(int pos) {
	    	
	    	if (pos == 1) 
	        {
	            if (size == 1)
	            {
	                start = null;
	                end = null;
	                size = 0;
	                return; 
	            }
	            start = start.getNext();
	            start.setPrev(null);
	            size--; 
	            return ;
	        }
	    	
	    	
	    	if (pos == size)
	        {
	            end = end.getPrev();
	            end.setNext(null);
	            size-- ;
	        }
	    	
	    	Node ptr = start.getNext();
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == pos)
	            {
	                Node p = ptr.getPrev();
	                Node n = ptr.getNext();
	 
	                p.setNext(n);
	                n.setPrev(p);
	                size-- ;
	                return;
	            }
	            ptr = ptr.getNext();
	        }        
	    	
	    	
	    }
	    
		public Node getStart() {
			return start;
		}

		public void setStart(Node start) {
			this.start = start;
		}

		public Node getEnd() {
			return end;
		}

		public void setEnd(Node end) {
			this.end = end;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

	   
}
