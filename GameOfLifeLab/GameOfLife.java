import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 7;
    private final int COLS = 7;
    
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 2, Y1 = 2;
        final int X2 = 3, Y2 = 2;
        final int X3 = 4, Y3 = 2;
        final int X4 = 4, Y4 = 3;
        final int X5 = 2, Y5 = 3;
        final int X6 = 2, Y6 = 4;
        final int X7 = 3, Y7 = 4;
        final int X8 = 4, Y8 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add LivingCells (a type of Actor) to the three intial locations
        LivingCell LivingCell1 = new LivingCell();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, LivingCell1);
        
        LivingCell LivingCell2 = new LivingCell();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, LivingCell2);
        
        LivingCell LivingCell3 = new LivingCell();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, LivingCell3);
        
        LivingCell LivingCell4 = new LivingCell();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, LivingCell4);
        
        LivingCell LivingCell5 = new LivingCell();    
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, LivingCell5);
        
        LivingCell LivingCell6 = new LivingCell();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, LivingCell6);

        LivingCell LivingCell7 = new LivingCell();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, LivingCell7);
        
        LivingCell LivingCell8 = new LivingCell();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, LivingCell8);
    }

    public void step()
    {
        createNextGeneration();
    }
    
    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        Grid<Actor> newGrid = new BoundedGrid(ROWS, COLS);
        for (int row = 0; row <= 6; row++)
        {
            for (int columns = 0; columns <= 6; columns++)
            {
                ArrayList<Actor> neighbors = grid.getNeighbors(new Location(row,columns));
                System.out.println(neighbors.size());
                if (neighbors.size() == 2 && (grid.get(new Location(row,columns)) != null))
                {
                    System.out.println("This cell lives on!");
                    newGrid.put(new Location(row,columns),new LivingCell());
                }
                else if (neighbors.size() == 3)
                {
                    System.out.println("This cell shall be born!");
                    newGrid.put(new Location(row,columns),new LivingCell());
                }
                System.out.println(row + " " + columns);
            }   
        }
        
        world.setGrid(newGrid);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
