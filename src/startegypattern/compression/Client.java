package startegypattern.compression;

import startegypattern.compression.context.CompressionContext;
import startegypattern.compression.strategy.ZipCompressionStrategy;

public class Client {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        ctx.createArchive(null);
    }

}
