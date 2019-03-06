package com.kwgproperty.server.dataworker;

import com.kwgproperty.server.dataworker.util.HttpUtil;
import com.kwgproperty.server.dataworker.util.StringUtil;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jclang on 2017/9/18.
 */
@ControllerAdvice
@ResponseBody
public class GlobalDefaultExceptionHandler {

    protected final static Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> defaultErrorHandler(HttpServletRequest req, Exception ex) {
        // 全局异常处理
        logger.error(ex.getMessage(), ex);
        try {
            HttpUtil.postAsyncHeader("http://jclang.leanapp.cn/bug",
                    RequestBody.create(MediaType.parse("application/json"),
                            new JSONObject()
                                    .put("path", "dataworker||" + req.getRequestURI())
                                    .put("content", StringUtil.getErrorInfoFromException(ex))
                                    .toString()));
        } catch (JSONException e) {
            logger.error(e.getMessage());
        }
        if (ex instanceof HttpMessageNotReadableException || ex instanceof MethodArgumentNotValidException || ex instanceof NullPointerException) {
            return new ResponseEntity(null, HttpStatus.OK);
        } else if (ex instanceof HttpMediaTypeNotAcceptableException) {
            return new ResponseEntity("error", HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
