package Project.Drive;

import Project.File;

public interface Drive {
    void addFile(File file);
    void listFile();
    File findFile(String name);
}
