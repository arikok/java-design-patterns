Strategy - System behavior partially specified at runtime

- Many algorithms can be decomposed into higher - and lower level parts
- Making tea can be decomposed into
    - The process of making a hot beverage(boil water, pour into cup)
    - Tea-specific things ( put teabag into water)
- The high-level algorithm can then be reused for making coffee or hot chocolate
    - Supported by beverage-specific strategies

Enables the exact behavior of a system to be selected either at runtime(dynamic) or compile-time(static)

Also known as a policy (C++)

- Define an algorithm at a high level
- Define the interface you expect each strategy to follow
- Provide for either dynamic or static composition of strategy to in the overall algorithm

 
