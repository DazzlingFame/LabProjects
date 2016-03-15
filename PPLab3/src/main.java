import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		String text = "А ещё он был самодовольный как чёрт, глупый и лживый. Постоянно обижал программистов и, вообще, не стоило ему здесь появляться.";
		System.out.println(text);
		MoodFinder moodfinder= new MoodFinder();
		moodfinder.moodFind(text);
		
	}

}
