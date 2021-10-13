import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipException;

public class Main {
    public static void main(String[] args) {
        List<IOException> ioExceptionList = new ArrayList<>();
        ioExceptionList.add(new IOException("added in main method"));
        lowerBound(ioExceptionList);
        upperBound(ioExceptionList);
    }
    public static void upperBound(List<? extends Exception> exceptionList){
        System.out.println("upperBound method");
        for(Exception exception : exceptionList){
            System.out.println(exception.getMessage());
        }
    }
    public static void lowerBound(List<? super ZipException> exceptionList){
        exceptionList.add(new ZipException("zip exception added in lowerBound method"));
    }
}
