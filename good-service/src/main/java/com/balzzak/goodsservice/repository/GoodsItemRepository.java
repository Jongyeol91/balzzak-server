package com.balzzak.goodsservice.repository;

import com.balzzak.goodsservice.model.domain.GoodsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsItemRepository extends JpaRepository<GoodsItem, Long> {
}
