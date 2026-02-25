package edu.sdsu.cs160l.university.lab6.exam;

/**
 * An observer has method implemented by A subject, which is student in this case
 */
public interface ExamObserver {
    void onResultPublished(String message);
}
