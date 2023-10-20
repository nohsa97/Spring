package hello.core.order;

import hello.core.dicount.discountPolicy;
import hello.core.dicount.fixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImple implements OrderService{
    private final MemberRepository memberRepo = new MemoryMemberRepository();
    private final discountPolicy discount = new fixDiscountPolicy();

    @Override
    public Order createOrder(long memberId, String itemName, int itemPrice) {
        Member member = memberRepo.findById(memberId);
        int discountPrice = discount.discount(member, itemPrice);
//       철저하게 지킨 OCP

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
