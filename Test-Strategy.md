## Key Risks Identified
- Authentication errors: Handling locked out users or incorrect credentials.
- Cart and pricing: Ensuring products added match final checkout.
- Checkout form handling: Incomplete or missing user input fields.
- UI sync issues: Dynamic elements (e.g., loading inventory) require proper waits.
- Test data reset: Each session is stateless; must isolate all test dependencies.

## Automation Priorities
1. Core Functional Flow – Validate happy path: login → add item → checkout.
2. Negative Flow – Assert failure message for locked out user login.
3. Scalability – Apply Page Object Model (POM) for clean test separation.
4. Stability – Use explicit waits instead of hard sleeps.

## Test Scope
- Positive test: Valid user completes purchase
- Negative test: Locked-out user login
- Future scope: Form validation, logout, inventory sorting, visual checks

## Continuous Integration Plan
- Tests are runnable via Maven (mvn test)
- Chrome runs in headless mode using 'ChromeOptions'
- GitHub Actions or Jenkins can trigger suite on pull requests
- Reports (TestNG HTML) generated
