package RoadOther.Road20.Task1.Service;

public class File {
    private String name;
    private FileType type;
    private int size;
    private int hashCode;

    public File(String name, int size, FileType type){
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " / " + size + " / " + type;
    }

    @Override
    public int hashCode() {
        if (hashCode == 0){
            hashCode = name.hashCode();
            hashCode += 31 * hashCode;
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        File f = (File) obj;
        return (name.equals(f.name));
    }
}
