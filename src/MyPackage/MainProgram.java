package MyPackage;

public class MainProgram {
    public static void main(String[] args) {
        BlockChain blockChain = new BlockChain();

        Miner miner = new Miner();

        Block block0 = new Block(0, "",Constant.GENESIS_PREV_HASH);

        miner.mine(block0, blockChain);

        Block block1 = new Block(1, "Tom => Sergei 10CC",blockChain.getBlockChain().get(blockChain.size()-1).getHash());

        miner.mine(block1, blockChain);

        Block block2 = new Block (2,"Sergei => Hiro 5CC, Sergei => Zach 5CC",blockChain.getBlockChain().get(blockChain.size()-1).getHash());

        miner.mine(block2, blockChain);

        Block block3 = new Block (3,"Zach => Tomo 2CC, Hiro => Zach 5CC",blockChain.getBlockChain().get(blockChain.size()-1).getHash());

        miner.mine(block3, blockChain);

        Block block4 = new Block (4,"Zach => Andy 1CC",blockChain.getBlockChain().get(blockChain.size()-1).getHash());

        miner.mine(block4, blockChain);

        System.out.println("\n" + "BLOCKCHAIN:\n" + blockChain);

        System.out.println("You got " + miner.getReward()+ " CC Coins. You are now rich!");
    }


}
