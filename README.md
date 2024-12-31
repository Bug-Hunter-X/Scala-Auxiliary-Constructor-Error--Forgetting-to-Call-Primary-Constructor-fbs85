# Scala Auxiliary Constructor Error

This repository demonstrates a common error in Scala related to auxiliary constructors.  When defining an auxiliary constructor, it's crucial to explicitly call the primary constructor. Failure to do so will result in default values being used where they might not be expected, leading to subtle and hard-to-find bugs.

## The Problem

The `MyClass` class defines an auxiliary constructor (`this()`).  However, this auxiliary constructor doesn't explicitly call the primary constructor (`this(value)`). This means that the `value` field is not initialized correctly when the auxiliary constructor is used, instead falling back to a default value (0 in this case).

## The Solution

The solution is to explicitly call the primary constructor within the auxiliary constructor, ensuring that the `value` field is properly initialized.
