package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostNameParser;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.address.TelephoneNumber;
import android.gov.nist.javax.sip.header.ExtensionHeaderImpl;
import android.gov.nist.javax.sip.header.NameMap;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

/* loaded from: classes.dex */
public class StringMsgParser implements MessageParser {
    protected static boolean computeContentLengthFromMessage;
    private static StackLogger logger = CommonLogger.getLogger(StringMsgParser.class);

    public static void main(String[] strArr) {
        String[] strArr2 = {"SIP/2.0 200 OK\r\nTo: \"The Little Blister\" <sip:LittleGuy@there.com>;tag=469bc066\r\nFrom: \"The Master Blaster\" <sip:BigGuy@here.com>;tag=11\r\nVia: SIP/2.0/UDP 139.10.134.246:5060;branch=z9hG4bK8b0a86f6_1030c7d18e0_17;received=139.10.134.246\r\nCall-ID: 1030c7d18ae_a97b0b_b@8b0a86f6\r\nCSeq: 1 SUBSCRIBE\r\nContact: <sip:172.16.11.162:5070>\r\nContent-Length: 0\r\n\r\n", "SIP/2.0 180 Ringing\r\nVia: SIP/2.0/UDP 172.18.1.29:5060;branch=z9hG4bK43fc10fb4446d55fc5c8f969607991f4\r\nTo: \"0440\" <sip:0440@212.209.220.131>;tag=2600\r\nFrom: \"Andreas\" <sip:andreas@e-horizon.se>;tag=8524\r\nCall-ID: f51a1851c5f570606140f14c8eb64fd3@172.18.1.29\r\nCSeq: 1 INVITE\r\nMax-Forwards: 70\r\nRecord-Route: <sip:212.209.220.131:5060>\r\nContent-Length: 0\r\n\r\n", "REGISTER sip:nist.gov SIP/2.0\r\nVia: SIP/2.0/UDP 129.6.55.182:14826\r\nMax-Forwards: 70\r\nFrom: <sip:mranga@nist.gov>;tag=6fcd5c7ace8b4a45acf0f0cd539b168b;epid=0d4c418ddf\r\nTo: <sip:mranga@nist.gov>\r\nCall-ID: c5679907eb954a8da9f9dceb282d7230@129.6.55.182\r\nCSeq: 1 REGISTER\r\nContact: <sip:129.6.55.182:14826>;methods=\"INVITE, MESSAGE, INFO, SUBSCRIBE, OPTIONS, BYE, CANCEL, NOTIFY, ACK, REFER\"\r\nUser-Agent: RTC/(Microsoft RTC)\r\nEvent:  registration\r\nAllow-Events: presence\r\nContent-Length: 0\r\n\r\nINVITE sip:littleguy@there.com:5060 SIP/2.0\r\nVia: SIP/2.0/UDP 65.243.118.100:5050\r\nFrom: M. Ranganathan  <sip:M.Ranganathan@sipbakeoff.com>;tag=1234\r\nTo: \"littleguy@there.com\" <sip:littleguy@there.com:5060> \r\nCall-ID: Q2AboBsaGn9!?x6@sipbakeoff.com \r\nCSeq: 1 INVITE \r\nContent-Length: 247\r\n\r\nv=0\r\no=4855 13760799956958020 13760799956958020 IN IP4  129.6.55.78\r\ns=mysession session\r\np=+46 8 52018010\r\nc=IN IP4  129.6.55.78\r\nt=0 0\r\nm=audio 6022 RTP/AVP 0 4 18\r\na=rtpmap:0 PCMU/8000\r\na=rtpmap:4 G723/8000\r\na=rtpmap:18 G729A/8000\r\na=ptime:20\r\n"};
        for (int i10 = 0; i10 < 20; i10++) {
            new Thread(new Runnable(strArr2) { // from class: android.gov.nist.javax.sip.parser.StringMsgParser.1ParserThread
                String[] messages;

                {
                    this.messages = strArr2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    for (int i11 = 0; i11 < this.messages.length; i11++) {
                        try {
                            SIPMessage parseSIPMessage = new StringMsgParser().parseSIPMessage(this.messages[i11].getBytes(), true, false, null);
                            System.out.println(" i = " + i11 + " branchId = " + parseSIPMessage.getTopmostVia().getBranch());
                        } catch (ParseException unused) {
                        }
                    }
                }
            }).start();
        }
    }

    public static SIPHeader parseSIPHeader(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (str.charAt(i10) <= ' ') {
            try {
                i10++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParseException("Empty header.", 0);
            }
        }
        while (str.charAt(length) <= ' ') {
            length--;
        }
        StringBuilder sb2 = new StringBuilder(length + 1);
        boolean z10 = false;
        int i11 = i10;
        while (i10 <= length) {
            char charAt = str.charAt(i10);
            if (charAt != '\r' && charAt != '\n') {
                if (z10) {
                    if (charAt != ' ' && charAt != '\t') {
                        z10 = false;
                        i11 = i10;
                    } else {
                        sb2.append(' ');
                        i11 = i10 + 1;
                        z10 = false;
                    }
                }
            } else if (!z10) {
                sb2.append(str.substring(i11, i10));
                z10 = true;
            }
            i10++;
        }
        sb2.append(str.substring(i11, i10));
        sb2.append('\n');
        HeaderParser createParser = ParserFactory.createParser(sb2.toString());
        if (createParser != null) {
            return createParser.parse();
        }
        throw new ParseException("could not create parser", 0);
    }

    public static void setComputeContentLengthFromMessage(boolean z10) {
        computeContentLengthFromMessage = z10;
    }

    public static String trimEndOfLine(String str) {
        if (str == null) {
            return str;
        }
        int length = str.length() - 1;
        while (length >= 0 && str.charAt(length) <= ' ') {
            length--;
        }
        if (length == str.length() - 1) {
            return str;
        }
        if (length == -1) {
            return "";
        }
        return str.substring(0, length + 1);
    }

    public AddressImpl parseAddress(String str) {
        return new AddressParser(str).address(true);
    }

    public Host parseHost(String str) {
        return new HostNameParser(new Lexer("charLexer", str)).host();
    }

    @Override // android.gov.nist.javax.sip.parser.MessageParser
    public SIPMessage parseSIPMessage(byte[] bArr, boolean z10, boolean z11, ParseExceptionListener parseExceptionListener) {
        boolean z12;
        SIPMessage sIPMessage;
        int i10;
        int i11;
        String str = null;
        if (bArr != null && bArr.length != 0) {
            z12 = false;
            int i12 = 0;
            while (bArr[i12] < 32) {
                try {
                    i12++;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("handled only control char so returning null");
                    }
                }
            }
            int i13 = i12;
            boolean z13 = true;
            sIPMessage = null;
            while (true) {
                i10 = i13;
                while (true) {
                    try {
                        byte b10 = bArr[i10];
                        if (b10 == 13 || b10 == 10) {
                            break;
                        }
                        i10++;
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                    }
                }
                try {
                    String trimEndOfLine = trimEndOfLine(new String(bArr, i13, i10 - i13, "UTF-8"));
                    if (trimEndOfLine.length() == 0) {
                        if (str != null && sIPMessage != null) {
                            processHeader(str, sIPMessage, parseExceptionListener, bArr);
                        }
                    } else if (z13) {
                        sIPMessage = processFirstLine(trimEndOfLine, parseExceptionListener, bArr);
                    } else {
                        char charAt = trimEndOfLine.charAt(0);
                        if (charAt != '\t' && charAt != ' ') {
                            if (str != null && sIPMessage != null) {
                                processHeader(str, sIPMessage, parseExceptionListener, bArr);
                            }
                            str = trimEndOfLine;
                        } else if (str != null) {
                            StringBuilder p10 = a.p(str);
                            p10.append(trimEndOfLine.substring(1));
                            str = p10.toString();
                        } else {
                            throw new ParseException("Bad header continuation.", 0);
                        }
                    }
                    if (bArr[i10] == 13 && bArr.length > (i11 = i10 + 1) && bArr[i11] == 10) {
                        i10 = i11;
                    }
                    int i14 = i10 + 1;
                    if (trimEndOfLine.length() <= 0) {
                        i10 = i14;
                        break;
                    }
                    i13 = i14;
                    z13 = false;
                } catch (UnsupportedEncodingException unused3) {
                    throw new ParseException("Bad message encoding!", 0);
                }
            }
        }
        return null;
        if (sIPMessage != null) {
            sIPMessage.setSize(i10);
            if (z10 && sIPMessage.getContentLength() != null) {
                if (sIPMessage.getContentLength().getContentLength() != 0) {
                    int length = bArr.length - i10;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, i10, bArr2, 0, length);
                    sIPMessage.setMessageContent(bArr2, !z11, computeContentLengthFromMessage, sIPMessage.getContentLength().getContentLength());
                } else if (!computeContentLengthFromMessage) {
                    if (sIPMessage.getContentLength().getContentLength() == 0) {
                        z12 = true;
                    }
                    if ((z12 & z11) && !"\r\n\r\n".equals(new String(bArr, bArr.length - 4, 4))) {
                        throw new ParseException("Extraneous characters at the end of the message ", i10);
                    }
                }
            }
            return sIPMessage;
        }
        throw new ParseException("Bad message", 0);
    }

    public RequestLine parseSIPRequestLine(String str) {
        return new RequestLineParser(a.g(str, Separators.RETURN)).parse();
    }

    public StatusLine parseSIPStatusLine(String str) {
        return new StatusLineParser(a.g(str, Separators.RETURN)).parse();
    }

    public SipUri parseSIPUrl(String str) {
        try {
            return new URLParser(str).sipURL(true);
        } catch (ClassCastException unused) {
            throw new ParseException(a.g(str, " Not a SIP URL "), 0);
        }
    }

    public TelephoneNumber parseTelephoneNumber(String str) {
        return new URLParser(str).parseTelephoneNumber(true);
    }

    public GenericURI parseUrl(String str) {
        return new URLParser(str).parse();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SIPMessage processFirstLine(String str, ParseExceptionListener parseExceptionListener, byte[] bArr) {
        SIPResponse sIPResponse;
        if (!str.startsWith(SIPConstants.SIP_VERSION_STRING)) {
            SIPRequest sIPRequest = new SIPRequest();
            try {
                sIPRequest.setRequestLine(new RequestLineParser(str.concat(Separators.RETURN)).parse());
                sIPResponse = sIPRequest;
            } catch (ParseException e10) {
                if (parseExceptionListener != null) {
                    try {
                        parseExceptionListener.handleException(e10, sIPRequest, RequestLine.class, str, new String(bArr, "UTF-8"));
                        sIPResponse = sIPRequest;
                    } catch (UnsupportedEncodingException e11) {
                        e11.printStackTrace();
                        sIPResponse = sIPRequest;
                    }
                } else {
                    throw e10;
                }
            }
        } else {
            SIPResponse sIPResponse2 = new SIPResponse();
            try {
                sIPResponse2.setStatusLine(new StatusLineParser(str.concat(Separators.RETURN)).parse());
                sIPResponse = sIPResponse2;
            } catch (ParseException e12) {
                if (parseExceptionListener != null) {
                    try {
                        parseExceptionListener.handleException(e12, sIPResponse2, StatusLine.class, str, new String(bArr, "UTF-8"));
                        sIPResponse = sIPResponse2;
                    } catch (UnsupportedEncodingException e13) {
                        e13.printStackTrace();
                        sIPResponse = sIPResponse2;
                    }
                } else {
                    throw e12;
                }
            }
        }
        return sIPResponse;
    }

    public void processHeader(String str, SIPMessage sIPMessage, ParseExceptionListener parseExceptionListener, byte[] bArr) {
        if (str != null && str.length() != 0) {
            try {
                try {
                    sIPMessage.attachHeader(ParserFactory.createParser(str.concat(Separators.RETURN)).parse(), false);
                } catch (ParseException e10) {
                    if (parseExceptionListener != null) {
                        Class<ExtensionHeaderImpl> classFromName = NameMap.getClassFromName(Lexer.getHeaderName(str));
                        if (classFromName == null) {
                            classFromName = ExtensionHeaderImpl.class;
                        }
                        try {
                            parseExceptionListener.handleException(e10, sIPMessage, classFromName, str, new String(bArr, "UTF-8"));
                        } catch (UnsupportedEncodingException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            } catch (ParseException e12) {
                if (parseExceptionListener != null) {
                    parseExceptionListener.handleException(e12, sIPMessage, null, str, null);
                    return;
                }
                throw e12;
            }
        }
    }
}
