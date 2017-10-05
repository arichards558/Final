package Test;

import java.io.*;
import sun.audio.*;

public class test

{
	public static void main(String[] args) 
	throws Exception
	{
		  String wav_file = "C:\\Users\\dp201524\\Desktop\\JavaGitHub\\Final\\Final\\src\\Test\\no.wav";
		  
		InputStream in = new FileInputStream(wav_file);
		  
		  AudioStream audio = new AudioStream(in);
		  AudioPlayer.player.start(audio);
	}
}
