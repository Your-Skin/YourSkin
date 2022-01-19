-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2020 at 09:43 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myskin`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(4) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
(1234, 'finn', '12aabb');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id_category` int(50) NOT NULL,
  `cate_name` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id_category`, `cate_name`) VALUES
(101, 'Cleanser'),
(102, 'Toner'),
(103, 'Essence'),
(104, 'Serum'),
(105, 'Moisturizer'),
(106, 'Cream'),
(107, 'Sunscreen');

-- --------------------------------------------------------

--
-- Table structure for table `matchskin`
--

CREATE TABLE `matchskin` (
  `id_skin` int(4) NOT NULL,
  `match_ingredient` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matchskin`
--

INSERT INTO `matchskin` (`id_skin`, `match_ingredient`) VALUES
(1, 'AHA'),
(2, 'Squalane'),
(3, 'AHA'),
(4, 'BHA'),
(6, 'AHA'),
(7, 'AHA'),
(8, 'AHA'),
(10, 'AHA'),
(13, 'AHA'),
(14, 'Retinol'),
(16, 'AHA'),
(19, 'Niacinamide'),
(20, 'Retinol'),
(22, 'BHA'),
(25, 'BHA'),
(28, 'Squalane'),
(29, 'Retinol'),
(30, 'Squalane');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id_skin` int(50) NOT NULL,
  `name_skin` varchar(200) NOT NULL,
  `ingredient` varchar(2000) NOT NULL,
  `id_category` int(50) NOT NULL,
  `link_picture` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id_skin`, `name_skin`, `ingredient`, `id_category`, `link_picture`) VALUES
(1, 'COSRX Low Ph Good Morning Gel Cleanser', '- Water \r\n- Cocamidopropyl Betaine\r\n- Sodium Lauroyl Methyl Isethionate\r\n- Polysorbate 20\r\n- Styrax Japonicus Branch/Fruit/Leaf Extract\r\n- Butylene Glycol\r\n- Saccharomyces Ferment\r\n- Cryptomeria Japonica Leaf Extract\r\n- Nelumbo Nucifera Leaf Extract\r\n- Pinus Palustris Leaf Extract\r\n- Ulmus Davidiana Root Extract\r\n- Evening Primrose Flower Extract\r\n- Pueraria Lobata Root Extract\r\n- Tea Tree Leaf Oil\r\n- Allantoin\r\n- Caprylyl Glycol\r\n- Ethylhexylglycerin\r\n- Betaine Salicylate\r\n- Citric Acid\r\n- Ethyl Hexanediol\r\n- 1,2-Hexanediol\r\n- Trisodium Ethylenediamine Disuccinate\r\n- Sodium Benzoate\r\n- Disodium Edta ', 101, 'https://i.pinimg.com/originals/67/9d/1c/679d1c8429d17c61d2dbaa6be5f59124.png'),
(2, 'Acne.org Aha+ (Glycolic Acid - 10%)', '- Water\r\n- Glycolic Acid\r\n- Sodium Hydroxide\r\n- C12-15 Alkyl Benzoate\r\n- Cetyl Palmitate, Sorbitan Stearate\r\n- Glycerin\r\n- Cyclomethicone\r\n- Glyceryl Stearate\r\n- Butylene Glycol\r\n- Glycyrrhiza Glabra (Licorice) Root Extract (Licochalcone)\r\n- Tocopheryl Acetate\r\n- Squalane\r\n- Peg-12 Glyceryl Distearate\r\n- Peg-100 Stearate\r\n- Magnesium Aluminum Silicate\r\n- Xanthan Gum\r\n- Sorbic Acid\r\n- 1,2-Hexanediol \r\n- Caprylyl Glycol', 101, 'https://i.pinimg.com/originals/c7/f2/17/c7f217b55ed98dec05078588c07df7b2.png'),
(3, 'Bioderma Sensibio H2O AR Micellar Solution', '- Aqua / Water\r\n- PEG-6 Caprylic / Capric Glycerides\r\n- Aloe Barbadensis Leaf Extract\r\n- Cucumis Sativus (Cucumber) Fruit Extract\r\n- Mannitol\r\n- Xylitol \r\n- Rhamnose\r\n- Fructooligosaccharides\r\n- Lecithin\r\n- Ginkgo Biloba Leaf Extract\r\n- Camellia Sinensis Leaf Extract\r\n- Propylene Glycol\r\n- Disodium EDTA\r\n- Cetrimonium Bromide\r\n- Sodium Hydroxide\r\n- Citric Acid', 101, 'https://i.pinimg.com/originals/26/5b/fe/265bfe398ec08ba97c3b5e3a0b57e0bf.png'),
(4, 'SkinCeuticals Blemish + Age Cleanser', '- Aqua / Water\r\n- Coco-Betaine\r\n- Propylene Glycol\r\n- PEG-120 Methyl Glucose Dioleate\r\n- SorbitolGlycerin\r\n- Glycolic Acid\r\n- Triethanolamine\r\n- Sodium Laureth Sulfate\r\n- Sodium Chloride\r\n- Disteareth-100 Ipdi\r\n- Phenoxyethanol\r\n- Salicylic Acid\r\n- Capryloyl Salicylic Acid\r\n- Menthol\r\n- Methylparaben\r\n- Disodium EDTA\r\n- Steareth-100', 101, 'https://i.pinimg.com/originals/a8/bc/3d/a8bc3d41ee9cd4156391f90186fe28f2.png'),
(5, 'Alpha-H Age Delay Cleansing Oil', '- Caprylic / Capric Triglycerides\r\n- Cera Alba\r\n- Peg-7 Glyceryl Cocoate\r\n- Bis Stearyl Ethylenediamine/ Neo-Pentyl Glycol/ Stearyl Hydrogenated Dimer Dilinoleate Copolymer\r\n- Silica\r\n- Phenoxyethanol\r\n- Citrus Reticulata Peel Oil\r\n- Vitis Vinifera Seed Oil\r\n- Rosa Moschata Oil\r\n- Tocopherol\r\n- Hippoaerhamnoides Oil\r\n- Lavandula Angustifolia Oil\r\n- Bisabolol\r\n- Linalool\r\n- Limonene\r\n- Geraniol\r\n- Citronellol\r\n- Eugenol', 101, 'https://i.pinimg.com/originals/f0/96/3c/f0963c9b21350b573715c64c2c4f19b1.png'),
(6, 'The Body Shop Camomile Sumptuous Cleansing Butter', '- Ethylhexyl\r\n- Palmitate\r\n- Synthetic Wax\r\n- Peg-20 Glyceryl Triisostearate\r\n- Olea Europaea (Olive) Fruit Oil\r\n- Butyrospermum Parkii (Shea) Butter\r\n- Caprylyl Glycol\r\n- Tocopherol\r\n- Parfum / Fragrance\r\n- Aqua / Water\r\n- Linalool\r\n- Limonene\r\n- Helianthus Annuus (Sunflower) Seed Oil\r\n- Anthemis Nobilis Flower Extract \r\n- Citric Acid', 101, 'https://i.pinimg.com/originals/ac/50/48/ac50486b0736122746bbb794186eefab.png'),
(7, 'Kiehl’s Calendula Herbal-Extract Toner ', '- Water\r\n- Propylene Glycol\r\n- Propanediol\r\n- Phenoxyethanol\r\n- Chlorphenesin\r\n- Arctium Lappa Root Extract\r\n- Disodium EDTA\r\n- Calendula Officinalis Flower Extract \r\n- Calendula Officinalis Flower\r\n- Hydrolyzed Corn Starch\r\n- Allantoin\r\n- Ivy Leaf Extract\r\n- Glycerin\r\n- Althaea Officinalis Root Extract \r\n- Sodium Hydroxide \r\n- Citric Acid \r\n- Alcohol free', 102, 'https://i.pinimg.com/originals/e0/ac/51/e0ac515f6e031dc7ebd9e5d18a7fc5aa.png'),
(8, 'Thayers Rose Petal Facial Toner ', '- Purified Water\r\n- Hamamelis Virginiana Extract\r\n- Aloe Barbadensis Leaf Juice (Filet Of Aloe Vera*)]\r\n- Glycerin\r\n- Phenoxyethanol\r\n- Rosa Centifolia (Rose) Flower Water\r\n- Fragrance (Natural Rose)\r\n- Citric Acid\r\n- Citrus Grandis (Grapefruit) Seed Extract', 102, 'https://i.pinimg.com/originals/93/77/d3/9377d384e76c9bd6526cd35266b9e370.png'),
(9, 'Anua Heartleaf 77% Soothing Toner', '- Houttuynia Cordata Extract (77%)\r\n- Water\r\n- 1,2-Hexanediol\r\n- Glycerin\r\n- Betaine\r\n- Panthenol\r\n- Saccharum Officinarum (Sugar Cane) Extract\r\n- Portulaca Oleracea Extract\r\n- Butylene Glycol\r\n- Vitex Agnus Castus Extract\r\n- Chamomilla Recutita (Matricaria)\r\n- Flower Extract \r\n- Arctium Lappa Root Extract\r\n- Phellinus Linteus Extract\r\n- Vitis Vinifera (Grape) Fruit Extract\r\n- Pyrus Malus (Apple) Fruit Extract\r\n- Centella Asiatica Extract\r\n- Isopentyldiol\r\n- Methylpropanediol\r\n- Acrylates / C10-30 Alkyl Acrylate Crosspolymer \r\n- Tromethamine \r\n- Disodium EDTA', 102, 'https://i.pinimg.com/originals/d8/a8/87/d8a887777b9496a80305a987747d2e08.png'),
(10, 'Pixi Glow Tonic', '- Water / Aqua\r\n- Aloe Barbadensis Leaf Juice\r\n- Glycolic Acid\r\n- Butylene Glycol\r\n- Glycerin\r\n- Sodium Hydroxide\r\n- Hamamelis Virginiana (Witch Hazel) Leaf Extract\r\n- Aesculus Hippocastanum (Horse Chestnut) Seed Extract \r\n- Hexylene Glycol\r\n- Fructose\r\n- Glucose\r\n- Sucrose\r\n- Urea\r\n- Dextrin\r\n- Alanine\r\n- Glutamic Acid\r\n- Aspartic Acid\r\n- Hexyl Nicotinate\r\n- Panax Ginseng Root Extract\r\n- Ethylhexylglycerin\r\n- Disodium EDTA\r\n- Biotin\r\n- Panthenol\r\n- PPG-26-Buteth-26\r\n- PEG-40 Hydrogenated Castor Oil \r\n- Phenoxyethanol\r\n- Fragrance (Parfum) \r\n- Caramel \r\n- Red 4 (Ci 14700)', 102, 'https://i.pinimg.com/originals/af/ce/a3/afcea385407aae6c97b31814a2ecd674.png'),
(11, 'It\'s Skin Power 10 Formula Li Effector', '- Water\r\n- Glycyrrhiza Glabra (Licorice) Root Extract\r\n- Butylene Glycol\r\n- Polyglutamic Acid\r\n- Carbomer\r\n- Triethanolamine\r\n- Methylparaben\r\n- Chlorphenesin\r\n- Disodium Edta ', 103, 'https://i.pinimg.com/originals/a2/54/3d/a2543d7144eb60ab60f07c5c0effd4f0.png'),
(12, 'Heritage Store Rosewater And Glycerin Spray ', '- Water\r\n- Glycerin\r\n- Rosa Damascena (Hydroessential Rose) Flower Oil', 103, 'https://i.pinimg.com/originals/91/5b/f6/915bf6e7ab80934703499edbb3dafb45.png'),
(13, 'Dr. Andrew Weil For Origins Mega-Mushroom Relief & Resilience Soothing Treatment Lotion', '- Water\r\n- Butylene Glycol\r\n- Peg-4\r\n- Citrus Aurantium Dulcis (Orange) Oil\r\n- Lavandula Angustifolia (Lavender) Oil\r\n- Pogostemon Cablin (Patchouli) Oil\r\n- Citrus Nobilis (Mandarin Orange) Peel Oil\r\n- Pelargonium Graveolens Flower Oil\r\n- Boswellia Carterii (Olibanum) Oil\r\n- Limonene\r\n- Linalool\r\n- Citronellol\r\n- Geraniol\r\n- Ganoderma Lucidum (Reishi Mushroom) Extract\r\n- Fuscoporia Obliqua Sclerotium Extract\r\n- Cordyceps Sinensis (Mushroom) Extract\r\n- Ergothioneine\r\n- Camelina Sativa Seed Oil\r\n- Lactobacillus Ferment\r\n- Hippophae Rhamnoides Extract\r\n- Zingiber Officinale (Ginger) Root Extract\r\n- Curcuma Longa (Turmeric) Root Extract\r\n- Ocimum Sanctum (Holy Basil) Leaf Extract \r\n- Helianthus Annuus (Sunflower) Seed Oil\r\n- Silybum Marianum Fruit Extract\r\n- Saccharomyces Lysate Extract\r\n- Centella Asiatica (Hydrocotyl) Extract\r\n- Hypnea Musciformis (Algae) Extract\r\n- Caffeine, Sucrose, Salvia Sclarea (Clary) Extract\r\n- Saccharomyces Ferment Filtrate\r\n- Peg-40 Hydrogenated Castor Oil\r\n- Gelidiella Acerosa Extract\r\n- Trideceth-9\r\n- Glycerin\r\n- Glycereth-26\r\n- Polysorbate 20\r\n- Sodium Hyaluronate\r\n- Tocopheryl Acetate\r\n- Maltodextrin\r\n- Pentylene Glycol\r\n- Sodium Hydroxide\r\n- Citric Acid\r\n- Potassium Sorbate\r\n- Phenoxyethanol ', 103, 'https://i.pinimg.com/originals/d3/95/9c/d3959c724773882382cc99142c218513.png'),
(14, 'Sarah Chapman Skinesis Overnight Exfoliating Booster', '- Aqua\r\n- Propanediol\r\n- Polysorbate 20\r\n- Lactic Acid\r\n- Cyclomethicone (Pentamer)\r\n- Dimethicone, Peg-8 Dimethicone\r\n- Xanthan Gum, Phenoxyethanol\r\n- Caprylyl Glycol\r\n- Retinol\r\n- Rosa Damascena Flower Oil\r\n- Ethylhexylglycerin\r\n- Hexylene Glycol\r\n- Lens Esculenta Seed Extract\r\n- Salix Alba Bark Extract\r\n- Ficus Indica Flower / Leaf / Stem Juice\r\n- Ceratonia Siliqua Seed Extract \r\n- Citronellol\r\n- Eugenol\r\n- Farnesol\r\n- Geraniol\r\n- Linalool ', 104, 'https://i.pinimg.com/originals/cc/77/d2/cc77d2b2728096aa9182c25fdf029124.png'),
(15, 'KylieSkin Vitamin C Serum ', '- Water/ Aqua/ Eau\r\n- Tetrahexyldecyl Ascorbate\r\n- Glycerin\r\n- Phenoxyethanol\r\n- Carthamus Tinctorius (Safflower) Seed Oil\r\n- Ammonium Acryloyldimethyltaurate/ Vp Copolymer\r\n- Dipalmitoyl Hydroxyproline\r\n- Tocopheryl Acetate\r\n- Tetrasodium Glutamate Diacetate\r\n- Carbomer\r\n- Polysorbate 20\r\n- Sodium Metabisulfite\r\n- Panthenol\r\n- Ferulic Acid\r\n- Ethylhexylglycerin\r\n- Sodium Hydroxide\r\n- Camellia Sinensis Leaf Extract ', 104, 'https://i.pinimg.com/originals/4a/84/f3/4a84f3117c061b2414cd4d45e180bfeb.png'),
(16, 'Kypris Antioxidant Dew ', '- Water/ Aqua\r\n- Glycerin\r\n- Helianthus Annuus (Sunflower) Seed Oil\r\n- Camellia Oleifera Seed Oil\r\n- Xylitylglucoside\r\n- Dipalmitoyl Hydroxyproline\r\n- Algae\r\n- Aloe Barbadensis Leaf Juice\r\n- Phospholipids\r\n- Phragmites Communis (Reed) Extract\r\n- Symphytum Officinale (Comfrey) Leaf Extract\r\n- Urtica Dioica (Nettle) Extract\r\n- Poria Cocos Extract\r\n- Xylitol, Anhydroxylitol\r\n- Waltheria Indica Leaf Extract\r\n- Panthenol\r\n- Rosa Damascena Flower Extract\r\n- Rosa Centifolia Flower Extract\r\n- Calophyllum Inophyllum Seed Oil\r\n- Lecithin\r\n- Tocopherol\r\n- Ascorbyl Palmitate\r\n- Superoxide Dismutase\r\n- Ferulic Acid\r\n- Sodium Hyaluronate\r\n- Mannitol\r\n- Dextrin\r\n- Rosmarinus Officinalis (Rosemary) Leaf Extract\r\n- Leuconostoc/ Radish Root Ferment Filtrate\r\n- Sodium Anisate\r\n- Sodium Levulinate\r\n- Citric Acid\r\n- Sodium Citrate\r\n- Sodium Gluconate\r\n- Xanthan Gum ', 104, 'https://i.pinimg.com/originals/7c/f4/f7/7cf4f7a55c53f4947f3a4020493044d5.png'),
(17, 'NIOD Re: Pigment ', '- Lentinus Edodes Mycelium Extract\r\n- Aqua (Water)\r\n- Glycerin\r\n- Propanediol\r\n- Potassium Azeloyl Diglycinate \r\n- Butylene Glycol\r\n- Acetyl Glycyl Beta-Alanine\r\n- Myristoyl Nonapeptide-3\r\n- Tetrapeptide-30\r\n- Oligopeptide-68\r\n- Diglucosyl Gallic Acid\r\n- Evodia Rutaecarpa Fruit Extract\r\n- Algae Extract\r\n- Glycine Soja (Soybean) Oil\r\n- Hydrogenated Lecithin\r\n- Sodium Oleate\r\n- Disodium Edta\r\n- Trisodium Ethylenediamine Disuccinate\r\n- Pentylene Glycol\r\n- Dimethyl Isosorbide\r\n- Ethoxydiglycol\r\n- Polysorbate 20\r\n- Potassium Sorbate\r\n- Sodium Benzoate\r\n- 1,2-Hexanediol\r\n- Phenoxyethanol\r\n- Caprylyl Glycol ', 104, 'https://i.pinimg.com/originals/f5/e4/fe/f5e4fec9d06d168c72ec9f248ca6225c.png'),
(18, 'Clinique Moisture Surge 72-Hour Auto-Replenishing Hydrator', '- Water\\Aqua\\Eau\r\n- Dimethicone\r\n- Butylene Glycol\r\n- Glycerin\r\n- Trisiloxane\r\n- Trehalose\r\n- Sucrose\r\n- Ammonium Acryloyldimethyltaurate/ Vp Copolymer\r\n- Hydroxyethyl Urea\r\n- Camellia Sinensis (Green Tea) Leaf Extract\r\n- Silybum Marianum (Lady\'S Thistle) Extract\r\n- Betula Alba (Birch) Bark Extract\r\n- Saccharomyces Lysate Extract\r\n- Aloe Barbadensis Leaf Water\r\n- Thermus Thermophillus Ferment\r\n- Caffeine\r\n- Sorbitol\r\n- Palmitoyl Hexapeptide-12\r\n- Sodium Hyaluronate\r\n- Caprylyl Glycol\r\n- Oleth-10\r\n- Sodium Polyaspartate\r\n- Saccharide Isomerate\r\n- Hydrogenated Lecithin\r\n- Tocopheryl Acetate\r\n- Acrylates/ C10-30 Alkyl Acrylate Crosspolymer\r\n- Glyceryl Polymethacrylate\r\n- Tromethamine\r\n- Peg-8\r\n- Hexylene Glycol\r\n- Magnesium Ascorbyl Phosphate\r\n- Disodium Edta\r\n- Bht\r\n- Phenoxyethanol\r\n- Red 4 (Ci 14700)\r\n- Yellow 5 (Ci 19140) ', 105, 'https://i.pinimg.com/originals/0c/5e/9d/0c5e9d943e2ab6d6a829c09c09e9df72.png'),
(19, ' EltaMD Am Therapy Moisturizer', '- Purified Water\r\n- Cyclopentasiloxane\r\n- Ethylhexyl Isononanoate\r\n- Niacinamide\r\n- Lauryl Peg-9 Polydimethylsiloxyethyl Dimethicone\r\n- Dimethicone, Salix Alba (Willow) Bark Extract\r\n- Sodium Chloride\r\n- Piptadenia Colubrina Peel Extract\r\n- Sodium Hyaluronate\r\n- Glycerin\r\n- Allantoin\r\n- Caffeine\r\n- Ascorbyl Palmitate\r\n- Dimethicone/ Peg-10/ 15 Crosspolymer\r\n- Butylene Glycol\r\n- Phenoxyethanol\r\n- Capryloyl Glycine\r\n- Undecylenoyl Glycine\r\n- Disodium Edta\r\n- Sodium Hydroxide ', 105, 'https://i.pinimg.com/originals/68/9a/48/689a480f8794c337b7085144d430fa29.png'),
(20, 'Paula\'s Choice Clinical Ceramide Enriched Firming Eye Cream', '- Water(Aqua)\r\n- Neopentyl Glycol Diheptanoate\r\n- Cetyl Alcohol\r\n- Butylene Glycol\r\n- Glycerin\r\n- Glyceryl Stearate\r\n- PEG-100 Stearate\r\n- Ammonium Acryloyldimethyltaurate/​Vp Copolymer\r\n- Ascorbyl Glucoside\r\n- Potassium Cetyl Phosphate\r\n- Sodium Ascorbyl Phosphate\r\n- Bis-Diglyceryl Polyacyladipate-2\r\n- Polyglyceryl-10 Dioleate\r\n- Tetrahexyldecyl Ascorbate\r\n- Ceramide Ns, Ceramide Eop\r\n- Ceramide AP, Ceramide Eos\r\n- Ceramide NP, Palmitoyl Tripeptide-5\r\n- Acetyl Tetrapeptide-5\r\n- Sodium Hyaluronate\r\n- Caprooyl Phytosphingosine\r\n- Caprooyl Sphingosine\r\n- Cholesterol\r\n- Squalane\r\n- Retinol\r\n- Vitis Vinifera (Grape) Seed Extract\r\n- Glycyrrhiza Glabra (Licorice) Root Extract\r\n- Punica Granatum (Pomegranate) Fruit Extract\r\n- Dunaliella Salina (Algae) Extract\r\n- Pongamia Glabra Seed Oil\r\n- Tocopheryl Acetate\r\n- Allantoin\r\n- Bisabolol\r\n- Carnosine\r\n- Panthenol\r\n- Sodium Pca\r\n- Pullulan\r\n- Glyceryl Ascorbate\r\n- Behenic Acid\r\n- Dimethicone\r\n- Sodium Citrate\r\n- Sodium Polyacrylate\r\n- Caprylyl Glycol\r\n- Ethylhexyl Stearate\r\n- Ceteareth-25\r\n- Sodium Hydroxide\r\n- Trideceth-6\r\n- Propyl Gallate\r\n- Polysorbate 20\r\n- Disodium EDTA\r\n- Mica\r\n- Phenoxyethanol\r\n- Chlorphenesin\r\n- Sodium Benzoate\r\n- Compare  View INCI photo  Report Error  Embed\r\n\r\n', 106, 'https://i.pinimg.com/originals/c1/8d/1a/c18d1ad4d2e3e1ce6d057e1967092c03.png'),
(21, 'May Lindstrom The Blue Cocoon', '- Camellia Oleifera (Camellia) Seed Oil \r\n- Butyrospermum Parkii (Shea) Butter\r\n- Theobroma Cacao Seed Butter\r\n- Sclerocarya Birrea (Virgin Marula) Oil \r\n- Calodendrum Capense (Yangu) Oil\r\n- Adansonia Digitata (Baobab) Oil\r\n- Tanacetum Annuum (Blue Tansy) Oil\r\n- Commiphora Myrrha (Myrrh) Oil\r\n- Lavandula Angustifolia (Lavender) Oil\r\n- Boswellia Carterii (Frankincense) Oil\r\n- Pelargonium Graveolens (Geranium Rose) Oil\r\n- Vanilla Planifolia Co2 Total Essential Oil \r\n- Schisandra Sphenanthera Co2 Fruit Extract \r\n- Helichrysum Italicum (Immortelle) Oil \r\n- Ravensara Aromatica Oil ', 106, 'https://i.pinimg.com/originals/3e/15/14/3e15142f8ea35023dc227615c1d17630.png'),
(22, 'Kiehl\'s Calendula Serum Infused Water Cream', '- Diisopropyl Sebacate\r\n- Dipropylene Glycol\r\n- Panthenol\r\n- Sodium Citrate\r\n- Sodium Chloride\r\n- Artemisia Absinthium Extract\r\n- Chamomilla Recutita (Matricaria) Flower Oil\r\n- Water\r\n- Geranium Maculatum Oil\r\n- Calendula Officinalis Flower\r\n- Calendula Officinalis Flower Extract\r\n- Glycerin\r\n- Propylene Glycol\r\n- Trisodium Ethylenediamine Disuccinate\r\n- Polymethylsilsesquioxane\r\n- Propanediol\r\n- Tocopherol (Vitamin E)\r\n- Citric Acid\r\n- Chlorphenesin\r\n- Dimethicone\r\n- Dimethicone/PEG-10/15 Crosspolymer\r\n- Citrus Limon (Lemon) Peel Oil\r\n- PEG-10 Dimethicone\r\n- Cymbopogon Schoenanthus Oil\r\n- Farnesol\r\n- Phenoxyethanol\r\n- Linalool\r\n- Citronellol\r\n- Limonene\r\n- Citral\r\n- Geraniol\r\n- Alpha-Bisabolol', 106, 'https://i.pinimg.com/originals/fc/33/c6/fc33c6727583b79941c19e2bc26cad51.png'),
(23, 'Etude House Soon Jung Hydro Barrier Cream', '- Water (67.3%)\r\n- Glycerin 10.0%\r\n- Propanediol (10%)\r\n- Phenyl Trimethicone \r\n- Panthenol\r\n- Methyl Trimethicone\r\n- Hydrogenated Poly(C6-14 Olefin)\r\n- 1,2-Hexanediol\r\n- Polymethylsilsesquioxane\r\n- Hydroxyethyl Acrylate/​Sodium Acryloyldimethyl Taurate Copolymer \r\n- Ammonium Acryloyldimethyltaurate/​Vp Copolymer \r\n- Glyceryl Stearate Citrate\r\n- C14-22 Alcohols\r\n- Arachidyl Alcohol\r\n- Stearic Acid\r\n- Glyceryl Stearate\r\n- Butyrospermum Parkii (Shea) Butter \r\n- Palmitic Acid\r\n- Glyceryl Caprylate\r\n- Behenyl Alcohol\r\n- C12-20 Alkyl Glucoside \r\n- Ethylhexylglycerin\r\n- Butylene Glycol\r\n- Disodium EDTA\r\n- Arachidyl Glucoside \r\n- Sorbitan Isostearate \r\n- Madecassoside \r\n- Pentylene Glycol \r\n- Scutellaria Baicalensis Root Extract \r\n- Myristic Acid \r\n- Lauric Acid\r\n- Citrus Aurantium Amara (Bitter Orange) Flower Extract\r\n- Chamaecyparis Obtusa Leaf Extract \r\n- Tocopherol\r\n', 106, 'https://i.pinimg.com/originals/5a/a0/9e/5aa09ea171bf6aca52cd76b2fb1cff10.png'),
(24, 'Banana Boat Simply Protect Aqua Daily Moisture', '- Aqua\r\n- Ethylhexyl Methoxycinnamate\r\n- Butylene Glycol\r\n- Diethylamino Hydroxybenzoyl Hexyl Benzoate \r\n- Silica\r\n- Ethylhexyl Palmitate\r\n- Pentylene Glycol\r\n- Polyglyceryl-10 Myristate\r\n- Phenoxyethanol\r\n- Carbomer\r\n- Potassium Hydroxide\r\n- Parfum\r\n- Xanthan Gum\r\n- Tocopherol\r\n- Benzyl Benzoate\r\n- Butylphenyl Methylpropional \r\n- Sodium Hyaluronate', 107, 'https://i.pinimg.com/originals/4c/33/9c/4c339c792c83009c9e673b4a5b314ffd.png'),
(25, 'Dr. Jetske Ultee Suncover SPF 30 ', '- Aqua\r\n- C12-15 Alkyl Benzoate\r\n- Propylheptyl Caprylate\r\n- Diethylamino Hydroxybenzoyl Hexyl Benzoate\r\n- Cetearyl Alcohol\r\n- Bis-Ethylhexyloxyphenol Methoxyphenyl Triazine \r\n- Phenylbenzimidazole Sulfonic Acid \r\n- Tris-Biphenyl Triazine (Nano) \r\n- Xylityl Sesquicaprylate\r\n- Lactic Acid\r\n- Polyglyceryl-2 Dipolyhydroxystearate\r\n- Hydrogenated Dimer Dilinoleyl/ Dimethylcarbonate Copolymer\r\n- Niacinamide\r\n- Pentaerythrityl Distearate\r\n- Lauryl Glucoside\r\n- Glycerin\r\n- Sodium Acrylate/ Sodium Acryloyldimethyl Taurate Copolymer\r\n- Sodium Cetearyl Sulfate\r\n- Capryloyl Glycine\r\n- Hydroxyethyl Acrylate/ Sodium Acryloyldimethyl Taurate Copolymer \r\n- Isohexadecane\r\n- Squalane\r\n- Sodium Hydroxide\r\n- Decyl Glucoside\r\n- Anhydroxylitol\r\n- Polysorbate 80\r\n- Sodium Bicarbonate\r\n- Tetrasodium Glutamate Diacetate \r\n- Polysorbate 60\r\n- Citric Acid\r\n- Sorbitan Isostearate \r\n- Butylene Glycol\r\n- Disodium Phosphate \r\n- Xanthan Gum ', 107, 'https://i.pinimg.com/originals/79/6a/d8/796ad87c5a2107b0c01db31b63206fd0.png'),
(26, 'Anessa Perfect UV Sunscreen Mild Milk Spf 50 Pa++++', '- Cyclopentasiloxane\r\n- Zinc Oxide\r\n- Diisopropyl Sebacate\r\n- Methyl Methacrylate Crosspolymer\r\n- Water\r\n- Cetyl Ethylhexanoate\r\n- Pentaerythrityl Tetraethylhexanoate\r\n- Triethylhexanoin\r\n- Butylene Glycol\r\n- Diethylhexyl Succinate\r\n- Titanium Dioxide\r\n- Dimethicone\r\n- Glycerin\r\n- Polymethylsilsesquioxane\r\n- Dextrin Palmitate\r\n- PEG-9 Polydimethylsiloxyethyl Dimethicone\r\n- Ethylhexyl Triazone\r\n- Diethylamino Hydroxybenzoyl Hexyl Benzoate\r\n- Disteardimonium Hectorite\r\n- Trimethylsiloxysilicate\r\n- Bis-Ethylhexyloxyphenol Methoxyphenyl Triazine \r\n- PEG/ PPG-14/ 7 Dimethyl Ether\r\n- Sodium Chloride\r\n- Dipotassium Glycyrrhizate\r\n- Angelica Acutiloba Root Extract \r\n- Thymus Serpyllum Extract\r\n- Rosa Roxburghii Fruit Extract \r\n- Sodium Hyaluronate\r\n- PEG-10 Dimethicone\r\n- Aluminum Hydroxide\r\n- Stearic Acid\r\n- Silica\r\n- Sodium Citrate\r\n- Sodium Metabisulfite \r\n- Tocopherol ', 107, 'https://i.pinimg.com/originals/e6/63/ef/e663ef1ba6c90ef95032549c41145521.png'),
(27, 'Eucerin Sun Face Oil Control Dry Touch Spf 50+', '- Aqua\r\n- Homosalate\r\n- Polymethylsilsesquioxane\r\n- Butyl Methoxydibenzoylmethane\r\n- Ethylhexyl Salicylate\r\n- Octocrylene\r\n- Alcohol Denat\r\n- Tapioca Starch\r\n- Phenylbenzimidazole Sulfonic Acid\r\n- Cyclomethicone\r\n- Behenyl Alcohol\r\n- Cetearyl Alcohol\r\n- Methylpropanediol\r\n- Silica Dimethyl Silylate\r\n- Glycerin\r\n- L-Carnitine\r\n- Glycyrrhetinic Acid\r\n- Glycyrrhiza Inflata Root Extract\r\n- Sodium Stearoyl Glutamate\r\n- Acrylates/ C10-30 Alkyl Acrylate Crosspolymer \r\n- Carbomer\r\n- Xanthan Gum\r\n- Sodium Hydroxide\r\n- Sodium Chloride\r\n- Trisodium Edta\r\n- Ethylhexylglycerin\r\n- Phenoxyethanol ', 107, 'https://i.pinimg.com/originals/ac/53/a4/ac53a4e6a1d6a5c57599f3e223f1772f.png'),
(28, 'The Ordinary Retinol 1% In Squalane', '- Squalane\r\n- Caprylic/​Capric Triglyceride\r\n- Simmondsia Chinensis (Jojoba) Seed Oil\r\n- Retinol 1.0%\r\n- Solanum Lycopersicum (Tomato) Fruit Extract\r\n- Rosmarinus Officinalis (Rosemary) Leaf Extract\r\n- Hydroxymethoxyphenyl Decanone\r\n- BHT', 104, 'https://i.pinimg.com/originals/53/17/c9/5317c92e69c992186b8bdd752857814a.png'),
(29, 'The Inkey List Retinol Serum', '- Water (Aqua/​Eau)\r\n- Glycerin\r\n- Butylene Glycol\r\n- Propanediol\r\n- Dicaprylyl Carbonate\r\n- Dimethicone\r\n- Hydroxyethyl Acrylate/​Sodium Acryloyldimethyl Taurate Copolymer\r\n- Caprylyl Glycol\r\n- Phospholipids\r\n- Caprylic/​Capric Glycerides\r\n- Squalane\r\n- Dimethyl Isosorbide, Glycine Soja (Soybean) Extract\r\n- Carbomer\r\n- Sodium Ascorbate\r\n- Tocopherol\r\n- Polysorbate 60\r\n- Tocopheryl Acetate\r\n- Glycolipids\r\n- Sodium Hydroxide\r\n- Disodium EDTA\r\n- Hydroxypinacolone Retinoate 0.05%\r\n- Retinol 0.05%\r\n- Glycine Soja (Soybean) Sterols\r\n- Leuconostoc/​Radish Root Ferment Filtrate\r\n- PEG-40 Hydrogenated Castor Oil\r\n- Hyaluronic Acid\r\n- Polysorbate 20\r\n- Palmitoyl Tetrapeptide-7\r\n- Palmitoyl Tripeptide-1\r\n- Phenoxyethanol', 104, 'https://i.pinimg.com/originals/00/1e/e5/001ee5cbbab7276c3fba6c32d59c4e59.png'),
(30, 'MooGoo Blemish Cleansing Moisturiser', '- Aqua\r\n- Squalene (Olive)\r\n- Cetearyl Alcohol\r\n- Prunus Armeniaca (Apricot) Kernel Oil\r\n- Vitis Vinifera (Grape) Seed Oil\r\n- Simmondsia Chinensis (Jojoba) Seed Oil\r\n- Camellia Sinensis Leaf Extract (Standardized Green Tea Ecgc)\r\n- Pantothenic Acid (Vitamin B5)\r\n- Aloe Barbadensis (Aloe Vera) Leaf Juice\r\n- Caprylic/​Capric Triglyceride (Fractionated Coconut)\r\n- Dimethyl Sulfone (Msm Organic Sulphur)\r\n- Helianthus Annuus (Sunflower) Seed Oil\r\n- Polysorbate 60 (Food Grade Emulsifier)\r\n- Resveratrol (Japanese Knotweed Extract)\r\n- Piroctone Olamine\r\n- Hydrolyzed Milk Protein\r\n- Allantoin\r\n- Whey Protein\r\n- Coconut Acid\r\n- Palm Acid\r\n- Ascorbyl Tetraisopalmitate (Stabilised Vitamin C)\r\n- Tocopherol (Natural Vitamin E)\r\n- Vanilla Planifolia Fruit Extract\r\n- Humulus Lupulus (Hops) Extract', 101, 'https://i.pinimg.com/originals/e5/45/c2/e545c288fe9df7cc9725e354857ab222.png'),
(31, 'dfgggffff', 'ghh', 102, 'fghjk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id_category`);

--
-- Indexes for table `matchskin`
--
ALTER TABLE `matchskin`
  ADD PRIMARY KEY (`id_skin`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id_skin`,`id_category`),
  ADD KEY `id_category` (`id_category`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id_category` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=108;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id_skin` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `matchskin`
--
ALTER TABLE `matchskin`
  ADD CONSTRAINT `matchskin_ibfk_1` FOREIGN KEY (`id_skin`) REFERENCES `product` (`id_skin`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`id_category`) REFERENCES `category` (`id_category`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
