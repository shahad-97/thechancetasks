fun main() {
    val testCases = listOf(
        "192.168.0.1" to true,
        "256.100.50.25" to false,
        "192.168.01.1" to false,
        "192.168.0" to false,
        "192.168.0.256" to false
    )

    for ((ip, expected) in testCases) {
        val result = isValidIpv4(ip)
        println("Testing $ip: Expected $expected, got $result")

    }
}