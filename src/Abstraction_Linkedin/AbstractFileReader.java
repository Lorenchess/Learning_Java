package Abstraction_Linkedin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

//An Abstract class is almost like a template class where some functionality is not implemented yet, so you cannot
// instantiate the abstract class but other classes can extend the abstract class and implement the appropriate
// functionality.

public abstract class AbstractFileReader {
   private final Path filePath;

   protected AbstractFileReader(String filePath) {
      this.filePath = Path.of(filePath);
   }

   public String getPath() {
      return filePath.toString();
   }

   public List<String> readFile() throws IOException {
      return Files.lines(filePath).map(this::parseLine).collect(Collectors.toList());
   }

   protected abstract String parseLine(String line);
}
