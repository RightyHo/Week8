public class UseMap {
	public static void main(String[] args){
		UseMap um = new UseMap();
		um.launch();
	}
	public void launch(){
		SimpleMap sm = new Mapper();
		if(sm.isEmpty()){
			System.out.println("Map is empty");
		} else {
			System.out.println("Map is not empty");
		}
		sm.put(101,"Laura");
		sm.put(102,"Andrew");
		sm.put(103,"Heather");
		sm.put(104,"Kate");	
		System.out.println("Key 103 is visiting today: " + sm.get(103));
		System.out.println("this should print null: " + sm.get(113));
		System.out.println("This person is moving down the road: " + sm.get(104));
		System.out.println("Prior to removing 102: " + sm.get(102));
		System.out.println("Should say Laura: " + sm.get(101));
		sm.remove(102);
		System.out.println("After removing 102: " + sm.get(102));
		System.out.println("Should say Laura: " + sm.get(101));
		if(sm.isEmpty()){
			System.out.println("Map is empty");
		} else {
			System.out.println("Map is not empty");
		}
		System.out.println("Should say Laura: " + sm.get(101));
		System.out.println("Should say Heather: " + sm.get(103));
		System.out.println("Should say Kate: " + sm.get(104));
	}
}