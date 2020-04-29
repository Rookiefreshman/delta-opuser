package cn.chinatelecom.bigdata.delta.opuser.dao.impl;

import cn.chinatelecom.bigdata.delta.opuser.dao.UserDao;
import cn.chinatelecom.bigdata.delta.opuser.entity.User;
import cn.chinatelecom.bigdata.delta.opuser.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

import java.util.List;
//实现类，mybatisplus是因为要用<mapper>扫描dao
@Repository
public class UserDaoImpl extends ServiceImpl<UserMapper, User> implements UserDao {

    public List<User> findByUserName(String username) {
        return this.baseMapper.findByUserName(username);
    }
}
