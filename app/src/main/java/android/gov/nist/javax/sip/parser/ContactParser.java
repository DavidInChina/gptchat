package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.ContactList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* loaded from: classes2.dex */
public class ContactParser extends AddressParametersParser {
    public ContactParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        char lookAhead;
        headerName(TokenTypes.CONTACT);
        ContactList contactList = new ContactList();
        while (true) {
            Contact contact = new Contact();
            if (this.lexer.lookAhead(0) == '*') {
                char lookAhead2 = this.lexer.lookAhead(1);
                if (lookAhead2 != ' ' && lookAhead2 != '\t' && lookAhead2 != '\r' && lookAhead2 != '\n') {
                    super.parse((AddressParametersHeader) contact);
                } else {
                    this.lexer.match(42);
                    contact.setWildCardFlag(true);
                }
            } else {
                super.parse((AddressParametersHeader) contact);
            }
            contactList.add((ContactList) contact);
            this.lexer.SPorHT();
            lookAhead = this.lexer.lookAhead(0);
            if (lookAhead != ',') {
                break;
            }
            this.lexer.match(44);
            this.lexer.SPorHT();
        }
        if (lookAhead != '\n' && lookAhead != 0) {
            throw createParseException("unexpected char");
        }
        return contactList;
    }

    public ContactParser(Lexer lexer) {
        super(lexer);
        this.lexer = lexer;
    }
}
