package org.karimdjemai.chat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{
		Chat c = new Chat();
		c.anf�gen("Hey na?");												//0
		c.anf�gen("Wie geht es dir?");										//1
		c.anf�gen("Das Wetter ist Heute aber sch�n, oder?");				//2
		c.anf�gen("Was wei� denn ich? Ich bin ein Computer!");				//3
		c.anf�gen("Du bist lustig...");										//4
		c.anf�gen("Mir wird langweilig. Fordere mich mal!");				//5
		c.anf�gen("Gute Idee!");											//6
		c.anf�gen("Ja!");													//7
		c.anf�gen("Nein!");													//8
		c.anf�gen("Okay.");													//9
		c.anf�gen("Na dann");												//10
		c.anf�gen("Tsch�ssie!");											//11
		
		while (true){
			String s = c.einlesen();
			if (s.equalsIgnoreCase("hi!") || s.equalsIgnoreCase("hi")){
				c.ausgabe(c.antworten.get(0));
			} else if (s.equalsIgnoreCase("Wie gehts?") || s.equalsIgnoreCase("Wie gehts")){
				c.ausgabe(c.antworten.get(1));
			} else if (s.equalsIgnoreCase("Mir geht es gut!") || s.equalsIgnoreCase("Mir geht es gut")){
				c.ausgabe(c.antworten.get(2));
			} else if (s.equalsIgnoreCase("Wie hei�t du?") || s.equalsIgnoreCase("Wie hei�t du?")){
				c.ausgabe(c.antworten.get(3));
			}
			else if (s.equalsIgnoreCase("Du bist cool!") || s.equalsIgnoreCase("Du bist cool")){
				c.ausgabe(c.antworten.get(4));
			}
			else if (s.equalsIgnoreCase("Wie Sp�t ist es?") || s.equalsIgnoreCase("Wie Sp�t ist es")){
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
			else if (s.equalsIgnoreCase("Tsch�ss!") || s.equalsIgnoreCase("Tsch�ss")){
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
