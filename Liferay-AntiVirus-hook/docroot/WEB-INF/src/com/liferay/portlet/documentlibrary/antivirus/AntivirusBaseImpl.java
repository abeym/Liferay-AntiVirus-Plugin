package com.liferay.portlet.documentlibrary.antivirus;

import java.io.File;
import java.io.InputStream;


public class AntivirusBaseImpl implements Antivirus {

	
	public String scanFile(File file) {
		return Antivirus.VIRUS_SCAN_STATUS_SUCESS;
	}
	
	
	public String scanFile(InputStream is) {
		return Antivirus.VIRUS_SCAN_STATUS_SUCESS;
	}
	
}
