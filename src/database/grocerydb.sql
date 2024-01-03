-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 25, 2023 at 11:52 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `grocerydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE `bills` (
  `bill_no` int(10) NOT NULL,
  `cus_id` int(10) DEFAULT NULL,
  `bill_date` date DEFAULT NULL,
  `total_amount` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bills`
--

INSERT INTO `bills` (`bill_no`, `cus_id`, `bill_date`, `total_amount`) VALUES
(5, 5, '2023-05-14', 8810),
(6, 6, '2023-05-14', 848),
(8, 8, '2023-05-14', 900),
(9, 9, '2023-07-25', 625),
(10, 10, '2023-07-25', 380);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `cus_id` int(10) NOT NULL,
  `cus_name` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `date_of_purchase` date DEFAULT NULL,
  `bill_no` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`cus_id`, `cus_name`, `phone`, `email`, `date_of_purchase`, `bill_no`) VALUES
(1, 'Sahil ', '9319620274', 'sahilcc125@gmail.com', '2023-05-14', 1),
(2, 'Mohd Asif Khan', '8745789878', 'asif@gmail.com', '2023-05-14', 2),
(4, 'Ishita', '8079546545', 'ishiz@gmail.com', '2023-05-14', 4),
(5, 'Deepanshu', '8668745450', 'dspns@gmail.com', '2023-05-14', 5),
(6, 'Vikram', '8745784578', 'vkm@gmail.com', '2023-05-14', 6),
(7, 'Divesh', '8079455412', 'dvkansal@gmail.com', '2023-05-14', 7),
(8, 'Deeksha', '8045124512', 'dksha@gmail.com', '2023-05-14', 8),
(9, 'Deepanshu', '8045102997', NULL, '2023-07-25', 9),
(10, 'jyti', '8754500112', NULL, '2023-07-25', 10),
(11, 'deepu', '8545111010', NULL, '2023-07-25', 11),
(12, 'sarphseil', '9451001200', NULL, '2023-07-25', 12);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_no` int(10) NOT NULL,
  `item_name` varchar(50) DEFAULT NULL,
  `qty` int(10) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `sub_total` int(10) DEFAULT NULL,
  `bill_no` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_no`, `item_name`, `qty`, `price`, `sub_total`, `bill_no`) VALUES
(1, 'Shakti Bhog', 20, 420, 8400, 5),
(3, 'Yippee', 10, 45, 410, 5),
(5, 'Hide & Seek', 4, 40, 160, 6),
(3, 'Yippee', 30, 45, 900, 8),
(2, 'Colgate', 5, 125, 625, 9),
(2, 'Colgate', 6, 125, 750, 11),
(1, 'Shakti Bhog', 3, 420, 1260, 11),
(1, 'Shakti Bhog', 6, 420, 2520, 12);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `userid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `userid`) VALUES
('user1', 'user1@123A', 1),
('userA', 'userA@123A', 2),
('userX', 'user123@X', 4);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `prod_id` int(10) NOT NULL,
  `prod_name` varchar(70) NOT NULL,
  `category` varchar(50) NOT NULL,
  `mrp` int(10) NOT NULL,
  `import_price` int(10) NOT NULL,
  `mfg_date` date DEFAULT NULL,
  `exp_date` date DEFAULT NULL,
  `imp_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`prod_id`, `prod_name`, `category`, `mrp`, `import_price`, `mfg_date`, `exp_date`, `imp_date`) VALUES
(1, 'Shakti Bhog', 'Atta', 420, 260, '2023-05-02', '2023-10-17', '2023-05-05'),
(2, 'Colgate', 'Toothpaste', 125, 70, '2023-05-05', '2023-12-06', '2023-05-07'),
(3, 'Yippee', 'Noodles', 45, 20, '2023-05-04', '2023-09-07', '2023-05-05'),
(5, 'Hide & Seek', 'Cookies', 40, 20, '2023-05-04', '2023-10-09', '2023-05-06'),
(6, 'Limca', 'Soft Drink', 95, 50, '2023-05-02', '2023-10-05', '2023-05-05'),
(7, 'Kanak', 'Atta', 340, 240, '2023-05-11', '2023-09-04', '2023-05-13'),
(8, 'ngknb', 'Noodles', 60, 40, '2023-07-03', '2023-07-18', '2023-11-15');

-- --------------------------------------------------------

--
-- Table structure for table `signup_request`
--

CREATE TABLE `signup_request` (
  `user_id` int(10) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `passwd` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` int(10) NOT NULL,
  `staff_name` varchar(70) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `dept_name` varchar(50) DEFAULT NULL,
  `salary` varchar(10) DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `gender` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `staff_name`, `phone`, `address`, `dept_name`, `salary`, `joining_date`, `gender`) VALUES
(1, 'Devansh', '8745784578', 'Janakpuri', 'HR', '40000', '2023-06-06', 'Male'),
(2, 'Samiksha Pal', '9878456645', 'GTB Nagar', 'HR', '45000', '2023-03-07', 'Female'),
(3, 'Vanshika Sharma', '7774587454', 'Ashok Vihar', 'Business', '35000', '2023-05-03', 'Female'),
(5, 'Saket', '8745784578', 'Rohini', 'IT', '50000', '2023-05-02', 'Male'),
(6, 'Manish Aggarwal', '9091451245', 'Nangloi', 'Cyber Security', '55000', '2023-02-08', 'Male'),
(7, 'Divya Solanki', '7908451245', 'Uttam Nagar', 'Cyber Security', '50000', '2023-02-13', 'Female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`bill_no`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`cus_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`prod_id`);

--
-- Indexes for table `signup_request`
--
ALTER TABLE `signup_request`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bills`
--
ALTER TABLE `bills`
  MODIFY `bill_no` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `cus_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `userid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `prod_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `signup_request`
--
ALTER TABLE `signup_request`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staff_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
