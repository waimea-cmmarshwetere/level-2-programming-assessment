/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold
 * Project Author: Caius Marsh-Wetere
 * GitHub Repo:    https://github.com/waimea-cmmarshwetere/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */



fun main() {
    println()
    println("OLD GOLD!")
    println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
    println(" Welcome to Old Gold this is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.")
    println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
    println()

    println("Enter Player 1 Name: ")
    val player1 = readln()
    println("Player 1: $player1")

    println("Enter Player 2 Name: ")
    val player2 = readln()
    println("Player 2: $player2")



}

//fun setupBoxes(): MutableList<String> {
//    val boxList = mutableListOf<String>()
//    for (i in 1.. NUMBOXES) boxList.add(EMPTY)
//    return boxList
//}


//fun showBoxesList(boxList: List<String>) {
//    println("+--------+--------+--------+--------+--------+--------+--------+--------+")
//    for (i in 0..boxList.size -1) {
//        print("|  ${i + 1} ".padEnd(9))
//    }