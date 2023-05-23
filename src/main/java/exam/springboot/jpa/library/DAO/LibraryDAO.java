package exam.springboot.jpa.library.DAO;

import exam.springboot.jpa.library.model.Library;
import java.util.List;
import java.util.Map;

public interface LibraryDAO {
    Map<String, Object> selectBoard(int page);

/*    int countBoard();*/
}
