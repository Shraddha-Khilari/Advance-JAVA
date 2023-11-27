package com.sunbeam.bank;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary
@Component
public class FileLoggerImpl implements Logger {
	@Value("${logFile}")
	private String logFilePath = "applog.txt";
	
	public String getLogFilePath() {
		return logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}

	@Override
	public void log(String message) {
		//System.out.println("File: " + message);
		try(FileOutputStream fout = new FileOutputStream(logFilePath, true)) {
			try(PrintWriter pw = new PrintWriter(fout)) {
				pw.println("File: " + message);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
