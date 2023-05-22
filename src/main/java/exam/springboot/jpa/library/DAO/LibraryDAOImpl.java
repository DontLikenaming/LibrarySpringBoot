package exam.springboot.jpa.library.DAO;

import exam.springboot.jpa.library.model.Library;
import exam.springboot.jpa.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("libdao")
public class LibraryDAOImpl implements LibraryDAO{
    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public List<Library> selectBoard(int page) {
        System.out.println(page);
        PageRequest paging = PageRequest.of(page-1,25, Sort.by("lbno").descending());
        return libraryRepository.findAll(paging).getContent();
    }

    @Override
    public int countBoard() {
        int allcnt = libraryRepository.countLibraryBy();
        return (int) Math.ceil((double)allcnt/25);
    }
}
