package zh.footprint.zmy.mapper;

import zh.footprint.zmy.entity.BillEntity;
import zh.footprint.zmy.optimisticlock.annotation.OptimisticLock;


public interface BillEntityMapper {

    BillEntity selectByPrimaryKey(Long id);

    @OptimisticLock
    int updateByPrimaryKeySelective(BillEntity record);

    int insertSelective(BillEntity record);
}