package com.xynu.service;

import com.xynu.entity.User;

/**
 *
 * @author xiaosuda
 * @date 2018/3/16
 */
public interface UserService {

    boolean loginCheck(User user);
}