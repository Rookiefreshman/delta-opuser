package cn.chinatelecom.bigdata.delta.opuser.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author sx
 * @date 2020/4/28
 */
@ApiModel("用户登录所需信息")
@Data
public class UserLoginBody {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("用户密码")
    private String password;

}
