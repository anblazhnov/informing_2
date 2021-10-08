package ru.iflex.esb.informing.ws;

import io.swagger.v3.oas.annotations.Parameter;
import ru.iflex.esb.informing.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public interface RestApi {
    @POST
    @Path("/sendEvent")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response sendEvent(@Parameter(required = true) SendEventRequest request);

    @POST
    @Path("/sendMessage")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response sendMessage(@Parameter(required = true) SendMessageRequest request);

    @GET
    @Path("/getEventParameters")
    @Produces({"application/json"})
    Response getEventParameters(String eventTypeId);

    @POST
    @Path("/getMessageList")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response getMessageList(@Parameter(required = true) GetMessageListRequest request);

    @GET
    @Path("/getAttachment")
    @Produces({"application/json"})
    Response getAttachment(@Parameter(required = true) String attachmentId);

    @POST
    @Path("/getMessageStatus")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response getMessageStatus(@Parameter(required = true) GetMessageStatusRequest request);

    @POST
    @Path("/markMessageRead")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response markMessageRead(@Parameter(required = true) MarkMessageReadRequest request);

    @POST
    @Path("/markMessageImportant")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response markMessageImportant(@Parameter(required = true) MarkMessageImportantRequest request);

    @POST
    @Path("/markMessageDeleted")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response markMessageDeleted(@Parameter(required = true) MarkMessageDeletedRequest request);

    @POST
    @Path("/getAlarmMessage")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response getAlarmMessage(@Parameter(required = true) GetAlarmMessageRequest request);

    @POST
    @Path("/getTemplates")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response getTemplates(@Parameter(required = true) GetTemplatesRequest request);

    @GET
    @Path("/getGroups")
    @Produces({"application/json"})
    Response getGroups(SubjectType subjectTypeId);

    @POST
    @Path("/sendMessageByTemplate")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response sendMessageByTemplate(@Parameter(required = true) SendMessageByTemplateRequest request);

    @POST
    @Path("/sendDirectEvent")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response sendDirectEvent(@Parameter(required = true) SendDirectEventRequest request);

    @POST
    @Path("/getMessageCount")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Response getMessageCount(@Parameter(required = true) GetMessageCountRequest request);
}
