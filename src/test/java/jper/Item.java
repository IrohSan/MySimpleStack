package jper;

public class Item
{
    private int value;
    public String name;

    public Item(int init)
    {
        value = init;
        name = "#"+init;
    }

    public Item()
    {
        value = 0;
        name = "#0";
    }

    public Item(Item it)
    {
        this.value = it.value;
        this.name = it.name;
    }

}
