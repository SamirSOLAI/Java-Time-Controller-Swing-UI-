# DureeApp — Time Manipulation with Java Swing

This project is a small desktop application developed in **Java** using the **Swing** graphical library.  
The goal is to manipulate a duration in a structured way (hours, minutes, seconds) while keeping everything synchronized with an internal representation in total seconds.

## 🎯 Objective

The application allows the user to:
- Increase or decrease the total duration second by second.
- Adjust hours, minutes, or seconds individually using arrow buttons.
- Always display a consistent and synchronized time format.

At the core of the application is a custom `Duree` class that models time and ensures valid values.

## 🧠 Core Concepts Used

This project helped me practice and apply:

- **Object-Oriented Programming (OOP)**  
  - Encapsulation with the `Duree` class  
  - Clear separation between data (`Duree`) and interface (`AppliDuree`)

- **Java Swing (GUI programming)**  
  - Layout management with `GridLayout`
  - Buttons and text fields
  - Event listeners (`ActionListener`) for user interactions

- **Data consistency**  
  - Single method (`convertSeconds()`) to synchronize all UI fields with the current duration

## 🛠️ How It Works 

- Internally, the duration is stored in **total seconds**.
- The UI displays the same duration as:
  - Hours (`h`)
  - Minutes (`m`)
  - Seconds (`s`)
- Any change (button click) updates the internal value first, then refreshes the display.



