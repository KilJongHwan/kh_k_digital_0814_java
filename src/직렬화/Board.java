package 직렬화;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
    private int bnp;
    public String title;
    private String content;
    private String writer;
    private Date date;

    public Board(int bnp, String title, String content, String writer, Date date) {
        this.bnp = bnp;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getBnp() {
        return bnp;
    }

    public void setBnp(int bnp) {
        this.bnp = bnp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
