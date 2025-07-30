🌟 What I Learned While Building the Dice App in Jetpack Compose
Creating this simple dice-rolling app using Jetpack Compose was a great hands-on experience that taught me multiple important concepts related to modern Android development. Below are the key areas I explored and learned while writing this code:

🔘 1. Making Elements Clickable with clickable Modifier
One of the first things I learned was how to make UI components interactive using the clickable modifier. I applied it to an Image and a Box, enabling users to roll the dice by tapping the image and reset the state by clicking the refresh box. This taught me how user interactions can be easily handled in a declarative UI using Compose.

🖼️ 2. Displaying and Switching Between Images
I also learned how to display images in Compose using painterResource. More importantly, I figured out how to conditionally change which image is shown based on the state of the app. For example, different dice images (like dice_1, dice_2, etc.) are shown based on the randomly generated number. This helped me understand dynamic UI rendering.

🎲 3. Using the random() Function for Dice Rolls
The functionality of a dice roll required generating a random number between 1 and 6. I used Kotlin’s random() function for this, learning how to use ranges ((1..6).random()) to simulate randomness. It was a simple but effective way to bring unpredictability and fun to the app.

🧠 4. State Management with remember and mutableStateOf
I learned how to manage and preserve UI state using remember and mutableStateOf. For example, diceRolled and diceNumber were tracked using these state variables. This allowed the app to update the UI in real time whenever the state changed, making it reactive and smooth.

🎨 5. Styling the UI with Modifiers
Styling the components using modifiers like padding, fillMaxSize, clip, background, border, and size gave me a deeper understanding of layout control in Jetpack Compose. I also experimented with shapes, colors, and alignment to create a clean and user-friendly interface.
<img width="350" height="600" alt="image" src="https://github.com/user-attachments/assets/3fe6abe9-92ea-4f6f-9720-cec8896a33ef" />


🧱 6. Understanding Composable Function Structure
I improved my understanding of how to structure UI in Compose using functions like Greeting() and Dice(). Each function handles a specific part of the screen, promoting reusability and readability. This helped reinforce the idea of breaking down UI into manageable, modular components.

🔄 7. Conditional Logic with when Expressions
To select the correct dice image based on the random number, I used Kotlin’s when expression. This taught me how effective when can be for mapping values to specific outcomes in a clean and concise way, especially for UI updates.

✅ Conclusion
Overall, this project gave me valuable experience in building interactive UI with Jetpack Compose. I learned how to handle user input, manage state, display images conditionally, and design clean layouts using composables and modifiers. It was a great foundation for understanding modern declarative UI principles in Android development, and it made me more confident about exploring more complex UI functionalities in the future.
