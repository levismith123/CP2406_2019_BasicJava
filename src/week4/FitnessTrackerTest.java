package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitnessTrackerTest {

    @Test
    public void defaultValueConstructor(){

        FitnessTracker Default = new FitnessTracker();
        assertEquals(Default.getActivity(), "running");
        assertEquals(Default.getDate(), "January 1st 2019");
        assertEquals(Default.getTimeSpent(), 0);

    }

    @Test
    public void initialValueConstructor(){

        FitnessTracker initial = new FitnessTracker(10, "basketball", "21st september 1998");
        assertEquals(initial.getDate(), "21st september 1998");
        assertEquals(initial.getTimeSpent(), 10);
        assertEquals(initial.getActivity(), "basketball");
    }
}