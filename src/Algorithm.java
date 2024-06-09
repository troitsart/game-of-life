public class Algorithm {

    Board board;

    Algorithm(Board board)
    {
        this.board = board;
    }

    void process()
    {
        for (int column = 0; column < board.boardSize; column++){
            for (int row = 0; row < board.boardSize; row++)
            {
                if (board.places.get(column).get(row))
                {
                    if (numberOfNearLiving(column, row) == 2 | numberOfNearLiving(column, row) == 3)
                    {
                        board.nextPlaces.get(column).set(row, true);
                    }
                    else board.nextPlaces.get(column).set(row, false);
                }
                else
                {
                    if (numberOfNearLiving(column, row) == 3 )
                    {
                        board.nextPlaces.get(column).set(row, true);
                    }
                    else board.nextPlaces.get(column).set(row, false);
                }
            }
        }
        boardCopy();
    }

    int numberOfNearLiving(int column, int row)
    {
        int count = 0;

        for (int i = column - 1; i < column + 2; i++){
            for (int j = row - 1; j < row + 2; j++)
            {
                if (i >= 0 & j >= 0 & i < board.boardSize & j < board.boardSize & (i != column | j != row))
                {
                    if (board.places.get(i).get(j))
                    {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    void boardCopy()
    {
        for (int i = 0; i < board.boardSize; i++){
            for (int j = 0; j < board.boardSize; j++)
            {
                board.places.get(i).set(j, board.nextPlaces.get(i).get(j));
            }
        }
    }
}
