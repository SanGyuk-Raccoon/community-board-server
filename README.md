# Back-end Server for Otter's Community Board

## Introduction

This is Back-end server for Otter's Community Board.
- [Otter's Community Board](https://github.com/otterbits/vue-community-board)
- offer some REST API for community board
  
made by [spring initializr](https://start.spring.io/).  

### Spring Boot Initializr Config

![image](https://github.com/SanGyuk-Raccoon/community-board-server/assets/56672129/814d9717-ab4d-497d-937b-17bebb7822be)



## Getting Started

1. Clone this Repo.
2. Open in IntelliJ IDE
3. set Gradle Options in IntelliJ IDE  
`File` - `Settings` - `Build, Execution, Deployment` - `Gradle`
use `IntelliJ IDEA` both
![gradle setting](https://github.com/SanGyuk-Raccoon/community-board-server/assets/56672129/34f11965-b5bb-4232-9762-af79aeb64e4a)

## API

|   function    | Method |    URL    |
|--------------|:------:|---------|
|모든 글 불러오기|GET|/posts|
|상세 글 불러오기|GET|/post/{id}|
|글 작성|POST|/post/create|
|글 수정|PATCH|/post/{id}|
|글 삭제|DELETE|/post/{id}|


## Run

1. run `CommunityBoardServerApplication`
   ![image](https://github.com/SanGyuk-Raccoon/community-board-server/assets/56672129/b4954561-cd48-40c3-8614-b60c2f800cbb)
2. access to `localhost:8080`
![image](https://github.com/SanGyuk-Raccoon/community-board-server/assets/56672129/99ef940d-419c-4ac4-a44b-abb67d05234f)

   
