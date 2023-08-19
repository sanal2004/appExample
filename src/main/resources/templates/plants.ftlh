<!DOCTYPE html>
<html>
<head>
    <title>База данных сорных растений</title>
</head>
<body>
<h1>ЭКОНОМИЧЕСКИЕ ПОРОГИ ВРЕДОНОСНОСТИ
    СОРНЫХ РАСТЕНИЙ В РОСТОВСКОЙ ОБЛАСТИ
</h1><hr>
<h4>Перечень сорных растений</h4>
<form action="/" method="get">
    Поиск по названию культурного растения: <input type="text" name="culturename"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list plants as plants>
    <div>
        <p><b>
                <b>${plants.id}</b>. ${plants.pestname}</b>| <a href="/plants/${plants.id}">Подробнее...</a>
            <br>
            (<b>${plants.culturename}</b>) </p>
    </div>
<#else>
    <h3>Данные отсутствуют</h3>
</#list>
<hr>
<h3>Добавить в базу сорное растение</h3>
<form action="/plants/create" method="post">
    Название культурного растения: <input type="text" name="culturename"/><br><br>
    Название сорного растения: <input type="text" name="pestname"/><br><br>
    Фаза развития культуры: <input type="text" name="effiquencyname"/><br><br>
    Экономический порог вредоносности, шт/м2: <input type="text" name="phasename"/><br><br>
    <input type="submit" value="Добавить"/>
</form>
</body>
</html>