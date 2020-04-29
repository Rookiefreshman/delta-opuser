package cn.chinatelecom.bigdata.delta.opuser.service;

import cn.chinatelecom.bigdata.delta.opuser.dto.request.UserLoginBody;
import cn.chinatelecom.bigdata.delta.opuser.dto.response.UserVo;
import cn.chinatelecom.bigdata.delta.opuser.entity.User;

import java.util.List;

public interface UserLoginService {

    /**根据给定信息查询用户列表
     * 查询符合用户的信息
     * @return 符合用户的信息列表
     */
    UserVo getUserInfo(UserLoginBody userLoginBody);

}
