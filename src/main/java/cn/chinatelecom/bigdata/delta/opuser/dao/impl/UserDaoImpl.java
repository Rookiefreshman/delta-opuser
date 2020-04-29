package cn.chinatelecom.bigdata.delta.opuser.dao.impl;

import cn.chinatelecom.bigdata.delta.opuser.dao.UserDao;
import cn.chinatelecom.bigdata.delta.opuser.entity.User;
import cn.chinatelecom.bigdata.delta.opuser.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

public class UserDaoImpl extends ServiceImpl<UserMapper, User> implements UserDao {
    @Override
    public List<User> findByUserName(String username) {
        return this.baseMapper.findByUserName(username);
    }
}
