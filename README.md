# Java Core & GUI Applications (Winchester)

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Swing](https://img.shields.io/badge/GUI-Java_Swing-007396?logoColor=white)](https://docs.oracle.com/javase/tutorial/uiswing/)

A collection of Java applications demonstrating Object-Oriented Programming (OOP) paradigms, GUI engineering with Java Swing, and computational geometry logic.

---

## 🚀 Projects & Modules

### 1. 📚 Library Book Search (`LibraryBookSearch.java`)
- **GUI Engine**: Interactive desktop GUI built using Java Swing (`JFrame`, `JTextField`, `JButton`, `JLabel`, `JPanel`).
- **Search Logic**: Case-insensitive substring searching across catalog arrays.
- **Visual Feedback**: Real-time availability status banners (`Available` with green highlight, `Not Found` with warning state).

### 2. 📐 Land Plot Layout Checker (`LandPlotLayoutChecker.java`)
- **Geometric Modeler**: Models $n$-sided regular polygonal land plots using OOP classes and encapsulation.
- **Concentricity Verification**: Analyzes whether two polygon boundaries share a concentric center based on regular polygon side divisibility constraints.

---

## 📁 Project Structure

```text
├── src/
│   ├── LibraryBookSearch.java       # Interactive Java Swing desktop app
│   └── LandPlotLayoutChecker.java   # Geometric polygon centering analyzer
├── .gitignore                       # Excludes *.class and bin/ artifacts
└── README.md                        # Documentation
```

---

## 🛠️ How to Compile & Run

### Terminal / Command Prompt
```bash
# 1. Compile all Java source files into bin directory
javac -d bin src/*.java

# 2. Run Library Book Search GUI
java -cp bin LibraryBookSearch

# 3. Run Land Plot Layout Checker CLI
java -cp bin LandPlotLayoutChecker
```

---

## 👤 Author
* GitHub: [@iamwarriorofmyuniverse-coder](https://github.com/iamwarriorofmyuniverse-coder)
