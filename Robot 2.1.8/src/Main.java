public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);
        System.out.println("x= " + robot.getX() + " " + "y= "+ robot.getY());
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }


    public static void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        // определяем направление по оси X
        Direction xDirection = currentX < toX ? Direction.RIGHT : Direction.LEFT;

        // поворачиваем робота в нужное направление по оси X
        while (currentDirection != xDirection) {
            robot.turnRight();
            currentDirection = robot.getDirection();
        }

        // робот движется до нужной координаты по оси X
        while (currentX != toX) {
            robot.stepForward();
            currentX = robot.getX();
        }

        // определяем направление по оси Y
        Direction yDirection = currentY < toY ? Direction.UP : Direction.DOWN;

        // поворачиваем робота в нужное направление по оси Y
        while (currentDirection != yDirection) {
            robot.turnRight();
            currentDirection = robot.getDirection();
        }

        // робот движется до нужной координаты по оси Y
        while (currentY != toY) {
            robot.stepForward();
            currentY = robot.getY();
        }
    }
}
