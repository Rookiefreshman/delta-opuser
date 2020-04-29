package cn.chinatelecom.bigdata.delta.opuser.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 基础实体类，一般实体需要包含以下字段
 * - 主键: id
 * - 创建时间和更新时间: created_time,updated_time
 * - 逻辑删除: is_deleted
 * @author DFFuture
 * @date 2020/1/9
 */
@Data
public class BaseEntity {
    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean isDeleted;
}
