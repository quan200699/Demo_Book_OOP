package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Book> books = init();
        Book[] books = init();
        init();
        int sum;
        sum = sumOfPrice(books);
        System.out.println("Tổng tiền = " + sum);
        int count;
        count = countProgramingBookByLanguage(books);
        System.out.println("Số quyển sách Java:" + count);
    }

    private static int countProgramingBookByLanguage(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                String language = ((ProgrammingBook) book).getLanguage();
                if (language.equalsIgnoreCase("java")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int sumOfPrice(Book[] books) {
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }

    private static Book[] init() {
        Book[] books = new Book[10];
        ProgrammingBook programmingBook1 = new ProgrammingBook("001", "Sách 01", 10000, "Tác giả 01", "Java", "Spring");
        ProgrammingBook programmingBook2 = new ProgrammingBook("002", "Sách 02", 15000, "Tác giả 01", "C#", "ASP");
        ProgrammingBook programmingBook3 = new ProgrammingBook("003", "Sách 03", 17000, "Tác giả 02", "PHP", "Laravel");
        ProgrammingBook programmingBook4 = new ProgrammingBook("004", "Sách 04", 210000, "Tác giả 02", "PHP", "Laravel");
        ProgrammingBook programmingBook5 = new ProgrammingBook("005", "Sách 05", 1590000, "Tác giả 03", "Java", "Spring");
        FictionBook fictionBook1 = new FictionBook("006", "Sách 06", 2595500, "Tác giả 03", "01");
        FictionBook fictionBook2 = new FictionBook("007", "Sách 07", 259000, "Tác giả 04", "01");
        FictionBook fictionBook3 = new FictionBook("008", "Sách 08", 251900, "Tác giả 06", "03");
        FictionBook fictionBook4 = new FictionBook("009", "Sách 09", 255900, "Tác giả 011", "04");
        FictionBook fictionBook5 = new FictionBook("010", "Sách 10", 258900, "Tác giả 032", "02");
//        books.add(programmingBook1);
//        books.add(programmingBook2);
//        books.add(programmingBook3);
//        books.add(programmingBook4);
//        books.add(programmingBook5);
//        books.add(fictionBook1);
//        books.add(fictionBook2);
//        books.add(fictionBook3);
//        books.add(fictionBook4);
//        books.add(fictionBook5);
        books[0] = programmingBook1;
        books[1] = programmingBook2;
        books[2] = programmingBook3;
        books[3] = programmingBook4;
        books[4] = programmingBook5;
        books[5] = fictionBook1;
        books[6] = fictionBook2;
        books[7] = fictionBook3;
        books[8] = fictionBook4;
        books[9] = fictionBook5;
        return books;
    }
}
