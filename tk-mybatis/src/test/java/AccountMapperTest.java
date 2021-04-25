import com.wang.tK.TKApplication;
import com.wang.tK.domain.Account;
import com.wang.tK.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TKApplication.class)
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void test0(){

        Account account = new Account();

        account.setAccount("123");
        accountMapper.select(account);

        List<Account> accounts = accountMapper.selectAll();

        Example example = new Example(Account.class);
        Example.Criteria c1 = example.createCriteria();
        c1.andEqualTo("uuid", "1");
        c1.orCondition("uuid = 1");
        c1.andEqualTo("uuid", "1");
//        example.or().andEqualTo("uuid","1");
//        c1.andEqualTo("uuid", 2);

        c1.andAllEqualTo(new Account());
//        example.and(c1);
        accountMapper.updateByExampleSelective(account, example);
    }

}
