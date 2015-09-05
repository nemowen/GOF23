package me.htime.gof23.mediator;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ManagerImpl implements IMediator {
	
	private Map<String,IDepartment> departments = new HashMap<String, IDepartment>();

	@Override
	public void registor(String name, IDepartment d) {
		departments.put(name, d);
	}

	@Override
	public void commond(String name, String action) {
		IDepartment d = departments.get(name);
		try {
			Method m = d.getClass().getMethod(action, new Class[]{});
			// Method m = d.getClass().getDeclaredMethod(action, new Class[]{});
			// m.setAccessible(true);
			m.invoke(d, new Object[]{});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
