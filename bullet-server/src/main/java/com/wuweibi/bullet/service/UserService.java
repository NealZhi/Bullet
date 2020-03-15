package com.wuweibi.bullet.service;

import com.baomidou.mybatisplus.service.IService;
import com.wuweibi.bullet.domain.message.MessageResult;
import com.wuweibi.bullet.entity.User;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author marker
 * @since 2017-12-08
 */
public interface UserService extends IService<User> {


    /**
     * 申请修改密码接口
     *
     * @param url
     * @param email 电子邮箱地址
     * @param ip
     * @return
     */
    MessageResult applyChangePass(String email, String url, String ip);


    /***
     * 修改密码
     * @param code
     * @param pass
     * @return
     */
    MessageResult changePass4Code(String code, String pass);


    /**
     * 根据Email获取
     * @param email
     * @return
     */
    User getByEmail(String email);


    /**
     * 登录校验
     * @param email email
     * @param pass 密码
     * @return
     */
    int login(String email, String pass);

    /**
     * 更新用户余额
     * @param userId 用户Id
     * @param payMoney 支付金额
     * @return
     */
    boolean updateBalance(Long userId, BigDecimal payMoney);
}