


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class music {
    public int con;

    public void gunshot() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\gun-gunshot-01.wav"; // replace with your music file path


        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void welcomebgm() {

        Scanner sc = new Scanner(System.in);

        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\welcome-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            System.out.println("\n ************************** Welcome to Russian Roulette *************************** ");
            System.out.println("To play Enter 1");
            System.out.println("To play Enter With out BGM enter 2 ");
            System.out.println("To know About Origin of Russian Roulette enter 3");
            System.out.println("To Read rules enter 4");
            System.out.println("To Read Advanced Rules enter 5");
            System.out.println("TO Quit enter 6");


            con = sc.nextInt();
            if (con == 1) {

                return;

            } else if (con == 2) {

                clip.close();
                return;

            } else if (con == 3) {

                return;

            } else if (con == 4) {


                return;

            } else if (con == 5) {


                return;

            } else if (con == 6) {


                return;

            }


            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            //


        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void guncock1() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\gun-cocking-01.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }

    }

    public void compdeath() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\comp-death-scream.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void palyerdeath() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\man-death-scream.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void empty() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\empty.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void compbgm() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\comp-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }


    }

    public void herobgm() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\hero-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void americanbgm() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\american-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void russianbgm() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\russian-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public void chinesebgm() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\chinese-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }


    }

    public void indianbgm() {

        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\indian-bgm.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                 InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }
    }


    public void dash() {
        String musicFilePath = "C:\\Users\\ED\\Downloads\\gamemusics\\dash.wav"; // replace with your music file path

        try {
            File musicFile = new File(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Wait for the music to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing music: " + e.getMessage());
        }

    }
}