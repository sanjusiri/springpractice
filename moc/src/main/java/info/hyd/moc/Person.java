package info.hyd.moc;

public class Person {
private Integer pid;
private String name;
@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + "]";
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
