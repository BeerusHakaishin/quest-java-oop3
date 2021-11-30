public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();
        pingou.sing();

        Eagle isma = new Eagle("Isma");
        // TODO : uncomment the following code in order to test it , c'est ce que j'ai fait ça tombe bien !
       
        isma.takeOff();
        isma.ascend(120);
        isma.ascend(30);
        isma.glide();
        isma.descend(140);
        isma.land();
        isma.descend(9);
        isma.land();  
        isma.sing();
    }
}
