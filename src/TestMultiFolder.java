import java.util.List;

public class TestMultiFolder implements MultiFolder {
    private String name;
    private String size;
    private List<Folder> folders;

    public TestMultiFolder(String name, String size, List<Folder> folders) {
        this.name = name;
        this.size = size;
        this.folders = folders;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public List<Folder> getFolders() {
        return folders;
    }

    public String toString(){
        return "\nMultiFolder{" + name + ", size= " + size + "multiFoleder= " + folders.size() + "}";
    }
}