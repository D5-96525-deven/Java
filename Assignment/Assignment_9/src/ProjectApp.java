import java.util.*;

class Project {
    int id;
    String title;
    int teamSize;
    double projectCost;
    String technology;

    public Project(int id, String title, int teamSize, double projectCost, String technology) {
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    public int getId() { return id; }
    public int getTeamSize() { return teamSize; }
    public double getProjectCost() { return projectCost; }

    @Override
    public String toString() {
        return id + " | " + title + " | Team: " + teamSize +
               " | Cost: " + projectCost + " | Tech: " + technology;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Project)) return false;
        Project p = (Project) obj;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class ProjectApp {

    static HashSet<Project> set = new HashSet<>();
    static ArrayList<Project> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addDummyData() {
        set.add(new Project(1, "Train Reservation System", 5, 5000000, "Java"));
        set.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
        set.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
        set.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
        set.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
        set.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
        System.out.println("Dummy data added.");
    }

    public static void addProject() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Team Size: ");
        int team = sc.nextInt();

        System.out.print("Enter Cost: ");
        double cost = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Technology: ");
        String tech = sc.nextLine();

        Project p = new Project(id, title, team, cost, tech);

        if (set.add(p))
            System.out.println("Project Added");
        else
            System.out.println("Duplicate ID! Not Added");
    }

    public static void displaySet() {
        if (set.isEmpty()) {
            System.out.println("Set is empty");
            return;
        }
        for (Project p : set)
            System.out.println(p);
    }

    public static void deleteProject() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Project temp = new Project(id, "", 0, 0, "");

        if (set.remove(temp))
            System.out.println("Deleted successfully");
        else
            System.out.println("Project not found");
    }

    public static void copyToList() {
        list.clear();
        list.addAll(set);
        System.out.println("Copied to List");
    }

    public static void displayList() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        for (Project p : list)
            System.out.println(p);
    }

    public static void sortByCost() {
        if (list.isEmpty()) {
            System.out.println("List is empty. Copy first.");
            return;
        }
        list.sort(Comparator.comparingDouble(Project::getProjectCost));
        System.out.println("Sorted by Cost");
        displayList();
    }

    public static void maxTeamSize() {
        if (list.isEmpty()) {
            System.out.println("List is empty. Copy first.");
            return;
        }
        Project max = Collections.max(list,
                Comparator.comparingInt(Project::getTeamSize));

        System.out.println("Project with Max Team Size:");
        System.out.println(max);
    }

    public static int menu() {
        System.out.println("\n1.Add Dummy Data");
        System.out.println("2.Add Project");
        System.out.println("3.Display Set");
        System.out.println("4.Delete by ID");
        System.out.println("5.Copy Set to List");
        System.out.println("6.Display List");
        System.out.println("7.Sort by Cost");
        System.out.println("8.Max Team Size");
        System.out.println("0.Exit");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int choice;

        while ((choice = menu()) != 0) {
            switch (choice) {
                case 1: addDummyData(); break;
                case 2: addProject(); break;
                case 3: displaySet(); break;
                case 4: deleteProject(); break;
                case 5: copyToList(); break;
                case 6: displayList(); break;
                case 7: sortByCost(); break;
                case 8: maxTeamSize(); break;
                default: System.out.println("Invalid choice");
            }
        }

        System.out.println("Exited...");
    }
}