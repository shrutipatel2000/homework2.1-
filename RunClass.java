package InheritancePackage;

public class RunClass {
    public static void main(String[] args) {
        System.out.println("parent class TV" );
        TV T = new TV();
        T.switchon();
        T.useremote();
        T.startchanel();
        T.watchtv();
        T.switchoff();

        System.out.println("child class sony");
        Sony s = new Sony();
        s.switchon();
        s.useremote();
        s.startchanel();
        s.watchtv();
        s.switchoff();

        System.out.println("child class panasonic");
        Panasonic p = new Panasonic();
        p.switchon();
        p.useremote();
        p.startchanel();
        p.watchtv();
        p.switchoff();

        System.out.println("child class samsung");
        Samsung S = new Samsung();
        S.switchon();
        S.useremote();
        S.startchanel();
        S.watchtv();
        S.switchoff();

        System.out.println("child class AppleTV");
        AppleTV a = new AppleTV();
        a.systemsound();
        a.sizeofTV();
        a.wightofTV();
    }
}
