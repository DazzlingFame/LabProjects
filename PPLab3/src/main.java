import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		int a=0;
		String badPattern = " ?[��]����������[���] | ?[��]�������[���] | ?[��]���[���] | ?[��]������[���] | ?[��]���[���] | ?[��]���[���] | ?[��]�����[���] | ?[��]�������[���] | ?[��]������[���] ";
		String text = "� ��� �� ��� ������������� ��� ����, ������ � ������. ��������� ������ ������������� �, ������, �� ������ ��� ����� ����������.";
		System.out.println(text);

		Pattern badP = Pattern.compile(badPattern);
		Matcher badM = badP.matcher(text);
		while(badM.find()) {
			a--;
			System.out.print(text.substring(badM.start(), badM.end())+"*");	
		}
		String goodPattern = " ?[�]��� | ?[�]��������| ?[�]�����| ?[�]�����| ?[�]����| ?[�]����| ?[�]������| ?[�]������| ?[�]������| ?[�]������| ?[�]������| ?[�]���������| ?[�]��| ?[�]������| ?[�]������| ?[�]���| ?[�]����������| ?[�]������| ?[�]����� ";
		Pattern goodP = Pattern.compile(goodPattern);
		Matcher goodM = goodP.matcher(text);
		while(goodM.find()) {
			a++;
			System.out.print(text.substring(goodM.start(), goodM.end())+"*");	
		
	}

}
