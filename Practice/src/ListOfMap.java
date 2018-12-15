import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class ListOfMap {
	
	public static void main(String[] args) throws IOException{
	Properties prop = new Properties();
	File f = new File("C://seleniumworkspace//Practice//src//Config.properties");
	FileInputStream fis = new FileInputStream(f);
	prop.load(fis);
	//String str = prop.getProperty("locators");
	//System.out.println(prop.contains("z"));
	Set<Object> set = prop.keySet();
	System.out.println("set of key is"+set);
	Set<Entry<Object, Object>> set1 = prop.entrySet();
	System.out.println("set of propert file is "+set1);
	List<Object> list = new ArrayList<Object>();
	List<Object> list1 = new ArrayList<Object>();
	
	
	Iterator<Object> itr = set.iterator();
	while(itr.hasNext()){
		Object obj = itr.next();
		list.add(obj);
		list1.add(prop.get(obj));
		
	}
	
	System.out.println("list of key is "+list);
	System.out.println("list of values is "+list1);

	
	
	Map<Object, Object> map= new HashMap<Object, Object>();
	Iterator<Object> itr1 = set.iterator();
	while(itr1.hasNext()){
		Object obj = itr1.next();
		map.put(obj, prop.get(obj));
		
		
	}
	
	System.out.println("map of propert file is "+map);
	List<Map<String, String>> list3 = new ArrayList<Map<String, String>>();
	
	Map<String, String> map1 = new HashMap<String, String>();
	map1.put("One", "1");
	map1.put("one", "11");

	
	Map<String, String> map2 = new HashMap<String, String>();
	map2.put("Two", "2");
	map2.put("two", "21");

	
	Map<String, String> map3 = new HashMap<String, String>();
	map3.put("Three", "3");
	map3.put("three", "31");
	
	
	list3.add(map1);
	list3.add(map2);
	list3.add(map3);
	
	System.out.println("list of map is "+list3);
	
	String str =list3.get(1).put("twoabc", "212");
	System.out.println("value of str is "+str);
	
	
	} 

}
