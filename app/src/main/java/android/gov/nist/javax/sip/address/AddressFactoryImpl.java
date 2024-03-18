package android.gov.nist.javax.sip.address;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.parser.URLParser;
import b.AbstractC2091a;
import b.AbstractC2094d;
import b.AbstractC2095e;
import b.AbstractC2096f;
import java.text.ParseException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class AddressFactoryImpl implements AddressFactoryEx {
    public static final Pattern SCHEME_PATTERN = Pattern.compile("\\p{Alpha}[[{\\p{Alpha}][\\p{Digit}][\\+][-][\\.]]*");

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2091a createAddress(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            AddressImpl addressImpl = new AddressImpl();
            addressImpl.setURI(abstractC2096f);
            return addressImpl;
        }
        throw new NullPointerException("null address");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2094d createSipURI(String str) {
        if (str != null) {
            try {
                return new StringMsgParser().parseSIPUrl(str);
            } catch (ParseException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new NullPointerException("null URI");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2095e createTelURL(String str) {
        if (str != null) {
            if (!str.startsWith("tel:")) {
                str = "tel:".concat(str);
            }
            try {
                return (TelURLImpl) new StringMsgParser().parseUrl(str);
            } catch (ParseException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new NullPointerException("null url");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2096f createURI(String str) {
        if (str != null) {
            try {
                String peekScheme = new URLParser(str).peekScheme();
                if (peekScheme != null) {
                    if (!peekScheme.equalsIgnoreCase("sip") && !peekScheme.equalsIgnoreCase("sips")) {
                        if (peekScheme.equalsIgnoreCase("tel")) {
                            return createTelURL(str);
                        }
                        if (SCHEME_PATTERN.matcher(peekScheme).matches()) {
                            return new GenericURI(str);
                        }
                        throw new ParseException("the scheme " + peekScheme + " from the following uri " + str + " doesn't match ALPHA *(ALPHA / DIGIT / \"+\" / \"-\" / \".\" ) from RFC3261", 0);
                    }
                    return createSipURI(str);
                }
                throw new ParseException("bad scheme", 0);
            } catch (ParseException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new NullPointerException("null arg");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2091a createAddress(String str) {
        if (str != null) {
            if (str.equals(Separators.STAR)) {
                AddressImpl addressImpl = new AddressImpl();
                addressImpl.setAddressType(3);
                SipUri sipUri = new SipUri();
                sipUri.setUser(Separators.STAR);
                addressImpl.setURI(sipUri);
                return addressImpl;
            }
            return new StringMsgParser().parseAddress(str);
        }
        throw new NullPointerException("null address");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2094d createSipURI(String str, String str2) {
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder("sip:");
            if (str != null) {
                sb2.append(str);
                sb2.append(Separators.AT);
            }
            if (str2.indexOf(58) != str2.lastIndexOf(58) && str2.trim().charAt(0) != '[') {
                str2 = a.h("[", str2, ']');
            }
            sb2.append(str2);
            try {
                return createSipURI(sb2.toString());
            } catch (ParseException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new NullPointerException("null host");
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public AbstractC2091a createAddress(String str, AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            AddressImpl addressImpl = new AddressImpl();
            if (str != null) {
                addressImpl.setDisplayName(str);
            }
            addressImpl.setURI(abstractC2096f);
            return addressImpl;
        }
        throw new NullPointerException("null  URI");
    }

    public AbstractC2091a createAddress() {
        return new AddressImpl();
    }
}
