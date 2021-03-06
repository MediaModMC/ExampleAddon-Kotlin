<div align="center">

## ExampleAddon-Kotlin

#### An example addon for MediaMod using Kotlin

</div>

### Notes

- [IntelliJ IDEA](https://www.jetbrains.com/idea/) is the recommended IDE to use for MediaMod Addons
- This addon uses Kotlin ``1.5.10`` and the ``rewrite`` branch of MediaMod
- If you want to use Java, check out [ExampleAddon-Java](https://github.com/MediaModMC/ExampleAddon-Java)
- At the moment, the MediaMod Addon API is still very experimental and subject to change


- **You must not use any Minecraft references directly as it will not work across multiple versions. (e.g. ``
  Minecraft.getMinecraft()``). Check out the [MediaMod Wiki](https://github.com/MediaModMC/MediaMod/wiki) for
  replacements for these methods.**

### Setup

1. Clone this GitHub Repository
    ```
    git clone https://github.com/MediaModMC/ExampleAddon-Kotlin.git
    ```

2. Import the project into IntelliJ (or your IDE of choice)
   <div>
      <img src="https://cdn.discordapp.com/attachments/806461073199988737/817728961248362516/unknown.png" width="45%">
      <img src="https://cdn.discordapp.com/attachments/806461073199988737/817729124268769290/unknown.png" width="31.2%">
   </div>

3. (optional) Wait for Gradle to load, then run the ``setupDecompWorkspace`` task
   <div>
      <img src="https://cdn.discordapp.com/attachments/806461073199988737/817730572528910396/unknown.png" width="31.2%">
   </div>

4. (optional) Run the ``genIntelliJRuns`` task to be able to launch Minecraft

**The workspace is now setup, check out the [MediaMod Wiki](https://github.com/MediaModMC/MediaMod/wiki) for the
documentation on addons!**
