package day2.coupon.domain.coupon.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CouponType {

    DISCOUNT("할인"),
    POINT("포인트");

    private final String description;
}
