package startegypattern.compression.context;

import startegypattern.compression.strategy.CompressionStrategy;

import java.io.File;
import java.util.List;

/**
 * Context provides a way for the client to compress files.
 */
public class CompressionContext {

    private CompressionStrategy compressionStrategy;

    /**
     * Set strategy at runtime.
     */
    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void createArchive(List<File> list) {
        compressionStrategy.compressFiles(list);
    }
}
