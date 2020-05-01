public class TestTelevision
{
    public static void main(String[] args)
    {
        Television television = new Television();
        television.changeChannel(Channel.PBS);
        television.changeChannel(Channel.DISCOVERY_CHANNEL);
        television.changeChannel(Channel.DISNEY_CHANNEL);
        television.changeChannel(Channel.NICKELODEON);
        television.changeChannel(Channel.CARTOON_NETWORK);
    }
}
