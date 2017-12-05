package template.dboperator;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){
        // 模拟两个用户数据
        Person person1 = new Person() ;
        person1.setId(1);
        person1.setName("TigerChain");
        person1.setAge(28);
        person1.setAddress("中国陕西");

        Person person2 = new Person() ;
        person2.setId(2);
        person2.setName("小陈");
        person2.setAge(30);
        person2.setAddress("中国陕西西安");

        PersonConCreateDAO personConCreateDAO = new PersonConCreateDAO() ;

        // 给库中添加用户
        personConCreateDAO.add(person1);
        personConCreateDAO.add(person2);

        // 更新用户 1 的数据
        personConCreateDAO.update(person1);
        personConCreateDAO.findById(1);
        personConCreateDAO.findall() ;

        // 删除一条数据
        personConCreateDAO.delete(1);
        // 查找所有库中的数据
        personConCreateDAO.findall() ;

    }
}
