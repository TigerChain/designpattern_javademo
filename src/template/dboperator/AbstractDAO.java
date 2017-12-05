package template.dboperator;

import java.util.List;

/**
 * Created by TigerChain
 * 定义抽象的数据库增、删、改、查的模版
 */
public abstract class AbstractDAO<T> {
    // 增加数据
    abstract void add(T t) ;
    // 根据 id 删除数据
    abstract void delete(int id) ;
    // 更新数据
    abstract void update(T t) ;
    // 根据 id 查找数据
    abstract T findById(int id);
    // 查找所有数据
    abstract List<T> findall() ;
}
