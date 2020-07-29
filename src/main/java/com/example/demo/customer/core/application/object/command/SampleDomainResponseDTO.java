package com.example.demo.customer.core.application.object.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SampleDomainResponseDTO {
 
    protected long id; 
    private String sampleData1;
    private String sampleData2;
    
}