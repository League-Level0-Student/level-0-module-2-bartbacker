package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		for (int i = 0; i < 5; i++) {
			
		
	String animal = JOptionPane.showInputDialog("Which animal do you want?");
		if(animal.equals("cow")) {
		playMoo();
		}
			
		if(animal.equals("duck")) {
			playQuack();
			}
		if(animal.equals("dog")) {
			playWoof();
			}
		if(animal.equals("cat")) {
			playMeow();
			}		
		if(animal.equals("llama")) {
			playllama();
			}		
	}
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}
	
	void playllama() {
		playNoise(llamaFile);
	}
	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = null;
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("src/methods/" + soundFile));
			DataLine.Info info = new DataLine.Info(Clip.class, inputStream.getFormat());
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(inputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
