# Java Design Patterns

Een leerproject waarin ik de 23 Gang of Four (GoF) design patterns bestudeer en implementeer met **Java 25, Maven en JUnit 5**.

De oefeningen volgen de [94-daagse roadmap](Roadmap.md), verdeeld over drie categorieën:

- **Creational:** objectcreatie.
- **Structural:** structuur en samenstelling van objecten.
- **Behavioral:** gedrag en communicatie tussen objecten.

## Creational Patterns

### Factory Method ✅

**Doel:** objectcreatie scheiden van de algemene verwerkingslogica.

Factory Method definieert een creatiemethode in een Creator, waarbij subklassen bepalen welk concreet Product wordt aangemaakt.

**Vier rollen:**
- Product: gemeenschappelijke interface.
- Concrete Product: specifieke implementatie.
- Creator: definieert de Factory Method en eventueel de algemene workflow.
- Concrete Creator: bepaalt welk Product wordt aangemaakt.

**Belangrijkste SOLID-principes:**
- Open/Closed Principle (OCP).
- Dependency Inversion Principle (DIP).

**Voordelen:** uitbreidbaar, minder koppeling aan concrete implementaties en goed testbaar.

**Nadelen:** extra klassen, overerving en mogelijk onnodige complexiteit.

**Oefeningen:** notificaties, documentexport, betalingen en verzendingen.

**Belangrijkste inzicht:** Factory Method gaat niet om het vermijden van `new`, maar om het delegeren van de keuze welk concreet object wordt aangemaakt.

### Abstract Factory ⏳

Volgende onderdeel: families van samenhangende objecten creëren.

## Tests uitvoeren

```bash
mvn test
```

## Voortgang

**3 van 94 reguliere oefendagen afgerond**, plus 2 extra Factory Method-oefeningen.