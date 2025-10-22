public class TestFolder implements Folder {
    private String name;
    private String size;

    public TestFolder(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    public String toString(){
        return "\nFolder{" + name + ", size=" + size + "}";
    }
}