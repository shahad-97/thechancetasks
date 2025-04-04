fun isValidIpv4(ip: String): Boolean {

    val segments = ip.split('.')

    if (segments.size != 4) {
        return false
    }

    for (segment in segments) {

        if (!segment.all { it.isDigit() }) {
            return false
        }

        if (segment.length > 1 && segment.startsWith('0')) {
            return false
        }

        val number = segment.toInt()
        if (number < 0 || number > 255) {
            return false
        }
    }

    return true
}
