import java.util.*;
import java.util.stream.Stream; 

abstract class DistributedDataProcessor {
    String dataSource;
    List<String> dataBatch;

    DistributedDataProcessor(String dataSource, List<String> dataBatch) {
        this.dataSource = dataSource;
        this.dataBatch = dataBatch;
    }

    abstract void loadData();
    abstract void processData();
    abstract void aggregateData();
    void aggregateData(String condition) {
        System.out.println("Custom aggregation with condition: " + condition);
    }
}
class StockProcessor extends DistributedDataProcessor {
    StockProcessor(String dataSource, List<String> dataBatch) {
        super(dataSource, dataBatch);
    }

    @Override
    void loadData() {
        System.out.println("Loading stock data from: " + dataSource);
    }

    @Override
    void processData() {
        System.out.println("Processing stock data in batch mode.");
        processBatchData();
    }
    void processData(Stream<String> realTimeDataStream) {
        System.out.println("Processing real-time stock data stream.");
        realTimeDataStream.parallel().forEach(stock -> {
            System.out.println("Processing stock: " + stock);
        });
    }
    private void processBatchData() {
        if (dataBatch.size() > 10) {
            System.out.println("Using multi-threaded processing due to high volume.");
            dataBatch.parallelStream().forEach(stock -> System.out.println("Processed stock: " + stock));
        } else {
            System.out.println("Using single-threaded processing for small batch.");
            dataBatch.forEach(stock -> System.out.println("Processed stock: " + stock));
        }
    }

    @Override
    void aggregateData() {
        System.out.println("Performing time-based aggregation for stock prices.");
    }

    
    void aggregateData(String timePeriod) {
        System.out.println("Aggregating stock data by: " + timePeriod);
    }
}

class TransactionProcessor extends DistributedDataProcessor {
    TransactionProcessor(String dataSource, List<String> dataBatch) {
        super(dataSource, dataBatch);
    }

    @Override
    void loadData() {
        System.out.println("Loading banking transactions from: " + dataSource);
    }

    @Override
    void processData() {
        System.out.println("Processing banking transactions in batch mode.");
        dataBatch.forEach(transaction -> System.out.println("Processed transaction: " + transaction));
    }

    @Override
    void aggregateData() {
        System.out.println("Aggregating banking transactions by user.");
    }

    void aggregateData(String userId, String riskProfile) {
        System.out.println("Aggregating transactions for user: " + userId + " with risk profile: " + riskProfile);
    }
}

class CryptoProcessor extends DistributedDataProcessor {
    CryptoProcessor(String dataSource, List<String> dataBatch) {
        super(dataSource, dataBatch);
    }

    @Override
    void loadData() {
        System.out.println("Loading cryptocurrency exchange data from: " + dataSource);
    }

    @Override
    void processData() {
        System.out.println("Processing cryptocurrency exchange rates.");
        dataBatch.forEach(currency -> System.out.println("Processed currency: " + currency));
    }

    @Override
    void aggregateData() {
        System.out.println("Aggregating cryptocurrency data by currency.");
    }
}


public class q3{
    public static void main(String[] args) {
        // StockProcessor instance
        List<String> stockBatch = List.of("AAPL", "GOOGL", "TSLA");
        StockProcessor stockProcessor = new StockProcessor("StockMarket", stockBatch);
        stockProcessor.loadData();
        stockProcessor.processData(); // Batch processing
        stockProcessor.aggregateData("Daily"); // Time-based aggregation

        // Real-time stock stream processing
        Stream<String> stockStream = Stream.of("AAPL", "AMZN", "TSLA");
        stockProcessor.processData(stockStream); // Real-time processing

        // TransactionProcessor instance
        List<String> transactionBatch = List.of("TXN1", "TXN2", "TXN3");
        TransactionProcessor transactionProcessor = new TransactionProcessor("BankTransactions", transactionBatch);
        transactionProcessor.loadData();
        transactionProcessor.processData(); // Batch processing
        transactionProcessor.aggregateData("User123", "High Risk"); // User-based aggregation with profiling

        // CryptoProcessor instance
        List<String> cryptoBatch = List.of("BTC", "ETH", "XRP");
        CryptoProcessor cryptoProcessor = new CryptoProcessor("CryptoExchange", cryptoBatch);
        cryptoProcessor.loadData();
        cryptoProcessor.processData(); // Batch processing
        cryptoProcessor.aggregateData(); // Currency-based aggregation
    }
}
