/*
SQLyog Ultimate v9.20 
MySQL - 5.6.10 : Database - management_rental_car
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`management_rental_car` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `management_rental_car`;

/*Table structure for table `chi_tiet_dat_xe` */

DROP TABLE IF EXISTS `chi_tiet_dat_xe`;

CREATE TABLE `chi_tiet_dat_xe` (
  `chi_tiet_dat_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `dm_xe_id` int(5) NOT NULL,
  `ngay_thue` datetime DEFAULT NULL,
  `ngay_tra` datetime DEFAULT NULL,
  `so_luong` int(5) DEFAULT NULL,
  `so_tien` double DEFAULT NULL,
  `tinh_trang` varchar(50) DEFAULT NULL,
  `dat_xe_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`chi_tiet_dat_xe_id`),
  KEY `FK_chi_tiet_dat_xe_dm_xe` (`dm_xe_id`),
  KEY `FK_chi_tiet_dat_xe` (`dat_xe_id`),
  CONSTRAINT `FK_chi_tiet_dat_xe` FOREIGN KEY (`dat_xe_id`) REFERENCES `dat_xe` (`dat_xe_id`),
  CONSTRAINT `FK_chi_tiet_dat_xe_dm_xe` FOREIGN KEY (`dm_xe_id`) REFERENCES `dm_xe` (`dm_xe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chi_tiet_dat_xe` */

/*Table structure for table `chi_tiet_nhap_xe` */

DROP TABLE IF EXISTS `chi_tiet_nhap_xe`;

CREATE TABLE `chi_tiet_nhap_xe` (
  `chi_tiet_nhap_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `dm_xe_id` int(5) DEFAULT NULL,
  `so_luong` int(5) DEFAULT NULL,
  `don_gia` float DEFAULT NULL,
  `nhap_xe_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`chi_tiet_nhap_xe_id`),
  KEY `FK_chi_tiet_nhap_xe_dm_xe` (`dm_xe_id`),
  KEY `FK_chi_tiet_nhap_xe_nhap_xe` (`nhap_xe_id`),
  CONSTRAINT `FK_chi_tiet_nhap_xe_dm_xe` FOREIGN KEY (`dm_xe_id`) REFERENCES `dm_xe` (`dm_xe_id`),
  CONSTRAINT `FK_chi_tiet_nhap_xe_nhap_xe` FOREIGN KEY (`nhap_xe_id`) REFERENCES `nhap_xe` (`nhap_xe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chi_tiet_nhap_xe` */

/*Table structure for table `dat_xe` */

DROP TABLE IF EXISTS `dat_xe`;

CREATE TABLE `dat_xe` (
  `dat_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `ngay_dat_thue` datetime DEFAULT NULL,
  `lien_he` varchar(100) DEFAULT NULL,
  `tong_so_tien` double DEFAULT NULL,
  PRIMARY KEY (`dat_xe_id`),
  KEY `FK_dat_xe_quanly` (`user_id`),
  CONSTRAINT `FK_dat_xe_quanly` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dat_xe` */

/*Table structure for table `dm_xe` */

DROP TABLE IF EXISTS `dm_xe`;

CREATE TABLE `dm_xe` (
  `dm_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `ten_xe` varchar(50) NOT NULL,
  `tong_so_luong` int(5) DEFAULT NULL,
  `so_luong_thue` int(5) DEFAULT NULL,
  `gia_thue_xe` double DEFAULT NULL,
  `hinh_anh` varchar(100) DEFAULT NULL,
  `thong_tin` varchar(255) DEFAULT NULL,
  `loai_xe_id` int(5) DEFAULT NULL,
  `hinh_anh_slider` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dm_xe_id`),
  KEY `FK_dm_xe_gia_xe` (`gia_thue_xe`),
  KEY `FK_dm_xe` (`loai_xe_id`),
  CONSTRAINT `FK_dm_xe` FOREIGN KEY (`loai_xe_id`) REFERENCES `loai_xe` (`loai_xe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `dm_xe` */

insert  into `dm_xe`(`dm_xe_id`,`ten_xe`,`tong_so_luong`,`so_luong_thue`,`gia_thue_xe`,`hinh_anh`,`thong_tin`,`loai_xe_id`,`hinh_anh_slider`) values (2,'Civic 1.8 AT',5,0,3,'assets/img/Civic 1.8 AT.jpg','Địa Chỉ: 104 Nguyễn Văn Cừ - Long Biên - Hà Nội',1,'assets/img/Civic 1.8 AT Slider.JPG'),(3,'Civic 2.0 AT',3,0,5,'assets/img/Civic 2.0 AT.jpg','Địa Chỉ: 104 Nguyễn Văn Cừ - Long Biên - Hà Nội\r\nĐiện Thoại: 04.23.213.213 - 0923.583.583\r\nTại TPHCM:\r\nĐịa chỉ: Số 1 đường Huỳnh Văn Nghệ, Phường 12, Quận Gò Vấp\r\nĐiện thoại: 08.62.950.950 - 0924.338.338 \r\nEmail: thanhhunggroup1996@gmail.com\r\nWebsitte:  w',1,'assets/img/Civic 2.0 AT Slider.jpg'),(4,'CRV 2.0 AT',6,0,6,'assets/img/CRV 2.0 AT.jpg','Địa Chỉ: 104 Nguyễn Văn Cừ - Long Biên - Hà Nội\r\nĐiện Thoại: 04.23.213.213 - 0923.583.583\r\nTại TPHCM:\r\nĐịa chỉ: Số 1 đường Huỳnh Văn Nghệ, Phường 12, Quận Gò Vấp\r\nĐiện thoại: 08.62.950.950 - 0924.338.338 \r\nEmail: thanhhunggroup1996@gmail.com\r\nWebsitte:  w',2,'assets/img/CRV 2.0 AT Slider.jpg'),(5,'CRV 2.4 AT',7,0,6,'assets/img/CRV 2.4 AT.jpg','Địa Chỉ: 104 Nguyễn Văn Cừ - Long Biên - Hà Nội\r\nĐiện Thoại: 04.23.213.213 - 0923.583.583\r\nTại TPHCM:\r\nĐịa chỉ: Số 1 đường Huỳnh Văn Nghệ, Phường 12, Quận Gò Vấp\r\nĐiện thoại: 08.62.950.950 - 0924.338.338 \r\nEmail: thanhhunggroup1996@gmail.com\r\nWebsitte:  w',2,'assets/img/CRV 2.4 AT Slider.jpg'),(6,'Corolla Altis 2.0RS',3,0,4,'assets/img/Corolla Altis 2.0RS.jpg','Địa Chỉ: 104 Nguyễn Văn Cừ - Long Biên - Hà Nội\r\nĐiện Thoại: 04.23.213.213 - 0923.583.583\r\nTại TPHCM:\r\nĐịa chỉ: Số 1 đường Huỳnh Văn Nghệ, Phường 12, Quận Gò Vấp\r\nĐiện thoại: 08.62.950.950 - 0924.338.338 \r\nEmail: thanhhunggroup1996@gmail.com\r\nWebsitte:  w',5,'assets/img/Corolla Altis 2.0RS Slider.jpg'),(7,'Corolla Altis 2.0V (CVT)',6,0,1,'assets/img/Corolla Altis 2.0V (CVT).jpg','Địa Chỉ: 104 Nguyễn Văn Cừ - Long Biên - Hà Nội\r\nĐiện Thoại: 04.23.213.213 - 0923.583.583\r\nTại TPHCM:\r\nĐịa chỉ: Số 1 đường Huỳnh Văn Nghệ, Phường 12, Quận Gò Vấp\r\nĐiện thoại: 08.62.950.950 - 0924.338.338 \r\nEmail: thanhhunggroup1996@gmail.com\r\nWebsitte:  w',5,'assets/img/Corolla Altis 2.0V (CVT) Slider.jpg');

/*Table structure for table `hang_xe` */

DROP TABLE IF EXISTS `hang_xe`;

CREATE TABLE `hang_xe` (
  `hang_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `ten_hang_xe` varchar(50) NOT NULL,
  PRIMARY KEY (`hang_xe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `hang_xe` */

insert  into `hang_xe`(`hang_xe_id`,`ten_hang_xe`) values (1,'Honda'),(2,'Ford'),(3,'Toyota');

/*Table structure for table `loai_xe` */

DROP TABLE IF EXISTS `loai_xe`;

CREATE TABLE `loai_xe` (
  `loai_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `ten_loai_xe` varchar(50) DEFAULT NULL,
  `so_cho` int(2) DEFAULT NULL,
  `hang_xe_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`loai_xe_id`),
  KEY `FK_loai_xe` (`hang_xe_id`),
  CONSTRAINT `FK_loai_xe` FOREIGN KEY (`hang_xe_id`) REFERENCES `hang_xe` (`hang_xe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `loai_xe` */

insert  into `loai_xe`(`loai_xe_id`,`ten_loai_xe`,`so_cho`,`hang_xe_id`) values (1,'Civic',4,1),(2,'CR-V',4,1),(3,'Accord',4,1),(4,'City',4,1),(5,'Corolla Altis',4,3);

/*Table structure for table `nhap_xe` */

DROP TABLE IF EXISTS `nhap_xe`;

CREATE TABLE `nhap_xe` (
  `nhap_xe_id` int(5) NOT NULL AUTO_INCREMENT,
  `quanli_id` int(5) DEFAULT NULL,
  `ngay_nhap` datetime DEFAULT NULL,
  `tong_so_tien` double DEFAULT NULL,
  PRIMARY KEY (`nhap_xe_id`),
  KEY `FK_nhap_xe_quanly` (`quanli_id`),
  CONSTRAINT `FK_nhap_xe_quanly` FOREIGN KEY (`quanli_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nhap_xe` */

/*Table structure for table `quyen` */

DROP TABLE IF EXISTS `quyen`;

CREATE TABLE `quyen` (
  `quyen_id` int(5) NOT NULL AUTO_INCREMENT,
  `quyen_name` varchar(30) NOT NULL,
  PRIMARY KEY (`quyen_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `quyen` */

insert  into `quyen`(`quyen_id`,`quyen_name`) values (1,'Admin'),(2,'User');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `ho_ten` varchar(50) DEFAULT NULL,
  `ngay_sinh` datetime DEFAULT NULL,
  `gioi_tinh` smallint(1) DEFAULT '0',
  `dien_thoai` varchar(13) DEFAULT NULL,
  `cmnd` decimal(15,0) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `diachi` varchar(255) DEFAULT NULL,
  `quyen_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_user` (`quyen_id`),
  CONSTRAINT `FK_user` FOREIGN KEY (`quyen_id`) REFERENCES `quyen` (`quyen_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`password`,`ho_ten`,`ngay_sinh`,`gioi_tinh`,`dien_thoai`,`cmnd`,`email`,`diachi`,`quyen_id`) values (1,'jason','123456','Jason','1990-12-29 11:57:36',0,NULL,'20112122121',NULL,NULL,1),(2,'rick','123456','Rick','1990-02-20 11:54:10',0,'12345666','6541165161',NULL,NULL,1),(3,'admin','123456','Lê Đình Thoa','2014-01-04 00:23:00',1,'0978245635','213123213','aaaa@gmail.com','Hòa Khánh - Đà Nẵng',1),(4,'user','123456','Lê Đình Thoa','2014-01-04 00:09:00',1,'0978245635','213123213','aaaa@gmail.com','Lớp 11I5',2),(6,'thoa_user','123456','Lê Đình Thoa','2014-01-04 00:22:00',1,'0168254625','213123213','aaaa@gmail.com','Hòa Khánh - Đà Nẵng',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
