package android.gov.nist.javax.sip.message;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.header.StatusLine;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d.AbstractC2562c;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class SIPResponse extends SIPMessage implements AbstractC2562c, ResponseExt {
    private boolean isRetransmission = true;
    protected StatusLine statusLine;

    public static String getReasonPhrase(int i10) {
        if (i10 != 420) {
            if (i10 == 421) {
                return "Etension Required";
            }
            if (i10 == 603) {
                return "Decline";
            }
            if (i10 != 604) {
                switch (i10) {
                    case 100:
                        return "Trying";
                    case RCHTTPStatusCodes.SUCCESS /* 200 */:
                        return "OK";
                    case 202:
                        return "Accepted";
                    case 305:
                        return "Use proxy";
                    case 380:
                        return "Alternative service";
                    case 410:
                        return "Gone";
                    case 423:
                        return "Interval too brief";
                    case 491:
                        return "Request Pending";
                    case 493:
                        return "Undecipherable";
                    case 513:
                        return "Message Too Large";
                    case 600:
                        return "Busy everywhere";
                    case 606:
                        return "Session Not acceptable";
                    default:
                        switch (i10) {
                            case 180:
                                return "Ringing";
                            case 181:
                                return "Call is being forwarded";
                            case 182:
                                return "Queued";
                            case 183:
                                return "Session progress";
                            default:
                                switch (i10) {
                                    case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                                        return "Multiple choices";
                                    case 301:
                                        return "Moved permanently";
                                    case 302:
                                        return "Moved Temporarily";
                                    default:
                                        switch (i10) {
                                            case RCHTTPStatusCodes.BAD_REQUEST /* 400 */:
                                                return "Bad request";
                                            case 401:
                                                return "Unauthorized";
                                            case 402:
                                                return "Payment required";
                                            case 403:
                                                return "Forbidden";
                                            case RCHTTPStatusCodes.NOT_FOUND /* 404 */:
                                                return "Not found";
                                            case 405:
                                                return "Method not allowed";
                                            case 406:
                                                return "Not acceptable";
                                            case 407:
                                                return "Proxy Authentication required";
                                            case 408:
                                                return "Request timeout";
                                            default:
                                                switch (i10) {
                                                    case 412:
                                                        return "Conditional request failed";
                                                    case 413:
                                                        return "Request entity too large";
                                                    case 414:
                                                        return "Request-URI too large";
                                                    case 415:
                                                        return "Unsupported media type";
                                                    case 416:
                                                        return "Unsupported URI Scheme";
                                                    default:
                                                        switch (i10) {
                                                            case 480:
                                                                return "Temporarily Unavailable";
                                                            case 481:
                                                                return "Call leg/Transaction does not exist";
                                                            case 482:
                                                                return "Loop detected";
                                                            case 483:
                                                                return "Too many hops";
                                                            case 484:
                                                                return "Address incomplete";
                                                            case 485:
                                                                return "Ambiguous";
                                                            case 486:
                                                                return "Busy here";
                                                            case 487:
                                                                return "Request Terminated";
                                                            case 488:
                                                                return "Not Acceptable here";
                                                            case 489:
                                                                return "Bad Event";
                                                            default:
                                                                switch (i10) {
                                                                    case 500:
                                                                        return "Server Internal Error";
                                                                    case 501:
                                                                        return "Not implemented";
                                                                    case 502:
                                                                        return "Bad gateway";
                                                                    case 503:
                                                                        return "Service unavailable";
                                                                    case 504:
                                                                        return "Gateway timeout";
                                                                    case 505:
                                                                        return "SIP version not supported";
                                                                    default:
                                                                        return "Unknown Status";
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            return "Does not exist anywhere";
        }
        return "Bad extension";
    }

    public static boolean isFinalResponse(int i10) {
        return i10 >= 200 && i10 < 700;
    }

    public void checkHeaders() {
        if (getCSeq() != null) {
            if (getTo() != null) {
                if (getFrom() != null) {
                    if (getViaHeaders() != null) {
                        if (getCallId() != null) {
                            if (getStatusCode() <= 699) {
                                return;
                            }
                            throw new ParseException("Unknown error code!" + getStatusCode(), 0);
                        }
                        throw new ParseException("Call-ID Is missing ", 0);
                    }
                    throw new ParseException("Via Is missing ", 0);
                }
                throw new ParseException("From Is missing ", 0);
            }
            throw new ParseException("To Is missing ", 0);
        }
        throw new ParseException("CSeq Is missing ", 0);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public void cleanUp() {
        super.cleanUp();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public Object clone() {
        SIPResponse sIPResponse = (SIPResponse) super.clone();
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            sIPResponse.statusLine = (StatusLine) statusLine.clone();
        }
        return sIPResponse;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        String debugDump = super.debugDump();
        this.stringRepresentation = "";
        sprint(SIPResponse.class.getCanonicalName());
        sprint("{");
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            sprint(statusLine.debugDump());
        }
        sprint(debugDump);
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        if (this.statusLine != null) {
            return this.statusLine.encode() + super.encode();
        }
        return super.encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public byte[] encodeAsBytes(String str) {
        byte[] bytes;
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            try {
                bytes = statusLine.encode().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e10) {
                InternalErrorHandler.handleException(e10);
            }
            byte[] encodeAsBytes = super.encodeAsBytes(str);
            byte[] bArr = new byte[bytes.length + encodeAsBytes.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            System.arraycopy(encodeAsBytes, 0, bArr, bytes.length, encodeAsBytes.length);
            return bArr;
        }
        bytes = null;
        byte[] encodeAsBytes2 = super.encodeAsBytes(str);
        byte[] bArr2 = new byte[bytes.length + encodeAsBytes2.length];
        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        System.arraycopy(encodeAsBytes2, 0, bArr2, bytes.length, encodeAsBytes2.length);
        return bArr2;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public StringBuilder encodeMessage(StringBuilder sb2) {
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            statusLine.encode(sb2);
            super.encodeSIPHeaders(sb2);
            return sb2;
        }
        return super.encodeSIPHeaders(sb2);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || !this.statusLine.equals(((SIPResponse) obj).statusLine) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getFirstLine() {
        StatusLine statusLine = this.statusLine;
        if (statusLine == null) {
            return null;
        }
        return statusLine.encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public LinkedList getMessageAsEncodedStrings() {
        LinkedList<String> messageAsEncodedStrings = super.getMessageAsEncodedStrings();
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            messageAsEncodedStrings.addFirst(statusLine.encode());
        }
        return messageAsEncodedStrings;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getSIPVersion() {
        return this.statusLine.getSipVersion();
    }

    @Override // d.AbstractC2562c
    public int getStatusCode() {
        return this.statusLine.getStatusCode();
    }

    public StatusLine getStatusLine() {
        return this.statusLine;
    }

    public boolean isRetransmission() {
        return this.isRetransmission;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StatusLine statusLine = ((SIPResponse) obj).statusLine;
        StatusLine statusLine2 = this.statusLine;
        if (statusLine2 == null && statusLine != null) {
            return false;
        }
        if (statusLine2 == statusLine) {
            return super.match(obj);
        }
        if (statusLine2.match(statusLine) && super.match(obj)) {
            return true;
        }
        return false;
    }

    @Override // d.AbstractC2562c
    public void setReasonPhrase(String str) {
        if (str != null) {
            if (this.statusLine == null) {
                this.statusLine = new StatusLine();
            }
            this.statusLine.setReasonPhrase(str);
            return;
        }
        throw new IllegalArgumentException("Bad reason phrase");
    }

    public void setRetransmission(boolean z10) {
        this.isRetransmission = z10;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public void setSIPVersion(String str) {
        this.statusLine.setSipVersion(str);
    }

    @Override // android.gov.nist.javax.sip.message.ResponseExt
    public void setStatusCode(int i10) {
        if (i10 >= 100 && i10 <= 699) {
            if (this.statusLine == null) {
                this.statusLine = new StatusLine();
            }
            this.statusLine.setStatusCode(i10);
            return;
        }
        throw new ParseException("bad status code", 0);
    }

    public void setStatusLine(StatusLine statusLine) {
        this.statusLine = statusLine;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public String toString() {
        if (this.statusLine == null) {
            return "";
        }
        return this.statusLine.encode() + super.encode();
    }

    public boolean isFinalResponse() {
        return isFinalResponse(this.statusLine.getStatusCode());
    }

    @Override // android.gov.nist.javax.sip.message.ResponseExt
    public String getReasonPhrase() {
        StatusLine statusLine = this.statusLine;
        if (statusLine != null && statusLine.getReasonPhrase() != null) {
            return this.statusLine.getReasonPhrase();
        }
        return "";
    }
}
