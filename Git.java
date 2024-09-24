import java.io.File;
import java.io.IOException;

public class Git {
    public static void main(String[] args) throws IOException {
        init();
    }

    public static void init() throws IOException {
        boolean exists = true;
        File git = new File("./git");
        if (!git.exists()) {
            git.mkdir();
            exists = false;
        }
        File objects = new File("./git/objects");
        if (!objects.exists()) {
            objects.mkdir();
            exists = false;
        }
        File index = new File("./git/index");
        exists = !(index.createNewFile()) && exists;
        if (exists)
            System.out.println("Git Repository already exists");
    }
}