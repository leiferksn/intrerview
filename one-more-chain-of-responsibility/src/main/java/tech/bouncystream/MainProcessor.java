package tech.bouncystream;

import java.util.HashMap;
import java.util.Map;

public class MainProcessor extends CompositeDocumentProcessor<ProcessType> {


    @Override
    public Document process(Document doc) {
        doStuff();
        nextProcessor(doc.properties().processType());
        return this.documentProcessor.process(doc);
    }

    @Override
    public String toString() {
        return "Main Processor";
    }
}
