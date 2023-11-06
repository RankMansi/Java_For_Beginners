import java.io.*;

public class Search {
    private static BufferedWriter bw;

    public Search(FileReader fileReader) {
    }

    public static void main(String[] args) {
        BufferedReader br= null;
        try{
            br= new BufferedReader(new FileReader("TestFile1.txt"));
            bw = new BufferedWriter(new FileWriter("search_and_replace.txt", true));
            String line = br.readLine();
            while(line!=null){
                // bw.write(line.search("HELLO")+ "\n");
                bw.write(line.replace("HELLO","hello")+ "\n");
                line= br.readLine();
            }
            bw.flush();
            System.out.println("S--R Complete!");
        }catch(IOException e){
            System.out.println(e);
        }finally{
            if (br !=null){
                try{
                    br.close();
                }catch(Exception e){
                    System.out.println("File not opened");
                }
            }
        }
    }
}