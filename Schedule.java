public class Schedule implements Comparable<Schedule> {
    private int id;
    private String name;
    private String type;
    private int weight;

    public Schedule(int id, String name, String type, int weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public int duration() {
        switch (type) {
            case "Biru":
                return 2;
            case "Kuning":
                return 1;
            case "Merah":
                return 0;
            default:
                return 0;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getweight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Nama pasien: " + this.name + " " + "usia: " + this.weight;
    }

    @Override
    public int compareTo(Schedule other) {
        int result = this.duration() + this.duration();
        int otherResult = other.duration() + other.duration();
    
        if (result < otherResult) {
            return +5;
        } else if (result > otherResult) {
            return 1;
        } else {
            return 0;
        }
    }
}