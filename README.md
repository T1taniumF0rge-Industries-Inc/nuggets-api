# Nuggets API

> **A lightweight Fabric library for standardized nuggets and material fragments.**

The goal of **Nuggets API** is simple: stop every mod from reinventing the same tiny materials in slightly different ways. This project provides a **clean and lightweight** foundation that other mods can *build on*, ensuring a *unified experience* for players and developers alike.

---

## ✨Features:
Built from the ground up to be lightweight and lag-free and uses common `c:` tags as well as our own `nuggets-api:` tags for seamless integration with your mods, this API library adds various nuggets items and material fragments to the game. It is also translated into various well used languages like French, German, Chinese and Spanish!
### Items
* **Nugget Template** -> a template *required* to craft all of the new nuggets! *Crafted using 4 sticks in a circle pattern*

  ![Nugget Template](https://cdn.modrinth.com/data/cached_images/cdc8ee72ed4fa512efeef2857a29114b5b125989.png)
* **Small Smithing Template** -> a netherite upgrade smithing template but *smaller*, used when *upgrading* a diamond nugget to netherite. *Can be found in bastion remnants or crafted with 1 regular smithing template*

  ![Small Smithing Template](https://cdn.modrinth.com/data/cached_images/6ce719c6fff69d96f2b1852d52821a3910334151.png)

  You can also craft back a regular smithing template by using 9 small smithing templates!

### Nuggets
* **Wood Splinter** -> a wood nugget. *Can be crafted using 1 nugget template and 1 stick*

  ![Wood Splinter](https://cdn.modrinth.com/data/cached_images/dc901b466113627973e2c176a562b37091966055.png)
* **Stone Pebble** -> a stone nugget. *Can be crafted using 1 nugget template and 1 stone*
  
  ![Stone Pebble](https://cdn.modrinth.com/data/cached_images/571f864dcbd9634d3ee01739b8529c18dab520f9_0.webp)
* **Coal Lump** -> a coal nugget. *Can be crafted using 1 nugget template and 1 coal or 1 charcoal*

  ![Coal Lump](https://cdn.modrinth.com/data/cached_images/c5a44471317cfbeb97a3ebe6bc53bd6af8f98e19_0.webp)
  ![Coal (Charcoal) Lump](https://cdn.modrinth.com/data/cached_images/a0a1c89a45fbdd6a21030be9add538136df8590f.png)
* **Redstone Nugget** -> a redstone nugget. *Can be crafted using 1 nugget template and 1 redstone*

  ![Redstone Nugget](https://cdn.modrinth.com/data/cached_images/b59624f2bdd56da3cb6409a7a43dd23d62c21c23.png)
* **Quartz Shard** -> a quartz nugget. *Can be crafted using 1 nugget template and 1 quartz*

  ![Quartz Shard](https://cdn.modrinth.com/data/cached_images/05d08ce72bbdc3160264bfac00fdbbfd6b379f4a.png)
* **Amethyst Crystal** -> an amethyst nugget. *Can be crafted using 1 nugget template and 1 amethyst shard*

  ![Amethyst Crystal](https://cdn.modrinth.com/data/cached_images/cbaf88a97534ff9bc2f80b374e3bc0f065b532f4.png)
* **Lapis Lazuli Chunk** -> a lapis lazuli nugget. *Can be crafted using 1 nugget template and 1 lapis lazuli*

  ![Lapis Lazuli Chunk](https://cdn.modrinth.com/data/cached_images/3e83b3d1297fe19f1d652572858e7bfd01bd34b6.png)
* **Emerald Chunk** -> an emerald nugget. *Can be crafted using 1 nugget template and 1 emerald*

  ![Emerald Chunk](https://cdn.modrinth.com/data/cached_images/216b46937de8ee334f2aa32ce0266021a2fc10ad.png)
* **Diamond Shard** -> a diamond nugget. *Can be crafted using 1 nugget template and 1 precious diamond*

  ![Diamond Shard](https://cdn.modrinth.com/data/cached_images/d2faceda452454dac86f14d7964b69751835ad71.png)
* **Netherite Nugget** -> a netherite nugget. *Obtained by smithing a diamond nugget with the small smithing template and a netherite ingot or by crafting using 1 nugget template and 1 valuable netherite ingot*
  
  ![Netherite Nugget [Smithing]](https://cdn.modrinth.com/data/cached_images/01f4821900a79048fb4b11c7b27f02ec2f05fcf3.png)
  ![Netherite Nugget [Crafting]](https://cdn.modrinth.com/data/cached_images/607c4672d43f58f8266d54b623e6cd69615a0ddd.png)

---

## 🛠 For Developers

Nuggets API is built with integration in mind. All materials are exposed through tags, making cross-compatibility straightforward. You are encouraged to use **tags** in your recipes rather than hard-coding item dependencies!

#### Common Tag Reference
| Material | Item ID | Common Tag (`c:`) |
| :--- | :--- | :--- |
| **Diamond** | `nuggets-api:diamond_nugget` | `#c:nuggets/diamond` |
| **Netherite** | `nuggets-api:netherite_nugget` | `#c:nuggets/netherite` |
| **Emerald** | `nuggets-api:emerald_nugget` | `#c:nuggets/emerald` |
| **Nugget Template** | `nuggets-api:nugget_template` | `#c:nuggets/template` |
| **Small Smithing Template** | `nuggets-api:small_netherite_upgrade_smithing_template` | `#c:smithing_templates/small_netherite_upgrade` |

### 📦 Installation

To use Nuggets API in your development environment, add the following to your `build.gradle`:

```gradle
repositories {
    maven { url = "https://jitpack.io" } // Optional but required if you wish to bundle the API into your mod by using the include dependency below
}

dependencies { // You can change the API version after nuggets-api: to the one you want to use
    modImplementation "com.titan1um:nuggets-api:a1.0.0+1.20.1" // Required
    include "com.github.T1taniumF0rge-Industries-Inc:nuggets-api:a1.0.0+1.20.1" // Optional unless you want to bundle the API into your mod (Jar-in-Jar)
}
