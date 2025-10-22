import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileCabinet implements Cabinet {
    private List<Folder> folders;

    public FileCabinet(List<Folder> folders) {
        this.folders = folders != null ? folders : List.of();
    }


    @Override
    public Optional<Folder> findFolderByName(String name) {

        return flattenFolders().filter(folder -> folder.getName().equals(name)).findFirst();
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {

        return flattenFolders().filter(folder -> folder.getSize().equals(size)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return (int) flattenFolders().count();
    }

    private Stream<Folder> flattenFolders(){
        return folders.stream().flatMap(this::flattenFolder);
    }

    private Stream<Folder> flattenFolder(Folder folder){
        return Stream.concat(Stream.of(folder),folder.getSubFolder().stream().flatMap(this::flattenFolder));
    }
}