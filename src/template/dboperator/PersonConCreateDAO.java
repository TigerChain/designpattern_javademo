package template.dboperator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TigerChain
 * 一个具体的模版对用户表的增、删、改、查
 */
public class PersonConCreateDAO extends AbstractDAO<Person> {
    // 库中的用户列表
    private List<Person> persons = new ArrayList<>() ;

    @Override
    void add(Person person) {
        // 实际上应该做插入数据库操作，为了简单我们直接输出语句
        persons.add(person) ;
        System.out.println("添加了 person "+person.toString());
    }

    @Override
    void delete(int id) {
        System.out.println("删除了 id 为 "+id+" person "+persons.get(id-1));
        persons.remove(id-1) ;
    }

    @Override
    void update(Person person) {
        person.setId(1);
        person.setName("TigerChain");
        person.setAge(30);
        person.setAddress("中国陕西西安");

        System.out.println("更新了 person "+person.toString());
    }

    @Override
    Person findById(int id) {
        // 实际这里应该从数据库中查出数据，为了简单模拟一个数据
        Person person = new Person() ;
        if(id ==1){
            person.setId(1);
            person.setName("TigerChain");
            person.setAge(28);
            person.setAddress("中国陕西");
        }
        System.out.println("查找id 为 "+id+" 的 person "+person.toString());
        return person;
    }

    @Override
    List<Person> findall() {
        System.out.println("查找所有的 person "+ persons.toString());
        return persons;
    }
}
