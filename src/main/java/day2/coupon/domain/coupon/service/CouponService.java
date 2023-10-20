package day2.coupon.domain.coupon.service;

import day2.coupon.domain.coupon.dto.CouponCreateRequest;
import day2.coupon.domain.coupon.entity.Coupon;

import java.util.List;

public interface CouponService {
    public List<Coupon> couponList();

    public void createCoupon(CouponCreateRequest coupon);
}
