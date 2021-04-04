package com.wllfengshu.car.rest;

import com.wllfengshu.car.model.entity.TbCustomerEntity;
import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.service.TbCustomerService;
import io.swagger.annotations.*;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Slf4j
@Api(value = "tbCustomer Rest",tags = "tbCustomer管理")
@RestController
@RequiredArgsConstructor
@RequestMapping("/tbCustomers")
public class TbCustomerRest {

    @NonNull
    private TbCustomerService tbCustomerService;

    @ApiOperation(value = "添加", httpMethod = "POST")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCustomer", method = RequestMethod.POST)
    public Map<String, Object> insert(
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody TbCustomerEntity entity) throws CustomException {
        log.info("insert entity:{}", entity);
        return tbCustomerService.insert(entity, sessionId);
    }

    @ApiOperation(value = "删除", httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID",example = "0", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCustomer/{id}", method = RequestMethod.DELETE)
    public Map<String, Object> delete(
            @PathVariable("id") Integer id,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        log.info("delete id:{}", id);
        return tbCustomerService.delete(id, sessionId);
    }

    @ApiOperation(value = "修改", httpMethod = "PUT")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCustomer", method = RequestMethod.PUT)
    public Map<String, Object> update(
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody TbCustomerEntity entity) throws CustomException {
        log.info("update entity:{}", entity);
        return tbCustomerService.update(entity, sessionId);
    }

    @ApiOperation(value = "查询", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", example = "0", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCustomer/{id}", method = RequestMethod.GET)
    public Map<String, Object> select(
            @PathVariable("id") Integer id,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        log.info("select id:{}", id);
        return tbCustomerService.select(id, sessionId);
    }

    @ApiOperation(value = "查询列表", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "customerName", value = "客户姓名", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "customerNickname", value = "客户昵称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "phone", value = "电话", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "otherContacts", value = "其他联系人", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "licensePlate", value = "车牌", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "页数(从0开始，默认0)", example = "0", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量(默认10)", example = "10", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<String, Object> selects(
            @RequestParam(value = "pageNo", required = false, defaultValue = "0") Integer pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        Map<String, Object> params = new HashMap<>();
        params.put("pageNo", pageNo);
        params.put("pageSize", pageSize);
        log.info("selects params{}", params);
        return tbCustomerService.selects(params, sessionId);
    }
}
