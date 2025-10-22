import java.util.List;

interface MultiFolder extends Folder {
    List<Folder> getFolders();

    @Override
    default List<Folder> getSubFolder() {
        return getFolders();
    }
}