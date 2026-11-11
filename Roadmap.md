# Java 25+ Design Patterns – Leerroadmap

> **Doel:** alle 23 klassieke Gang of Four (GoF) design patterns zelfstandig leren herkennen, implementeren, testen en verantwoord toepassen.
>
> **Studieritme:** maandag t/m vrijdag, ongeveer 10–15 minuten per oefendag (richttijd rond 12:00 uur).
>
> **Omvang:** 94 geplande oefendagen, ongeveer 19 werkweken; reserveer circa 20 weken met ruimte voor uitloop. Dit is een flexibel plan, geen deadline.

## 1. Uitgangspunten

- We starten met een **nieuw, zelfstandig Maven-project** en beginnen opnieuw bij Factory Method.
- De oefeningen zijn **per categorie** georganiseerd: eerst Creational, dan Structural, daarna Behavioral.
- Elk pattern krijgt **meerdere dagen**. Complexere patterns krijgen meer tijd.
- De oefeningen gebruiken **Java 25 zonder preview-features**, Maven en waar nuttig JUnit 5 (eventueel Mockito).
- We gebruiken **geen Spring Boot** als vereiste, zodat de focus op de patterns en objectgeoriënteerd ontwerp blijft.
- Iedere keer **één kleine, zelfstandig uitvoerbare opdracht**. De oplossing wordt niet vooraf gegeven.
- Na het insturen van de code volgt een **code review**, uitleg bij denkvragen, gerichte verbeterpunten en waar nuttig een vervolgvariant.
- We bespreken nadrukkelijk **wanneer een pattern níét nodig is** en vergelijken patterns met vergelijkbare structuren.
- Als een concept nog niet duidelijk is, voegen we extra oefeningen toe of herhalen we het onderwerp.

## 2. Leerdoelen

Na het traject kan ik:

1. Het probleem beschrijven dat ieder pattern oplost.
2. De belangrijkste rollen, verantwoordelijkheden en relaties uitleggen.
3. Een pattern zelfstandig in Java implementeren.
4. De implementatie testen, inclusief relevante randgevallen.
5. De trade-offs en alternatieven uitleggen.
6. Zelf beslissen welk pattern bij een gegeven probleem past — of waarom geen pattern nodig is.

## 3. Planning in één oogopslag

| Fase | Onderwerp | Patterns | Oefendagen | Indicatieve duur |
|---|---|---:|---:|---|
| 1 | Creational | 5 | 17 | 3–4 weken |
| 2 | Structural | 7 | 26 | 5–6 weken |
| 3 | Behavioral | 11 | 46 | 9–10 weken |
| 4 | Integratie-eindproject | Gecombineerd | 5 | 1 week |
| **Totaal** | | **23** | **94** | **circa 20 weken** |

### Fase 1 – Creational Patterns (oefendagen 1–17)

**Centrale vraag:** hoe maken we objecten gecontroleerd, flexibel en zonder onnodige koppeling aan concrete implementaties?

| Dagen | Pattern / onderdeel | Duur | Inhoud |
|---|---|---:|---|
| 1–3 | Factory Method | 3 | Objectcreatie scheiden van verwerking; subklassen kiezen concrete producten; testen en vergelijken |
| 4–7 | Abstract Factory | 4 | Families van gerelateerde objecten; nieuwe families toevoegen; vergelijking met Factory Method en Builder |
| 8–10 | Builder | 3 | Stapsgewijs construeren; verplichte/optionele velden; defaults, validatie en immutability |
| 11–12 | Prototype | 2 | Objecten kopiëren; shallow versus deep copy; mutabele velden |
| 13–14 | Singleton | 2 | Scope, lazy/eager initialisatie, thread safety, nadelen voor testbaarheid |
| 15–17 | Categorie-eindopdracht | 3 | Zonder patternhint requirements analyseren, oplossing implementeren en ontwerpkeuze verdedigen |

**Resultaat:** zelfstandig het juiste creational pattern kunnen kiezen.

### Fase 2 – Structural Patterns (oefendagen 18–43)

**Centrale vraag:** hoe laten we objecten samenwerken, organiseren en uitbreiden zonder sterke afhankelijkheden?

| Dagen | Pattern / onderdeel | Duur | Inhoud |
|---|---|---:|---|
| 18–20 | Adapter | 3 | Externe interfaces vertalen; gegevens transformeren; integratietests |
| 21–24 | Bridge | 4 | Abstractie en implementatie loskoppelen; onafhankelijke varianten uitbreiden |
| 25–28 | Composite | 4 | Boomstructuren, recursie, bladeren en samengestelde objecten |
| 29–31 | Decorator | 3 | Logging, timing en andere wrappers; stapelvolgorde en foutafhandeling |
| 32–33 | Facade | 2 | Complexe subsystemen via een eenvoudiger toegangspunt gebruiken |
| 34–37 | Flyweight | 4 | Intrinsieke/extrinsieke toestand; objectdeling; geheugenoverwegingen |
| 38–40 | Proxy | 3 | Lazy loading, toegangscontrole en caching; verschil met Decorator |
| 41–43 | Categorie-eindopdracht | 3 | Structural patterns herkennen, combineren en verdedigen |

**Resultaat:** onder andere Adapter, Decorator en Proxy op basis van hun **doel** uit elkaar kunnen houden, ook als hun code op elkaar lijkt.

### Fase 3 – Behavioral Patterns (oefendagen 44–89)

**Centrale vraag:** hoe verdelen objecten gedrag, beslissingen en communicatie?

| Dagen | Pattern / onderdeel | Duur | Inhoud |
|---|---|---:|---|
| 44–46 | Strategy | 3 | Uitwisselbare algoritmen, selectie en testbaarheid |
| 47–50 | Observer | 4 | Registreren/afmelden, events, notificatiegedrag, wijzigingen tijdens iteratie |
| 51–54 | Command | 4 | Acties als objecten, wachtrijen, undo en ontvangers |
| 55–59 | State | 5 | Toestandafhankelijk gedrag, overgangen, tests, vergelijking met enum en Strategy |
| 60–62 | Template Method | 3 | Algoritmeskelet en variabele stappen; verschil met Strategy |
| 63–66 | Chain of Responsibility | 4 | Handlerketens, stop-/doorgaanregels, foutscenario's |
| 67–68 | Iterator | 2 | Collecties doorlopen zonder interne details vrij te geven |
| 69–72 | Mediator | 4 | Interacties tussen objecten centraliseren en koppeling reduceren |
| 73–75 | Memento | 3 | Snapshotten en herstellen van toestand; encapsulation |
| 76–80 | Visitor | 5 | Nieuwe operaties op objectstructuren, double dispatch, trade-offs |
| 81–85 | Interpreter | 5 | Eenvoudige grammatica, expressies en evaluatie |
| 86–89 | Categorie-eindopdracht | 4 | Behavioral patterns kiezen, combineren, testen en vergelijken |

**Resultaat:** herkennen wanneer gedrag via bijvoorbeeld Strategy, Observer, Command of State moet worden gemodelleerd.

### Fase 4 – Integratie-eindproject (oefendagen 90–94)

We bouwen een kleine **dienstverzoekenapplicatie** als oefencontext, zonder vooraf te vertellen welke patterns vereist zijn.

| Dag | Opdracht |
|---|---|
| 90 | Requirements analyseren en geschikte patterns selecteren |
| 91 | Objectcreatie en domeinstructuur implementeren |
| 92 | Gedrag, toestandsovergangen en notificaties implementeren |
| 93 | Unit tests, randgevallen en refactoring |
| 94 | Architectuurreview en ontwerpkeuzes beargumenteren |

## 4. Aanpak per pattern

Een pattern doorloopt doorgaans deze stappen, verdeeld over twee tot vijf dagen afhankelijk van de moeilijkheid:

1. **Begrijpen:** welk concreet probleem lossen we op? Wat gaat er mis met een naïeve oplossing?
2. **Implementeren:** zelf de kernrollen en samenwerking bouwen op basis van startcode.
3. **Verdiepen:** een wijziging in requirements, extra variant, randgeval of test toevoegen.
4. **Toepassen:** het pattern in een realistischer situatie gebruiken.
5. **Vergelijken:** alternatieven, beperkingen, SOLID-principes en overengineering bespreken.

Niet iedere stap hoeft een aparte dag te zijn. Bij relatief eenvoudige patterns combineren we stappen.

### Vast format voor een dagelijkse oefening

- **Titel, categorie, pattern en oefendag**
- **Leerdoel** en korte probleemomschrijving
- **Startcode** met package en duidelijke TODO's
- **Opdracht en acceptatiecriteria**
- **Verwachte uitvoer** en/of testgedrag
- **Twee of drie denkvragen**
- **Geen volledige oplossing vooraf**
- **Review na inzending:** wat klopt, wat ontbreekt, waarom, en een kleine vervolgvariant

## 5. Voorgestelde projectstructuur

```text
java-design-patterns/
├── pom.xml
├── README.md
├── docs/
│   └── roadmap.md
└── src/
    ├── main/java/nl/jase/patterns/
    │   ├── creational/
    │   │   ├── factorymethod/
    │   │   │   ├── dag01/
    │   │   │   ├── dag02/
    │   │   │   └── dag03/
    │   │   ├── abstractfactory/
    │   │   ├── builder/
    │   │   ├── prototype/
    │   │   └── singleton/
    │   ├── structural/
    │   │   ├── adapter/
    │   │   ├── bridge/
    │   │   ├── composite/
    │   │   ├── decorator/
    │   │   ├── facade/
    │   │   ├── flyweight/
    │   │   └── proxy/
    │   └── behavioral/
    │       ├── strategy/
    │       ├── observer/
    │       ├── command/
    │       ├── state/
    │       └── ...
    └── test/java/nl/jase/patterns/
        ├── creational/
        ├── structural/
        └── behavioral/
```

De mappen voor een pattern worden aangevuld wanneer we dat pattern bereiken. Een vervolgdag mag voortbouwen op bestaande code; een nieuw package is niet verplicht als dat geen leerwaarde heeft.

## 6. Criteria voor afronding van een pattern

Een pattern is pas *voldoende beheerst* wanneer ik:

- [ ] Het probleem kan uitleggen waarvoor het pattern bedoeld is.
- [ ] De rollen en verantwoordelijkheden kan benoemen.
- [ ] Zonder volledige voorbeeldoplossing een werkende Java-implementatie kan maken.
- [ ] De kern en relevante foutgevallen kan testen.
- [ ] De voordelen, nadelen en trade-offs kan uitleggen.
- [ ] Weet wanneer een eenvoudige oplossing beter is dan het pattern.

De categorie-eindopdrachten testen vooral het **zelfstandig herkennen en kiezen** van een pattern.

## 7. Voortgang bijhouden

| Onderdeel | Gepland | Afgerond |
|---|---:|---:|
| Creational | 17 | 0 |
| Structural | 26 | 0 |
| Behavioral | 46 | 0 |
| Integratie-eindproject | 5 | 0 |
| **Totaal** | **94** | **0** |

Werk deze tabel na iedere afgeronde oefening bij. Eventueel kunnen we per pattern in het README-bestand noteren welke inzichten, valkuilen en testcases belangrijk waren.

## 8. Start en planning aanpassen

- **Voorgestelde start:** maandag 16 november 2026, met **Factory Method – dag 1**.
- **Frequentie:** één oefening op werkdagen, bij voorkeur om 12:00 uur.
- **Flexibiliteit:** uitloop en extra verdieping hebben voorrang op het oorspronkelijke dagnummer.
- **Bestaande oefenreeks:** blijft gescheiden van dit nieuwe project; een bestaande dagelijkse herinnering of taak wordt niet automatisch door dit document aangepast.

**Leidraad:** eerst begrijpen, daarna implementeren, vervolgens toepassen en pas dan doorgaan.
