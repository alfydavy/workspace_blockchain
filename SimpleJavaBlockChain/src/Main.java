public class Main {

    /**
     Hash = digital signature
     Each block will have:
     List of transactions
     Previous Hash
     Hash
     */


    public static void main(String[] args) {

        // first block in the blockchain is a genesis block
        String[] genesisTransactions = {" Alfy sent  1000 bitcoins to satoshi ", "satish sent 100 bitcoins to satoshi"};
        Block genesisBlock = new Block(0, genesisTransactions) ;

        String[] block2Transactions ={"satoshi sent 20 bitcoins to amazon", "satoshi send 500 bitcoins to alfy"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);


        String[] block3Transactions ={"alfy sends 200 bitcoins to home", "satoshi sends 100 bitcoins to satish"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);


        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());


       // System.out.println("Hello World!");
    }
}
