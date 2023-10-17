// import java.io.*;

// class BufferedIOTest{
//     public static void main(String[] args){
//         BufferedReader br = null;
//         BufferedWriter br = null;
//         try{
//             br = new BufferedReader(new FileReader("TestFile1.txt"));
//             bw = new BufferedWriter(new FileWriter("LowercaseTestFile1.txt"));
//             // to read the file
//             String line = br.readLine();
//             while(line!=null){
//                 bw.write(line.toLowerCase() + "\n");
//                 line=br.readLine();
//             }
//             bw.flush();
//             System.out.println("Reading-writing completed !!!");
//         }
//         catch(IOException e){
//             System.out.println("Unable to read or write the file" + e);
//         }
//         finally{
//             if(br!=null)
//             try{
//                 br.close();
                
//             }
//             catch(Exception e){
//                 System.out.println("File not opened !!!");
//             }
//         }
//     }
// }

import java.io.*;

public class BufferedIOTest {
    private static BufferedWriter bw;

    public BufferedIOTest(FileReader fileReader) {
    }

    public static void main(String[] args) {
        BufferedReader br= null;
        try{
            br= new BufferedReader(new FileReader("TestFile1.txt"));
            bw = new BufferedWriter(new FileWriter("lowercasetextfile.txt", true));
            String line = br.readLine();
            while(line!=null){
                bw.write(line.toLowerCase()+ "\n");
                line= br.readLine();
            }
            bw.flush();
            System.out.println("R--W Complete!");
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