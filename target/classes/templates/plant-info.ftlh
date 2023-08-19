<!DOCTYPE html>
<html>
<head>
    <title>База данных сорных растений</title>
</head>
<body>
<h1>ЭКОНОМИЧЕСКИЕ ПОРОГИ ВРЕДОНОСНОСТИ
    СОРНЫХ РАСТЕНИЙ В РОСТОВСКОЙ ОБЛАСТИ</h1><hr>
<h4>Подробная информация</h4>
<b>Название сорного растения: </b>${plant.pestname}<br>
<b>Фаза развития культуры: </b>${plant.phasename}<br>
<b>Экономический порог вредоносности, шт/м2: </b>${plant.effiquencyname}<br>
<hr>
<form action="/plant/delete/${plant.id}" method="post">
    <input type="submit" value="Удалить"/>
</form>
</body>
</html>