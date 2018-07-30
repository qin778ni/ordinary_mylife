package springmvc.dao;

import org.springframework.stereotype.Repository;
import springmvc.domain.User;

/**
 * @author:ms.y
 * @create 2018/7/30-11:13
 */
@Repository
public interface IUserDao {

    User findUserById(String id);
}
