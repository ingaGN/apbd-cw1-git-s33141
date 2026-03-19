1. git wykonuje fast forward w momencie gdy nie ma konfliktow. Czyli jeżeli nie doszło do zmian wywołujących konflikt na galezi docelowej.

Gdy sa konflikty git tworzy nowy commit, merge commit. Laczy historie galezi które mergujemy i na których wystapily zmiany które spowodowaly konflikt


2. merge -  Tworzy dodatkowy commit merge i zachowuje pełną historię rozgałęzień

rebase - przenosi commity z jednej galezi na koniec drugiej

3. konflikt został rozwiązany poprzez edycje kodu, usuniecie znakow `<<<<<<<`, `=======` i `>>>>>>>`, wybranie uznanej za lepsza wersje kodu. potem git add . i zacommitowalam
