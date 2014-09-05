package org.bahmni.module.referencedata.model.event;

public class ConceptEventFactory {
    static final String CONCEPT_URL = "/openmrs/ws/rest/v1/reference-data/%s/%s";
    public static ConceptOperationEvent sampleEvent() {
        return new SampleEvent(CONCEPT_URL);
    }

    public static ConceptOperationEvent labConceptSetEvent() {
        return new LabConceptSetEvent();
    }
}