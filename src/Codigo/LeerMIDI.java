package Codigo;

import java.io.IOException;
import javax.sound.midi.*;
import java.util.List;

/******************************************************************************
 *
 * @author Kelly Johana Cordoba Quintana
 * kelly.johana.cordoba@correounivalle.edu.co
 * 
*****************************************************************************
 * 
 * LeerMIDI, Identifica el controlador MIDI activo,
 * 
 ******************************************************************************/

    public class LeerMIDI {
  
    MidiDevice dispositivo;
   
    public LeerMIDI ()  throws IOException {
        
        MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
        
        for (int i = 0; i < infos.length; i++) {
            System.out.println(infos[i]);
            try {
            dispositivo = MidiSystem.getMidiDevice(infos[i]);
            List<Transmitter> listaDispositivos = dispositivo.getTransmitters();
            Transmitter trans = dispositivo.getTransmitter();
            dispositivo.open();
            trans.setReceiver(new EntradaMIDI(dispositivo.getDeviceInfo().toString()));

          } catch (MidiUnavailableException e) {}
        }
    System.out.println();

    }
}
     

  

    

