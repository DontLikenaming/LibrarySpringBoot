package exam.springboot.jpa.library.DAO;

import exam.springboot.jpa.library.model.Library;
import exam.springboot.jpa.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("libdao")
public class LibraryDAOImpl implements LibraryDAO{
    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public Map<String, Object> selectBoard(int page) {
        System.out.println(page);
        PageRequest paging = PageRequest.of(page-1,25, Sort.by("lbno").descending());

        List<Library> lblist = libraryRepository.findAll(paging).getContent();
        int cntpg = libraryRepository.findAll(paging).getTotalPages();

        Map<String, Object> libs = new HashMap<>();
        libs.put("lblist", lblist);
        libs.put("cntpg", cntpg);

        return libs;
    }

/*    @Override
    public int countBoard() {
        Long allcnt = libraryRepository.countLibraryBy();
        return (int) Math.ceil((double)allcnt/25);
    }*/
}
