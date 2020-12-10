// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
        /*
        // 创建 HashMap 对象 Sites
        HashMap<String, String> Sites = new HashMap<String, String>();
        // 添加键值对
        Sites.put("one", "Google");
        Sites.put("two", "Runoob");
        Sites.put("three", "Taobao");
        Sites.put("four", "Zhihu");
        System.out.println(Sites);
        */
        // 访问元素
        System.out.println(Sites.get(3));
        // 删除元素
        Sites.remove(4);
        System.out.println(Sites);
        // 删除所有键值对(key-value)
        Sites.clear();
        System.out.println(Sites);
        // 计算大小
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites.size());
        // 迭代 HashMap
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
}

/*
Java HashMap 常用方法列表如下：

方法  描述
clear() 删除 hashMap 中的所有键/值对
clone() 复制一份 hashMap
isEmpty()   判断 hashMap 是否为空
size()  计算 hashMap 中键/值对的数量
put()   将键/值对添加到 hashMap 中
putAll()    将所有键/值对添加到 hashMap 中
putIfAbsent()   如果 hashMap 中不存在指定的键，则将指定的键/值对插入到 hashMap 中。
remove()    删除 hashMap 中指定键 key 的映射关系
containsKey()   检查 hashMap 中是否存在指定的 key 对应的映射关系。
containsValue() 检查 hashMap 中是否存在指定的 value 对应的映射关系。
replace()   替换 hashMap 中是指定的 key 对应的 value。
replaceAll()    将 hashMap 中的所有映射关系替换成给定的函数所执行的结果。
get()   获取指定 key 对应对 value
getOrDefault()  获取指定 key 对应对 value，如果找不到 key ，则返回设置的默认值
forEach()   对 hashMap 中的每个映射执行指定的操作。
entrySet()  返回 hashMap 中所有映射项的集合集合视图。
keySet()    返回 hashMap 中所有 key 组成的集合视图。
values()    返回 hashMap 中存在的所有 value 值。
merge() 添加键值对到 hashMap 中
compute()   对 hashMap 中指定 key 的值进行重新计算
computeIfAbsent()   对 hashMap 中指定 key 的值进行重新计算，如果不存在这个 key，则添加到 hasMap 中
computeIfPresent()  对 hashMap 中指定 key 的值进行重新计算，前提是该 key 存在于 hashMap 中。
*/