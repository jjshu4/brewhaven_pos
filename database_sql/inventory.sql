-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2024 at 11:55 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffee shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(11) NOT NULL,
  `Product` varchar(127) NOT NULL,
  `Quantity` varchar(127) NOT NULL,
  `Status` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `Product`, `Quantity`, `Status`) VALUES
(6, 'Espresso', '5', 'Available'),
(7, 'Macchiato', '50', 'Available'),
(8, 'Cappucino', '50', 'Available'),
(9, 'Americano', '50', 'Available'),
(10, 'Mocha Latte', '50', 'Available'),
(11, 'Cafe Latte', '50', 'Available'),
(12, 'Vanilla Latte', '50', 'Available'),
(13, 'Matcha Latte', '50', 'Available'),
(14, 'Chocolate Latte', '50', 'Available'),
(15, 'Caramel Syrup', '50', 'Available'),
(16, 'Vanilla Syrup', '50', 'Available'),
(17, 'Hazelnut Syrup', '50', 'Available'),
(18, 'Salted Caramel Syrup', '50', 'Available'),
(19, 'Chocolate Chip Syrup', '50', 'Available'),
(20, 'White Chocolate Syrup', '50', 'Available'),
(21, 'Soy Milk', '50', 'Available'),
(22, 'Almond Milk', '50', 'Available'),
(23, 'Coconut Milk', '50', 'Available'),
(24, 'Cashew Milk', '50', 'Available'),
(25, 'Croissant', '50', 'Available'),
(26, 'Scones', '50', 'Available'),
(27, 'Cinnamon Roll', '50', 'Available'),
(28, 'Muffin', '50', 'Available'),
(29, 'Cupcakes', '50', 'Available'),
(30, 'Donuts', '50', 'Available'),
(31, 'Lemon Bar', '50', 'Available'),
(32, 'Macarons', '50', 'Available'),
(33, 'Chocolate Brownies', '50', 'Available'),
(34, 'Chocolate Cake', '50', 'Available'),
(35, 'Cheesecake', '50', 'Available'),
(36, 'Eclair', '50', 'Available'),
(37, 'Fruit Tarts', '50', 'Available'),
(38, 'Pecan Pie', '50', 'Available'),
(39, 'Tiramisu', '50', 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
