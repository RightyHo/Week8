public class Int2StrNode {
	private int key;
	private String str;
	private Int2StrNode nextNode;

	public Int2StrNode(int key,String str){
		this.key = key;
		this.str = str;
		nextNode = null;
	}
	public int getKey(){
		return key;
	}
	public void setKey(int key){
		this.key = key;
	}
	public String getString(){
		return str;
	}
	public void setString(String str){
		this.str = str;
	}
	public Int2StrNode getNext(){
		return nextNode;
	}
	public void setNext(Int2StrNode nextOne){
		nextNode = nextOne;	
	}
}