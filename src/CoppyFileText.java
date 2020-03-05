import java.io.*;

public class CoppyFileText {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("/Users/holoi/IdeaProjects/Coppy File Text/src/loi.txt"));
            outStream = new FileOutputStream(new File("/Users/holoi/IdeaProjects/Coppy File Text/src/loi1.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            outStream.close();
            inStream.close();
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}