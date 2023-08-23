package Chapter20;

import java.sql.Date;
import java.util.Objects;

public class MemoVO {
    private int no;
    private String title;
    private String content;
    private String writer;
    private Date registerDate;
    private Date modifyDate;

    public MemoVO() {

    }

    public MemoVO(int no) {
        this.no = no;
    }

    public MemoVO(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public MemoVO(String title, String content, String writer, int no) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.no = no;
    }

    public MemoVO(int no, String title, String content, String writer, Date registerDate, Date modifyDate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
        this.modifyDate = modifyDate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%s", no, title, content, writer, registerDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemoVO memoVO = (MemoVO) o;
        return no == memoVO.no && Objects.equals(title, memoVO.title) && Objects.equals(content, memoVO.content) && Objects.equals(writer, memoVO.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, title, content, writer);
    }
}