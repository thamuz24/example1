package com.example.database.controller;

import com.example.database.model.Song;
import com.example.database.model.SongForm;
import com.example.database.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("/song")
public class MusicController {
    @Autowired
    protected ISongService songService;

    @GetMapping("")
    public String home(Model model) {
        List<Song> songs = songService.getSongList();
        model.addAttribute("songs", songs);
        return "/home";
    }

    @GetMapping("create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("songForm", new SongForm());
        return modelAndView;
    }

    @Value("${song-upload}")
    public String songUpload;

    @PostMapping("/save")
    public ModelAndView saveSong(@ModelAttribute SongForm songForm) {
        String path = "C:/CodeGym/ky4/ky4Block1/database&orm/database/src/main/resources/mySong";
        MultipartFile multipartFile = songForm.getSong();
        String songName = multipartFile.getOriginalFilename();
        try{
            FileCopyUtils.copy(songForm.getSong().getBytes(), new File( path + "/" + songName));



//            try {
//               InputStream inputstream = new FileInputStream(songUpload +"/" + songName);
//                byte[] buffer = new byte[4096];
//                int bytesread = 0;
//                do {
//                    bytesread = inputstream.read(buffer, 0, buffer.length);
//                    httpservletresponse.getoutputstream().write(buffer, 0, bytesread);
//                } while (bytesread == buffer.length);
//
//                /* some code for set attributes to httpservletresponse */
//            } finally {
//                if (inputstream != null)
//                    inputstream.close();
//            }
//



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Song song = new Song(songForm.getName(),songForm.getAuthor(),songForm.getType(),songName);
        songService.save(song);
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("songs", songService.getSongList());
        modelAndView.addObject("message", "Song created successfully!");
        return modelAndView;
    }

}
