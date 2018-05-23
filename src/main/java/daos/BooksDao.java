package daos;

import entities.BooksEntity;

import java.util.List;

public interface BooksDao {
    public List<BooksEntity> list();

    public List<BooksEntity> searchByAuthor(String authorName);
}
