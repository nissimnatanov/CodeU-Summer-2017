package codeu.chat.util;

// why is this class in the util package? Can we combine the two ServerInfo classes in the
// codeu.chat.common package?

import java.io.IOException;

public final class UptimeServerInfo {

    public Time startTime;
    private final static String SERVER_VERSION = "1.0.0";
    public Uuid version;

    public UptimeServerInfo() throws IOException{
        //Set the startTime equal to the Time value that the server was started
        this.startTime = Time.now();
        this.version = Uuid.parse(SERVER_VERSION);
    }

    public UptimeServerInfo(Uuid version) throws IOException{
        this.version = version;
    }

    public UptimeServerInfo(Time startTime, Uuid version) throws IOException{
        this.startTime = startTime;
        this.version = version;
    }
}
