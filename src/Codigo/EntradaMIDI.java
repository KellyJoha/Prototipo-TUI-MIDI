
package Codigo;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author KellyJ
 */
/*****************************************************************************
    EntradaMIDI, Identifica el pin tocado por el usuario, de acuerdo
    a ello, cambia la imagen y genera el sonido
    *************************************************************************/
 class EntradaMIDI implements Receiver {
    public String name;
    ShortMessage m;
    private Receiver receptor;

    int i = 0;
    private Clip audio;
    public String ruta="/Sonidos/";
    
    //Imagenes de los animales
    public ImageIcon imagenE11 = new ImageIcon(getClass().getResource("/Imagenes/Gallo.png"));
    public ImageIcon imagenE10 = new ImageIcon(getClass().getResource("/Imagenes/Buho.png"));
    public ImageIcon imagenE09 = new ImageIcon(getClass().getResource("/Imagenes/Pollito.png"));
    public ImageIcon imagenE08 = new ImageIcon(getClass().getResource("/Imagenes/Oveja.png"));
    public ImageIcon imagenE07 = new ImageIcon(getClass().getResource("/Imagenes/Cerdo.png"));
    public ImageIcon imagenE06 = new ImageIcon(getClass().getResource("/Imagenes/Caballo.png"));
    public ImageIcon imagenE05 = new ImageIcon(getClass().getResource("/Imagenes/Perro.png"));
    public ImageIcon imagenE04 = new ImageIcon(getClass().getResource("/Imagenes/Vaca.png"));
    public ImageIcon imagenE03 = new ImageIcon(getClass().getResource("/Imagenes/Gato.png"));
    public ImageIcon imagenE02 = new ImageIcon(getClass().getResource("/Imagenes/Leon.png"));
    public ImageIcon imagenE01 = new ImageIcon(getClass().getResource("/Imagenes/Pavo.png"));
    public ImageIcon imagenE00 = new ImageIcon(getClass().getResource("/Imagenes/Elefante.png"));
    
   
    public EntradaMIDI(String name) {
        this.name = name;
       
    }
    
    @Override
     /*
        ************************************************************************
        En este metodo se identifica el tipo de tecla presionado por el usuario,
        adicional asigna a cada tecla una imagen, sonido y modifica Jlabel
        ************************************************************************
        */
    public void send(MidiMessage msg, long timeStamp) {
      
       
        /*el msg obtiene 3 elementos del pin en cuestion
        msg[dato1,dato2,dato3]
       
        dato1 = 112 (presionado, ON)
                128 (No esta presionado, OFF)
       
        dato2= Numero de la tecla
       
        dato3= Tamano del mensaje
        
       */
        
        byte[] aMsg = msg.getMessage();
       
        //System.out.println(Arrays.toString(msg.getMessage()));
 
         if ((aMsg[i + 1])== 48) {
             
            //Permite detener el sonido de otro pin, en caso de estar sonando 
             try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Gallo");
            System.out.println("PIN 11");
            Main.Etiqueta.setText("Gallo");
            Main.Imagen.setIcon(imagenE11);
            
             
        }
                  
        if ((aMsg[i + 1])== 49){
            
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Buho");
            System.out.println("PIN 10");
            Main.Etiqueta.setText("Buho");
            Main.Imagen.setIcon(imagenE10);
        }
        
        if ((aMsg[i + 1])== 50){
                     
             try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            
            Reproducir("Pollito");
            System.out.println("PIN 09"); 
            Main.Etiqueta.setText("Pollito");
            Main.Imagen.setIcon(imagenE09);         
        }
        
        if ((aMsg[i + 1])== 51){//ok
            
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Oveja");
            System.out.println("PIN 08");
            Main.Etiqueta.setText("Oveja");
            Main.Imagen.setIcon(imagenE08);
           
        }
        
        if ((aMsg[i + 1])== 52){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Cerdo");
            System.out.println("PIN 07");
            Main.Etiqueta.setText("Cerdo");
            Main.Imagen.setIcon(imagenE07);
        }
        
        if ((aMsg[i + 1])== 53){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Caballo");
            System.out.println("PIN 06");
            Main.Etiqueta.setText("Caballo");
            Main.Imagen.setIcon(imagenE06);
        }
        
        if ((aMsg[i + 1])== 54){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Perro");
            System.out.println("PIN 05");
            Main.Etiqueta.setText("Perro");
            Main.Imagen.setIcon(imagenE05);
        }
        
        if ((aMsg[i + 1])== 55){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Vaca");
            System.out.println("PIN 04");
            Main.Etiqueta.setText("Vaca");
            Main.Imagen.setIcon(imagenE04);
        }
        
        if ((aMsg[i + 1])== 56){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Gato");
            System.out.println("PIN 03");
            Main.Etiqueta.setText("Gato");
            Main.Imagen.setIcon(imagenE03);
        }
        
        if ((aMsg[i + 1])== 57){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Leon");
            System.out.println("PIN 02");
            Main.Etiqueta.setText("Leon");
            Main.Imagen.setIcon(imagenE02);
        }
        
        if ((aMsg[i + 1])== 58){//ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Pavo");
            System.out.println("PIN 01");
            Main.Etiqueta.setText("Pavo");
            Main.Imagen.setIcon(imagenE01);
        }
        
        if ((aMsg[i + 1])== 59){  //ok
            try 
            {
                audio.stop();
            }
            catch (Exception e)
            {
                System.out.println("\"No hay hilo\"");
            }
            Reproducir("Elefante");
            System.out.println("PIN 00");
            Main.Etiqueta.setText("Elefante");
            Main.Imagen.setIcon(imagenE00);

        }
       
    }
    
    @Override
    public void close() {
    receptor.close();
    }
    
    //El metodo recibe el nombre del archivo que va reproducir.
     public void Reproducir(String nombreArchivo)
    {        
       try
       {
         audio=AudioSystem.getClip();
         audio.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta +  nombreArchivo + ".wav" ) ) );
         audio.start();
       }catch(Exception ex){
            System.err.println( ex.getMessage() );
        }
    }
    }
     
