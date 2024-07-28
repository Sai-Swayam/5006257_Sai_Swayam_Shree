import javax.print.Doc;

interface Document {
    void show();
}

class WordDocument implements Document {
    @Override
    public void show() {
        System.out.println("Word Document");
    }
}

class PdfDocument implements Document {
    @Override
    public void show() {
        System.out.println("Pdf Document");
    }
}

class ExcelDocument implements Document {
    @Override
    public void show() {
        System.out.println("Excel Document");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocument = wordDocumentFactory.createDocument();
        wordDocument.show();

        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfDocumentFactory.createDocument();
        pdfDocument.show();

        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocumentFactory.createDocument();
        excelDocument.show();
    }
}