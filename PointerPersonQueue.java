/**
 * Implementation of interface queue using a
 * dynamic structure as support.
 */
public class PointerPersonQueue implements PersonQueue {
    /**
     * The first person in the line
     */
    private Person firstInLine;
    private int queueSize;

    public PointerPersonQueue(){
		firstInLine = null;
		queueSize = 0;
	}
	public Person getFirstPerson(){
		return firstInLine;
	}
	public int getSize(){
		return queueSize;
	}
	public void insert(Person person){
		if(person == null){
			System.out.println("Error - Person passed to insert function was null");
			return;
		}
		if(firstInLine == null){
			firstInLine = person;
			queueSize++;
		} else {
			Person currentPerson = firstInLine;
			while(currentPerson.getNext() != null){
				currentPerson = currentPerson.getNext();
			}
			currentPerson.setNext(person);
			queueSize++;
		}
	}
	public Person retrieve(){
		Person result = firstInLine;
		firstInLine.setNext(firstInLine.getNext().getNext());
		queueSize--;
		return result;
	}
}
