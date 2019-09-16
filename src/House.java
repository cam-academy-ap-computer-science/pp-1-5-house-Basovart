
public class House {

	public static void main(String[] args) {
		Opening();
		Malt();
		Rat();
		Cat();
		Dog();
		Cow();
		Maiden();

	}
	public static void Opening() {
		System.out.println("This is the house that Jack built.");
		System.out.println("");
	}
	public static void Malt() {
		System.out.println("This is the malt");
		Lay();
	}
	public static void Rat() {
		System.out.println("This is the rat,");
		Ate();
		Lay();
	}
	public static void Cat() {
		System.out.println("This is the cat,");
		Killed();
		Ate();
		Lay();
	}
	public static void Dog() {
		System.out.println("This is the dog,");
		Worried();
		Killed();
		Ate();
		Lay();
	}
	public static void Cow() {
		System.out.println("This is the cow with the crumpled horn,");
		Tossed();
		Worried();
		Killed();
		Ate();
		Lay();
	}
	public static void Maiden() {
		System.out.println("This is the maiden all forlorn");
		Milked();
		Tossed();
		Worried();
		Killed();
		Ate();
		Lay();
	}
	public static void Ate() {
		System.out.println("That ate the malt");
	}
	public static void Killed() {
		System.out.println("That killed the rat,");
	}
	public static void Worried() {
		System.out.println("That worried the cat,");
	}
	public static void Tossed() {
		System.out.println("That tossed the dog,");
	}
	public static void Milked() {
		System.out.println("That milked the cow with the crumpled horn,");
	}
	public static void Lay() {
		System.out.println("That lay in the house that Jack built.");
		System.out.println();
	}

}
