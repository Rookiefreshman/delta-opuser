package cn.chinatelecom.bigdata.delta.opuser.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Schumiyi
 * @date 2020/4/28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("User")
public class User extends BaseEntity{

    /**
     * Userid
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 创建者ID
     */
    private String creator_id;

    /**
     * 创建时间
     */
    private String created_time;

    /**
     * 更新时间
     */
    private String updated_time;

    /**
     * 伪删除
     */
    private String is_deleted;

}
