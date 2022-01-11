package tests;

import org.junit.*;
import core.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

    public class ContractTests extends Assert {
        @Test
        public void create_CreateEmptyContractBook_ConCountEqualsZero() {
            ContractBook contractBook = ContractBook.create();
            assertEquals(0, contractBook.getConCount());
        }
        @Test
        public void addCon_AddConWithNumberAndDate_ConCountEqualsOne() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "date");
            assertEquals(1, contractBook.getConCount());
        }
        @Test
        public void addCon_AddConWithNullNumber_ThrowsException() {
            ContractBook contractBook = ContractBook.create();
            var exc = assertThrows(IllegalArgumentException.class, () -> contractBook.addCon(null, "date"));
            assertTrue(exc.getMessage().toLowerCase().contains("number cannot be null"));
        }
        @Test
        public void addCon_AddConWithNullDate_ThrowsException() {
            ContractBook contractBook = ContractBook.create();
            var exc = assertThrows(IllegalArgumentException.class, () -> contractBook.addCon("number", null));
            assertTrue(exc.getMessage().toLowerCase().contains("date cannot be null"));
        }
        @Test
        public void addCon_AddConWithNullNumberAndNullDate_ThrowsException() {
            ContractBook contractBook = ContractBook.create();
            var exc = assertThrows(IllegalArgumentException.class, () -> contractBook.addCon(null, null));
            assertTrue(exc.getMessage().toLowerCase().contains("number cannot be null") && exc.getMessage().toLowerCase().contains("date cannot be null"));
        }
        @Test
        public void getList_getListOfAllPayments_equalLists() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "date");
            contractBook.addCon("number2", "date");

        }


        @Test
        public void registerPaymentDocs_registerPaymentDocWithoutData_PaymentDocsCountEqualsZero() {
            ContractBook contractBook = ContractBook.create();

            contractBook.addCon("number", "date");
            assertEquals(0, contractBook.getCons().get("number").getPaymentDocsCount());
        }
        @Test
        public void registerPaymentDocs_registerPaymentDocWithData_PaymentDocsCountEqualsOne() {
            ContractBook contractBook = ContractBook.create();

            contractBook.addCon("number", "date");
            contractBook.registerPaymentDocs(100, 1, TypeOfPaymentDoc.PaymentOrder, "number", "20220101");
            assertEquals(1, contractBook.getCons().get("number").getPaymentDocsCount());
        }
        @Test
        public void registerPaymentDocs_registerPaymentDocWithData_PaymentDocsCountEqualsThree() {
            ContractBook contractBook = ContractBook.create();

            contractBook.addCon("number", "date");
            contractBook.registerPaymentDocs(10, 1, TypeOfPaymentDoc.PaymentOrder, "number", "20220101");
            contractBook.registerPaymentDocs(20, 2, TypeOfPaymentDoc.BankOrder, "number", "20210101");
            contractBook.registerPaymentDocs(30, 3, TypeOfPaymentDoc.PaymentOrder, "number", "20200101");
            assertEquals(3, contractBook.getCons().get("number").getPaymentDocsCount());
        }
        @Test
        public void registerPaymentDocs_registerPaymentDocWithNegSum_ThrowsExceptions() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "date");
            var exc = assertThrows(IllegalArgumentException.class, () -> contractBook.registerPaymentDocs(-100, 1, TypeOfPaymentDoc.PaymentOrder, "number", "20001010"));
            assertTrue(exc.getMessage().toLowerCase().contains("sum is a positive number"));
        }
        @Test
        public void registerPaymentDocs_registerPaymentDocWithNegPaymentDocNum_ThrowsExceptions() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "date");
            var exc = assertThrows(IllegalArgumentException.class, () -> contractBook.registerPaymentDocs(100, -9, TypeOfPaymentDoc.PaymentOrder, "number", "20001010"));
            assertTrue(exc.getMessage().toLowerCase().contains("number of payment document is a positive number"));
        }


        @Test
        public void deletePayment_DeletePaymentWithNumConNumDate_PaymentDocCountEqualsZero() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "20150101");
            contractBook.registerPaymentDocs(40, 3, TypeOfPaymentDoc.BankOrder, "number", "20190101");
            contractBook.registerPaymentDocs(100, 5, TypeOfPaymentDoc.PaymentOrder, "number", "20180101");

            contractBook.deletePayment("number", 3, "20190101");
            contractBook.deletePayment("number", 5, "20180101");
            assertEquals(0, contractBook.getCons().get("number").getPaymentDocsCount());
        }
        @Test
        public void deletePayment_DeleteNonExistPayment_PaymentDocCountEqualsZeroOne() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "20150101");
            contractBook.registerPaymentDocs(40, 3, TypeOfPaymentDoc.BankOrder, "number", "20190101");

            contractBook.deletePayment("number", 5, "20180101");
            assertEquals(1, contractBook.getCons().get("number").getPaymentDocsCount());
        }
        @Test
        public void getList_GetListOfAllPayments_EqualList() {
            ContractBook contractBook = ContractBook.create();
            contractBook.addCon("number", "20150101");
            contractBook.registerPaymentDocs(10, 1, TypeOfPaymentDoc.PaymentOrder, "number", "20220101");
            contractBook.registerPaymentDocs(20, 2, TypeOfPaymentDoc.BankOrder, "number", "20210101");
            contractBook.registerPaymentDocs(30, 3, TypeOfPaymentDoc.PaymentOrder, "number", "20200101");

            List<Integer> ListOfPayments = new ArrayList<>();
            ListOfPayments.add(10);
            ListOfPayments.add(20);
            ListOfPayments.add(30);
            assertArrayEquals(ListOfPayments.toArray(), contractBook.getAllPayments().toArray());
        }
}
