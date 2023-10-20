package day2.coupon.domain.coupon.service;

import day2.coupon.domain.coupon.dto.CouponCreateRequest;
import day2.coupon.domain.coupon.entity.Coupon;
import day2.coupon.domain.coupon.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CouponServiceImpl implements CouponService{

    private final CouponRepository couponRepository;

    @Override
    public List<Coupon> couponList() {
        return couponRepository.findAll();
    }

    @Override
    public void createCoupon(CouponCreateRequest coupon) {
        couponRepository.save(coupon.toEntity());
    }
}
