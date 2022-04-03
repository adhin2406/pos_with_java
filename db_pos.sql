-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 02, 2022 at 04:02 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pos`
--

-- --------------------------------------------------------

--
-- Table structure for table `query_fakturtransaksi`
--

CREATE TABLE `query_fakturtransaksi` (
  `kd_transaksi` varchar(20) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga_satuan` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `subtotal` int(20) NOT NULL,
  `kd_transaksilaporan` varchar(20) NOT NULL,
  `total` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembali` int(11) NOT NULL,
  `tanggal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `query_laporanpasok`
--

CREATE TABLE `query_laporanpasok` (
  `kd_pasok` varchar(20) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `jumlah` int(20) NOT NULL,
  `tgl` date NOT NULL,
  `stok_total` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `query_stoktotal`
--

CREATE TABLE `query_stoktotal` (
  `kd_barang` varchar(20) NOT NULL,
  `stok_total` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `query_total`
--

CREATE TABLE `query_total` (
  `total_harga` decimal(36,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `kd_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `jenis_barang` varchar(20) NOT NULL,
  `harga_barang` varchar(20) NOT NULL,
  `harga_jual` varchar(20) NOT NULL,
  `stok` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`kd_barang`, `nama_barang`, `jenis_barang`, `harga_barang`, `harga_jual`, `stok`) VALUES
('1', 'BukanKopi', 'Minuman', '2', '2', 2),
('2', 'INIkopi', 'Minuman', '3', '3', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_laporan`
--

CREATE TABLE `tb_laporan` (
  `kd_transaksilaporan` varchar(20) NOT NULL,
  `total` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembali` int(11) NOT NULL,
  `tanggal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pasok`
--

CREATE TABLE `tb_pasok` (
  `kd_pasok` varchar(20) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `jumlah` int(20) NOT NULL,
  `tanggal` date NOT NULL,
  `pemasok` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pasok`
--

INSERT INTO `tb_pasok` (`kd_pasok`, `kd_barang`, `nama_barang`, `jumlah`, `tanggal`, `pemasok`) VALUES
('1', '1', 'Kopi', 12, '2022-03-03', 'hello');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pemasok`
--

CREATE TABLE `tb_pemasok` (
  `kd_pemasok` varchar(30) NOT NULL,
  `nama_pemasok` varchar(20) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `nohp` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pemasok`
--

INSERT INTO `tb_pemasok` (`kd_pemasok`, `nama_pemasok`, `alamat`, `nohp`) VALUES
('1', 'hello', 'hello', 909),
('2', '2', '2', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pengguna`
--

CREATE TABLE `tb_pengguna` (
  `kd_pengguna` varchar(50) NOT NULL,
  `nama_pengguna` varchar(50) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `nohp` int(12) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pengguna`
--

INSERT INTO `tb_pengguna` (`kd_pengguna`, `nama_pengguna`, `jk`, `nohp`, `jabatan`, `username`, `password`) VALUES
('1', 'admin', 'pria', 9999, 'admin', 'admin', 'password');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `kd_transaksi` varchar(20) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga_satuan` int(12) NOT NULL,
  `jumlah` int(15) NOT NULL,
  `subtotal` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indexes for table `tb_pasok`
--
ALTER TABLE `tb_pasok`
  ADD PRIMARY KEY (`kd_pasok`);

--
-- Indexes for table `tb_pemasok`
--
ALTER TABLE `tb_pemasok`
  ADD PRIMARY KEY (`kd_pemasok`);

--
-- Indexes for table `tb_pengguna`
--
ALTER TABLE `tb_pengguna`
  ADD PRIMARY KEY (`kd_pengguna`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
