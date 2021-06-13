# HomeWork05
Простая обектная модель создана по мотивам вселенной Warcraft для изучения инъекций зависимостей и инверсии контроля.

Описание классов:

Unit - абстрактный класс с общими свойствами юнита, такими как "здоровье" и признак того, что юнит не убит. Также содержит общие для юнита методы: получение урона и лечение.

Berserk и Knight - классы описывают кокретные юниты, которые отличаются силой наносимого урона и имеют метод атаки где сила атаки вычисляется путем умножение 
силы юнита на урон выбранного юнитом оружия.

Юнит имеет одно из трех видов оружия, которое отличается наносимым уроном и имеет свой класс.

IoC достигается через реализацию интерфейса Weapon.

Тесты покрывают использование всех сочетаний юнитов и оружия и проверяют наносимы данными сочетаниями результирующий урон.
