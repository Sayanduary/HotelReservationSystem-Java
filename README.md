
# 🏨 Hotel Management System (Java JDBC CLI)

A **console-based Hotel Management System** built with Java and MySQL using **JDBC (Java Database Connectivity)**. This project allows hotel operators to manage room reservations efficiently using a CLI-based interface, with real-time UTC logging and a secure MySQL backend.

---

## 📌 Features

✅ **Authentication Log Display** (UTC timestamps + session duration)
✅ **Reserve a Room** with guest name, room number, and contact
✅ **View Reservations** in a formatted table with sorting
✅ **Get Room Number** by reservation ID and guest name
✅ **Update Reservation** with new guest, room, or contact details
✅ **Delete Reservation** by reservation ID
✅ **View Current Date & Time** in real-time UTC format
✅ **Session Duration Tracker** for login/logout overview

---

## 🧠 What I Learned

* JDBC fundamentals (connection, statements, result sets)
* Secure CRUD operations using **PreparedStatement**
* Console-based UI design for better UX
* Real-time date and time handling using `java.time` (UTC support)
* SQL table design and indexing for faster queries

---

## 🛠️ Tech Stack

| Tech               | Purpose                     |
| ------------------ | --------------------------- |
| Java               | Core programming language   |
| JDBC               | DB connectivity & SQL ops   |
| MySQL              | Backend relational database |
| IntelliJ / VS Code | IDE for development         |
| Terminal           | CLI-based UI                |

---

## 💾 Database Schema

```sql
CREATE TABLE reservations (
    reservation_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_name VARCHAR(100),
    room_number INT,
    contact_number VARCHAR(20),
    reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## 🔑 Sample Output

```
═══════════════════════════════════════════
    HOTEL MANAGEMENT SYSTEM 
═══════════════════════════════════════════
AUTHENTICATION STATUS
Current Date and Time (UTC): 2025-07-09 10:34:21
Current User's Login: Sayanduary
Login Time: 2025-07-09 10:34:21
Status: ✅ Authenticated Successfully
═══════════════════════════════════════════

 === HOTEL MANAGEMENT SYSTEM ===
User: Sayanduary | UTC: 2025-07-09 10:34:21
────────────────────────────
1. Reserve a room
2. View Reservations
3. Get Room Number
4. Update Reservations
5. Delete Reservations
6. View Current Date/Time
0. Exit
────────────────────────────
```

---

## 🗂️ Project Structure

```
📦 HotelManagementSystem/
├── Main.java                  // Entry point, CLI logic
├── DatabaseUtil.java          // (Assumed) utility class to manage DB connection
└── README.md
```

> ⚠️ Make sure to configure your `DatabaseUtil` class with correct DB URL, username, and password.

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/HotelManagementSystem-Java.git
   cd HotelManagementSystem-Java
   ```

2. Configure MySQL connection in `DatabaseUtil.java`.

3. Compile and run:

   ```bash
   javac Main.java
   java Main
   ```

---

## ✅ To-Do / Future Scope

* [ ] Add user authentication system
* [ ] Role-based access (Admin, Receptionist)
* [ ] Export reservations to CSV
* [ ] JavaFX/React GUI
* [ ] Dockerize for easier deployment
* [ ] Host MySQL on cloud

---

## 📬 Contact

📛 Author: **Sayan Duary**
🔗 [LinkedIn](https://linkedin.com/in/sayanduary)
📧 [sayan.duary@example.com](mailto:sayanduary@gmail.com)

---

