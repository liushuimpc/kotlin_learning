class Tv {
    private var state: String = "NONE"

    fun open() {
        println("Open TV...")
        state = "OPEN"
    }

    fun close() {
        println("Close TV...")
        state = "CLOSE"
    }

    fun replayVideo() {
        println("Replay Video...")
        state = "REPLAY_VIDEO"
    }

    fun replayMusic() {
        println("Replay Music...")
        state = "REPLAY_MUSIC"
    }

    fun getState(): String {
        return state
    }
}