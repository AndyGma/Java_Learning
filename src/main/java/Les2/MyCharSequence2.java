package Les2;

public interface MyCharSequence2 {

    default MyCharSequence subSequence(int start) {
        return null;
    }
}
