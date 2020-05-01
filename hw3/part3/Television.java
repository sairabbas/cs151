public class Television
{
    public void changeChannel(Channel channel)
    {
        switch (channel)
        {
            case CARTOON_NETWORK:
                System.out.println(channel.channel_number + ": Cartoon Network");
                break;
            case NICKELODEON:
                System.out.println(channel.channel_number + ": Nickelodeon");
                break;
            case DISNEY_CHANNEL:
                System.out.println(channel.channel_number + ": Disney Channel");
                break;
            case DISCOVERY_CHANNEL:
                System.out.println(channel.channel_number + ": Discovery Channel");
                break;
            case PBS:
                System.out.println(channel.channel_number + ": PBS");
                break;
        }
    }
}
