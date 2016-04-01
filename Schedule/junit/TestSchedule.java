import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestSchedule {

	@Test
	public void test() {
		Work wor = new Work("job1",6,2);
		Work wor2 = new Work("job2",8,4);
		Work wor3 = new Work("job3",4,1);
		List<Work> li = new ArrayList<Work>();
		li.add(wor);
		li.add(wor2);
		li.add(wor3);
		Schedule sch = new Schedule();
		List<Double> an = sch.FCFS(li);
		Schedule.sortByServiceTime(li);
		List<Double> an2 = sch.SJF(li);
	
		assertEquals(0,an.get(0).compareTo(5.0));
		assertEquals(0,an.get(1).compareTo(3+2.0/3));
		assertEquals(0,an2.get(0).compareTo(2 + 1.0/3));
		assertEquals(0,an2.get(1).compareTo(1.0));
	}

}
