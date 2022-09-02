package MyPackage;

public class Miner {

    double reward;

    public void mine(Block block, BlockChain blockChain){
        while(notGoodHash (block)){
            block.generateHash();
            block.incrementNonce();
        }
//
        blockChain.addBlock(block);
        reward+=Constant.MINER_REWARD;
    }
    public boolean notGoodHash(Block block){
        String leadingZeros = new String(new char[Constant.DIFFICULTY]).replace('\0', '0');
        return !block.getHash().substring (0, Constant.DIFFICULTY).equals (leadingZeros);
    }

    public double getReward() {
        return this.reward;
    }
}
