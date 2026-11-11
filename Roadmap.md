# Java 25+ Design Patterns – Leerroadmap

## Doel

Een nieuw, zelfstandig Java-project waarin alle **23 klassieke Gang of Four (GoF) design patterns** per categorie worden geleerd en geoefend. De nadruk ligt op **begrijpen, zelf implementeren, testen, vergelijken en herkennen wanneer een pattern wel of niet passend is**.

## Uitgangspunten

- **Java 25**, zonder preview-features.
- **Maven** voor de build en **JUnit 5** voor tests; Mockito alleen wanneer nuttig.
- **Maandag t/m vrijdag** standaard één oefening rond **12:00 uur**.
- Per oefening ongeveer **10–15 minuten**; complexere onderwerpen kunnen meerdere dagen vragen.
- **Flexibel tempo:** de gebruiker kan **op elk moment om de volgende oefening vragen**, ook wanneer de volgende geplande dag nog niet is aangebroken of dezelfde dag al een oefening is afgerond.
- De voortgang volgt de **daadwerkelijk afgeronde oefeningen**, niet strikt de kalender. Een vroeg afgeronde oefening hoeft later niet opnieuw te worden aangeboden.
- **Eén oefening tegelijk**, met leerdoel, startcode, verwachte uitvoer en denkvragen; **geen oplossing vooraf**.
- Na het insturen: code review, uitleg van verbeterpunten en een kleine vervolgvariant.
- Eerst beheersing, dan doorgaan. Bij onduidelijkheid wordt een extra oefening toegevoegd.

**Totale basisplanning:** 94 oefendagen, circa **19 werkweken** bij vijf dagen per week; met ruimte voor uitloop **ongeveer 20 weken**. Dit is een richtlijn en geen deadline.

## Vaste leeropbouw per pattern

1. **Begrijpen:** concreet probleem, doel, rollen en samenwerking van objecten.
2. **Implementeren:** zelfstandig bouwen vanuit startcode.
3. **Verdiepen:** uitbreiding, edge cases, foutafhandeling of tests.
4. **Toepassen:** eigen ontwerpkeuzes maken in een praktijksituatie.
5. **Vergelijken:** alternatieven, trade-offs en wanneer het pattern overbodig is.

Eenvoudige patterns krijgen minder oefendagen dan complexe. Niet iedere fase hoeft bij ieder pattern een afzonderlijke dag te zijn.

## Fase 1 – Creational Patterns (17 oefendagen)

*Hoofdvraag: hoe worden objecten aangemaakt en samengesteld?*

| Pattern / opdracht | Dagen | Leerdoelen |
|---|---:|---|
| Factory Method | 3 | Objectcreatie van verwerkingslogica scheiden; subklassen kiezen concrete producten |
| Abstract Factory | 4 | Families van samenhangende producten maken en uitbreiden |
| Builder | 3 | Fluent API, immutable objecten, defaults en validatie |
| Prototype | 2 | Kopiëren, shallow copy en deep copy |
| Singleton | 2 | Unieke instantie per scope, thread safety, testbaarheid en alternatieven |
| Categorie-eindopdracht | 3 | Zelf een passend creational pattern kiezen en onderbouwen |
| **Totaal** | **17** | |

**Voorbeeld Abstract Factory (4 dagen):** probleem verkennen en vergelijken met Factory Method; factory en producten implementeren; een tweede productfamilie toevoegen; tests en vergelijking met alternatieven.

## Fase 2 – Structural Patterns (26 oefendagen)

*Hoofdvraag: hoe laat je objecten samenwerken en hoe voeg je structuur of gedrag toe?*

| Pattern / opdracht | Dagen | Leerdoelen |
|---|---:|---|
| Adapter | 3 | Interfaces vertalen en externe clients integreren |
| Bridge | 4 | Abstractie en implementatie onafhankelijk laten variëren |
| Composite | 4 | Boomstructuren, recursie en uniforme operaties |
| Decorator | 3 | Gedrag combineren, zoals logging en timing |
| Facade | 2 | Een eenvoudige ingang voor een complex subsysteem bieden |
| Flyweight | 4 | Gedeelde toestand en geheugenefficiëntie begrijpen |
| Proxy | 3 | Toegang, lazy loading en caching afhandelen |
| Categorie-eindopdracht | 3 | Structural patterns vergelijken en combineren |
| **Totaal** | **26** | |

**Extra aandacht:** Adapter, Decorator en Proxy kunnen vergelijkbare composition-code gebruiken, maar lossen verschillende problemen op.

## Fase 3 – Behavioral Patterns (46 oefendagen)

*Hoofdvraag: hoe verdelen objecten gedrag, acties en communicatie?*

| Pattern / opdracht | Dagen | Leerdoelen |
|---|---:|---|
| Strategy | 3 | Algoritmen uitwisselbaar maken |
| Observer | 4 | Observers beheren, events en veilige notificatie |
| Command | 4 | Opdrachten als objecten, queue en undo |
| State | 5 | Toestandafhankelijk gedrag en geldige transities |
| Template Method | 3 | Vaste algoritmestructuur en variabele stappen |
| Chain of Responsibility | 4 | Verzoeken door een keten van handlers sturen |
| Iterator | 2 | Collecties doorlopen zonder interne details bloot te leggen |
| Mediator | 4 | Communicatie tussen samenwerkende objecten centraliseren |
| Memento | 3 | Toestand opslaan en herstellen |
| Visitor | 5 | Nieuwe bewerkingen toevoegen aan objectstructuren |
| Interpreter | 5 | Een kleine grammatica en expressies interpreteren |
| Categorie-eindopdracht | 4 | Verschillende behavioral patterns zelfstandig toepassen |
| **Totaal** | **46** | |

**Voorbeeld State (5 dagen):** lange conditionele logica onderzoeken; state-interface en concrete states bouwen; transities en foutgevallen; unit tests; vergelijken met Strategy en een eenvoudige enum.

## Fase 4 – Integratie en eindproject (5 oefendagen)

Een kleine **dienstverzoekenapplicatie** waarin patterns uit meerdere categorieën gecombineerd worden. Het juiste pattern wordt niet vooraf voorgeschreven.

| Dag van deze fase | Opdracht |
|---|---|
| 1 (globaal dag 90) | Requirements analyseren en patterns kiezen |
| 2 (dag 91) | Objectcreatie en domeinstructuur implementeren |
| 3 (dag 92) | Gedrag, statusovergangen en notificaties implementeren |
| 4 (dag 93) | Tests schrijven en ontwerp verbeteren |
| 5 (dag 94) | Refactoring, review en ontwerpkeuzes onderbouwen |

## Voortgangsoverzicht

| Fase | Oefendagen |
|---|---:|
| Creational | 17 |
| Structural | 26 |
| Behavioral | 46 |
| Eindproject | 5 |
| **Totaal** | **94** |

Een pattern is goed beheerst wanneer je:

- [ ] het probleem kunt uitleggen dat het pattern oplost;
- [ ] de rollen en verantwoordelijkheden herkent;
- [ ] het zelfstandig kunt implementeren;
- [ ] de werking kunt testen;
- [ ] voor- en nadelen kunt benoemen;
- [ ] weet wanneer je het pattern beter niet inzet.

## Voorstel voor projectstructuur

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

De dagen van een pattern mogen voortbouwen op eerdere dagen. Je hoeft niet iedere dag een volledig nieuwe applicatie te maken.

## Werkwijze bij dagelijkse en vervroegde oefeningen

- Op werkdagen is **12:00 uur** het gewenste standaardmoment.
- De volgende oefening mag **altijd eerder op verzoek** worden gegeven, ongeacht datum of tijd.
- Bij een verzoek als *‘Geef mij de volgende oefening’* wordt de **eerstvolgende nog niet afgeronde oefening** aangeboden.
- Bij het insturen van code volgt eerst een review met gerichte verbeterpunten.
- De gebruiker kan ervoor kiezen direct verder te gaan of nog een verdieping te doen.
- De kalenderplanning schuift mee met de feitelijke voortgang; afgeronde oefeningen worden niet opnieuw als nieuwe opdracht ingepland.
- Een geplande dagelijkse taak moet bij daadwerkelijke ingebruikname op deze roadmap worden afgestemd; dit document wijzigt bestaande automatiseringen niet.

## Voorgestelde start

**Maandag 16 november 2026:** Creational → Factory Method → Dag 1. Eerder starten is mogelijk op verzoek.

> Leidraad: begrip gaat vóór tempo; één oefening tegelijk, zonder vooraf de volledige oplossing te tonen.
