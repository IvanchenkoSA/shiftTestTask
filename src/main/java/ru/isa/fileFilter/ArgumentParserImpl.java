package ru.isa.fileFilter;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.List;

public class ArgumentParserImpl implements ArgumentParser {
    @Override
    public Arguments parse(String[] args) {
        Args arguments = new Args();
        JCommander.newBuilder()
                .addObject(arguments)
                .build()
                .parse(args);
        Statistics statistics;

        if (arguments.fullStat && arguments.shortStat) {
            throw new IllegalArgumentException("Select either -f or -s");
        } else if (arguments.shortStat) {
            statistics = Statistics.SHORT;
        } else if (arguments.fullStat) {
            statistics = Statistics.FULL;
        } else {
            statistics = Statistics.NO;
        }
        return new Arguments(arguments.prefix, arguments.path, arguments.append, statistics, arguments.inputFiles);
    }

    public static class Args {
        @Parameter(names = "-a")
        public boolean append = false;
        @Parameter(names = "-p")
        public String prefix;
        @Parameter(names = "-o")
        public String path;
        @Parameter(names = "-s")
        public boolean shortStat;
        @Parameter(names = "-f")
        public boolean fullStat;
        @Parameter
        public List<String> inputFiles;
    }
}
