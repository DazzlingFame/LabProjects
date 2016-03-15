import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		String badText = "А ещё он был самодовольный, как чёрт, глупый и лживый. Постоянно обижал программистов и, вообще, не стоило ему здесь появляться.";
		MoodFinder moodfinder= new MoodFinder();
		System.out.println(moodfinder.moodFind(badText));
		String goodText = "С утра я проснулся будто в чудесном параллельном мире. У окна стояла наряженная ёлка, а под ней лежали подарки. Вот это был сюрприз, я снова начал верить в чудеса."; 
		System.out.println(moodfinder.moodFind(goodText));
	}

}
