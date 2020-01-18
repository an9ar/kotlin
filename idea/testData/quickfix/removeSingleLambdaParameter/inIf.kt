// "Remove single lambda parameter declaration" "false"
// ACTION: Add braces to 'if' statement
// ACTION: Remove explicit lambda parameter types (may break code)
// ACTION: Rename to _
fun test(i: Int) {
    val p: (String) -> Boolean =
        if (i == 1) { <caret>s: String -> true } else { s: String -> false }
}