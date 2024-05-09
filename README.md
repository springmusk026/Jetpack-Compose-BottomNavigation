# Jetpack Compose Bottom Navigation Sample

This repository contains a Jetpack Compose project showcasing the implementation of a bottom navigation bar, inspired by [this tutorial](https://www.youtube.com/watch?v=HVub2u8DpDQ). The project demonstrates the usage of Material3 components for creating a sleek and modern UI.

## Features

- Bottom navigation bar with icons and labels
- Badge notifications for certain items
- Navigation between different sections of the app

## Screenshots

Include some screenshots or gifs demonstrating the app's functionality and appearance.

## Getting Started

### Prerequisites

- Android Studio Arctic Fox (2020.3.1) or later
- Android SDK version 31 or higher
- Kotlin version 1.5.0 or later

### Installation

1. Clone the repository:

```bash
git clone https://github.com/springmusk026/Jetpack-Compose-BottomNavigation.git
```

2. Open the project in Android Studio.

3. Build and run the project on a compatible device or emulator.

## Usage

1. Upon launching the app, you'll see the bottom navigation bar with four tabs: Home, Posts, Notifications, and Profile.
2. Tap on each tab to navigate between different sections of the app.
3. If there are any new notifications, a badge will appear on the Notifications tab.

## Code Explanation

### MainActivity.kt

- The `MainActivity` class sets up the main UI using Jetpack Compose.
- It initializes the bottom navigation bar with icons, labels, and badge notifications.
- The `bottomNavItems` list defines the navigation items with their properties.
- Each `BottomNavItem` represents a tab in the bottom navigation bar.

### BottomNavItem.kt

- This data class represents a single item in the bottom navigation bar.
- It contains properties such as title, route, selected icon, unselected icon, badge presence, and badge count.

### Components Used

- `Scaffold`: Provides a basic layout structure for the app screen, including the bottom navigation bar.
- `NavigationBar`: A custom navigation bar implementation for Jetpack Compose.
- `NavigationBarItem`: Represents a single item in the bottom navigation bar.
- `BadgedBox`: Displays a badge on top of an icon to indicate new notifications.
- `Badge`: Represents a badge notification with customizable content.
- `Icon`: Displays an icon image using either a vector or a bitmap.

## Contributing

Contributions are welcome! Please feel free to fork the repository and submit pull requests to suggest improvements or add new features.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgements

- Thanks to [YouTube Tutorial](https://www.youtube.com/watch?v=HVub2u8DpDQ) for providing inspiration for this project.
- Special thanks to the Jetpack Compose team for developing such an amazing toolkit for Android UI development.

## Contact

For any inquiries or feedback, feel free to reach out to [GitHub Profile](https://github.com/springmusk026).