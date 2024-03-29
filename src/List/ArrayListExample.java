package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
//      Board [] array = {
//         new Board(1, "제목1", "내용1", "글쓴이1"),
//         new Board(2, "제목2", "내용2", "글쓴이2"),
//         new Board(3, "제목3", "내용3", "글쓴이3"),
//         new Board(4, "제목4", "내용4", "글쓴이4"),
//         new Board(5, "제목5", "내용5", "글쓴이5"),
//      };
//
//      for (Board board : array) {
//         System.out.println(board);
//      }
////
//      Board [] newArray = new Board[6];
//      for (int i=0;i<array.length;i++) {
//         newArray[i] = array[i];
//      }
//      newArray[5] = new Board(6, "제목6", "내용6", "글쓴이6");
//
//      for (Board board : newArray) {
//         System.out.println(board);
//      }

        //ArrayList 컬렉션 생성
        List<Board> list = new ArrayList< >();

        //객체 추가
        list.add(new Board(1, "제목1", "내용1", "글쓴이1"));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2"));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3"));
        list.add(new Board(4, "제목4", "내용4", "글쓴이4"));
        list.add(new Board(5, "제목5", "내용5", "글쓴이5"));

        //저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        //특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println(board);
        System.out.println();

        //모든 객체를 하나씩 가져오기
        for(int i=0; i<list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b);
        }
        System.out.println();

        for(Board b : list) {
            System.out.println(b);
        }
        System.out.println();

        for(var b : list) {
            System.out.println(b);
        }
        System.out.println();

        //게시물의 아이디가 2인 자료를 찾자~~~
        for (Board b : list) {
            if (b.getId() == 2) {
                //아이디가 2인 자료 찾음
                break;
            }
        }


        // contains랑 indexOf는 첫번째 hashcode를 찾고 같으면 equals 메서드를 실행한다.
        /*
         * contains 메서드 사용 시: ArrayList의 contains 메서드를 호출할 때 equals 메서드가 내부적으로 사용됩니다. 이는 ArrayList가 특정 객체의 존재 여부를 확인할 때 해당 객체와 리스트 내의 각 객체를 equals 메서드를 통해 비교하기 때문입니다.
         * indexOf 메서드 사용 시: ArrayList의 indexOf 메서드 역시 equals 메서드를 사용하여 리스트 내에서 특정 객체의 인덱스를 찾습니다. 주어진 객체와 동일한 객체가 리스트에 있는지 확인하고, 있다면 해당 객체의 인덱스를 반환합니다.
         * */


        Board board2 = new Board(1);
        if (list.contains(board2)) {
            int idx = list.indexOf(board2);
            if (idx != -1) {
                board2 = list.get(idx);
                System.out.println("찾은 자료 ==== ");
                System.out.println(board2);
            }
            System.out.println("아이디가 "+board2.getId()+" 인 자료의 위치 = " + idx);
        } else {
            System.out.println(board2.getId() + " 찾고가 하는 아이디가 존재하지 않습니다");
        }


        //객체 삭제
        list.remove(2);
        System.out.println("총 객체 수: " + list.size());
        System.out.println();


        list.remove(2);
        System.out.println("총 객체 수: " + list.size());
        System.out.println();

        //향상된 for문으로 모든 객체를 하나씩 가져오기
        for(Board b : list) {
            System.out.println(b);
        }
        System.out.println();

        list.add(new Board(6, "제목6", "내용6", "글쓴이6"));
        for(Board b : list) {
            System.out.println(b);
        }
        System.out.println();
    }
}