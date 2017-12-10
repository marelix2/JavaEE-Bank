package pl.wipek.users.ejb.services;

import pl.wipek.shared.domain.entity.User;
import pl.wipek.users.ejb.dao.UsersDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author Krzysztof Adamczyk on 18.09.2017.
 */
@Stateless
public class UsersService implements Serializable {

    @EJB(beanInterface = UsersDAO.class, beanName = "JpaUsersDao")
    private UsersDAO usersDao;

    public Optional<User> findById(String id) {
        Optional<User> result = null;
        try {
            result = Optional.of(this.usersDao.findById(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<User> getAll() {
        return this.usersDao.getAll();
    }

}
