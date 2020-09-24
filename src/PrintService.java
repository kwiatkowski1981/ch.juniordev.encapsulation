public class PrintService {

    public void printSummary(Client client, double originalPrice, double discountPrice) {
        printWelcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }

    private void printWelcomeMessage(Client client) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if(firstName != null && lastName == null)
            System.out.println("Welcome " + firstName);
        else if(firstName != null && lastName != null)
            System.out.println("Welcome " + firstName + " " + lastName);
        else if(firstName == null && lastName != null)
            System.out.println("Welcome Mrs/Mr " + lastName);
        else
            System.out.println("Welcome stranger");
    }

    private void printPrices(double originalPrice, double discountPrice) {
        System.out.println("Price before Discount: " + originalPrice);
        System.out.println("Price after Discount: " + discountPrice);
    }

}
