package exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class School {

    HashMap<String, Integer> studentsHm = new HashMap<String, Integer>();
    ArrayList<ArrayList<String>> studentsAl = new ArrayList<ArrayList<String>>();
    ArrayList<String> result = new ArrayList<String>();
    int counter = 0;

    void add(String student, int grade) {
	studentsHm.put(student, grade);
    }

    List<String> roster() {
	int i = 1;
	while (counter < studentsHm.size()) {
	    ArrayList<String> prov = (ArrayList<String>) grade(i);
	    studentsAl.add(prov);
	    i++;
	}
	for (ArrayList<String> x : studentsAl) {
	    for (String str : x) {
		result.add(str);
	    }
	}
	return result;
    }

    List<String> grade(int grade) {
	ArrayList<String> prov = new ArrayList<String>();
	for (String s : studentsHm.keySet()) {
	    if (studentsHm.get(s) == grade) {
		prov.add(s);
		counter++;
	    }
	}
	Collections.sort(prov);
	return prov;
    }
}
