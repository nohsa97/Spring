package hello.core.member;

public class MemberServiceImple implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(long MemberId) {
        return memberRepository.findById(MemberId);
    }
}
