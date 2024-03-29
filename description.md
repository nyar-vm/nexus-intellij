<!-- Plugin description -->


A [Wasm Interface Type](https://github.com/WebAssembly/component-model/blob/main/design/mvp/WIT.md) plugin for
IntelliJ-based IDEs, supports the old `*.witx` and latest `*.wit` file extension.

## Features

| Feature            | Progress | Implement                                                                                                                                             |
|--------------------|----------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| Syntax Highlight   | ✅        | [SyntaxHighlighter](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/highlight/WitSyntaxHighlighter.kt) |
| Semantic Highlight | ✅        | [HighlightVisitor](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/highlight/WitHighlightVisitor.kt)   |
| Pretty Formatter   | ✅        | [FormatBuilder](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/formatter/WitFormatBuilder.kt)         |
| Block Folding      | ✅        | [FoldingVisitor](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/matcher/WitFoldingVisitor.kt)         |
| Braces Matcher     | ✅        |                                                                                                                                                       |
| Smart Enter        | ✅        | [SmartEnter]()                                                                                                                                        |

<!-- Plugin description end -->