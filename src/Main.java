import java.util.List;


public class Main {
    public static void main(String[] args) {

        Folder basic1 = new TestFolder("test1", "small");
        Folder basic2 = new TestFolder("test2", "large");
        Folder basic3 = new TestFolder("test3", "large");
        Folder basic4 = new TestFolder("test4", "medium");
        Folder basic5 = new TestFolder("test5", "medium");

        MultiFolder multi1 = new TestMultiFolder("multiTest1", "medium", List.of(basic4, basic3));
        MultiFolder multi2 = new TestMultiFolder("multiTest2", "large", List.of(basic1, multi1));
        MultiFolder multi3 = new TestMultiFolder("multiTest3", "medium", List.of(basic2, basic3, basic4));
        MultiFolder multi4= new TestMultiFolder("multiTest4", "medium", List.of(basic5, basic3));

        FileCabinet all = new FileCabinet(List.of(basic1, basic2, basic3, basic4, basic5, multi1, multi2, multi3, multi4));

        System.out.println("findFolderByName(\"test5\"):");
        System.out.println(all.findFolderByName("test5").orElse(null));

        System.out.println("\nfindFoldersBySize(\"medium\"):");
        System.out.println(all.findFoldersBySize("medium"));


        System.out.println("\ncount():");
        System.out.println("Liczba wszystkich folderów: " + all.count());

    }
}