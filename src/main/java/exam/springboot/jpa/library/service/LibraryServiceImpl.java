package exam.springboot.jpa.library.service;

import exam.springboot.jpa.library.DAO.LibraryDAO;
import exam.springboot.jpa.library.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("libsrv")
public class LibraryServiceImpl implements LibraryService{
    @Autowired private LibraryDAO libdao;

    @Override
    public List<Library> readBoard(Integer page) {
        return libdao.selectBoard(page);
    }

    @Override
    public int countBoard() {
        return libdao.countBoard();
    }
}
