package Project.Drive;

import Project.File;

import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive{
    Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.toString(), file);
    }

    @Override
    public void listFile() {

    }

    @Override
    public File findFile(String name) {
        return null;
    }
}
