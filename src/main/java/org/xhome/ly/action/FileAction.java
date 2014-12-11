package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.FileService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by fenjuly
 * Date: 14/12/1
 * Time: 下午1:11
 */
@Controller
public class FileAction {

    @Autowired
    private FileService fileService;



    @ResponseBody
    @RequestMapping(value="/api/file",method = RequestMethod.POST)
    public Object uploadFile (HttpServletRequest request, @RequestParam("file") MultipartFile multipartFile,
                              @RequestParam("interrogationRecordId") int interrogationRecordId) {
        int status = Status.ERROR;
        if (!multipartFile.isEmpty()) {
            try {
                org.xhome.ly.bean.File file = new org.xhome.ly.bean.File();
                file.setInterrogationRecordId(interrogationRecordId);
                file.setName(multipartFile.getOriginalFilename());
               // file.setUrl(filePath);
                status = fileService.add(file);
                String rename =  interrogationRecordId + "_" + file.getId() + "_" + "attachment" ;
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("/") + "/upload/"
                        + rename;

                // 转存文件
                File file_temp = new File(filePath);
                if(!file_temp.exists()){
                    file_temp.mkdirs();
                }
                multipartFile.transferTo(file_temp);

                file.setUrl(filePath);
                file.setName(rename);
                fileService.update(file);
//                System.out.println("FileName:==" + multipartFile.getOriginalFilename());
//                System.out.println("SavePath:=="+filePath);
//                System.out.println("RecordId:=="+interrogationRecordId);
                return new Response(status,rename);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new Response(status);
    }

}
