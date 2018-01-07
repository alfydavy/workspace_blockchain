import java.lang.reflect.Array;
import java.util.Arrays;

public class Block {

private int prevHash;

private String[] transactions;

private int blockHash;


public Block(int previousHash, String[] transactions){

    this.prevHash = previousHash;
    this.transactions = transactions;

    Object[] contents = {Arrays.hashCode(transactions), prevHash};
    this.blockHash = Arrays.hashCode(contents);

}

public int getprevHash() {

    return prevHash;

    }

public String[] getTransaction(){
    return transactions;
}

public int getBlockHash() {

    return blockHash;
}


}
