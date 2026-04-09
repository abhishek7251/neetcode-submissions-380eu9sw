class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c == '.') continue;

                if (set.contains(c)) return false;

                set.add(c);
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                char c = board[i][j];

                if (c == '.') continue;

                if (set.contains(c)) return false;

                set.add(c);
            }
        }

        // Check 3x3 boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {

                Set<Character> set = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        char c = board[boxRow * 3 + i][boxCol * 3 + j];

                        if (c == '.') continue;

                        if (set.contains(c)) return false;

                        set.add(c);
                    }
                }
            }
        }

        return true;
    }
}