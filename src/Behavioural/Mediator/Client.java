package Behavioural.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator md = new Auction();
        Colleague phani = new Bidder(md,"phani");
        Colleague sumathi = new Bidder(md,"sumathi");
        Colleague abhi = new Bidder(md,"abhi");
        md.addColleague(phani);
        md.addColleague(sumathi);
        md.addColleague(abhi);
        System.out.println("Phani plced 100");
        phani.placeBid(100);
        System.out.println("Sumathi plced 130");
        sumathi.placeBid(130);
        System.out.println("Abhi plced 190");
        abhi.placeBid(190);



    }
}
