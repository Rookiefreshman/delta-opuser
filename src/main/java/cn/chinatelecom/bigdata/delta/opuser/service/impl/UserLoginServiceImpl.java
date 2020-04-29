package cn.chinatelecom.bigdata.delta.opuser.service.impl;
import cn.chinatelecom.bigdata.delta.common.service.dto.RestResult;
import cn.chinatelecom.bigdata.delta.opuser.dao.*;
import cn.chinatelecom.bigdata.delta.opuser.dao.UserDao;
import cn.chinatelecom.bigdata.delta.opuser.dto.request.UserLoginBody;
import cn.chinatelecom.bigdata.delta.opuser.dto.response.UserVo;
import cn.chinatelecom.bigdata.delta.opuser.entity.User;
import cn.chinatelecom.bigdata.delta.opuser.service.UserLoginService;
import cn.chinatelecom.bigdata.delta.opuser.util.PasswordUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Resource
    private UserDao userDao;

    @Override
    public UserVo getUserInfo(UserLoginBody userLoginBody) {
        // 用户信息
        List <User> users = userDao.findByUserName(userLoginBody.getUsername());
        // 账号不存在、密码错误
        String password = userLoginBody.getPassword();
        if (users == null) {
            log.info("账户不存在");
           RestResult.builder().message("PasswordUtils.java账号不存在");
     }

        if(password.equals(users.get(0).getPassword()))
        {
            log.info("密码正确");
            return (UserVo) users;
        }
        return (UserVo) users;
//        if (!PasswordUtils.matches(PasswordUtils.getSalt(), password, users.get(0).getPassword())) {
//            log.info("密码错误");
//            RestResult.builder().message("密码错误");
//        }

    }
}
