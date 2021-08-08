package Les2;

public class CharSequenceImpl implements MyCharSequence, MyCharSequence2 { // implements - класс реализует интерфейс

    char[] data;

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int i) {
        return data[i];
    }

    @Override
    public MyCharSequence subSequence(int start, int end) {
        return new CharSequenceImpl();
    }

    @Override
    public MyCharSequence subSequence(int start) {
        return MyCharSequence.super.subSequence(start);
    }
}
