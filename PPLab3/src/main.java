import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		String text = "� ��� �� ��� ������������� ��� ����, ������ � ������. ��������� ������ ������������� �, ������, �� ������ ��� ����� ����������.";
		System.out.println(text);
		MoodFinder moodfinder= new MoodFinder();
		moodfinder.moodFind(text);
		
	}

}
