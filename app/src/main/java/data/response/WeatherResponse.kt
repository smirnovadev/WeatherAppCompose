package data.response

data class WeatherResponse (
    val location: Location,
    val current: Current
)

data class Location(
    val name: String,
    val country: String,
    val localtime: String
)
data class Current(
    val temp: Float,
    val icon: String,
    val cloud: Int
)