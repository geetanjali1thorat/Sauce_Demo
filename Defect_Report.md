## Summary
The login form accepts usernames with leading whitespace, which could allow unauthorized access if validation is bypassed.

## Steps to Reproduce
1. Open https://www.saucedemo.com
2. Enter username: ` standard_user` (with a leading space)
3. Enter password: `secret_sauce`
4. Click 'Login'

## Expected Result
System should reject the username due to incorrect input format.

## Actual Result
User is logged in successfully and redirected to the inventory page.

## Severity
Medium – The system should enforce strict input validation. In real-world scenarios, this could cause authentication inconsistencies or security concerns.
