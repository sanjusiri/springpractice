package info.hyd.moc;

import java.util.HashSet;

public class Student {
private HashSet<String>names;

public HashSet<String> getNames() {
	return names;
}

public void setNames(HashSet<String> names) {
	this.names = names;
}

@Override
public String toString() {
	return "Student [names=" + names + "]";
}
}
