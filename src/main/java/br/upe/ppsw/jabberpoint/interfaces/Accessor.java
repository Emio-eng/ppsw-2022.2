package br.upe.ppsw.jabberpoint.interfaces;

import java.io.IOException;

import br.upe.ppsw.jabberpoint.model.Presentation;

public interface Accessor {

    public Presentation loadFile(Presentation presentation, String fileName) throws IOException;

    void saveFile(Presentation presentation, String fileName) throws IOException;

}
