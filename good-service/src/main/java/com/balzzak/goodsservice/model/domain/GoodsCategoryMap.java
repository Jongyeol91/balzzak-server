package com.balzzak.goodsservice.model.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GoodsCategoryMap {

    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class MapId implements Serializable {
        public MapId(Long goodsId, Long goodsCategoryId) {
            this.goodsId = goodsId;
            this.goodsCategoryId = goodsCategoryId;
        }
        private Long goodsId;
        private Long goodsCategoryId;
    }

    @EmbeddedId
    private MapId id;

    @Column(nullable = false)
    private Timestamp createDate;

    @Column(nullable = false)
    private Timestamp updateDate;
}
