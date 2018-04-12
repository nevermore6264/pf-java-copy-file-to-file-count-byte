import java.io.*;

public class CountByte {

    public static void main(String[] args) throws Exception {
        InputStream input = null;
        OutputStream output = null;
        File source = new File("source.txt");
        File dest = new File("target.txt");
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
                System.out.println(bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }
}


