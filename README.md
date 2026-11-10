# CS341 Project 2: Mystery Box (starter files)

The rules, deliverables, grading and submission format are in the project sheet. This page explains the files, how to set up Java, and how to run your experiments.

## 1. Find your folder

Use the class and group number from the team sheet: `sophomore<class>/group<number>/`.
For example, Sophomore 3, Group 2 is `sophomore3/group2/`. Use only your own group's folder, and copy it to your computer.

## 2. What is inside

| File | What it is |
|---|---|
| `MysteryBox.class` | Your group's box. Compiled, no source code. |
| `Probe.java` | The program you use to run your experiments (see section 6). |
| `MyBox.java` | Empty class with the same five methods. You fill it in at the end. |
| `Stack.java`, `Queue.java`, `Node.java` | The classes from Labs 6 and 7. |

## 3. Java setup (do this once)

You need a JDK (Java Development Kit), version 8 or newer. A JRE alone is not enough, because it has no compiler.

1. Download and install a JDK, for example Eclipse Temurin 17 or 21 from https://adoptium.net. On Windows, tick the installer options that add Java to the PATH and set `JAVA_HOME`.
2. Open a new terminal (Command Prompt, PowerShell or Terminal) and check both commands work:

```
java -version
javac -version
```

Both must print a version number. If `javac` is not found, the JDK is not installed or not on your PATH: restart the terminal, or reinstall and enable the PATH option.

## 4. Run from the terminal (always works)

Open a terminal inside your group folder, then:

```
javac *.java
java Probe
```

`javac *.java` compiles every file, including `MyBox.java`, which must compile even while it is empty. Run the two commands again each time you change a file.

## 5. Using an IDE

### Eclipse

1. Install "Eclipse IDE for Java Developers" from https://www.eclipse.org/downloads/ (after the JDK from section 3).
2. File > New > Java Project. Give it a name. **Untick "Create module-info.java"** on the last page, then Finish.
3. Copy `Probe.java`, `MyBox.java`, `Stack.java`, `Queue.java` and `Node.java` into the project's `src` folder (drag and drop them onto `src` in Package Explorer, choose Copy).
4. Create a plain folder named `lib` in the project (right-click the project > New > Folder) and copy `MysteryBox.class` into it.
5. Right-click the project > Build Path > Configure Build Path > Libraries tab > select Classpath > **Add Class Folder...** > tick `lib` > OK > Apply and Close.
6. Right-click `Probe.java` > Run As > Java Application. The output appears in the Console.

If `MysteryBox` is underlined in red, step 5 was not done correctly: check that `lib` is listed under Libraries.

### Visual Studio Code

1. Install Visual Studio Code from https://code.visualstudio.com/ (after the JDK from section 3).
2. Open the Extensions view (Ctrl+Shift+X), search for **Extension Pack for Java** (by Microsoft) and install it.
3. File > Open Folder... and choose your group folder (the one that contains `MysteryBox.class`).
4. Open the built-in terminal (Terminal > New Terminal) and run the commands from section 4:

```
javac *.java
java Probe
```

The Run button above `main` can also work, but it may not see `MysteryBox.class` (VS Code may underline `MysteryBox` in red). If that happens, ignore the underline and use the terminal commands, which always work.

## 6. Run your experiments with `Probe.java`

Do your experiments in the `Probe.java` file you were given. Do not create a different program. Edit `Probe.java`, recompile and run it again (section 4, or Run in your IDE).

`Probe.java` can call the five methods of the box. For example, change `main` like this:

```java
public class Probe {
    public static void main(String[] args) {
        MysteryBox box = new MysteryBox();
        box.put("A");
        System.out.println("size = " + box.size() + ", isEmpty = " + box.isEmpty());
        System.out.println("peek = " + box.peek());
        System.out.println("take = " + box.take());
    }
}
```

- `put(String x)`, `take()`, `peek()`, `size()` and `isEmpty()` are the only things you can call.
- `take()` or `peek()` on an empty box throws a `RuntimeException`. Check `isEmpty()` first, or catch the exception, so the program does not stop in the middle of an experiment.
- Print `size()` after every call, and print what `peek()` returns as well as what `take()` returns.
- Every experiment should start with a **new box** (`new MysteryBox()`), because the box remembers what happened before.

To keep all your experiments in the same file, give each one its own method and call the ones you want to run from `main`:

```java
public class Probe {
    public static void main(String[] args) {
        experiment1();
        // experiment2();   // remove the // to run it
    }

    static void experiment1() {
        MysteryBox box = new MysteryBox();
        box.put("A");
        box.put("B");
        while (!box.isEmpty()) {
            System.out.print(box.take() + " ");
        }
        System.out.println();
    }

    static void experiment2() {
        MysteryBox box = new MysteryBox();
        box.put("A");
        System.out.println("peek = " + box.peek() + ", size = " + box.size());
    }
}
```

You submit your final `Probe.java`, so keep your earlier experiments in it (as methods or commented-out code).

## 7. Working on `MyBox.java`

Fill in the five methods once you have your spec. Use only `Stack`, `Queue` and `int`/`boolean` variables. No arrays, no `ArrayList`, no `java.util` collections, and never use `MysteryBox` inside `MyBox`.

## 8. Reminders

- Decompiling, disassembling or opening `MysteryBox.class` with any tool gives the group zero.
- Do not share your box's rule or your log with another group.
