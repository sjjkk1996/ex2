package org.zerock.ex2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ex2.entity.Memo;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired //자동으로 들고와서 인스턴스를 만들어줌 spring 빈이있기때문임
    MemoRepository memoRepository;

    @Test
    public void testClass(){
        System.out.println("testClass::"+memoRepository.getClass().getName());
    }
    @Test
    public void testInsert() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Sample..."+i).build();
            //Memo.builder()는 생성자 만드는거임
            memoRepository.save(memo); //save가 insert 해주는거임 여기서는 sql을 안씀 여기서는
        });
    }
}
