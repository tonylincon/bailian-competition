package com.test.controller;
import java.util.List;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.data.jpa.repository.Modifying;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.UserInfoRepository;
import com.test.domain.ResultMsg;
import com.test.domain.ResultStatusCode;
import com.test.entity.UserInfo;  
  
/*http://localhost:8080/user/adduser   {
"name":"tony",
"password":"tonylincon",
"salt":"0",
"role":"Manager"
}
返回：{"errcode":0,"errmsg":"OK","p2pdata":{"id":1,"name":"tony","password":"tonylincon","salt":"0","role":"Manager"}}
http://localhost:8080/user/updateuser  {
"id":"1",
"name":"tony2"
}
http://localhost:8080/user/getuser?id=13
http://localhost:8080/user/getusers?role=Manager
http://localhost:8080/user/deleteuser?id=13
*/
@RestController  
@RequestMapping("user")  
public class UserController {  
    @Autowired  
    private UserInfoRepository userRepositoy;  
      
    @RequestMapping("getuser")  
    public Object getUser(int id)  
    {  
        UserInfo userEntity = userRepositoy.findUserInfoById(id);  
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntity);  
        return resultMsg;  
    }  
      
    @RequestMapping("getusers")  
    public Object getUsers(String role)  
    {  
        List<UserInfo> userEntities = userRepositoy.findUserInfoByRole(role);  
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntities);  
        return resultMsg;  
    }  
      
    @Modifying  
    @RequestMapping("adduser")  
    public Object addUser(@RequestBody UserInfo userEntity)  
    {  
        userRepositoy.save(userEntity);  
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntity);  
        return resultMsg;  
    }  
      
    @Modifying  
    @RequestMapping("updateuser")  
    public Object updateUser(@RequestBody UserInfo userEntity)  
    {  
        UserInfo user = userRepositoy.findUserInfoById(userEntity.getId());  
        if (user != null)  
        {  
            user.setName(userEntity.getName());  
            userRepositoy.save(user);  
        }  
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);  
        return resultMsg;  
    }  
      
    @Modifying  
    @RequestMapping("deleteuser")  
    public Object deleteUser(int id)  
    {  
        userRepositoy.delete(id);  
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);  
        return resultMsg;  
    }  
}  