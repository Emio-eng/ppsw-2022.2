package br.upe.ppsw.jabberpoint.model;

import java.io.IOException;

public interface Accessor {

    public Presentation loadFile(Presentation presentation, String fileName) throws IOException;

    void saveFile(Presentation presentation, String fileName) throws IOException;

}
