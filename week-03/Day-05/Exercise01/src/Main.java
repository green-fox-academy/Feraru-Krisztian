public class Main {
    public static void main(String[] args) {

        BlogPost blog1 = new BlogPost("\"Lorem Ipsum\"", "John Doe", "2000.05.04.", "Lorem ipsum dolor sit amet.");
        blog1.printBlogSpot();
        System.out.println("--------------------------------------------------------------------------------------------");

        BlogPost blog2 = new BlogPost("\"Wait but why\"", "Tim Urban", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");
        blog2.printBlogSpot();
        System.out.println("--------------------------------------------------------------------------------------------");

        BlogPost blog3 = new BlogPost("\"One Engineer Is Trying to Get IBM to Reckon With Trump\"", "William Turton", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." + "\n" + " When I asked to take his picture outside one of IBM’s New York City offices," + "\n" + " he told me that he wasn’t really into the whole organizer profile thing.");
        blog3.printBlogSpot();


        Blog blogList = new Blog();


        blogList.addBlogPostToList(blog1);
        blogList.addBlogPostToList(blog2);
        blogList.addBlogPostToList(blog3);

        blogList.deleteItem(2);

        blogList.addBlogPostToList(blog3);


        blogList.update(2, blog3);

    }
}
