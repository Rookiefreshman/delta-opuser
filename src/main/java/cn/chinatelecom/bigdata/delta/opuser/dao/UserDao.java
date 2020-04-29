package cn.chinatelecom.bigdata.delta.opuser.dao;

import cn.chinatelecom.bigdata.delta.opuser.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserDao extends IService<User> {
    List<User> findByUserName(String username);
}
