package Problem2;
class Level1Exception extends Exception {
    public Level1Exception(String message) {
        super(message);
    }
}

class Level2Exception extends Exception {
    public Level2Exception(String message) {
        super(message);
    }
}


class Level3Exception extends Exception {
    public Level3Exception(String message) {
        super(message);
    }
}


class Level4Exception extends Exception {
    public Level4Exception(String message) {
        super(message);
    }
}

public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            throwLevel1Exception();
        } catch (Level1Exception e) {
            System.out.println("Caught Level 1 Exception: " + e.getMessage());
        }
    }

    public static void throwLevel1Exception() throws Level1Exception {
        try {
            throwLevel2Exception();
        } catch (Level2Exception e) {
            throw new Level1Exception("Level 1 Exception caused by: " + e.getMessage());
        }
    }

    public static void throwLevel2Exception() throws Level2Exception {
        try {
            throwLevel3Exception();
        } catch (Level3Exception e) {
            throw new Level2Exception("Level 2 Exception caused by: " + e.getMessage());
        }
    }

    public static void throwLevel3Exception() throws Level3Exception {
        try {
            throwLevel4Exception();
        } catch (Level4Exception e) {
            throw new Level3Exception("Level 3 Exception caused by: " + e.getMessage());
        }
    }

    public static void throwLevel4Exception() throws Level4Exception {
        throw new Level4Exception("Level 4 Exception");
    }
}
