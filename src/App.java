public class App
{

    Board board = new Board(30);
    Algorithm algorithm = new Algorithm(board);


    void run() throws InterruptedException {

        board.createBoard();
        while (true)
        {
            algorithm.process();
            board.printBoard();
            System.out.println();
            Thread.sleep(100);

            System.out.print("\033[H\033[2J");
            System.out.flush();


        }
    }
}
