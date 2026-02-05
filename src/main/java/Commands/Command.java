package Commands;
import java.util.Map;
import java.util.HashMap;

public enum Command {
  echo("echo is a shell builtin", "v1"){
    @Override
    public String executeCommand(String ip){

    }
  },
  exit("exit is a shell builtin","v1"){
    @Override
    public String executeCommand(String ip){

    }
  },
  HIGH("echo is a shell builtin","v1"){
    @Override
    public String executeCommand(String ip){

    }
  };


  private String description;
  private String version;

  // Precomputed map for O(1) lookup
    private static final Map<String, Command> LOOKUP = new HashMap<>();

    static {
        for (Command c : values()) {
            LOOKUP.put(c.name().toLowerCase(), c);
        }
    }


  private Command(String description, String v) {
    this.description = description;
    this.version=v;
  }

  public String getDescription() {
    return description;
  }

  public abstract String executeCommand(String input);

}
