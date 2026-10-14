# JavaFX Text and Image Display

## Aim
Build a JavaFX GUI that displays a text label and an image in an `ImageView`, demonstrating the basic structure of a JavaFX application and the use of key UI components.

## Problem Statement
A JavaFX program that:
1. Creates a window (Stage) with the title **"Text and Image Display"**.
2. Displays a label with the text **"Hello, JavaFX!"**.
3. Loads and displays an image in an `ImageView`.
4. Organises the label and image vertically using a **VBox** layout.
5. Sets the scene size to **600×400** pixels.

## How the Code Works

| Step | Description |
|------|-------------|
| 1 | Imports required JavaFX packages |
| 2 | Class `DisplayTextAndImage` extends `Application` |
| 3 | `start(Stage)` sets the window title |
| 4 | Creates a `Label` with text "Hello, JavaFX!" |
| 5 | Loads image → creates `ImageView` (fit 400×300) |
| 6 | `VBox` with spacing 20, centered, contains label + image |
| 7 | `Scene` of size 600×400 |
| 8 | Scene set on Stage and shown |
| 9 | `main` calls `launch(args)` |

## Project Structure
```
javafx-text-image/
├── output/                  # Screenshots of the running GUI
│   ├── output1.png
│   ├── output2.jpg
│   └── ...
├── resources/
│   └── sample.png           # Image loaded by the application
├── src/
│   └── DisplayTextAndImage.java
├── README.md
└── .gitignore
```

## Prerequisites
- JDK 11+ (or any version that supports JavaFX)
- JavaFX SDK (if not bundled with your JDK)

## How to Compile & Run

### Option A – Modular JavaFX (recommended)
```bash
# Adjust the path to your JavaFX SDK lib folder
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.graphics src/DisplayTextAndImage.java

java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.graphics -cp src DisplayTextAndImage
```

### Option B – If JavaFX is already on the classpath
```bash
cd src
javac DisplayTextAndImage.java
java DisplayTextAndImage
```

**Important:** Run the program from the project root so that the relative path `file:resources/sample.png` resolves correctly.  
You may also change the image path inside the code to an absolute path if needed.

## Expected Output
A 600×400 window titled **"Text and Image Display"** containing:
- The text **Hello, JavaFX!** (centered)
- The sample image below the text

## Constraints Followed
- Image file exists at the specified path (`resources/sample.png`)
- `main` method calls `launch(args)`
- `start` method is the entry point for the GUI
- VBox used for vertical layout
- Scene size exactly 600×400
