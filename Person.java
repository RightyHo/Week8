public class Person {
	private String name;
	private	Person nextPerson;

	public Person(String name){
		this.name = name;
		this.nextPerson = null;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Person getNext(){
		return nextPerson;
	}
	public void setNext(Person next){
		this.nextPerson = next;
	}
}
