<%--
  Created by IntelliJ IDEA.
  User: harrynguyen
  Date: 14/05/2020
  Time: 08:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>calculator</title>
  </head>
  <body>
  <div style="width: 500px; height: 200px; border: blue solid 2px; margin: 20px auto">
  <form style="margin: 0 100px" method="post" action="/calculator">
    <h2>Simple Calculator</h2>
    <table>
      <tr>
        <td>First operand:</td>
        <td><input type="text" name="first" ></td>
      </tr>
      <tr>
        <td>Operantor:</td>
        <td>
          <select name="operator">
          <option value="+">Addition</option>
          <option value="-">Subtraction</option>
          <option value="*">Multiplication</option>
          <option value="/">Division</option>
        </select></td>
      </tr>
      <tr>
        <td>Second operand:</td>
        <td><input type="text" name="second"></td>
      </tr>
      <tr >
        <td></td>
        <td><input type="submit" id="submit" value="Calculate"></td>
      </tr>
      <tr>
        <td>Result</td>
        <td><p id="result">${result}</p></td>
      </tr>
    </table>
  </form>
  </div>
  </body>
</html>
