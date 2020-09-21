package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> getAllPost() {
        ArrayList list = new ArrayList<Post>();
        Post post = new Post();
        post.setTitle("Post 1");
        post.setBody("Post 1 Body");
        post.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post 2 Body");
        post2.setDate(new Date());


        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post 3 Body");
        post3.setDate(new Date());

        list.add(post);
        list.add(post2);
        list.add(post3);
        return list;
    }

    public Post getPost() {
        Post post = new Post();
        post.setTitle("Post 1");
        post.setBody("Post 1 Body");
        post.setDate(new Date());


        return post;
    }
}
