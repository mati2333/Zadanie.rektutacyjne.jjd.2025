import java.util.List;

interface Folder {
    String getName();

    String getSize();

    default List<Folder> getSubFolder(){
        return List.of();
    }
}