// db.createUser(
//     {
//         user: "springuser",
//         pwd: "12345678",
//         roles: [
//             {
//                 role: "readWrite",
//                 db: "admin"
//             }
//         ]
//     }
// );

db.createUser(
    {
        user: "springuser",
        pwd: "12345678",
        roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
    }
);