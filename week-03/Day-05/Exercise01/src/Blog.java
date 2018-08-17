import java.util.ArrayList;

public class Blog {

    ArrayList<BlogPost> listOfBlogPost;

    Blog() {
        listOfBlogPost = new ArrayList<>();
    }

    void addBlogPostToList(BlogPost blogPost){
        this.listOfBlogPost.add(blogPost);
    }

    void deleteItem(int index) {
        listOfBlogPost.remove(index);
    }

    void update(int index, BlogPost blogPost) {
        listOfBlogPost.set(index, blogPost);
    }
}
