import java.util.ArrayList;
public class LinkedPriorityQueue implements PriorityQueue{
	private ArrayList list[];
	private int size; 
        
        //Set LinkedPriorityQueue defaults
	public LinkedPriorityQueue(int s){
		size = s;
		list = new ArrayList[size];
		for(int x = 0; x<size;x++){
			list[x] = new ArrayList();
		}
	}
        //Remove an item from the queue
	public Object dequeue() {
		if(!list[0].isEmpty())return list[0].remove(0);
		else if(!list[1].isEmpty())return list[1].remove(0);
		else if(!list[2].isEmpty())return list[2].remove(0);
		else throw new IllegalStateException("Stack is empty");
	} 
        
	public void enqueue(Object obj) {
		throw new IllegalStateException("Must give a priority");
	}
        //Return the size of the list
	public int size() {
		return list.length;
	}
        //Add an item to the queue
	public void enqueue(Object obj, int i) {
		list[i].add(obj);
	} 
        //Return queue size
	public int queueSize(int i){
		return list[i].size();
	} 
        //Check if the list has any data
	public boolean hasData(){
		for(int i = 0;i<size;i++){
			if(queueSize(i)>0)return true;
		}
		return false;
	}
    public Object peekFront() { 
        { 
            return null;
        } 
    } 
}