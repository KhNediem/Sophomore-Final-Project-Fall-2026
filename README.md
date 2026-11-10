# CS341 Project 2: Mystery Box (starter files)

The rules, deliverables, grading and submission format are in the project sheet. This page only explains the files and how to run them.

## 1. Find your folder

Use the class and group number from the team sheet: `sophomore<class>/group<number>/`.
For example, Sophomore 3, Group 2 is `sophomore3/group2/`. Use only your own group's folder.

## 2. What is inside

| File | What it is |
|---|---|
| `MysteryBox.class` | Your group's box. Compiled, no source code. |
| `Probe.java` | Starter program from the project sheet. |
| `MyBox.java` | Empty class with the same five methods. You fill it in at the end. |
| `Stack.java`, `Queue.java`, `Node.java` | The classes from Labs 6 and 7. |

## 3. Set up and run

You need a JDK (Java 8 or newer). Copy your folder to your computer, open a terminal inside it, then:

```
javac *.java
java Probe
```

`javac *.java` compiles everything, including `MyBox.java`, which must compile even while it is empty. Run `java Probe` again after you edit and recompile.

## 4. Write your own probe programs

Make a new file, for example `Probe2.java`, in the same folder. It can call the five methods of the box:

```java
public class Probe2 {
    public static void main(String[] args) {
        MysteryBox box = new MysteryBox();
        box.put("A");
        System.out.println("size = " + box.size() + ", isEmpty = " + box.isEmpty());
        System.out.println("peek = " + box.peek());
        System.out.println("take = " + box.take());
    }
}
```

Compile and run it with `javac Probe2.java` then `java Probe2`.

- `put(String x)`, `take()`, `peek()`, `size()` and `isEmpty()` are the only things you can call.
- `take()` or `peek()` on an empty box throws a `RuntimeException`. Check `isEmpty()` first, or catch the exception, so a program does not stop in the middle of an experiment.
- Print `size()` after every call, and print what `peek()` returns as well as what `take()` returns.
- Keep every probe you write. You submit them with your project.

## 5. Working on `MyBox.java`

Fill in the five methods once you have your spec. Use only `Stack`, `Queue` and `int`/`boolean` variables. No arrays, no `ArrayList`, no `java.util` collections, and never use `MysteryBox` inside `MyBox`.

## 6. Reminders

- Decompiling, disassembling or opening `MysteryBox.class` with any tool gives the group zero.
- Do not share your box's rule or your log with another group.
