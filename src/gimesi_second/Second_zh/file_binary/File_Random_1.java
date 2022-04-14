package gimesi_second.Second_zh.file_binary;
import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.err;
import static java.lang.System.out;
public class File_Random_1 
{ 
    public static void main(String[] args) 
    { 
        int szam;
        long j;
        try
        {
            try (RandomAccessFile file = new RandomAccessFile("Generated/Teszt.txt", "rw"))
            {
                for(int i = 48; i <= 57; i++) file.write(i);
                file.seek(5);
                out.println(file.read());//pointer++
                file.skipBytes(2);

                /*
                file.seek(file.getFilePointer()-2);
                out.println(file.read());
                */
                out.println(file.read());//pointer++
                boolean more=true;
                try{
                    while (more)
                    {
                    for (int i = 0; i < file.length(); i++)
                    {
                        file.seek(file.getFilePointer()-2);
                        out.println(file.read());
                    }
                    }
                }
                catch (IOException e)
                {
                    more=false;
                }

                out.println("Aktuális pozició: " + file.getFilePointer());
            }
        }
        catch (IOException error)
        {
            err.println("Fájl hiba - " + error.getMessage());
        }
    } 
}
/*
*     FileReader fr=new FileReader("valami.txt");
        BufferedReader br=new BufferedReader(fr);
        String s;

        List<String> tmp = new ArrayList<String>();
        do{
        s = br.readLine();
        tmp.add(s);
        }while(s!=null);


        for(int i=tmp.size()-1;i>=0;i--) {
        System.out.println(tmp.get(i));
        }
* */