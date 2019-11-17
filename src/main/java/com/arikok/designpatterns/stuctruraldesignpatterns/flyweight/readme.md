- Flyweight 
    - Avoid redundancy when storing data
    - MMORPG,
        - Plenty of users with identical first/last names
        - No sense in storing same/last name over and over again
        - Store a list of names and pointers to them
    - Bold or italic text in the console
        - Dont want each character to have a formatting character
        - Operate on ranges (e.g., line number, start/end positions)

A space optimization technique that lets us use less moemory by storing externally the data associated with similar objects

- Store common data externally
- Specify an index or reference into the external dat store
- Define the idea of ranges on homogeneous collections and store data related to those ranges
- Dont forget String.intern()
