package 직렬화;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//직렬화 : 객체를 출력하기 위해서는 일렬로 연속적인 바이트로 변경
public class SerializationEx {
    public static void main(String[] args) {
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Board b : list){
            System.out.printf("%d %s %s %s %s %s",
                    b.getBnp(), b.getTitle(), b.getContent(), b.getContent(),b.getWriter(),sdf.format(b.getDate()));
            System.out.println();
        }
    }
    public static void writeList(){
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "C++","고성능 언어", "james", new Date()));
        list.add(new Board(2, "Java","객체 지향 언어","kane",new Date()));
        list.add(new Board(3, "Python","간결한 언어","jessy",new Date()));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("board.db");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (IOException e) {}
    }
    public static List<Board> readList(){
        try{
            FileInputStream fis = new FileInputStream("board.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Board> list = (List<Board>) ois.readObject();
            return  list;
        } catch (IOException | ClassNotFoundException e){}
        return  null;
    }
}
