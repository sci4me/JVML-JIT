package java.lang;

public class Byte extends Number {
    public static final byte MIN_VALUE = -128;
    public static final byte MAX_VALUE = 127;

    private final byte value;

    private static class ByteCache {
        private ByteCache(){}

        static final Byte cache[] = new Byte[-(-128) + 127 + 1];

        static {
            for(int i = 0; i < cache.length; i++)
                cache[i] = new Byte((byte)(i - 128));
        }
    }

    public static Byte valueOf(byte b) {
        final int offset = 128;
        return ByteCache.cache[(int)b + offset];
    }

    public Byte(byte value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString((int)value);
    }
}