public class Main {

    public static void main(String[] args) {
        Authors firstAuthor = new Authors("Фёдор", "Достоевский");
        Authors secondAuthor = new Authors("Фрэнсис", "Фицджеральд");
        Authors thirdAuthor = new Authors("Рэй", "Брэдбери");
        Book firstBook = new Book("Преступление и наказание", firstAuthor, 1866);
        Book secondBook = new Book("Великий Гэтсби", secondAuthor, 1925);
        Book thirdBook = new Book("451° по Фаренгейту", thirdAuthor, 0);

        System.out.println(firstBook.getNameOfTheBook());
        System.out.println(firstBook.getAuthor());
        System.out.println(firstBook.getYearOfPublish());

        System.out.println(secondBook.getNameOfTheBook());
        System.out.println(secondBook.getAuthor());
        System.out.println(secondBook.getYearOfPublish());

        thirdBook.setYearOfPublish(1953);

        System.out.println(thirdBook.getNameOfTheBook());
        System.out.println(thirdBook.getAuthor());
        System.out.println(thirdBook.getYearOfPublish());
    }
}