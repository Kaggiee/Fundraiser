public class Fundraiser {
    // Fields
    private double target;         // The goal for the fundraiser
    private double totalDonations; // The total amount of donations
    private int numberOfDonations; // The number of donations

    /**
        Constructor
        @param target The goal for the fundraiser.
    */

    public Fundraiser(double target) {
        // Note to professor: I hope you don't mind my use of 'this.'
        // I learned about 'this.'' in my high school java class back in the day
        // and I find it easier than making additional variable names
        this.target = target;
        this.totalDonations = 0.0;
        this.numberOfDonations = 0;
    }

    /**
        The addDonation method adds a donation of the amount specified by the
        parameter (double) to the fundraiser.
        @param donation The donation amount.
    */

    public void addDonation(double donation)
    {
        totalDonations += donation;
        numberOfDonations++;
    }

    /**
        The averageDonation method returns the average amount donated, found by dividing
        the amount donated by the number of donations as a double. This should
        return 0.0 when no donations have been made.
    */

    public double averageDonation()
    {
        if (numberOfDonations == 0) {
            return 0.0;
        }
        return totalDonations / numberOfDonations;
    }

    /**
        The distanceToTarget method returns the amount of money still to be raised
        to meet the target amount as a double. This is 0.0 once the amount
        raised is equal to or above the target amount.
    */

    public double distanceToTarget()
    {
        // If the goal has been reached already
        if(totalDonations >= target) {
            return 0.0;
        }
        // The money still needed is the target amount minus the existing donation total
        else {
            return target - totalDonations;
        }
    }
}