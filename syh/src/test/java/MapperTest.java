import com.wfu.crud.bean.Department;
import com.wfu.crud.bean.Employee;
import com.wfu.crud.dao.DepartmentMapper;
import com.wfu.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:ApplicationContext.xml","classpath:spring.xml"})
public class MapperTest {

  @Autowired
    DepartmentMapper departmentMapper;
 @Autowired
  EmployeeMapper employeeMapper;
 @Autowired
    SqlSession sqlSession;

    @Test
public void testCrud(){ 

    System.out.println(departmentMapper);


    //departmentMapper.insertSelective(new Department(null,"开发部"));
    //departmentMapper.insertSelective(new Department(null,"研发部"));



    //批量生产


        //employeeMapper.insertSelective(new Employee());

       EmployeeMapper  mapper=sqlSession.getMapper(EmployeeMapper.class);
        for(int i=0;i<10;i++){
            String  uid=UUID.randomUUID().toString().substring(0,5)+i;
           mapper.insertSelective(new Employee(null,uid,"M",uid+"@hys.com",27));
        }
        System.out.println("批量完成");
}


}
