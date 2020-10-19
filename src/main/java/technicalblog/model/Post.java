package technicalblog.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    private  Integer id;

    private String title;

    private String body;

    private  Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
