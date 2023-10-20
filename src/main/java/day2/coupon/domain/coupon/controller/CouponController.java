package day2.coupon.domain.coupon.controller;

import day2.coupon.domain.coupon.dto.CouponCreateRequest;
import day2.coupon.domain.coupon.entity.Coupon;
import day2.coupon.domain.coupon.service.CouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CouponController {

    private final CouponService couponService;

    @GetMapping("/coupon")
    public List<Coupon> couponList() {
        return couponService.couponList();
    }

    @PostMapping("/coupon")
    public void createCoupon(@RequestBody CouponCreateRequest coupon) {
        couponService.createCoupon(coupon);
    }
}
