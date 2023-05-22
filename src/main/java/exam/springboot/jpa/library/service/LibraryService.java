package exam.springboot.jpa.library.service;

import exam.springboot.jpa.library.model.Library;
import java.util.List;

public interface LibraryService {
    List<Library> readBoard(Integer page);

    int countBoard();
}
