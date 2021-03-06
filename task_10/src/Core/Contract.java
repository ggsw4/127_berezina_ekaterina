package core;

import java.util.HashMap;

public class Contract {
    private String date;
    private HashMap<Integer, PaymentDocs> PaymentDocuments;

    public Contract(String date) {
        this.date = date;
        PaymentDocuments = new HashMap<>();
        }
        public void registerPaymentDocs(int sum, int number, TypeOfPaymentDoc type, String date) {
            PaymentDocuments.put(number, new PaymentDocs(sum, type, date));
        }

        public int getPaymentDocsCount() {
            return PaymentDocuments.size();
        }

        public HashMap<Integer, PaymentDocs> getPayDocs() {
            return PaymentDocuments;
        }

    }
