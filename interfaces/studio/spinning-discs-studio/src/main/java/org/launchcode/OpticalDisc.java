package org.launchcode;

public interface OpticalDisc {
    void spinDisc();
    void writeData(double discMemory, double writingSpeed);

    void readData(double disMemory, double readingSpeed);

    String getDiscType();
}
