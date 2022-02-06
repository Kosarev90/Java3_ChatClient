package ru.titov.client.service;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChatHistory implements AutoCloseable{

    private static final String FAIL_NAME_PATTERN = "./history/history_%s.txt";

    private final String username;
    private File historyFile;
    private PrintWriter printWriter;

    public ChatHistory(String username) {
        this.username = username;
    }

    public void init(){
        try {
            historyFile = createHistoryFile();
            this.printWriter = new PrintWriter(new BufferedWriter(new FileWriter(historyFile, StandardCharsets.UTF_8, true)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File createHistoryFile() throws IOException {
       String filePath = String.format(FAIL_NAME_PATTERN, username);
       File file = new File(filePath);
       if(!file.exists()){
           file.getParentFile().mkdir();
           file.createNewFile();
       }
       return file;
    }

    public void appendText(String text){
    printWriter.print(text);
    printWriter.flush();
    }

    @Override
    public void close()  {
        if(printWriter != null){
            printWriter.close();
        }
    }
    public String loadLastRows(int rowNumber){
        try (RandomAccessFile raf = new RandomAccessFile(historyFile, "r")){
        long pointer;
        int count = 0;

        for (pointer = raf.length() - 1; pointer >0; pointer--){
            raf.seek(pointer);

            if (raf.read() == '\n'){
                count++;
            }
            if (count == rowNumber){
                break;
            }
        }
        if (pointer>= 0){
            raf.seek(pointer);
        }

        byte[] resultData = new byte[(int)(raf.length() - raf.getFilePointer())];
        raf.read(resultData);
        return new String(resultData, StandardCharsets.UTF_8);

        }catch (IOException e){
        e.printStackTrace();
        }
        return " ";
    }
}
