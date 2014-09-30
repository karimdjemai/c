package org.karimdjemai.chat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{
		Chat c = new Chat();
		c.anfügen("Hey na?");												//0
		c.anfügen("Wie geht es dir?");										//1
		c.anfügen("Das Wetter ist Heute aber schön, oder?");				//2
		c.anfügen("Was weiß denn ich? Ich bin ein Computer!");				//3
		c.anfügen("Du bist lustig...");										//4
		c.anfügen("Mir wird langweilig. Fordere mich mal!");				//5
		c.anfügen("Gute Idee!");											//6
		c.anfügen("Ja!");													//7
		c.anfügen("Nein!");													//8
		c.anfügen("Okay.");													//9
		c.anfügen("Na dann");												//10
		c.anfügen("Tschüssie!");											//11
		
		while (true){
			String s = c.einlesen();
			if (s.equalsIgnoreCase("hi!") || s.equalsIgnoreCase("hi")){
				c.ausgabe(c.antworten.get(0));
			} else if (s.equalsIgnoreCase("Wie gehts?") || s.equalsIgnoreCase("Wie gehts")){
				c.ausgabe(c.antworten.get(1));
			} else if (s.equalsIgnoreCase("Mir geht es gut!") || s.equalsIgnoreCase("Mir geht es gut")){
				c.ausgabe(c.antworten.get(2));
			} else if (s.equalsIgnoreCase("Wie heißt du?") || s.equalsIgnoreCase("Wie heißt du?")){
				c.ausgabe(c.antworten.get(3));
			}
			else if (s.equalsIgnoreCase("Du bist cool!") || s.equalsIgnoreCase("Du bist cool")){
				c.ausgabe(c.antworten.get(4));
			}
			else if (s.equalsIgnoreCase("Wie Spät ist es?") || s.equalsIgnoreCase("Wie Spät ist es")){
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
				c.ausgabe("Es ist: " + sdf.format(new Date()));
				c.ausgabe(c.antworten.get(5));
			}
			else if (s.equalsIgnoreCase("Lass uns was Spielen!") || s.equalsIgnoreCase("Lass uns was Spielen")){
				c.ausgabe(c.antworten.get(6));
			}
			else if (s.equalsIgnoreCase("Magst du mich?") || s.equalsIgnoreCase("Magst du mich")){
				c.ausgabe(c.antworten.get(7));
			}
			else if (s.equalsIgnoreCase("Liebst du mich?") || s.equalsIgnoreCase("Liebst du mich")){
				c.ausgabe(c.antworten.get(8));
			}
			else if (s.equalsIgnoreCase("Dann halt nicht.") || s.equalsIgnoreCase("Dann halt nicht")){
				c.ausgabe(c.antworten.get(9));
			}
			else if (s.equalsIgnoreCase("Du bist doof!") || s.equalsIgnoreCase("Du bist doof")){
				c.ausgabe(c.antworten.get(10));
			}
			else if (s.equalsIgnoreCase("Tschüss!") || s.equalsIgnoreCase("Tschüss")){
				c.ausgabe(c.antworten.get(11));
			}
			else if (s.equalsIgnoreCase("Fick dich!") || s.equalsIgnoreCase("Arschloch!") || s.equalsIgnoreCase("Ich hasse dich!") 
					|| s.equalsIgnoreCase("Fick dich") || s.equalsIgnoreCase("Arschloch") || s.equalsIgnoreCase("Ich hasse dich")){
				c.error(c.antworten.get(10));
				c.beenden();
			}
			else {
				c.error("Was?");
			}
		}
	}
}
