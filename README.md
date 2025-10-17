 💬 Real-Time Chat Application (Spring Boot + WebSocket + STOMP)

A production-grade **real-time chat application** built with **Spring Boot**, **WebSocket**, **STOMP**, and **SockJS** — enabling instant bi-directional messaging between multiple users.  
This project demonstrates my skills in **backend engineering**, **real-time systems**, **frontend integration**, and **clean code structure**.


🚀 Tech Stack

**Backend**
- Java 17
- Spring Boot 3.x
- WebSocket with STOMP protocol
- SockJS (for fallback WebSocket transport)
- Maven (build automation)

**Frontend**
- HTML5 / CSS3 / JavaScript (Vanilla)
- Bootstrap 5 for UI styling
- DOM-based dynamic chat rendering

Tools
- IntelliJ IDEA Ultimate
- Postman for testing
- Git & GitHub for version control

---

## ⚙️ Features

✅ Real-time one-to-many chat broadcast using WebSocket and STOMP  
✅ Bi-directional communication between clients and server  
✅ Auto-scroll chat window with smooth UI  
✅ User identification (sender name field)  
✅ Lightweight & responsive front-end built with Bootstrap  
✅ Clean MVC structure with controller, model, and config layers  
✅ Easy-to-deploy standalone Spring Boot application  

---

## 🧠 Architecture Overview

Client (Browser)
↓
SockJS / STOMP (over WebSocket)
↓
Spring Boot WebSocket Controller
↓
Message Broker (/topic/messages)
↓
All Connected Clients

yaml
Copy code

Each message from a user is published to the broker and instantly broadcast to all active WebSocket sessions — simulating a real-time chat room.

---

## 🧩 Project Structure

src
├── main
│ ├── java
│ │ └── com.example.demo
│ │ ├── config
│ │ │ └── WebSocketConfig.java
│ │ ├── controller
│ │ │ └── ChatController.java
│ │ ├── model
│ │ │ └── ChatMessage.java
│ │ └── DemoApplication.java
│ └── resources
│ ├── templates
│ │ └── chat.html
│ └── application.properties
└── test
└── DemoApplicationTests.java

yaml
Copy code

---

## 🧑‍💻 How to Run Locally

1️⃣ Clone this repository  
```bash
git clone https://github.com/Nazakat-12/RealtimeChat-App.git
cd RealtimeChat-App
2️⃣ Run the app

bash
Copy code
./mvnw spring-boot:run
3️⃣ Open in browser

bash
Copy code
http://localhost:8080/chat.html
4️⃣ Open in multiple tabs or devices to test real-time messaging 🔥

🧱 Backend Logic (Core Idea)
WebSocketConfig.java → Enables STOMP endpoints /ws and defines /topic/messages broker.

ChatController.java → Handles message routing with @MessageMapping("/chat.sendMessage").

ChatMessage.java → Defines the message payload (sender, content).

chat.html → Connects via SockJS → subscribes to /topic/messages → sends to /app/chat.sendMessage.

🎨 Frontend (UI Preview)
A clean and modern chat UI built using Bootstrap 5:

🟢 Sent messages → right-aligned, green bubbles
⚪ Received messages → left-aligned, gray bubbles
💬 Input area with smooth rounded design

**screenshots**
<img width="941" height="464" alt="image" src="https://github.com/user-attachments/assets/1254779b-009f-4c8e-85f1-01b1fa1e53fc" />
<img width="575" height="301" alt="image" src="https://github.com/user-attachments/assets/9491a3ee-a66e-4e5d-81cc-c047dc44810d" />


🧾 Real-World Use Case
This project simulates the core of a real-time messaging platform — similar to Slack, Discord, or WhatsApp Web.
It can be extended with:

Authentication (Spring Security)

Message persistence (MySQL, MongoDB)

Private chat rooms

Typing indicators / message status

📈 Why This Project Matters
I built this to demonstrate real-world backend skills in:

Event-driven communication

WebSocket management

Scalable architecture design

UI/UX integration

This is not a tutorial clone — it’s a from-scratch system built for production demonstration.

🧑‍🎓 Author
Nazakat Ali
🎓 BS Cybersecurity, FAST NUCES Karachi
💻 Passionate about building secure, scalable backend systems


