import mariadb

try:
    with mariadb.connect(
            host="DOMAIN_NAME",
            port=3306,
            database="demo",
            user="USER",
            password="PASSWORD",
            ssl_ca="CERT_PEM"
    ) as connection:
        cursor = connection.cursor()
        cursor.execute("select * from messages")
        for (id, content) in cursor:
            print(content)

except Exception as e:
    print(e)
