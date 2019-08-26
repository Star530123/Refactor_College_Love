package Love_project;

import java.io.File; 
import java.io.IOException; 
import javax.sound.sampled.*; 


public class music_test {

	public static void main(String[] args) {
		AePlayWave apw=new AePlayWave("C:\\77777final.wav");
		apw.start();
	}
}
