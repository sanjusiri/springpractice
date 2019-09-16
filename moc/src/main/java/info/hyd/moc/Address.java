package info.hyd.moc;

import java.util.ArrayList;

public class Address {
private ArrayList<Integer>names;

public ArrayList<Integer> getNames() {
	return names;
}

public void setNames(ArrayList<Integer> names) {
	this.names = names;
}

@Override
public String toString() {
	return "Address [names=" + names + "]";
}
}
