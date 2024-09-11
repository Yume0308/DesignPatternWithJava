public final class Singleton {
    private static volatile Singleton instance = null;
    public String value;

    private Singleton(String value) {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if(result != null) return result;

        synchronized(Singleton.class)
        {
            if(instance == null)
            {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}