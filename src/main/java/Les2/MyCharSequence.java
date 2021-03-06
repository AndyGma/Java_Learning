package Les2;

public interface MyCharSequence {

    int length();

    char charAt(int i);

    MyCharSequence subSequence(int start, int end);

    default MyCharSequence subSequence(int start) {
        return subSequence(start, length());
    }
}
