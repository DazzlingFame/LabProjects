import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		String badText = "� ��� �� ��� �������������, ��� ����, ������ � ������. ��������� ������ ������������� �, ������, �� ������ ��� ����� ����������.";
		MoodFinder moodfinder= new MoodFinder();
		System.out.println(moodfinder.moodFind(badText));
		String goodText = "� ���� � ��������� ����� � �������� ������������ ����. � ���� ������ ���������� ����, � ��� ��� ������ �������. ��� ��� ��� �������, � ����� ����� ������ � ������."; 
		System.out.println(moodfinder.moodFind(goodText));
	}

}
