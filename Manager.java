
import java.io.Serializable;
import java.util.Scanner;

public class Manager implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1811195473661939915L;
    private String mangaName;
    private String authorName;
    private int yearPublishing;
    private String nation;
    private float evaluate;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên truyện: ");
        mangaName = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        authorName = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        yearPublishing = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập quốc gia: ");
        nation = sc.nextLine();
        System.out.println("Nhập điểm đánh giá: ");
        evaluate = Float.parseFloat(sc.nextLine());
    }

    public void display(int stt) {
        String nd = String.format(String.format("|%-3d| %-25s| %-20s| %-13d| %-9s| %-8.1f|", stt + 1, mangaName,
                authorName, yearPublishing, nation, evaluate));
        System.out.println(nd);
    }

    public void showDisplay(Manager[] mangaList, int n) {
        String title = String.format("|%-3s| %-25s| %-20s| %-13s| %-10s| %-8s|", "STT", "Truyện", "Tác giả",
                "Năm xuất bản", "Quốc gia", "Đánh giá");
        System.out.println(title);
        for (int i = 0; i < n; i++) {
            mangaList[i].display(i);
        }
    }

    public void sortRateDecerease(Manager[] mangaList, int n) {
        Manager[] temp = new Manager[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mangaList[i].getEvaluate() < mangaList[j].getEvaluate()) {
                    temp[0] = mangaList[i];
                    mangaList[i] = mangaList[j];
                    mangaList[j] = temp[0];
                }
            }
        }
        showDisplay(mangaList, n);
    }

    public void sortRateAscending(Manager[] mangaList, int n) {
        Manager[] temp = new Manager[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mangaList[i].getEvaluate() > mangaList[j].getEvaluate()) {
                    temp[0] = mangaList[i];
                    mangaList[i] = mangaList[j];
                    mangaList[j] = temp[0];
                }
            }
        }
        showDisplay(mangaList, n);
    }

    public int searchElement(Manager[] mangaList, int n, String del) {
        for (int i = 0; i < n; i++) {
            if (del.equalsIgnoreCase(mangaList[i].getMangaName())
                    || del.equalsIgnoreCase(mangaList[i].getAuthorName())) {
                return i;
            }
        }
        return -1;
    }

    public int delete(Manager[] mangaList, int n, String del) {
        int pos = searchElement(mangaList, n, del);
        if (pos == -1) {
            System.out.println("---------------------------------");
            System.out.println("--Không tìm thấy truyện cần xóa--");
            System.out.println("---------------------------------");
        }
        for (int i = pos; i < n; i++) {
            mangaList[i] = mangaList[i + 1];
        }
        return n - 1;
    }

    public int insert(Manager[] mangaList, int n, int index) {
        for (int i = n; i > index; i--) {
            mangaList[i] = mangaList[i - 1];
        }
        mangaList[index] = new Manager();
        mangaList[index].input();
        return n + 1;
    }

    public Manager() {
    }

    public Manager(String mangaName, String authorName, int yearPublishing, String nation, float evaluate) {
        this.mangaName = mangaName;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
        this.nation = nation;
        this.evaluate = evaluate;
    }

    public String getMangaName() {
        return mangaName;
    }

    public void setMangaName(String mangaName) {
        this.mangaName = mangaName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public float getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(float evaluate) {
        this.evaluate = evaluate;
    }
}
