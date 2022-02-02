import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] data;

    public AsciiCharSequence(byte[] data) {
        this.data = data;
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int index) {
        return (char) data[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(data, start, end));
    }
}
