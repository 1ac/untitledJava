# Объекты, классы и интерфейсы

объект - это наборзначений , или полей (fields), а так же методов (methods), 
оперирущих этими данными. Тип данных объекта называется классом (class); об объекте
часто говорят как об экземпляре (instance) его класса. Класс определяет тип каждого поля
и предоставляет методы, оперирующие с данными,  содержащимися в экземпляре класса. 
Объект создается при помощи оператора new, вызывающего для инициализации объекта конструктор (constructor)
этого класса. Содержимое полей и методы объекта получаются и вызываются, соотвественно,
при помощи оператора " . " (точка).

Методы, оперирующие с полями объекта, называются методами экземпляра. Они отличаются от статических методов,
или методов класса. Методы класса объявляются как static; они оперируют с самим классам, 
а не с самим классом,  что делает их полями класса, а не полями экземпляра. в то
время как каждый объект имеет копии всех полей экземпляра, есть только одна копия пля класса, и она совместно используется всеми 
экземлярами класса.

Поля и методы класса могут иметь различные уровни видимости - public, private и protected. Эти различные уровни видимости
определяют возможность использования полей и методов в различных контекстах. У каждого класса ест свой базовый (родительский) класс,
от которого он наследует свои поля и методы. Класс, наследующий от другого класса, называется подклассом этого класса.
Классы в Java образуют иерарзию классов. Класс java.lang.Object - это корень иерархии; Object - это первичный базовый класс для всех классов в Java

Интерфейс - конструкция Java, определяющая, подобно классам, методы, но не представляющая никакой реализации этих методов. Класс
может реализовывать (implement) интрефейс путем реализации каждого метода в интерфейсе.
