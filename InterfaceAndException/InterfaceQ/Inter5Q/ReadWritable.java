package likeLionTestQ.InterfaceAndException.InterfaceQ.Inter5Q;

public interface ReadWritable extends Readable,Writable{
    @Override
    default String readContent() {

        return null;
    }

    @Override
    default void writeContent(String content) {

    }

}
