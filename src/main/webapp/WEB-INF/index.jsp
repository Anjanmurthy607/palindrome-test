<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Palindrome Checker</title>
</head>
<body>
    <h1>Palindrome Checker</h1>
    <form action="checkPalindrome" method="post">
        <label for="inputString">Enter a string:</label>
        <input type="text" name="inputString" id="inputString" required>
        <br><br>
        <input type="submit" value="Check">
    </form>
</body>
</html>
