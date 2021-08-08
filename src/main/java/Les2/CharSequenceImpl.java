package Les2;

@Version(value = "1.1", date = "2021-08-08")

public class CharSequenceImpl implements MyCharSequence { // implements - класс реализует интерфейс

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

//    @Override
//    public MyCharSequence subSequence(int start) {
//        return MyCharSequence.super.subSequence(start);
//    }
}
