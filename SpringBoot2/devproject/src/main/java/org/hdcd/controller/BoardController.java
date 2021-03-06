package org.hdcd.controller;

import org.apache.coyote.Response;
import org.hdcd.dto.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.AssertTrue;

@Controller
@RequestMapping("/board")
public class BoardController {

    private static Logger logger = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping(value = "/get", method = RequestMethod.GET
                    , params = "register")
    public String registerForm() {
        logger.info("registerForm");

        return "board/register";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, params = "register")
    public String register() {
        logger.info("register");

        return "board/list";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET
                    , params = "modify")
    public String modifyForm() {
        logger.info("modifyForm");

        return "board/modify";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST
                    , params = "modify")
    public String modify() {
        logger.info("modify");

        return "board/list";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET
                    , params = "list")
    public String list() {
        logger.info("list");

        return "board/list";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET
                    , params = "read")
    public String read() {
        logger.info("read");

        return "board/read";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET
                    , params = "remove")
    public String removeForm() {
        logger.info("removeForm");

        return "board/remove";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST
                    , params = "remove")
    public String remove() {
        logger.info("remove");

        return "board/list";
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT)
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo
                                        , @RequestBody Board board) {
        logger.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.POST)
    public ResponseEntity<String> modifyDefaultJSON(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        logger.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT
                    , consumes = "application/json")
    public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        logger.info("modifyByJson");

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.POST
                    , consumes = "application/xml")
    public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        logger.info("modifyByXml boardNo : " + boardNo);
        logger.info("modifyByXml board : " + board);

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

}
