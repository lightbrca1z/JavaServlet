package quizans0103;
import java.util.Comparator;

import quizans0502.Book;

public class TitleComparator implements Comparator<Book> {
  public int compare(Book x, Book y) {
    return x.getTitle().compareTo(y.getTitle());
  }
}
