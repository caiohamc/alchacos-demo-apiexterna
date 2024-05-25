# API EXTERNA
Serviço responsável por consumir uma API externa com diversos REST clients 

### REQUEST
    {username} = caiohamc

    GET /api/v1/httpclient/{username}
    GET /api/v1/okhttp/{username}
    GET /api/v1/openfeign/{username}
    GET /api/v1/resttemplate/{username}
    GET /api/v1/webclient/{username}

### RESPONSE

    {
        "login":"caiohamc", 
        "id":17348521,
        "node_id":"MDQ6VXNlcjE3MzQ4NTIx",
        "avatar_url":"https://avatars.githubusercontent.com/u/17348521?v=4",
        "gravatar_id":"",
        "url":"https://api.github.com/users/caiohamc",
        "html_url":"https://github.com/caiohamc",
        "followers_url":"https://api.github.com/users/caiohamc/followers",
        "following_url":"https://api.github.com/users/caiohamc/following{/other_user}",
        "gists_url":"https://api.github.com/users/caiohamc/gists{/gist_id}",
        "starred_url":"https://api.github.com/users/caiohamc/starred{/owner}{/repo}",
        "subscriptions_url":"https://api.github.com/users/caiohamc/subscriptions",
        "organizations_url":"https://api.github.com/users/caiohamc/orgs",
        "repos_url":"https://api.github.com/users/caiohamc/repos",
        "events_url":"https://api.github.com/users/caiohamc/events{/privacy}",
        "received_events_url":"https://api.github.com/users/caiohamc/received_events",
        "type":"User",
        "site_admin":false,
        "name":"Caio Henrique Albuquerque",
        "company":null,
        "blog":"",
        "location":"Brazil",
        "email":null,
        "hireable":null,
        "bio":"Software developer working in IT since 2015. \r\nFamiliar with Java, Spring, REST APIs, Git, Relational DBs, Scrum, Microservices/Monolith, Clean Arch, Tests.",
        "twitter_username":null,
        "public_repos":6,
        "public_gists":0,
        "followers":1,
        "following":2,
        "created_at":"2016-02-20T02:47:34Z",
        "updated_at":"2024-05-14T21:04:03Z"
    }