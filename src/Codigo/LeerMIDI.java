/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

//Keyboard LeerMIDI
import java.io.IOException;
import javax.sound.midi.*;
import java.util.List;

    public class LeerMIDI
{
  
    MidiDevice dispositivo;
   
    public LeerMIDI ()  throws IOException
    {
        
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
     

  

    

