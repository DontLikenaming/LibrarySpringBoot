package exam.springboot.jpa.library.DAO;

import exam.springboot.jpa.library.model.Library;
import java.util.List;

public interface LibraryDAO {
    List<Library> selectBoard(int page);
    int countBoard();
}
