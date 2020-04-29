package cn.chinatelecom.bigdata.delta.opuser.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author DFFuture
 * @date 2020/4/28
 */
@Data
@ApiModel("用户基本信息")
public class UserVo {
    @ApiModelProperty("用户id")
    private String id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("创建者ID")
    private String creator_id;

    @ApiModelProperty("创建时间")
    private String creator_time;
}
