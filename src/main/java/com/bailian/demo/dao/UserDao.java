/**
 * Create by TPig
 * Since： 2017年3月29日下午8:36:19
 * Filename：UserDao.java
 * Description：
 */
package com.bailian.demo.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.bailian.demo.entity.UserInfo;

/**
 * @author TPig
 * @date 2017年3月29日 下午8:36:19
 * @version 1.0
 */
/*@Repository*/
public interface UserDao extends JpaSpecificationExecutor<UserInfo> {

}
