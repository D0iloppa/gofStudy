package book.chapters.decorator.concrete.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException{
        int c = in.read();
        // 읽은 글자가 존재하는 경우, lowercase return
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = in.read(b,offset,len);
        for(int i = offset; i < offset+result ; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }

        return result;
    }

}
