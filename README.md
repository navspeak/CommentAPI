# CommentProj


## List all comments
GET /comments

Example:
GET http://localhost:8080/comments
```json
[
    {
        "id": 1,
        "text": "This is a kosher comment. Respectful and descent"
    },
    {
        "id": 2,
        "text": "This is a good comment."
    }
]
```
## POST a comment

POST /comments
```json
{ "text" : "Your text" }
```json

NOTE: if you want to update an existing comment provide the comment ID in the JSON Body
e.g:
```json
    {
        "id": 1,
        "text": "This is a Update to comment Id 1"
    }
```
## OFFENSIVE Comment is not allowed

POST 
```json
 {
        "text": "This is a bad comment."
  }
```
Response:
```json
{
    "timestamp": "2018-04-07T08:20:40.913+0000",
    "status": 406,
    "error": "Not Acceptable",
    "message": "Offensive Comment!!!",
    "path": "/comments"
}
```
