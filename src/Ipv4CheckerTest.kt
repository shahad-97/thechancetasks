fun testIsValidIPv4() {
    val testCases = listOf(
        Pair("192.168.1.1", true),
        Pair("255.255.255.255", true),
        Pair("0.0.0.0", true),
        Pair("256.100.50.25", false),
        Pair("192.168.01.1", false),
        Pair("192.168.1", false),
        Pair("192.168.1.256", false),
        Pair("192.168.1.-1", false),
        Pair("192.168.1.a", false),
        Pair("01.02.03.04", false),
        Pair("192.168.1.1.", false),
        Pair("192..168.1.1", false)
    )

}


