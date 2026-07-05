# Lab04 — App Híbrida Compose + XML

Aplicación Android educativa que combina **Jetpack Compose** (pantalla de bienvenida) y **vistas XML clásicas** (SecondActivity con ConstraintLayout) con tema **Material3** claro/oscuro.

## Descripción

App híbrida que demuestra la coexistencia de:
- **Jetpack Compose** para la pantalla principal con saludo personalizado
- **XML con ConstraintLayout** para la segunda actividad
- Tema **Material3** con soporte claro/oscuro
- Navegación entre actividades Compose y XML

## Tecnologías

- **Kotlin**
- **Jetpack Compose**
- **Material3**
- **XML Layouts** (ConstraintLayout)
- **AppCompatActivity**
- **Gradle Kotlin DSL**

## Estructura

```
app/src/main/java/com/example/lab04/
├── ui/theme/           → Tema Material3
│   └── screens/        → Pantalla Compose (Greeting)
├── MainActivity.kt     → Entry point Compose
└── SecondActivity.kt   → Actividad con vista XML
```

## Cómo ejecutar

Abrir en Android Studio y ejecutar en un dispositivo/emulador con API 24+.
