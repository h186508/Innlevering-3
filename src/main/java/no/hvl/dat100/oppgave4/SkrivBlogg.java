package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			String filePath = mappe + File.separator + filnavn;
			
		PrintWriter writer = new PrintWriter(new FileWriter(filePath));
		
		writer.close();
		
		return true;
		} catch (IOException e) {
			return false;
		}
	}
}
