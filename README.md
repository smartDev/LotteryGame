Problem

We are looking for a REST interface to a simple lottery system. The rules of the game are described below.

Lottery Rules

You have a series of lines on a ticket with 3 numbers, each of which has a value of 0, 1, or 2. For each ticket if the sum of the values is 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both 2nd and 3rd numbers are different from the 1st, the result is 1. Otherwise the result is 0.

Implementation

Implement a REST interface to generate a ticket with n lines. Additionally we will need to have the ability to check the status of lines on a ticket. We would like the lines sorted into outcomes before being returned. It should be possible for a ticket to be amended with n additional lines. Once the status of a ticket has been checked it should not be possible to amend.

We would like tested, clean code to be returned.



INTERFACE:

SEE LotteryWebInterface for Further Descriptions.

CREATE LOTTERY TICKET
HTTP METHOD: POST
URL EXAMPLE: http://localhost:8080/lottery/ticket/create?numberLines=2
RESPONSE: {"lines":[{"lineNumbers":[1,0,1]},{"lineNumbers":[2,0,1]},{"lineNumbers":[2,1,1]}],"checked":false,"ticketId":1}

AMEND LOTTERY TICKET
HTTP METHOD: PUT
URL EXAMPLE: http://localhost:8080/lottery/ticket/update?ticketId=1&numberLines=2
RESPONSE: {"results":[{"lotteryLine":{"lineNumbers":[1,0,1]},"lotteryLineValue":10},{"lotteryLine":{"lineNumbers":[2,0,1]},"lotteryLineValue":1},{"lotteryLine":{"lineNumbers":[2,1,1]},"lotteryLineValue":1}]}

CHECK LOTTERY TICKET
HTTP METHOD: GET
URL EXAMPLE: http://localhost:8080/lottery/ticket/check?ticketId=1
RESPONSE: {"results":[{"lotteryLine":{"lineNumbers":[1,0,1]},"lotteryLineValue":10},{"lotteryLine":{"lineNumbers":[2,0,1]},"lotteryLineValue":1},{"lotteryLine":{"lineNumbers":[2,1,1]},"lotteryLineValue":1}]}

Get ALL LOTTERY TICKETs
HTTP METHOD: GET
    URL EXAMPLE: http://localhost:8080/lottery/ticket/
RESPONSE: [{"lines":[{"lineNumbers":[0,0,0]},{"lineNumbers":[0,0,0]},{"lineNumbers":[0,2,1]},{"lineNumbers":[0,0,2]}],"checked":false,"ticketId":1}]



BUILD:
mvn clean install

RUN
java -jar target/LotteryGame-1.0-SNAPSHOT.jar
