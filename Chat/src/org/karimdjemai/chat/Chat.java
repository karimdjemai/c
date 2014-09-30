package org.karimdjemai.chat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Karim on 28.09.2014
 */
public class Chat {
    ArrayList<String> antworten = new ArrayList<>();
    
    public void ausgabe(String au){
        System.out.println("[Computer]: " + au);
    }
    public void error(String au){
        System.err.println("[Error]: " + au);
    }
    

    public String einlesen(){
		Scanner scan = new Scanner(System.in);
    	String nachricht = scan.nextLine();
        return nachricht;
    }
    public void anfügen(String an){
    	antworten.add(an);
    }
    public void beenden(){
    	System.exit(0);
    	
    }
}
