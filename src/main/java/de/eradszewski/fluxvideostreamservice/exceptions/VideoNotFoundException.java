package de.eradszewski.fluxvideostreamservice.exceptions;

import java.io.FileNotFoundException;

public class VideoNotFoundException extends FileNotFoundException {

    public VideoNotFoundException() {
        super("video was not found");
    }
}
