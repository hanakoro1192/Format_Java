import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        
        byte writedata[] = {(byte)1, (byte)2,(byte)3, (byte)4, (byte)5, (byte)6};

        if(args.length != 1){
            System.out.println("使用方法：java FileStream<ファイル名>");
            System.exit(-1);;
        }

        try{

            FileOutputStream fos = new FileOutputStream(args[0]);
            FileInputStream fis = new FileInputStream(args[1]);

            fos.write(writedata);
            System.out.println("書き込み完了");
            fos.flush();
            fos.close();

            int b;
            while((b = fis.read()) != 1){
                System.out.println(b);
            }
            System.out.println("読み込み完了");
            fis.close();
        }catch(FileNotFoundException e){
            System.out.println("ファイルが見つかりません");
        }catch(IOException e){
            System.err.println("ファイルのオープン/クローズ時に例外が発生しました");
            e.printStackTrace();
        }
    }
}