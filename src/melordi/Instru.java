/*
 * La classe instru contient les element pour le son
 */

package melordi;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Roland Kouadio Dje
 */
public class Instru {
    public int volume = 100;
    private Synthesizer synthetiseur;
    private final MidiChannel canal;
    
    public Instru(){
        
        try {
            //On récupère le synthétiseur, on l'ouvre et on obtient un canal
            synthetiseur = MidiSystem.getSynthesizer();
            synthetiseur.open();
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(Instru.class.getName()).log(Level.SEVERE, null, ex);
        }
        canal = synthetiseur.getChannels()[0];
        
        //On initialise l'instrument 0 (le piano) pour le canal
    canal.programChange(0);
    }
    //Joue la note dont le num est en parametre
    public void note_on(int note){
        canal.noteOn(note, volume);
    }
    //arreter la musique
    public void note_off(int note){
    canal.noteOff(note);
    }
    //Changer le type d'instrument 
    public void set_instrument(int intru){
        canal.programChange(intru);
    }
}
