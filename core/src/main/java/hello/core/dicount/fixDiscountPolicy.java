package hello.core.dicount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class fixDiscountPolicy implements discountPolicy {

    private int DiscountFixPrice = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return DiscountFixPrice;
        }
        else return 0;

    }
}
