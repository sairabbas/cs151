enum Channel
{
    CARTOON_NETWORK (734), NICKELODEON (728),
    DISNEY_CHANNEL (715), DISCOVERY_CHANNEL (749), PBS (719);
    final int channel_number;
    private Channel(int channel_number)
    {
        this.channel_number = channel_number;
    }
}
