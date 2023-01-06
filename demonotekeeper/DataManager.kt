package com.tongai.demonotekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
        var note = NoteInfo(courses["android_intents"] as CourseInfo,
            "Dynamic intent resolution",
            "Wow intents allow components to be resolved at runtime")
        notes.add(note)

        note = NoteInfo(courses["android_intents"] as CourseInfo,
            "Deleting intents",
            "PendingIntents are powerful, they delegate much more than just a component invocation")
        notes.add(note)

        note = NoteInfo(courses["android_async"] as CourseInfo,
            "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread")
        notes.add(note)

        note = NoteInfo(courses["java_lang"] as CourseInfo,
            "Parameters",
            "Leverage variable-length parameters list")
        notes.add(note)

        note = NoteInfo(courses["java_lang"] as CourseInfo,
            "Anonymous classes",
            "Anonymous classes simplify implementing one use type")
        notes.add(note)

        note = NoteInfo(courses["java_core"] as CourseInfo,
            "Compiler options",
            "The .jar options isn't compatible with the -cp option")
        notes.add(note)

        note = NoteInfo(courses["java_core"] as CourseInfo,
            "Serialization",
            "Remember to include Serial/VersionUID to assure version compatibility")
        notes.add(note)
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android: programming with intents")
        courses[course.courseId] = course

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java fundamentals: The Java Core")
        courses.set(course.courseId, course)
    }
}