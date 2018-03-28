# hydra-question-score-service
### Hydra MSA element for persisting and accessing scored responses to tech screening questions. 

This service contains the following methods for interacting with data:
* questionScore
  * Description
    * Takes a request body as a SimpleQuestionScore object and saves it to the database.
  * Endpoint
    * /question/score
* getScoresByScreeningId
  * Description
    * Returns a List of SimpleQuestionScore objects by a given screeningId.
  * Endpoint
    * /question/viewScoresByScreening/{screeningId}

The QuestionScore service communicates with the following services:
* Screening
