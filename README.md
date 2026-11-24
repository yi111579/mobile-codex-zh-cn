# Mobile Codex 简中版

Mobile Codex 的简体中文社区版，基于 [nokryong/mobile-codex v0.4.0](https://github.com/nokryong/mobile-codex/releases/tag/v0.4.0)。在 Android 手机上运行 Codex，可连接项目文件夹、使用终端工具，并按需邀请 Claude Code 或 Antigravity 参与对话。

[上游英文说明](README.en.md) · [上游韩文说明](README.ko.md) · [本版修改记录](docs/zh-CN/changes.md) · [从源代码构建](docs/zh-CN/build.md)

> 本项目是社区汉化版。原项目由 nokryong 和贡献者开发，OpenAI、Google、Anthropic 均未发布或维护本版。模型推理需要联网和相应服务的账号。

## 安装

要求 ARM64 手机、Android 10 或更新版本，以及可用的 Android System WebView。简中版的包名是 `dev.mobilecodex.app.zhcn`，可与上游版并存。两个版本各自保存账号、聊天和设置。

从本仓库的 [Releases](../../releases) 查找匹配的简中 APK。若当前没有 APK，可按[构建说明](docs/zh-CN/build.md)自行编译。安装时，Android 可能要求临时允许浏览器或文件管理器安装应用。

## 上手

1. **连接 ChatGPT**。打开应用，在「设置 → 账户 → Codex · ChatGPT」点「添加 ChatGPT 账户」。复制应用生成的设备登录码，点「在浏览器中登录」，在 OpenAI 登录页面完成验证后返回应用。设备码只用于当前登录流程。
2. **新建聊天或项目**。在侧栏点「新建聊天」。如果要读写自己的项目，先点「添加项目」，选择文件夹，并按系统提示授权。需要运行脚本时，可在「设置 → 工具」检查内置开发工具。
3. **添加 Antigravity 或 Claude Code（可选）**。在「设置 → 工具」安装并启用应用内 Linux 环境。再到「设置 → 账户」对应服务卡片，点「安装或更新 CLI」，安装结束后点「登录」。等终端输出出现浏览器登录入口，使用该服务的账号授权。如果网页显示一次性验证代码，把它填回「登录输入」并点「提交输入」。登录完成后，在聊天输入框的加号菜单选择「邀请代理」。可用 `@gemini`、`@claude` 和 `@codex` 指定回复者。
4. **任务通知（可选）**。在设置中找到「任务通知」，按需开启完成提醒、审批提醒或振动，并授权 Android 通知权限。
5. **手机控制（可选）**。在「设置 → 工具 → 手机控制」连接无障碍服务，主动开启控制，再开始新聊天。此功能可让助手读取屏幕、点击和输入。任务所用的屏幕内容和截图可能发送到 AI 服务并留在记录里，可随时用屏幕上的停止按钮暂停控制。

首次打开默认使用简体中文。可在「设置 → 常规 → 语言」切换英文、韩文或跟随系统。聊天内容、文件、终端原始输出和外部登录网页保留各自的语言。

## 反馈

欢迎用本仓库的 Issues 报告错译、漏译、截断或界面显示问题。请注明应用版本、Android 版本和出现位置。附截图时请遮住邮箱、登录码、账号信息和私人文件路径。

## 来源与许可证

应用代码和原项目素材依照 [GPL-3.0-only](LICENSE) 分发。汉化基于 [nokryong/mobile-codex](https://github.com/nokryong/mobile-codex)，保留原作者和贡献者署名。随应用使用的第三方组件各自适用原许可证，见 [THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md)。

### Linux 环境停在「正在提取」

若长时间没有进度，可先取消这次安装，然后在「设置 → 工具 → 内置开发工具」运行「检查工具执行」。如果 Python、Node.js 和 Git 都超时，应用还没有进入 Google 登录流程，反复获取登录码不会修复本地工具。

在一台运行 ColorOS 17 的一加设备上观察到了这一现象。该设备的存储空间充足，简中版与 v0.4.0 上游 APK 使用相同的运行时二进制和 Linux 安装配置。尚未确认故障属于设备兼容性，还是其他运行环境差异。
