fun  sudokuChecker(board: Array<CharArray>): Boolean {
    val rows = Array(9) { mutableSetOf<Char>() }
    val cols = Array(9) { mutableSetOf<Char>() }
    val boxes = Array(9) { mutableSetOf<Char>() }

    for (i in 0..8) {
        for (j in 0..8) {
            val current = board[i][j]
            if (current != '.') {
                val boxIndex = (i / 3) * 3 + (j / 3)
                if (!rows[i].add(current) || !cols[j].add(current) || !boxes[boxIndex].add(current)) {
                    return false
                }
            }
        }
    }
    return true
}