/*
 * This file is generated by jOOQ.
 */
package ru.tinkoff.edu.java.scrapper.domain.jooq.tables.records;


import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.StackoverflowQuestions;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StackoverflowQuestionsRecord extends UpdatableRecordImpl<StackoverflowQuestionsRecord> implements Record5<UUID, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.stackoverflow_questions.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.stackoverflow_questions.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.stackoverflow_questions.question_id</code>.
     */
    public void setQuestionId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.stackoverflow_questions.question_id</code>.
     */
    public Long getQuestionId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.stackoverflow_questions.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.stackoverflow_questions.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>public.stackoverflow_questions.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.stackoverflow_questions.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for
     * <code>public.stackoverflow_questions.answers_updated_at</code>.
     */
    public void setAnswersUpdatedAt(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>public.stackoverflow_questions.answers_updated_at</code>.
     */
    public OffsetDateTime getAnswersUpdatedAt() {
        return (OffsetDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UUID, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return StackoverflowQuestions.STACKOVERFLOW_QUESTIONS.ID;
    }

    @Override
    public Field<Long> field2() {
        return StackoverflowQuestions.STACKOVERFLOW_QUESTIONS.QUESTION_ID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return StackoverflowQuestions.STACKOVERFLOW_QUESTIONS.CREATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return StackoverflowQuestions.STACKOVERFLOW_QUESTIONS.UPDATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return StackoverflowQuestions.STACKOVERFLOW_QUESTIONS.ANSWERS_UPDATED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getQuestionId();
    }

    @Override
    public OffsetDateTime component3() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime component4() {
        return getUpdatedAt();
    }

    @Override
    public OffsetDateTime component5() {
        return getAnswersUpdatedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getQuestionId();
    }

    @Override
    public OffsetDateTime value3() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime value4() {
        return getUpdatedAt();
    }

    @Override
    public OffsetDateTime value5() {
        return getAnswersUpdatedAt();
    }

    @Override
    public StackoverflowQuestionsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public StackoverflowQuestionsRecord value2(Long value) {
        setQuestionId(value);
        return this;
    }

    @Override
    public StackoverflowQuestionsRecord value3(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public StackoverflowQuestionsRecord value4(OffsetDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public StackoverflowQuestionsRecord value5(OffsetDateTime value) {
        setAnswersUpdatedAt(value);
        return this;
    }

    @Override
    public StackoverflowQuestionsRecord values(UUID value1, Long value2, OffsetDateTime value3, OffsetDateTime value4, OffsetDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StackoverflowQuestionsRecord
     */
    public StackoverflowQuestionsRecord() {
        super(StackoverflowQuestions.STACKOVERFLOW_QUESTIONS);
    }

    /**
     * Create a detached, initialised StackoverflowQuestionsRecord
     */
    public StackoverflowQuestionsRecord(UUID id, Long questionId, OffsetDateTime createdAt, OffsetDateTime updatedAt, OffsetDateTime answersUpdatedAt) {
        super(StackoverflowQuestions.STACKOVERFLOW_QUESTIONS);

        setId(id);
        setQuestionId(questionId);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setAnswersUpdatedAt(answersUpdatedAt);
    }
}
