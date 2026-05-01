# 🫁 Lung Cancer Classification App (AI Medical Diagnosis System)


## 📌 Overview

This project is a **web-based AI-powered medical diagnosis system** for lung cancer classification.
It allows doctors and patients to upload lung scan images and receive **real-time predictions using a trained deep learning model**.

The system is built using a **full-stack architecture (React + PHP + Flask + MySQL)** and developed in a **SCRUM team workflow using Trello/Nikoniko calendar for planning and task tracking**.

---

## 🎯 Key Features

### 👤 Multi-role system

* **Patient:** Upload scans, view results, download reports
* **Doctor:** Analyze patient scans, manage patient history , sign reports 
* **Admin:** Global dashboard, statistics, user management

### 🤖 AI Diagnosis

* Upload lung scan images (JPG, PNG)
* Preprocessing (resize, normalization, CLAHE)
* CNN model prediction
* Output:

  * Normal / Cancer
  * Confidence score
  * Risk level (Low / Medium / High)

### 📊 Reports & Analytics

* Diagnosis history per user
* Statistical charts
* Export medical reports (PDF/Text)
* Multi-language reports:

  * 🇫🇷 French
  * 🇬🇧 English
  * 🇸🇦 Arabic

### ✍️ Electronic Signature

* Digital signature included in exported medical reports
* Ensures authenticity of medical documents

---

## 🏗️ System Architecture

```
Frontend (React + Bootstrap + JS)
        │
        ▼
PHP API (Authentication + Business Logic)
        │
        ▼
Flask API (AI Model Prediction)
        │
        ▼
MySQL Database
```

---

## 🧠 AI Model Details

* Model Type: Convolutional Neural Network (CNN)
* Framework: TensorFlow / Keras
* Input: 224x224 grayscale images
* Output: Binary classification
* Accuracy: ~97%

### Preprocessing Pipeline

1. Image resizing (224x224)
2. Grayscale conversion
3. Noise reduction
4. Contrast enhancement (CLAHE)
5. Normalization (0–1)

---

## 🗂️ Project Structure

```
frontend/
 ├── src/
 │   ├── pages/
 │   ├── components/
 │   └── styles/

backend-flask/
 ├── app.py
 ├── model/
 ├── uploads/

php-api/
 ├── api/
 │   ├── login.php
 │   ├── register.php
 │   ├── diagnostics.php
 │   └── admin.php

database/
 └── schema.sql
```

---

## ⚙️ Installation Guide

### 1️⃣ Clone repository

```bash
git clone https://github.com/C-Charif/lung-cancer-Classification-app.git
cd lung-cancer-Classification-app
```

---

### 2️⃣ Frontend Setup (React)

```bash
cd frontend
npm install
npm run dev
```

---

### 3️⃣ Backend Flask (AI API)

```bash
cd backend-flask
python -m venv venv
source venv/bin/activate  # Windows: venv\Scripts\activate
pip install -r requirements.txt
python app.py
```

---

### 4️⃣ PHP Backend (XAMPP)

* Move `php-api/` to `htdocs`
* Start Apache + MySQL (XAMPP)
* Import database:

```bash
mysql -u root -p < database/schema.sql
```

---

### 📌 screenshots

* Login page
* Dashboard (Patient)
* Dashboard (Doctor)
* AI upload page
* Prediction result page
* Admin panel

---

## 📊 SCRUM Workflow

* Sprint planning via **Trello board**
* Emotional tracking via **Nikoniko Calendar**
* Daily progress updates
* Role-based task distribution

---

## 👥 Team Collaboration

* GitHub branching strategy
* Feature-based commits
* Code review before merge

---

## 📄 Medical Reports

Generated reports include:

* Patient info
* Diagnosis result
* AI confidence
* Doctor signature
* Timestamp
* Multi-language support (FR / EN / AR)

---

## 🔐 Security Features

* Password hashing
* Input validation
* File type validation
* Session-based authentication
* Protected API routes

---

## 🚀 Future Improvements

* Mobile app version (React Native)
* Advanced AI model (ResNet / EfficientNet)
* Cloud deployment (AWS / Azure)
* Real-time doctor chat system

---

## 🐛 Troubleshooting

### Flask not running

```bash
pip install flask tensorflow
```

### React not starting

```bash
rm -rf node_modules
npm install
```

### Database error

* Check XAMPP MySQL service

---

## 📜 License

This project is for academic and educational purposes.

---

## ⭐ Acknowledgements

* SCRUM methodology
* Medical dataset preprocessing techniques
* Open-source AI community

---

## 📌 Important Notes

* Ensure GPU recommended for training
* Dataset must be cleaned before training
* Keep model file updated in `/model/`
