
package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Emma Orczy","e.orczy@gmail.com",'F');
        Author author2 = new Author("Charles Dickens","c.dickens@email.com",'M');
        Author author3 = new Author("Mark Twain","m.twain@gmail.com",'M');

        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());
    }
}
