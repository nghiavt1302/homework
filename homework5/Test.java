package homework5;

import java.util.Scanner;

public class Test {
    public static void main (String args[]){
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Welcome! ");
        System.out.println("Nhap 1 de them moi Can bo. ");
        System.out.println("Nhap 2 de Tim kiem theo ten. ");
        System.out.println("Nhap 3 de hien thi danh sach Can bo. ");
        x = sc.nextInt();
        CanBo[] canBoArray = new CanBo[10];
        switch (x){
            case 1:
                System.out.println("Nhap 1 de them Cong nhan.");
                System.out.println("Nhap 2 de them Ky su.");
                System.out.println("Nhap 3 de them Nhan vien.");
                int y = sc.nextInt();
                System.out.print("Nhap so Can bo muon them: ");
                int z = sc.nextInt();

                    if (y == 1) {
                        for (int i1 = 0; i1 < z; i1++) {
                            System.out.print("Nhap cong nhan thu " + (i1 + 1) + " theo thu tu Ten, Tuoi, Gioi tinh, Dia Chi: ");
                            sc.nextLine();
                            String line = sc.nextLine();
                            String[] item = line.split(", ");
                            CanBo cb = qlcb.addCanBo(item[0], item[1], item[2], item[3]);
                            canBoArray[i1] = cb;
                            System.out.println("Cong nhan " + canBoArray[i1].toString() + " da duoc them.");
                        }
                    }
                    else if (y == 2) {
                        for (int i2 = 0; i2 < z; i2++) {
                            System.out.print("Nhap Ky su thu " + (i2 + 1) + " theo thu tu Ten, Tuoi, Gioi tinh, Dia Chi.");
                            String line = sc.nextLine();
                            String[] item = line.split(", ");
                            canBoArray[i2] = (KySu) qlcb.addCanBo(item[0], item[1], item[2], item[3]);
                            System.out.println("Ky Su " + canBoArray[i2].toString() + " da duoc them.");
                        }
                    }
                    else if (y == 3) {
                        for (int i3 = 0; i3 < z; i3++) {
                            System.out.print("Nhap Nhan Vien thu " + (i3 + 1) + " theo thu tu Ten, Tuoi, Gioi tinh, Dia Chi.");
                            String line = sc.nextLine();
                            String[] item = line.split(", ");
                            canBoArray[i3] = qlcb.addCanBo(item[0], item[1], item[2], item[3]);
                            System.out.println("Nhan Vien " + canBoArray[i3].toString() + " da duoc them.");
                        }
                    }

            case 2:
                System.out.println("Nhap ten can bo muon tim: ");
                CanBo cb = qlcb.searchHoTen(sc.nextLine(), canBoArray);
                if (cb == null){
                    System.out.println("Khong tim thay can bo>");
                }
                else {
                    System.out.println("da tim thay can bo: " + cb);
                }
            case 3:
                qlcb.showListCanBo(canBoArray);
        }
    }
}
