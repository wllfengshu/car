package com.wllfengshu.car.rest;

import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.model.dto.LoginDTO;
import com.wllfengshu.car.model.dto.RepwdDTO;
import com.wllfengshu.car.model.entity.TbUserEntity;
import com.wllfengshu.car.service.TbUserService;
import io.swagger.annotations.*;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Api(value = "tbUser Rest",tags = "tbUser管理")
@RestController
@RequiredArgsConstructor
@RequestMapping("/tbUsers")
public class TbUserRest {

    @NonNull
    private TbUserService tbUserService;

    @ApiOperation(value = "添加", httpMethod = "POST")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbUser", method = RequestMethod.POST)
    public Map<String, Object> insert(
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody TbUserEntity entity) throws CustomException {
        log.info("insert entity:{}", entity);
        return tbUserService.insert(entity, sessionId);
    }

    @ApiOperation(value = "删除", httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID",example = "0", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbUser/{id}", method = RequestMethod.DELETE)
    public Map<String, Object> delete(
            @PathVariable("id") Integer id,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        log.info("delete id:{}", id);
        return tbUserService.delete(id, sessionId);
    }

    @ApiOperation(value = "修改", httpMethod = "PUT")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbUser", method = RequestMethod.PUT)
    public Map<String, Object> update(
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody TbUserEntity entity) throws CustomException {
        log.info("update entity:{}", entity);
        return tbUserService.update(entity, sessionId);
    }

    @ApiOperation(value = "查询", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", example = "0", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "IllegalParam")
    })
    @RequestMapping(value = "/tbUser/{id}", method = RequestMethod.GET)
    public Map<String, Object> select(
            @PathVariable("id") Integer id,
            @RequestHeader(value = "sessionId") String sessionId,
            HttpServletRequest request,
            HttpServletResponse response) throws CustomException {
        log.info("select id:{}", id);
        return tbUserService.select(id, sessionId);
    }

    @ApiOperation(value = "查询列表", httpMethod = "GET")
    @ApiImplicitParams({
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
        log.info("selects params{}", params);
        return tbUserService.selects(params, pageNo, pageSize, sessionId);
    }

    @ApiOperation(value = "登陆", httpMethod = "POST")
    @PostMapping("/tbUser/login")
    public Map<String, Object> login(@RequestBody LoginDTO loginDTO) throws CustomException {
        log.info("login loginName:{}", loginDTO.getLoginName());
        return tbUserService.login(loginDTO);
    }

    @ApiOperation(value = "登出", httpMethod = "POST")
    @ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
    @PostMapping("/tbUser/logout")
    public Map<String, Object> logout(@RequestHeader(value = "sessionId") String sessionId) throws CustomException {
        log.info("logout sessionId:{}", sessionId);
        return tbUserService.logout(sessionId);
    }

    @ApiOperation(value = "修改密码", httpMethod = "POST")
    @PostMapping("/tbUser/repwd")
    public Map<String, Object> repwd(@RequestHeader(value = "sessionId") String sessionId,
                                     @RequestBody RepwdDTO repwdDTO) throws CustomException {
        log.info("repwd repwdDTO:{}", repwdDTO.getLoginName());
        return tbUserService.repwd(repwdDTO, sessionId);
    }
}
