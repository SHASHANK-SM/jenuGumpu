# jenuGumpu Honey Hub

> A beautiful Android app for honey harvesting, batch quality tracking, and local honey buy/sell marketplace management.

![Kotlin](https://img.shields.io/badge/Kotlin-Android-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![XML](https://img.shields.io/badge/UI-XML-F5B301?style=for-the-badge)
![Android Studio](https://img.shields.io/badge/Android%20Studio-Project-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white)
![Material UI](https://img.shields.io/badge/Material-Design-C47A00?style=for-the-badge)

## Overview
<img width="717" height="1600" alt="WhatsApp Image 2026-05-15 at 10 37 07 PM" src="https://github.com/user-attachments/assets/7719fb43-497a-426d-99ca-9ed4868cfac8" />
<img width="717" height="1600" alt="WhatsApp Image 2026-05-15 at 10 37 06 PM" src="https://github.com/user-attachments/assets/e042162b-8fad-4935-9c7d-58b8f90e8b29" />
<img width="717" height="1600" alt="WhatsApp Image 2026-05-15 at 10 37 06 PM (2)" src="https://github.com/user-attachments/assets/35d30950-c46e-4b6c-92ea-3507cbc23a54" />
<img width="717" height="1600" alt="WhatsApp Image 2026-05-15 at 10 37 06 PM (1)" src="https://github.com/user-attachments/assets/1bd5706d-6eb6-4125-a5e7-257410770f6c" />
<img width="717" height="1600" alt="WhatsApp Image 2026-05-15 at 10 37 05 PM" src="https://github.com/user-attachments/assets/52c54708-002a-4175-8da6-7d579dd83040" />

**jenuGumpu Honey Hub** is a Kotlin and XML based Android application designed for honey harvesters, small honey sellers, local buyers, and self-employment groups. The app helps users record honey harvest details such as **floral source**, **moisture percentage**, and **litres harvested**, then manage buying and selling through a simple honey marketplace and cart.

The project is built as a mini-project friendly Android Studio application with a polished honey-themed interface, login/signup flow, bottom navigation, fragments, cards, gradients, and generated visual assets.

<p align="center">
  <img src="https://github.com/user-attachments/assets/7719fb43-497a-426d-99ca-9ed4868cfac8" alt="jenuGumpu screen 1" height="420" />
  <img src="https://github.com/user-attachments/assets/e042162b-8fad-4935-9c7d-58b8f90e8b29" alt="jenuGumpu screen 2" height="420" />
  <img src="https://github.com/user-attachments/assets/35d30950-c46e-4b6c-92ea-3507cbc23a54" alt="jenuGumpu screen 3" height="420" />
  <img src="https://github.com/user-attachments/assets/1bd5706d-6eb6-4125-a5e7-257410770f6c" alt="jenuGumpu screen 4" height="420" />
  <img src="https://github.com/user-attachments/assets/52c54708-002a-4175-8da6-7d579dd83040" alt="jenuGumpu screen 5" height="420" />
</p>

## App Preview

| Login / Signup | Honey Dashboard | Harvest Entry | Market and Cart |
| --- | --- | --- | --- |
| Warm honey-themed auth screen | Honey batch highlights | Floral source, moisture, litres | Buy/sell honey jars |

> Add screenshots here after running the app from Android Studio.

```text
app/src/main/res/drawable/bg_honey_market.png
app/src/main/res/layout/activity_login.xml
app/src/main/res/layout/fragment_harvest.xml
app/src/main/res/layout/fragment_cart.xml
```

## Key Features

### Login and Signup

- Beautiful honey-themed login page
- Signup mode for new users
- Phone number and password input
- Simple validation for demo/project use
- Opens the main app after successful login/signup

### Honey Dashboard

- Premium hero section with honey marketplace artwork
- Shows harvested honey quantity
- Shows active cart orders
- Displays honey batch highlights
- Uses RecyclerView and CardView for clean content presentation

### Honey Harvest Entry

Users can add harvest batch details:

- Floral source, such as forest blossom, jamun, wildflower, neem, or mixed flora
- Moisture percentage
- Litres harvested
- Instant quality result based on moisture value

Example output:

```text
Saved batch: Forest Blossom honey, 42 litres, 18.2% moisture. Quality: Premium grade.
```

### Honey Buy and Sell Marketplace

- Lists honey products and seller listings
- Shows jar size, category, price, and stock status
- Supports local honey selling concept
- Designed for rural and small business self-employment use cases

### Cart

- Buy honey jars
- Prepare sell order drafts
- Place cart request
- Shows order status after checkout action

### Beautiful UI Design

- Honey, amber, cream, and forest green color palette
- Gradient backgrounds
- Glass-style cards
- Honey jar icon
- Honeycomb visual panel
- Material Components input fields and buttons
- Bottom navigation for simple mobile use

## Problem Statement

Small honey harvesters often collect high-quality honey but struggle to manage batch details, quality indicators, pricing, and local sales in one place. Important information such as floral source, moisture percentage, and harvested quantity may be written manually or forgotten, making it difficult to prove quality, plan stock, and sell confidently.

Existing marketplace apps are too generic for honey producers because they do not focus on harvest quality, batch-level records, or local buyer-seller trust. jenuGumpu Honey Hub solves this by combining honey batch tracking with a simple marketplace and cart experience, making the app useful for self-employment groups, rural entrepreneurs, and honey collectors.

## User Flow

```text
Open App
   |
   v
Login / Signup
   |
   v
Home Dashboard
   |
   +--> Add Honey Harvest
   |
   +--> View Honey Marketplace
   |
   +--> Add Buy/Sell Items to Cart
   |
   v
Place Cart Request
```

## Tech Stack

| Technology | Usage |
| --- | --- |
| Kotlin | Activity, fragments, adapters, models, app logic |
| XML | Layouts, drawables, menus, colors, styles |
| Android Studio | Development and build environment |
| Material Components | Buttons, text input layouts, modern UI elements |
| RecyclerView | Honey batch and marketplace item lists |
| CardView | Dashboard, product, and cart cards |
| View Binding | Safer view access in Kotlin |
| Room DB | Local database structure for future persistence |
| Retrofit | API service placeholder for future backend/GenAI integration |
| Gradle Wrapper | Consistent build setup |

## Project Structure

```text
jenuGumpu/
|-- app/
|   |-- src/main/
|   |   |-- AndroidManifest.xml
|   |   |-- java/com/example/jenugumpu/
|   |   |   |-- activities/
|   |   |   |   |-- LoginActivity.kt
|   |   |   |   |-- MainActivity.kt
|   |   |   |-- fragments/
|   |   |   |   |-- DashboardFragment.kt
|   |   |   |   |-- HarvestFragment.kt
|   |   |   |   |-- MarketplaceFragment.kt
|   |   |   |   |-- CartFragment.kt
|   |   |   |-- adapters/
|   |   |   |-- models/
|   |   |   |-- database/
|   |   |   |-- services/
|   |   |   |-- utils/
|   |   |-- res/
|   |       |-- layout/
|   |       |-- drawable/
|   |       |-- values/
|   |       |-- menu/
|-- build.gradle
|-- settings.gradle
|-- gradle.properties
|-- README.md
```

## Main Screens

| Screen | File |
| --- | --- |
| Login / Signup | `activity_login.xml`, `LoginActivity.kt` |
| Main Navigation | `activity_main.xml`, `MainActivity.kt` |
| Dashboard | `fragment_dashboard.xml`, `DashboardFragment.kt` |
| Harvest Entry | `fragment_harvest.xml`, `HarvestFragment.kt` |
| Marketplace | `fragment_marketplace.xml`, `MarketplaceFragment.kt` |
| Cart | `fragment_cart.xml`, `CartFragment.kt` |

## How To Run

1. Open Android Studio.
2. Click **File > Open**.
3. Select the `jenuGumpu` project folder.
4. Wait for Gradle sync to complete.
5. Make sure Gradle JDK is set to **JDK 17**.
6. Click **Run** and choose an emulator or Android device.

Build command:

```bash
./gradlew assembleDebug
```

On Windows:

```bash
gradlew.bat assembleDebug
```

## Design System

| Element | Style |
| --- | --- |
| Primary color | Honey amber |
| Accent color | Golden yellow |
| Support color | Forest green |
| Background | Warm cream gradient |
| Cards | Soft white / glass style |
| Navigation | Bottom navigation |
| Typography | Clean Android sans-serif |

## Future Enhancements

- Firebase Authentication with phone OTP
- Firestore cloud sync for honey batches and orders
- Real cart quantity management
- Seller profile and buyer profile pages
- Honey quality certificate upload
- Product image scanner
- GenAI-generated product descriptions
- Moisture and purity recommendation engine
- Kannada and Hindi language support
- Payment gateway integration
- Admin dashboard for cooperative societies

## Academic Use

This project is suitable for:

- Engineering mini-projects
- Final year Android project submissions
- Hackathons
- Self-employment domain demonstrations
- Rural entrepreneurship app prototypes
- GenAI-enabled Android app presentations

## Build Status

The project was checked with:

```text
Gradle task: :app:assembleDebug
Result: BUILD SUCCESSFUL
```

## Author

**jenuGumpu Honey Hub**  
Android app development using Kotlin, XML, Material UI, and GenAI-inspired project design.

---

Made for honey harvesters, local sellers, and self-employment communities.
