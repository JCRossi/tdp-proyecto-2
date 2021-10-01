package entidades;
import java.io.File;
import javax.sound.sampled.*;

public class PlayMusic{
	
	
	public PlayMusic( File archiv ) {
		
		try{
			 AudioInputStream audioStream = AudioSystem.getAudioInputStream(archiv);
			 Clip clip = AudioSystem.getClip();
			 clip.open(audioStream);
			 clip.loop(clip.LOOP_CONTINUOUSLY);
		}
		catch(Exception ex)	{  
			ex.printStackTrace();
		}
	}

	
}