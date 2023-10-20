package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImple;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImple();
        Member member1 = new Member(1L, "Noh", Grade.VIP);
        memberService.join(member1);

        Member findM = memberService.findMember(1l);
        System.out.println("first : " + member1.getName());
        System.out.println("Finded : " + findM.getName());
    }
}
