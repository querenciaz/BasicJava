package Chapter20;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemoDAOTest {

    @org.junit.jupiter.api.Test
    void selectMemos() throws Exception {
        MemoDAO dao = new MemoDAO();
        List<MemoVO> memos = dao.selectMemos();
        MemoVO vo = memos.get(5);
        assertEquals("첫번쨰 글", vo.getTitle());

    }

    @org.junit.jupiter.api.Test
    void insertMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        dao.insertMemo(new MemoVO("첫번쨰 글", "테스트 및 배포 첫번쨰 수업", "킴은식"));
        List<MemoVO> memos = dao.selectMemos();
        assertEquals(7, memos.size());
    }

    @Test
    void updateMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        MemoVO vo = (new MemoVO("두번쨰 글", "테스트 및 배포 두번쨰 수업", "킴은식", 1));
        dao.updateMemo(vo);
        MemoVO memoVO = dao.selectMemo(1);
        assertEquals(vo, memoVO);
    }

    @Test
    void deleteMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        MemoVO memoVO = new MemoVO(1);
        dao.deleteMemo(memoVO);
        MemoVO memoVO1 = dao.selectMemo(1);
        assertNull(memoVO1);
    }
}