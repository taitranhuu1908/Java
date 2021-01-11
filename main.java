import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main {
    static Manager[] mangaList;
    static int n;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        mangaList = new Manager[100];
        int choose;
        boolean cont = true;
        clrscr();
        do {
            menu();
            System.out.println("Mời bạn lựa chọn: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    clrscr();
                    System.out.println("Nhập số lượng truyện bạn muốn thêm vào: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập phần tử thứ: " + (i + 1));
                        mangaList[i] = new Manager();
                        mangaList[i].input();
                    }
                    break;
                case 2:
                    System.out.println("Bạn có muốn lưu dữ liệu vào file không ?");
                    System.out.println("(1) Có or (2) Không");
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        FileOutputStream out = null;
                        ObjectOutputStream objectOutputStream = null;

                        try {
                            out = new FileOutputStream("manga.txt");
                            objectOutputStream = new ObjectOutputStream(out);

                            objectOutputStream.writeObject(mangaList);
                            System.out.println("--------------------------------------");
                            System.out.println("---Ghi thông tin vào file thành công---");
                            System.out.println("--------------------------------------");
                        } catch (Exception e) {
                            // System.out.println("Lỗi: " + e);
                        } finally {
                            if (out != null) {
                                out.close();
                            }
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                        }
                    } else {
                        System.out.println("----------------------------------");
                        System.out.println("--Lưu thông tin không thành công--");
                        System.out.println("----------------------------------");
                    }

                    break;
                case 3:
                    FileInputStream in = null;
                    ObjectInputStream objectInputStream = null;

                    try {
                        in = new FileInputStream("manga.txt");
                        objectInputStream = new ObjectInputStream(in);

                        System.out.println("Muốn lấy ra bao nhiêu truyện: ");
                        n = Integer.parseInt(sc.nextLine());

                        mangaList = (Manager[]) objectInputStream.readObject();
                        System.out.println("--------------------------------------");
                        System.out.println("---Đọc thông tin từ file thành công---");
                        System.out.println("--------------------------------------");
                    } catch (Exception e) {
                        System.out.println("Lỗi: " + e);
                    } finally {
                        if (in != null) {
                            in.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    }
                    break;
                case 4:
                    clrscr();
                    manager.showDisplay(mangaList, n);
                    break;
                case 5:
                    clrscr();
                    System.out.println("Tìm kiếm(theo tên hoặc tác giả): ");
                    String namelf = sc.nextLine();
                    int search = manager.searchElement(mangaList, n, namelf);
                    if (search == -1) {
                        System.out.println("---------------------------------");
                        System.out.println("--Không tìm thấy truyện cần tìm--");
                        System.out.println("---------------------------------");
                    } else {
                        clrscr();
                        String title = String.format("|%-3s| %-25s| %-20s| %-13s| %-10s| %-8s|", "STT", "Truyện",
                                "Tác giả", "Năm xuất bản", "Giá bán", "Đánh giá");
                        System.out.println(title);
                        mangaList[search].display(search);
                    }
                    break;
                case 6:
                    clrscr();
                    manager.showDisplay(mangaList, n);
                    System.out.println("Vị trí cần thêm: ");
                    int index = Integer.parseInt(sc.nextLine());
                    n = manager.insert(mangaList, n, index);
                    System.out.println("--------------------------------");
                    System.out.println("------ Đã thêm thành công ------");
                    System.out.println("--------------------------------");
                    manager.showDisplay(mangaList, n);
                    break;
                case 7:
                    manager.showDisplay(mangaList, n);
                    System.out.println("Nhap ten truyen muon xoa: ");
                    String del = sc.nextLine();
                    n = manager.delete(mangaList, n, del);
                    clrscr();
                    System.out.println("-------------------------");
                    System.out.println("--- Đã xóa thành công ---");
                    System.out.println("-------------------------");
                    manager.showDisplay(mangaList, n);
                    break;
                case 8:
                    clrscr();
                    System.out.println("Bạn muốn sắp xếp tăng dần hay giảm dần (theo điểm đánh giá): ");
                    System.out.println("-----------");
                    System.out.println("(1) Giảm dần or (2) Tăng dần");
                    System.out.println("-----------");
                    System.out.println("Chọn: ");
                    choose = Integer.parseInt(sc.nextLine());
                    clrscr();
                    System.out.println("----Đã sắp xếp----");
                    if (choose == 1) {
                        manager.sortRateDecerease(mangaList, n);
                    } else {
                        manager.sortRateAscending(mangaList, n);
                    }
                    break;
                case 9:
                    clrscr();
                    System.out.println("██████╗  ██████╗  ██████╗ ██████╗ ██████╗ ██╗   ██╗███████╗██╗██╗██╗");
                    System.out.println("██╔════╝ ██╔═══██╗██╔═══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██╔════╝██║██║██║");
                    System.out.println("██║  ███╗██║   ██║██║   ██║██║  ██║██████╔╝ ╚████╔╝ █████╗  ██║██║██║");
                    System.out.println("██║   ██║██║   ██║██║   ██║██║  ██║██╔══██╗  ╚██╔╝  ██╔══╝  ╚═╝╚═╝╚═╝");
                    System.out.println("╚██████╔╝╚██████╔╝╚██████╔╝██████╔╝██████╔╝   ██║   ███████╗██╗██╗██╗");
                    System.out.println(" ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚═════╝    ╚═╝   ╚══════╝╚═╝╚═╝╚═╝");
                    cont = false;
            }
        } while (cont);
    }

    public static void menu() {
        System.out.println("--------------------------------------");
        System.out.println("███╗   ███╗███████╗███╗   ██╗██╗   ██╗");
        System.out.println("████╗ ████║██╔════╝████╗  ██║██║   ██║");
        System.out.println("██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║");
        System.out.println("██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║");
        System.out.println("██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝");
        System.out.println("╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
        System.out.println("--------------------------------------");
        System.out.println("1. Nhập thông tin truyện");
        System.out.println("2. Ghi dữ liệu vào file");
        System.out.println("3. Đọc dữ liệu từ file");
        System.out.println("4. Hiển thị tất cả thông tin truyện");
        System.out.println("5. Tìm kiếm(theo tên hoặc tác giả)");
        System.out.println("6. Thêm truyện vào tủ");
        System.out.println("7. Xóa truyện");
        System.out.println("8. Sắp xếp");
        System.out.println("9. Thoát");
    }

    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
