import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        int choice;
        while (true) {
            displayMenu();
            System.out.println("Nhap lua chon");
            System.out.println("---");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("---");
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma sinh vien vao day (Number 3 chu so :)");
                    String msv = sc.nextLine();
                    if (manage.checkKey(msv)) {
                        System.out.println("Ma sinh vien nay da ton tai !");
                    } else {
                        System.out.println("Nhap ten sinh vien ");
                        String name = sc.nextLine();
                        System.out.println("Nhap lop hoc");
                        String classmate = sc.nextLine();
                        System.out.println("Nhap diem Toan");
                        double diemToan = sc.nextDouble();
                        sc.nextLine();
                        if (manage.checkDiem(diemToan)) {
                            System.out.println("Nhap diem Van");
                            double diemVan = sc.nextDouble();
                            sc.nextLine();
                            if (manage.checkDiem(diemVan)) {
                                System.out.println("Nhap diem Tieng Anh");
                                double diemTiengAnh = sc.nextDouble();
                                sc.nextLine();
                                if (manage.checkDiem(diemTiengAnh)) {
                                    Student student = new Student(msv, name, classmate, diemToan, diemVan, diemTiengAnh);
                                    manage.add(msv, student);
                                    System.out.println("Success !");
                                } else {
                                    System.out.println("Out of range ( 0 - 10 )");
                                }
                            } else {
                                System.out.println("Out of range ( 0 - 10 )");
                            }
                        } else {
                            System.out.println("Out of range ( 0 - 10 )");
                        }
                    }
                    break;
                case 2:
                    manage.display();
                    break;
                case 3:
                    System.out.println("Nhap ma sinh vien muon xoa");
                    msv = sc.nextLine();
                    manage.delete(msv);
                    break;
                case 4:
                    System.out.println("Nhap ma sinh vien muon sua ");
                    msv = sc.nextLine();
                    if (manage.checkKey(msv)) {
                        System.out.println("Nhap ten moi ");
                        String name = sc.nextLine();
                        System.out.println("Nhap lop moi ");
                        String classmate = sc.nextLine();
                        System.out.println("Nhap diem Toan");
                        double diemToan = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhap diem Van");
                        double diemVan = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhap diem Tieng Anh");
                        double diemTiengAnh = sc.nextDouble();
                        sc.nextLine();
                        Student student = new Student(msv, name, classmate, diemToan, diemVan, diemTiengAnh);
                        manage.edit(msv, student);
                        System.out.println("Success !");
                    } else {
                        System.out.println("Invalid Key !");
                    }
                    break;
                case 5:
                    System.out.println("1. Tim Kiem theo ten  2. Tim kiem theo diem trung binh");
                    int option = sc.nextInt();
                    sc.nextLine();
                    if (option == 1) {
                        System.out.println("Nhap msv muon tim");
                        msv = sc.nextLine();
                        manage.searchByMsv(msv);
                    } else if (option == 2) {
                        System.out.println("1.Yeu  2.Trung binh  3.Kha  4.Gioi");
                        int level = sc.nextInt();
                        sc.nextLine();
                        manage.searchByDiemTrungBinh(level);
                    } else {
                        System.out.println("out of option!");
                    }
                    break;
                case 6:
                    System.out.println("1.Sort by name  2.Sort by Diem trung binh");
                    int optionSort = sc.nextInt();
                    if (optionSort != 1 && optionSort != 2) {
                        System.out.println("out of option");
                    } else {
                        manage.sort(optionSort);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("out of option!!!");

            }
        }
    }

    public static void displayMenu() {
        System.out.println("--------------------MENU----------------------");
        System.out.println("1. Them mot sinh vien moi");
        System.out.println("2. Hien thi toan bo danh sach sinh vien");
        System.out.println("3. Xoa mot sinh vien");
        System.out.println("4. Sua thong tin sinh vien");
        System.out.println("5. Tim kiem sinh vien");
        System.out.println("6. Sap xep sinh vien ");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------------");
    }
}
