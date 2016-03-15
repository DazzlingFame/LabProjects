import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodFinder {
	public double moodFind(String text)
	{
		int a=0;
		String badPattern = " ?[��]����������[���][,. ] ?[��]�������[���][,. ]| ?[��]���[���][,. ]| ?[��]������[���] | ?[��]���[���][,. ]| ?[��]���[���][,. ]| ?[��]�����[���][,. ]| ?[��]�������[���][,. ]| ?[��]������[���][,. ]";
		
		System.out.println(text);

		Pattern badP = Pattern.compile(badPattern);
		Matcher badM = badP.matcher(text);
		while(badM.find()) {
			a--;
			System.out.print(text.substring(badM.start(), badM.end())+"*");	
		}
		String goodPattern = " ?[��]��� | ?[��]�������[������][,. ]| ?[��]�����[,. ]| ?[��]�����[,. ]| ?[��]����[,. ]| ?[��]����| ?[��]������| ?[��]������| ?[��]������| ?[��]������[,. ]| ?[��]������[,. ]| ?[��]���������[,. ]| ?[��]�� | ?[��]����[���][,. ]| ?[��]������[,. ][,. ]| ?[��]���[,. ]| ?[��]����������[,. ]| ?[��]������ | ?[��]�����[,. ]";
		Pattern goodP = Pattern.compile(goodPattern);
		Matcher goodM = goodP.matcher(text);
		while(goodM.find()) {
			a++;
			System.out.print(text.substring(goodM.start(), goodM.end())+"*");	
		}
		double mood = a/text.length();
		if ((mood<0.1)&&(mood>0.1)) System.out.println("����������� �����");
		else if ((mood>0.1)&&(mood<0.7)) System.out.println("������������� �����");
		else if (mood>0.7) System.out.println("����� ������������� �����");
		else if ((mood<-0.1)&&(mood>-0.7)) System.out.println("������������� �����");
		else if (mood<0.7) System.out.println("����� ������������� �����");
		return mood;
	}

}
