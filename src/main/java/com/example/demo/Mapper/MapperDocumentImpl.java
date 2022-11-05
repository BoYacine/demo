package com.example.demo.Mapper;

import com.example.demo.Dto.DocumentRequestDto;
import com.example.demo.Dto.DocumentResponseDto;
import com.example.demo.Entity.Document;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperDocumentImpl implements Mapper<Document, DocumentResponseDto, DocumentRequestDto>{
    @Autowired
    ModelMapper mapper;

    @Override
    public DocumentResponseDto EntityToDto(Document user) {
        DocumentResponseDto documentResponseDto=new DocumentResponseDto();
        mapper.map(user,documentResponseDto);
        return documentResponseDto;
    }

    @Override
    public Document DtoToEntity(DocumentRequestDto userRequestDto) {
        Document document=new Document();
        mapper.map(userRequestDto,document);
        return document;
    }
}
