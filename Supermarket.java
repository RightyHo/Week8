public class Supermarket {
	private PointerPersonQueue myQueue;

	public Supermarket(){
		myQueue = new PointerPersonQueue();
	}
	public static void main(String[] args){
		Supermarket sm = new Supermarket();
		sm.launch();
	}
	public void launch(){
		Person Andrew = new Person("Andrew");
		addPerson(Andrew);
		Person Laura = new Person("Laura");
		addPerson(Laura);
		Person Jamie = new Person("Jamie");
		addPerson(Jamie);
		Person Ken = new Person("Ken");
		addPerson(Ken);
		Person Lynette = new Person("Lynette");
		addPerson(Lynette);
		Person firstServed = servePerson();
		System.out.println("First person served was: " + firstServed.getName());
		Person secondServed = servePerson();
		System.out.println("second person served was: " + secondServed.getName());
	}
	public void addPerson(Person person){
		myQueue.insert(person);
	}
	public Person servePerson(){
		return myQueue.retrieve();
	}
}