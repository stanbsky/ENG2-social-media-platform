package uk.ac.york.eng2.client;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.client.vms.GetVideoCommand;
import uk.ac.york.eng2.client.vms.GetVideosCommand;

@Command(name = "client", description = "...", mixinStandardHelpOptions = true,
        subcommands = {
                GetVideosCommand.class,
                GetVideoCommand.class
        })
public class ClientCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(ClientCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
