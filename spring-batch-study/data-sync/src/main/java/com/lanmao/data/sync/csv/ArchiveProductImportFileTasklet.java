package com.lanmao.data.sync.csv;

import org.apache.commons.io.FileUtils;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.File;

/**
 * A tasklet that archives the input file
 */
public class ArchiveProductImportFileTasklet implements Tasklet {
    private String inputFile;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        // Make our destination directory and copy our input file to it
        //File archiveDir = new File("archive");
        //FileUtils.forceMkdir(archiveDir);
        //FileUtils.copyFileToDirectory(new File(inputFile), archiveDir);
        // We're done...
        System.out.println(inputFile);
        return RepeatStatus.FINISHED;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }
}