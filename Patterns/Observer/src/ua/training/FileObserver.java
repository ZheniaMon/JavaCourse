package ua.training;

import java.io.*;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        File file;
        try {
            file = File.createTempFile("TempAndPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Weather changed " + temp);
            printWriter.println("Pressure changed " + presser);
            printWriter.close();
        }catch(IOException e) {
            System.err.println("File error");
        }
    }
}
