import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextEditor implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file ,edit;
    JMenuItem newFile,openFile,saveFile;
    JMenuItem cut, copy, paste,selectAll,close;
    JTextArea textArea;
    TextEditor(){

        // initialisinf this frame
        frame=new JFrame();
        // initialize menu
        menuBar=new JMenuBar();


        file=new JMenu("File");
        edit=new JMenu(" Edit");


        menuBar.add(file);
        menuBar.add(edit);

    //initialize text area
        textArea=new JTextArea();
        // initial new iteams
        newFile = new JMenuItem("New file");
        openFile= new JMenuItem("Open file");
        saveFile=new JMenuItem("Save file");

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);


        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        selectAll=new JMenuItem("Select All");
        close=new JMenuItem("Close");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        close.addActionListener(this);


        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(close);



        frame.add(textArea);
        frame.setJMenuBar(menuBar);
        frame.setBounds(0,0,400,400);
        frame.setVisible(true);
        frame.setTitle("Text Editor");
    }
    public static void main(String args[]){
        TextEditor textEditor=new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==newFile){

        }
        if(e.getSource()==saveFile){

        }
        if(e.getSource()==openFile){

        }
        if(e.getSource()==cut){
         textArea.cut();
        }
        if(e.getSource()==copy)

        if(e.getSource()==paste){
        textArea.paste();
        }
        if(e.getSource()==selectAll){
        textArea.selectAll();
        }
        if(e.getSource()==close){
          System.exit(0);
        }
    }
}