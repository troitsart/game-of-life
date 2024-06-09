import java.util.ArrayList;
import java.util.Random;

public class Board
{
    ArrayList<ArrayList<Boolean>> places = new ArrayList<>();
    ArrayList<ArrayList<Boolean>> nextPlaces = new ArrayList<>();
    Random random = new Random();
    int boardSize;

    Board(int boardSize)
    {
        this.boardSize = boardSize;
    }
    void createBoard()
    {
        for (int i = 0; i < boardSize; i++)
        {
            ArrayList<Boolean> row = new ArrayList<>();

            for (int j = 0; j < boardSize; j++)
            {
                Boolean randomBool = random.nextBoolean();
                row.add(randomBool);
            }

            places.add(row);
            nextPlaces.add(row);
        }
    }

    void printBoard()
    {
        for (int i = 0; i < places.get(0).size(); i++)
        {
            for (int j = 0; j < places.get(0).size(); j++)
            {
                if (places.get(i).get(j)) System.out.print(1);
                else System.out.print(0);
            }

            System.out.print('\n');
        }

    }
}
