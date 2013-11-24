public class Mapper implements SimpleMap {
	private Int2StrNode listStart; 	
	public Mapper(){
		listStart = null;
	}
	/**
	* Puts a new String in the map.
	*
	* If the key is already in the map, nothing is done.
	*/

	public void put(int key, String name){
		boolean keyExists = false;
		Int2StrNode i2s = new Int2StrNode(key,name);
		if(listStart == null){
			listStart = i2s;
		} else {
			Int2StrNode searchNode = listStart;
			while(searchNode.getNext() != null){
				if(searchNode.getKey() == key){
					keyExists = true;
					return;	
				}
				searchNode = searchNode.getNext();
			}
			if(!keyExists){
				searchNode.setNext(i2s);	
			}
		}
	}
	/**
	* Returns the name associated with that key,
	* or null if there is none.
	*/
	public String get(int key){
		if(listStart.getKey() == key){
			return listStart.getString();
		} else {
			Int2StrNode searchNode = listStart;
			while(searchNode.getNext() != null){
				if(searchNode.getNext().getKey() == key){
					return searchNode.getNext().getString();
				}
				searchNode = searchNode.getNext();
			}
			return null;
		}
	}
	/**
	* Removes a name from the map. Future calls to get(key)
	* will return null for this key unless another
	* name is added with the same key.
	*/
	public void remove(int key){
		
		if(listStart == null){
			System.out.println("Empty Map");
			return;
		} else if(listStart.getKey() == key){
			listStart = listStart.getNext();
		} else {
			Int2StrNode searchNode = listStart;
			while(searchNode.getNext() != null){
				if(searchNode.getNext().getKey() == key){
					searchNode.setNext(searchNode.getNext().getNext());
					System.out.println("Node Removed");
					return;
				}
			}
			System.out.println("Node not found");
			return;
		}
	}
	/**
	* Returns true if there are no workers in the map,
	* false otherwise
	*/
	public boolean isEmpty(){
		if(listStart == null){
			return true;
		} else {
			return false;
		}
	}
}