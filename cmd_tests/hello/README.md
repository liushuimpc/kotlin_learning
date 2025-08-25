https://kotlinlang.org/docs/command-line.html



# Create and run an application﻿

1. Create a simple console JVM application in Kotlin that displays "Hello, World!". In a code editor, create a new file called hello.kt with the following code:

   ```c
   fun main() {
       println("Hello, World!")
   }
   ```

   

2. Compile the application using the Kotlin compiler:

   ```c
   kotlinc hello.kt -include-runtime -d hello.jar
   ```

   The **-d** option indicates the output path for generated class files, which may be either a directory or a **.jar** file.

   The **-include-runtime** option makes the resulting **.jar** file self-contained and runnable by including the Kotlin runtime library in it.

   To see all available options, run:

   ```c
   kotlinc -help
   ```

   

3. Run the application:

   ```c
   java -jar hello.jar
   ```

   



## Compile a library﻿

If you're developing a library to be used by other Kotlin applications, you can build the .jar file without including the Kotlin runtime:

```bash
kotlinc hello.kt -d hello.jar
```



Since binaries compiled this way depend on the Kotlin runtime, you should ensure that it is present in the classpath whenever your compiled library is used.

You can also use the `kotlin` script to run binaries produced by the Kotlin compiler:

```bash
kotlin -classpath hello.jar HelloKt
```



`HelloKt` is the main class name that the Kotlin compiler generates for the file named `hello.kt`.





## Run the REPL﻿

Run the compiler with the [`-Xrepl` compiler option](https://kotlinlang.org/docs/compiler-reference.html#xrepl) to have an interactive shell. In this shell, you can type any valid Kotlin code and see the results.

## Run scripts﻿

You can use Kotlin as a scripting language. A Kotlin script is a Kotlin source file (`.kts`) with top-level executable code.

```kotlin
import java.io.File

// Get the passed in path, i.e. "-d some/path" or use the current path.
val path = if (args.contains("-d")) args[1 + args.indexOf("-d")]
           else "."

val folders = File(path).listFiles { file -> file.isDirectory() }
folders?.forEach { folder -> println(folder) }
```



To run a script, pass the `-script` option to the compiler with the corresponding script file:

```bash
kotlinc -script list_folders.kts -- -d <path_to_folder_to_inspect>
```



Kotlin provides experimental support for script customization, such as adding external properties, providing static or dynamic dependencies, and so on. Customizations are defined by so-called script definitions – annotated kotlin classes with the appropriate support code. The script filename extension is used to select the appropriate definition. Learn more about [Kotlin custom scripting](https://kotlinlang.org/docs/custom-script-deps-tutorial.html).

Properly prepared script definitions are detected and applied automatically when the appropriate jars are included in the compilation classpath. Alternatively, you can specify definitions manually by passing the `-script-templates` option to the compiler:

```bash
kotlinc -script-templates org.example.CustomScriptDefinition -script custom.script1.kts
```



For additional details, see the [KEEP-75](https://github.com/Kotlin/KEEP/blob/master/proposals/scripting-support.md).
