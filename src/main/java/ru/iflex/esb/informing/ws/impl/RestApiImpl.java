package ru.iflex.esb.informing.ws.impl;

import ru.iflex.esb.informing.model.*;
import ru.iflex.esb.informing.ws.RestApi;

import javax.ws.rs.core.Response;

public class RestApiImpl implements RestApi {
    public Response sendEvent(SendEventRequest request) {
        return null;
    }

    @Override
    public Response sendMessage(SendMessageRequest request) {
        return null;
    }

    @Override
    public Response getEventParameters(String eventTypeId) {
        return null;
    }

    @Override
    public Response getMessageList(GetMessageListRequest request) {
        return null;
    }

    @Override
    public Response getAttachment(String attachmentId) {
        return null;
    }

    @Override
    public Response getMessageStatus(GetMessageStatusRequest request) {
        return null;
    }

    @Override
    public Response markMessageRead(MarkMessageReadRequest request) {
        return null;
    }

    @Override
    public Response markMessageImportant(MarkMessageImportantRequest request) {
        return null;
    }

    @Override
    public Response markMessageDeleted(MarkMessageDeletedRequest request) {
        return null;
    }

    @Override
    public Response getAlarmMessage(GetAlarmMessageRequest request) {
        return null;
    }

    @Override
    public Response getTemplates(GetTemplatesRequest request) {
        return null;
    }

    @Override
    public Response getGroups(SubjectType subjectTypeId) {
        return null;
    }

    @Override
    public Response sendMessageByTemplate(SendMessageByTemplateRequest request) {
        return null;
    }

    @Override
    public Response sendDirectEvent(SendDirectEventRequest request) {
        return null;
    }

    @Override
    public Response getMessageCount(GetMessageCountRequest request) {
        return null;
    }
}
