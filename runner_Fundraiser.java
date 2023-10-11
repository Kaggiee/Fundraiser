class runner_Fundraiser {
    public static void main(String[] args) {
        // Declare Fundraiser
        Fundraiser f = new Fundraiser(10000.00);

        System.out.println(f.averageDonation());
        System.out.println(f.distanceToTarget());
        f.addDonation(3550.00);
        System.out.println(f.averageDonation());
        System.out.println(f.distanceToTarget());
        f.addDonation(855.00);
        f.addDonation(1300.00);
        f.addDonation(1475.00);
        System.out.println(f.averageDonation());
        System.out.println(f.distanceToTarget());
        f.addDonation(1550.00);
        f.addDonation(1665.00);
        System.out.println(f.averageDonation());
        System.out.println(f.distanceToTarget());
    }
}