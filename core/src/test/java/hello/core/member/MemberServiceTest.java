package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImple();
    @Test
    void join() {
        //given
        Member member = new Member(1L, "Ma", Grade.VIP);


        //when
        memberService.join(member);
        Member findM = memberService.findMember(1l);


        //then
        Assertions.assertThat(member).isEqualTo(findM);
    }
}
