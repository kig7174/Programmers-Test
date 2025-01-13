func solution(numer1 int, denom1 int, numer2 int, denom2 int) [2]int {
    a := numer1 * denom2 + numer2 * denom1
    b := denom1 * denom2
    var c [2]int
    
    for i := 1; i<=a && i<=b; i++ {
        if a%i == 0 && b%i == 0 {
            c[0] = a / i
            c[1] = b / i
        }
    }

    return c
}