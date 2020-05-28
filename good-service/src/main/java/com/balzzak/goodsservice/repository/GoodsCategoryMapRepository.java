package com.balzzak.goodsservice.repository;

import com.balzzak.goodsservice.model.domain.GoodsCategoryMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsCategoryMapRepository extends JpaRepository<GoodsCategoryMap, GoodsCategoryMap.MapId> {
}
