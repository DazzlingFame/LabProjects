import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		int a=0;
		String badPattern = " ?[—с]амодовольн[ќый] | ?[“т]щеславн[ќый] | ?[√г]луп[ќый] | ?[Ќн]ечестн[ќый] | ?[Ћл]жив[ќый] | ?[ѕп]одл[ќый] | ?[ к]оварн[ќый] | ?[–р]ассе€нн[ќый] | ?[“т]руслив[ќый] ";
		String text = "ј ещЄ он был самодовольный как чЄрт, глупый и лживый. ѕосто€нно обижал программистов и, вообще, не стоило ему здесь по€вл€тьс€.";
		System.out.println(text);

		Pattern badP = Pattern.compile(badPattern);
		Matcher badM = badP.matcher(text);
		while(badM.find()) {
			a--;
			System.out.print(text.substring(badM.start(), badM.end())+"*");	
		}
		String goodPattern = " ?[ч]удо | ?[б]лагодарю| ?[л]юбовь| ?[д]оброе| ?[у]спех| ?[у]дача| ?[ф]ортуна| ?[п]оцелуй| ?[о]бъ€ти€| ?[в]осторг| ?[п]охвала| ?[м]илосердие| ?[д]ар| ?[п]одарок| ?[с]юрприз| ?[с]мех| ?[с]покойствие| ?[в]езение| ?[ч]удеса ";
		Pattern goodP = Pattern.compile(goodPattern);
		Matcher goodM = goodP.matcher(text);
		while(goodM.find()) {
			a++;
			System.out.print(text.substring(goodM.start(), goodM.end())+"*");	
		
	}

}
