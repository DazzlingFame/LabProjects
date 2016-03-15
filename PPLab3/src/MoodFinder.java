import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodFinder {
	public double moodFind(String text)
	{
		int a=0;
		String badPattern = " ?[—с]амодовольн[оый][,. ] ?[“т]щеславн[оый][,. ]| ?[√г]луп[оый][,. ]| ?[Ќн]ечестн[оый] | ?[Ћл]жив[оый][,. ]| ?[ѕп]одл[оый][,. ]| ?[ к]оварн[оый][,. ]| ?[–р]ассе€нн[оый][,. ]| ?[“т]руслив[оый][,. ]";
		
		System.out.println(text);

		Pattern badP = Pattern.compile(badPattern);
		Matcher badM = badP.matcher(text);
		while(badM.find()) {
			a--;
			System.out.print(text.substring(badM.start(), badM.end())+"*");	
		}
		String goodPattern = " ?[„ч]удо | ?[Ѕб]лагодар[ностью][,. ]| ?[Ћл]юбовь[,. ]| ?[ƒд]оброе[,. ]| ?[”у]спех[,. ]| ?[”у]дача| ?[‘ф]ортуна| ?[ѕп]оцелуй| ?[ќо]бъ€ти€| ?[¬в]осторг[,. ]| ?[ѕп]охвала[,. ]| ?[ћм]илосердие[,. ]| ?[ƒд]ар | ?[ѕп]одар[оки][,. ]| ?[—с]юрприз[,. ][,. ]| ?[—с]мех[,. ]| ?[—с]покойствие[,. ]| ?[¬в]езение | ?[„ч]удеса[,. ]";
		Pattern goodP = Pattern.compile(goodPattern);
		Matcher goodM = goodP.matcher(text);
		while(goodM.find()) {
			a++;
			System.out.print(text.substring(goodM.start(), goodM.end())+"*");	
		}
		double mood = a/text.length();
		if ((mood<0.1)&&(mood>0.1)) System.out.println("Ќейтральный текст");
		else if ((mood>0.1)&&(mood<0.7)) System.out.println("ѕоложительный текст");
		else if (mood>0.7) System.out.println("ќчень положительный текст");
		else if ((mood<-0.1)&&(mood>-0.7)) System.out.println("ќтрицательный текст");
		else if (mood<0.7) System.out.println("ќчень отрицательный текст");
		return mood;
	}

}
