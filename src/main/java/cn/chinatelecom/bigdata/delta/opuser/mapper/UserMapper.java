package cn.chinatelecom.bigdata.delta.opuser.mapper;

import cn.chinatelecom.bigdata.delta.opuser.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 通过hostId查询相关联的组件实例
     */
    List<User> findByUserName(String hostId);


}
