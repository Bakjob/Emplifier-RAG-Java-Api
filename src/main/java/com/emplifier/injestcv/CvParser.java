package com.emplifier.injestcv;

public class CvParser {
	public CvData parseCv(String cvText) {
		// Enkel parsing, utöka efter behov
		CvData data = new CvData();
		// Exempel: extrahera namn och email
		String[] lines = cvText.split("\n");
		for (String line : lines) {
			if (line.toLowerCase().contains("namn:")) {
				data.setName(line.replace("Namn:", "").trim());
			}
			if (line.toLowerCase().contains("email:")) {
				data.setEmail(line.replace("Email:", "").trim());
			}
		}
		return data;
	}
}
