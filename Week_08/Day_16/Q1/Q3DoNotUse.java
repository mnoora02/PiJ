package toSort_PiJ_Exercises.Day_16.Q1;

/**
 3 cat
 a)
 Write a program that takes a name from the user at the command line. If a file with that name exists, the program
 must show its contents on screen. If it does not, the program must say so.
 public class Q3 {
    public static void main(String[] args) {
        String name = args[0];

        File root = new File("I:");
    }

    public boolean searchFile(String filename, File directory) {
        File[] files = directory.listFiles();
        List<File> flatFiles = Arrays.stream(files).filter(File::isFile).collect(Collectors.toList());
        List<File> directories = Arrays.stream(files).filter(File::isDirectory).collect(Collectors.toList());

        List<String> fileNames = flatFiles.stream().map(File::getName).collect(Collectors.toList());
        if (fileNames.contains(filename)) {
            return true;
        }
        else {
            if (directories.isEmpty()) {
                return false;
            }
            else {
                return directories.forEach(d -> searchFile(filename, d));
            }
        }
    }

}
*/