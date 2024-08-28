# Kekod Project 01

This project is an Android application that offers a dynamic interface with various components controlled by switches. Below you will find the features, installation steps, and usage guidelines for the project.

# Features
The application includes 6 switches that provide different functionalities to the user, dynamically creating a BottomNavigationBar based on their interaction:

# Initial State:

When the application opens, 6 switches are displayed, and the "Ego" switch is on by default.
While the "Ego" switch is on, the other 5 switches cannot be activated.
When the "Ego" switch is turned off, the other switches can be toggled on by the user.

# BottomNavigationBar:

The BottomNavigationBar is hidden when the "Ego" switch is off.
As each switch is turned on, an icon and text are added to the BottomNavigationBar in the order they are toggled. The order of the items is determined dynamically and is not preset.

# Switch and BottomNavigationBar Interaction:

The screen containing the switches is always placed in the 1st slot of the BottomNavigationBar.
Users can open up to 4 switches, and these switches will appear on the BottomNavigationBar in the order they are toggled. The last opened switch will not be added to the BottomNavigationBar.
When a switch is turned off, its corresponding icon and text will be removed from the BottomNavigationBar.

# Navigation:

Each item in the BottomNavigationBar navigates to its own detail screen. Ensure the detail screens contain content and are not left empty.

# Binding Usage:

DataBinding or ViewBinding is used across all screens in the application.

## Screenshoots
| Welcome | Sign Up |
| ------ | ---- | 
|<img src="https://github.com/user-attachments/assets/23578497-9046-460a-b6a3-26d7c0b0b615" width="250" height="500"/>|<img src="https://github.com/user-attachments/assets/c82a7c54-2a69-4663-86b1-f72f73b562ad" width="250" height="500"/>|

</br>


