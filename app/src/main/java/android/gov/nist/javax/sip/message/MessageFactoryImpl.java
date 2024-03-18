package android.gov.nist.javax.sip.message;

import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import b.AbstractC2096f;
import c.AbstractC2230B;
import c.AbstractC2254i;
import c.AbstractC2255j;
import c.AbstractC2262q;
import c.AbstractC2267w;
import c.Y;
import c.d0;
import c.f0;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.text.ParseException;
import java.util.List;

/* loaded from: classes2.dex */
public class MessageFactoryImpl implements MessageFactoryExt {
    private static String defaultContentEncodingCharset = "UTF-8";
    private static Y server;
    private static f0 userAgent;
    private boolean testing = false;
    private boolean strict = true;

    public static String getDefaultContentEncodingCharset() {
        return defaultContentEncodingCharset;
    }

    public static Y getDefaultServerHeader() {
        return server;
    }

    public static f0 getDefaultUserAgentHeader() {
        return userAgent;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public MultipartMimeContent createMultipartMimeContent(AbstractC2262q abstractC2262q, String[] strArr, String[] strArr2, String[] strArr3) {
        abstractC2262q.getParameter(MultipartMimeContentImpl.BOUNDARY);
        MultipartMimeContentImpl multipartMimeContentImpl = new MultipartMimeContentImpl(abstractC2262q);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            ContentType contentType = new ContentType(strArr[i10], strArr2[i10]);
            ContentImpl contentImpl = new ContentImpl(strArr3[i10]);
            contentImpl.setContentTypeHeader(contentType);
            multipartMimeContentImpl.add(contentImpl);
        }
        return multipartMimeContentImpl;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B) {
        if (abstractC2096f != null && str != null && abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(abstractC2096f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(abstractC2255j);
            sIPRequest.setCSeq(abstractC2254i);
            sIPRequest.setFrom(abstractC2267w);
            sIPRequest.setTo(d0Var);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(abstractC2230B);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPRequest.setHeader(f0Var);
            }
            return sIPRequest;
        }
        throw new ParseException("JAIN-SIP Exception, some parameters are missing, unable to create the request", 0);
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B) {
        if (abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null) {
            SIPResponse sIPResponse = new SIPResponse();
            sIPResponse.setStatusCode(i10);
            sIPResponse.setCallId(abstractC2255j);
            sIPResponse.setCSeq(abstractC2254i);
            sIPResponse.setFrom(abstractC2267w);
            sIPResponse.setTo(d0Var);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(abstractC2230B);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPResponse.setHeader(f0Var);
            }
            return sIPResponse;
        }
        throw new ParseException("JAIN-SIP Exception, some parameters are missing, unable to create the response", 0);
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultContentEncodingCharset(String str) {
        if (str != null) {
            defaultContentEncodingCharset = str;
            return;
        }
        throw new NullPointerException("Null argument!");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultServerHeader(Y y10) {
        server = y10;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultUserAgentHeader(f0 f0Var) {
        userAgent = f0Var;
    }

    public void setStrict(boolean z10) {
        this.strict = z10;
    }

    public void setTest(boolean z10) {
        this.testing = z10;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, Object obj) {
        if (abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && obj != null && abstractC2262q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i10);
            String reasonPhrase = SIPResponse.getReasonPhrase(i10);
            if (reasonPhrase != null) {
                statusLine.setReasonPhrase(reasonPhrase);
                sIPResponse.setStatusLine(statusLine);
                sIPResponse.setCallId(abstractC2255j);
                sIPResponse.setCSeq(abstractC2254i);
                sIPResponse.setFrom(abstractC2267w);
                sIPResponse.setTo(d0Var);
                sIPResponse.setVia(list);
                sIPResponse.setContent(obj, abstractC2262q);
                f0 f0Var = userAgent;
                if (f0Var != null) {
                    sIPResponse.setHeader(f0Var);
                }
                return sIPResponse;
            }
            throw new ParseException(i10 + " Unknown", 0);
        }
        throw new NullPointerException("missing parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, Object obj) {
        if (abstractC2096f != null && str != null && abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && obj != null && abstractC2262q != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(abstractC2096f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(abstractC2255j);
            sIPRequest.setCSeq(abstractC2254i);
            sIPRequest.setFrom(abstractC2267w);
            sIPRequest.setTo(d0Var);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(abstractC2230B);
            sIPRequest.setContent(obj, abstractC2262q);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPRequest.setHeader(f0Var);
            }
            return sIPRequest;
        }
        throw new NullPointerException("Null parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, byte[] bArr) {
        if (abstractC2096f != null && str != null && abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && bArr != null && abstractC2262q != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(abstractC2096f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(abstractC2255j);
            sIPRequest.setCSeq(abstractC2254i);
            sIPRequest.setFrom(abstractC2267w);
            sIPRequest.setTo(d0Var);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(abstractC2230B);
            sIPRequest.setContent(bArr, abstractC2262q);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPRequest.setHeader(f0Var);
            }
            return sIPRequest;
        }
        throw new NullPointerException("missing parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, byte[] bArr) {
        if (abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && bArr != null && abstractC2262q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i10);
            String reasonPhrase = SIPResponse.getReasonPhrase(i10);
            if (reasonPhrase != null) {
                statusLine.setReasonPhrase(reasonPhrase);
                sIPResponse.setStatusLine(statusLine);
                sIPResponse.setCallId(abstractC2255j);
                sIPResponse.setCSeq(abstractC2254i);
                sIPResponse.setFrom(abstractC2267w);
                sIPResponse.setTo(d0Var);
                sIPResponse.setVia(list);
                sIPResponse.setContent(bArr, abstractC2262q);
                f0 f0Var = userAgent;
                if (f0Var != null) {
                    sIPResponse.setHeader(f0Var);
                }
                return sIPResponse;
            }
            throw new ParseException(i10 + " : Unknown", 0);
        }
        throw new NullPointerException("missing parameters");
    }

    public AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, byte[] bArr, AbstractC2262q abstractC2262q) {
        if (abstractC2096f != null && str != null && abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && bArr != null && abstractC2262q != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(abstractC2096f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(abstractC2255j);
            sIPRequest.setCSeq(abstractC2254i);
            sIPRequest.setFrom(abstractC2267w);
            sIPRequest.setTo(d0Var);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(abstractC2230B);
            sIPRequest.setHeader((ContentType) abstractC2262q);
            sIPRequest.setMessageContent(bArr);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPRequest.setHeader(f0Var);
            }
            return sIPRequest;
        }
        throw new ParseException("JAIN-SIP Exception, some parameters are missing, unable to create the request", 0);
    }

    public AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, Object obj, AbstractC2262q abstractC2262q) {
        if (abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && obj != null && abstractC2262q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i10);
            statusLine.setReasonPhrase(SIPResponse.getReasonPhrase(i10));
            sIPResponse.setStatusLine(statusLine);
            sIPResponse.setCallId(abstractC2255j);
            sIPResponse.setCSeq(abstractC2254i);
            sIPResponse.setFrom(abstractC2267w);
            sIPResponse.setTo(d0Var);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(abstractC2230B);
            sIPResponse.setContent(obj, abstractC2262q);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPResponse.setHeader(f0Var);
            }
            return sIPResponse;
        }
        throw new NullPointerException(" unable to create the response");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2561b createRequest(String str) {
        if (str != null && !str.equals("")) {
            StringMsgParser stringMsgParser = new StringMsgParser();
            ParseExceptionListener parseExceptionListener = new ParseExceptionListener() { // from class: android.gov.nist.javax.sip.message.MessageFactoryImpl.1
                @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
                public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str2, String str3) {
                    if (MessageFactoryImpl.this.testing) {
                        if (cls != From.class && cls != To.class && cls != CallID.class && cls != MaxForwards.class && cls != Via.class && cls != RequestLine.class && cls != StatusLine.class && cls != CSeq.class) {
                            sIPMessage.addUnparsed(str2);
                            return;
                        }
                        throw parseException;
                    }
                }
            };
            if (!this.testing) {
                parseExceptionListener = null;
            }
            SIPMessage parseSIPMessage = stringMsgParser.parseSIPMessage(str.getBytes(), true, this.strict, parseExceptionListener);
            if (parseSIPMessage instanceof SIPRequest) {
                return (SIPRequest) parseSIPMessage;
            }
            throw new ParseException(str, 0);
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setNullRequest();
        return sIPRequest;
    }

    public AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, byte[] bArr, AbstractC2262q abstractC2262q) {
        if (abstractC2255j != null && abstractC2254i != null && abstractC2267w != null && d0Var != null && list != null && abstractC2230B != null && bArr != null && abstractC2262q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            sIPResponse.setStatusCode(i10);
            sIPResponse.setCallId(abstractC2255j);
            sIPResponse.setCSeq(abstractC2254i);
            sIPResponse.setFrom(abstractC2267w);
            sIPResponse.setTo(d0Var);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(abstractC2230B);
            sIPResponse.setHeader((ContentType) abstractC2262q);
            sIPResponse.setMessageContent(bArr);
            f0 f0Var = userAgent;
            if (f0Var != null) {
                sIPResponse.setHeader(f0Var);
            }
            return sIPResponse;
        }
        throw new NullPointerException("Null params ");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(int i10, AbstractC2561b abstractC2561b) {
        if (abstractC2561b != null) {
            SIPResponse createResponse = ((SIPRequest) abstractC2561b).createResponse(i10);
            createResponse.removeContent();
            createResponse.removeHeader(SIPHeaderNames.CONTENT_TYPE);
            Y y10 = server;
            if (y10 != null) {
                createResponse.setHeader(y10);
            }
            return createResponse;
        }
        throw new NullPointerException("null parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(int i10, AbstractC2561b abstractC2561b, AbstractC2262q abstractC2262q, Object obj) {
        if (abstractC2561b != null && obj != null && abstractC2262q != null) {
            SIPResponse createResponse = ((SIPRequest) abstractC2561b).createResponse(i10);
            createResponse.setContent(obj, abstractC2262q);
            Y y10 = server;
            if (y10 != null) {
                createResponse.setHeader(y10);
            }
            return createResponse;
        }
        throw new NullPointerException("null parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(int i10, AbstractC2561b abstractC2561b, AbstractC2262q abstractC2262q, byte[] bArr) {
        if (abstractC2561b != null && bArr != null && abstractC2262q != null) {
            SIPResponse createResponse = ((SIPRequest) abstractC2561b).createResponse(i10);
            createResponse.setHeader((ContentType) abstractC2262q);
            createResponse.setMessageContent(bArr);
            Y y10 = server;
            if (y10 != null) {
                createResponse.setHeader(y10);
            }
            return createResponse;
        }
        throw new NullPointerException("null Parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public AbstractC2562c createResponse(String str) {
        if (str == null) {
            return new SIPResponse();
        }
        SIPMessage parseSIPMessage = new StringMsgParser().parseSIPMessage(str.getBytes(), true, false, null);
        if (parseSIPMessage instanceof SIPResponse) {
            return (SIPResponse) parseSIPMessage;
        }
        throw new ParseException(str, 0);
    }
}
