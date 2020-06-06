package com.genSci.tools.DataQuizHelper;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class PrimaryController {
	@FXML
	TextArea srcArea;
	@FXML
	TextArea codeArea;
	@FXML
	TextArea log;
	@FXML
	private void quitAction() {
		System.exit(0);
	}
	@FXML
	private void clearSrcArea() {
		srcArea.clear();
	}
	@FXML
	private void clearCodeArea() {
		codeArea.clear();
	}
	@FXML
	private void copyToClipboard() {
		final Clipboard clipboard = Clipboard.getSystemClipboard();
		final ClipboardContent content = new ClipboardContent();
		content.putString(codeArea.getText());
		clipboard.setContent(content);
	}
	@FXML
	private void transAction() {
		if(srcArea.getText() == null) {
			return;
		}
		String doc = srcArea.getText();
		String[] questionArray = doc.split("\n");
		//
//		String s = questionArray[0];
//		log.appendText(s+"\n");
		codeArea.appendText("<p>\n<ol>\n");
		for(String target:questionArray) {
			String[] targetArray = target.split("\t");
//			for(String s:targetArray) {
//				log.appendText(s+"\n");
//			}
			String outStr = "";
			outStr ="<li>"+ targetArray[0]+"の値は"+"{1:NM:="+targetArray[1]+"}である。</li>\n";
			codeArea.appendText(outStr);	
		}
		codeArea.appendText("</ol>\n</p>\n");
	}
	@FXML
	private void openAction() {
		
	}
    
}
