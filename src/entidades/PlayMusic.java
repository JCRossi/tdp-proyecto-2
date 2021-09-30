package entidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.*;

public class PlayMusic implements Runnable {


    private String path;
    
    public PlayMusic() {
        path = "Music//Tetris.wav";
   }
    
    public static void run(String path) {
    	InputStream music;
        try {
            music = new FileInputStream(new File(path));
            AudioStream audios= new AudioStream(music);
            AudioPlayer.player.start(audios);

        }
        catch(Exception e) {

            System.out.println("Error musical");
        }

    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
