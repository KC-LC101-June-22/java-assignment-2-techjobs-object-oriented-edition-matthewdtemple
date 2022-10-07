import org.junit.Test;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertNotEquals;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }
}
