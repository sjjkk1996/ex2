package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor//매개변수가 들어가있는 기본생성자를 만들어줌
@NoArgsConstructor//매개변수가 없는 기본생성자를만들어줌
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false) //varchar2(200), null 허용 안함 과같은 코드임
    private String memoText;

}
