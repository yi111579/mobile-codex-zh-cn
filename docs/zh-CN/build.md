# 构建简中版 APK

## 环境

准备 JDK 17、Android SDK Platform 35、Android SDK Build-Tools 35.0.0 和 Python 3。仓库包含 Gradle Wrapper。

## 准备运行时

可按[上游构建说明](../../README.en.md)准备运行时，也可从 [上游 v0.4.0 发布页](https://github.com/nokryong/mobile-codex/releases/tag/v0.4.0)获取 `mobile-codex-0.4.0-arm64.apk`，复用这一版本已经构建的运行时：

| 上游 APK 内的路径 | 本仓库内的路径 |
| --- | --- |
| `assets/devtools/` | `app/src/main/assets/devtools/` |
| `lib/arm64-v8a/` | `app/src/main/jniLibs/arm64-v8a/` |

上游 APK 的 SHA-256 为 `b90d29c9ae7a13ccd92e9407e265ed7d92cc6b7abb5f0945fabc2aa5c80a1c62`。本版没有修改这些运行时组件。

## 构建与签名

在仓库根目录运行：

```powershell
.\gradlew.bat :app:assembleRelease
```

Linux 或 macOS 使用 `./gradlew :app:assembleRelease`。默认生成 `app/build/outputs/apk/release/app-release-unsigned.apk`，再用自己的 Android 签名密钥和 Build-Tools 的 `apksigner` 签名。后续覆盖安装同一套件需要兼容的签名。

应用完整源码在本仓库。上游 [v0.4.0 发版](https://github.com/nokryong/mobile-codex/releases/tag/v0.4.0)提供原样复用的开发工具对应源码 `devtools-corresponding-source.zip`，上游 [Codex 运行时发版](https://github.com/nokryong/mobile-codex/releases/tag/runtime-0.162.1-live-v3)提供补丁与运行时源码。其他组件说明见 [THIRD_PARTY_NOTICES.md](../../THIRD_PARTY_NOTICES.md)。签名私钥应保存在本地，切勿提交到 Git。
