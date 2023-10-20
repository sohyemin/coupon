package day2.coupon.domain.coupon.dto;

import day2.coupon.domain.coupon.entity.Coupon;
import day2.coupon.domain.coupon.enums.CouponStatus;
import day2.coupon.domain.coupon.enums.CouponType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CouponCreateRequest {

    private String name;
    private String code;

    private CouponType type;

    private CouponStatus status;

    // 유효 기간
    private LocalDate startDate;
    private LocalDate endDate;

    public Coupon toEntity() {
        return Coupon.builder()
                .name(name)
                .code(code)
                .type(type)
                .status(status)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
