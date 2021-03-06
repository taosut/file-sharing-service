package com.demo.uploads.demo.entity.dto;

import com.demo.uploads.demo.entity.repository.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FileEntityListDto {

    private List<FileEntityDto> owned;

    private List<FileEntityDto> shared;
}
