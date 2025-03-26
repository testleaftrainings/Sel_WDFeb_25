package week6.day3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LearnTimeStam {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss");
		System.out.println(ofPattern);
		String timeStamp = now.format(ofPattern);
		System.out.println(timeStamp);
		String folderPath = System.getProperty("user.dir");
		System.out.println(folderPath);

	}

}
