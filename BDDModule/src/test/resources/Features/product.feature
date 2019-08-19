Feature: Display of Product Page
  This page contains the details about a particular product.
  "Add to Cart" and "Add to Wishlist" buttons are tested in this feature file.

Background: Customer is logged in.

Scenario: "Add to Cart" button Validation
    Given I want to add the product to cart
    When I press the Add to Cart button
    Then Product is added to Cart

Scenario: "Add to Wishlist" button Validation
    Given I want to add the product to wishlist
    When I press the Add to Wishlist button
    Then Product is added to Wishlist