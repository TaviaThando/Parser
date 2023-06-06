package com.eviro.assessment.grad001.octaviamoyo.service;

import java.io.File;
import java.net.URI;

public interface FileParser {
    void parseCSV(File csvFile);
    File convertCSVDataToImage(String base64ImageData);
    URI createImageLInk(File fileImage);
}
