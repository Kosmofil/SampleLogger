# SampleLogger
Тестовый проект, создан чтобы разобраться в подключении логера log4j и обертки slf4j.
Для корректной работы, необходимо подключить slf4j-api-1.7.25.jar и apache-log4j-1.2.jar.

Все настройки логера задаються в файле log4j.properties (описание настроек указано внутри файла в комментариях),
файл должен находиться в classpath приложения. Файл настроен таким образом что логи выводяться в консоль, плюс создаються
два отдельных файла логов, один для INFO и общий.
