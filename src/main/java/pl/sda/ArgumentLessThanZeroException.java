package pl.sda;

public class ArgumentLessThanZeroException extends RuntimeException {

    public ArgumentLessThanZeroException(String s) {

        //przekazanie String s do mechanizmów klasy RuntimeException
        super(s);
    }

}
