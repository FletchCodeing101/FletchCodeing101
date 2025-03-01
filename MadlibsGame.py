def madlib_game():
    # Get user input
    noun1 = input("Enter a noun: ")
    noun2 = input("Enter another noun: ")
    noun3 = input("Enter one more noun: ")
    
    adj1 = input("Enter an adjective: ")
    adj2 = input("Enter another adjective: ")
    adj3 = input("Enter one more adjective: ")
    adj4 = input("Enter a final adjective: ")
    
    verb1 = input("Enter a verb: ")
    verb2 = input("Enter another verb: ")
    
    # Generate story
    story = f"""One day, a {adj1} {noun1} was walking through the forest. It saw a {adj2} {noun2} that was 
    trying to {verb1}. Surprised, the {noun1} decided to help, but just then, a {adj3} {noun3} 
    appeared and started to {verb2} loudly. It was a {adj4} day, and in the end, they all became friends."""
    
    # Print story
    print("\nHere's your Mad Libs story:")
    print(story)

# Run the game
madlib_game()
