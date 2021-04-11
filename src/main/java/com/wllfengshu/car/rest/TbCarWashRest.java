package com.wllfengshu.car.rest;

import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.model.entity.TbCarWashEntity;
import com.wllfengshu.car.service.TbCarWashService;
import io.swagger.annotations.*;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Api(value = "tbCarWash Rest",tags = "tbCarWash管理")
@RestController
@RequiredArgsConstructor
@RequestMapping("/tbCarWashs")
public class TbCarWashRest {

    @NonNull
    private TbCarWashService tbCarWashService;

    @ApiOperation(value = "添加", httpMethod = "POST")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCarWash", method = RequestMethod.POST)
    public Map<String, Object> insert(
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody TbCarWashEntity entity) throws CustomException {
        log.info("insert entity:{}", entity);
        return tbCarWashService.insert(entity, sessionId);
    }

    @ApiOperation(value = "删除", httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID",example = "0", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCarWash/{id}", method = RequestMethod.DELETE)
    public Map<String, Object> delete(
            @PathVariable("id") Integer id,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        log.info("delete id:{}", id);
        return tbCarWashService.delete(id, sessionId);
    }

    @ApiOperation(value = "修改", httpMethod = "PUT")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCarWash", method = RequestMethod.PUT)
    public Map<String, Object> update(
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody TbCarWashEntity entity) throws CustomException {
        log.info("update entity:{}", entity);
        return tbCarWashService.update(entity, sessionId);
    }

    @ApiOperation(value = "查询", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", example = "0", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbCarWash/{id}", method = RequestMethod.GET)
    public Map<String, Object> select(
            @PathVariable("id") Integer id,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        log.info("select id:{}", id);
        return tbCarWashService.select(id, sessionId);
    }

    @ApiOperation(value = "查询列表", httpMethod = "GET")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "beginTime", value = "开始时间(格式:yyyy-MM-dd HH:mm:ss)", required = true, dataType = "date", paramType = "query"),
//            @ApiImplicitParam(name = "endTime", value = "结束时间(格式:yyyy-MM-dd HH:mm:ss)", required = true, dataType = "date", paramType = "query"),
            @ApiImplicitParam(name = "customerName", value = "客户姓名", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "customerNickname", value = "客户昵称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "phone", value = "电话", dataType = "string", paramType = "query"),
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
//            @RequestParam(value = "beginTime") String beginTime,
//            @RequestParam(value = "endTime") String endTime,
            @RequestParam(value = "customerName", required = false) String customerName,
            @RequestParam(value = "customerNickname", required = false) String customerNickname,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "licensePlate", required = false) String licensePlate,
            @RequestParam(value = "pageNo", required = false, defaultValue = "0") Integer pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        Map<String, Object> params = new HashMap<>();
//        params.put("beginTime", beginTime);
//        params.put("endTime", endTime);
        if (StringUtils.isNoneEmpty(customerName)) {
            params.put("customerName", "%" + customerName + "%");
        }
        if (StringUtils.isNoneEmpty(customerNickname)) {
            params.put("customerNickname", "%" + customerNickname + "%");
        }
        if (StringUtils.isNoneEmpty(phone)) {
            params.put("phone", "%" + phone + "%");
        }
        if (StringUtils.isNoneEmpty(licensePlate)) {
            params.put("licensePlate", "%" + licensePlate + "%");
        }
        log.info("selects params{}", params);
        return tbCarWashService.selects(params, pageNo, pageSize, sessionId);
    }
}
