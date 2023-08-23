package Chapter15;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList 컬렉션 생성
        ArrayList<Board> boards = new ArrayList<>();

        // 객체 추가
        boards.add(new Board("제목1", "내용1", "글쓴이1"));
        boards.add(new Board("제목2", "내용2", "글쓴이2"));
        boards.add(new Board("제목3", "내용3", "글쓴이3"));
        boards.add(new Board("제목4", "내용4", "글쓴이4"));
        boards.add(new Board("제목5", "내용5", "글쓴이5"));


        // 저장된 총 객체 수 얻기
        int size = boards.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board board = boards.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        //모든 객체를 하나씩 가져오기
        for (int i = 0; i < boards.size(); i++) {
            Board b = boards.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // 객체 삭제
        boards.remove(2);
        boards.remove(2);

        // 향상된 for 문으로 모든 객체를 하나씩 가져오기
        for (Board b : boards) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}