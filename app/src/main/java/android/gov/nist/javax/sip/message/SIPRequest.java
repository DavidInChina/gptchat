package android.gov.nist.javax.sip.message;

import R.a;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.n;
import b.AbstractC2096f;
import c.AbstractC2268x;
import c.Y;
import d.AbstractC2561b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SIPRequest extends SIPMessage implements AbstractC2561b, RequestExt {
    private static final String DEFAULT_TRANSPORT = "udp";
    private static final String DEFAULT_USER = "ip";
    protected static final Set<String> headersToIncludeInResponse;
    private static final Map<String, String> nameTable = new ConcurrentHashMap(15);
    private static final long serialVersionUID = 3360720013577322927L;
    private static final Set<String> targetRefreshMethods;
    private transient Object inviteTransaction;
    private transient Object messageChannel;
    protected RequestLine requestLine;
    private transient Object transactionPointer;

    static {
        HashSet hashSet = new HashSet();
        targetRefreshMethods = hashSet;
        HashSet hashSet2 = new HashSet(0);
        headersToIncludeInResponse = hashSet2;
        hashSet.add(TokenNames.INVITE);
        hashSet.add("UPDATE");
        hashSet.add(TokenNames.SUBSCRIBE);
        hashSet.add(TokenNames.NOTIFY);
        hashSet.add("REFER");
        putName(TokenNames.INVITE);
        putName(TokenNames.BYE);
        putName("CANCEL");
        putName(TokenNames.ACK);
        putName("PRACK");
        putName("INFO");
        putName(TokenNames.MESSAGE);
        putName(TokenNames.NOTIFY);
        putName(TokenNames.OPTIONS);
        putName("PRACK");
        putName(TokenNames.PUBLISH);
        putName("REFER");
        putName(TokenNames.REGISTER);
        putName(TokenNames.SUBSCRIBE);
        putName("UPDATE");
        hashSet2.add(SIPHeaderNames.FROM.toLowerCase());
        hashSet2.add(SIPHeaderNames.TO.toLowerCase());
        hashSet2.add(SIPHeaderNames.VIA.toLowerCase());
        hashSet2.add(SIPHeaderNames.RECORD_ROUTE.toLowerCase());
        hashSet2.add(SIPHeaderNames.CALL_ID.toLowerCase());
        hashSet2.add(SIPHeaderNames.CSEQ.toLowerCase());
        hashSet2.add(SIPHeaderNames.TIMESTAMP.toLowerCase());
    }

    public static String getCannonicalName(String str) {
        Map<String, String> map = nameTable;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return str;
    }

    public static boolean isDialogCreating(String str) {
        return SIPTransactionStack.isDialogCreated(str);
    }

    public static boolean isTargetRefresh(String str) {
        return targetRefreshMethods.contains(str);
    }

    private static void putName(String str) {
        nameTable.put(str, str);
    }

    public void checkHeaders() {
        if (getCSeq() != null) {
            if (getTo() != null) {
                CallID callID = this.callIdHeader;
                if (callID != null && callID.getCallId() != null && !this.callIdHeader.getCallId().equals("")) {
                    if (getFrom() != null) {
                        if (getViaHeaders() != null) {
                            if (getMaxForwards() != null) {
                                if (getTopmostVia() != null) {
                                    if (getMethod().equals(TokenNames.NOTIFY)) {
                                        if (getHeader(SIPHeaderNames.SUBSCRIPTION_STATE) != null) {
                                            if (getFromHeader().getTag() != null && getToHeader().getTag() != null && getHeader(SIPHeaderNames.EVENT) == null) {
                                                throw new ParseException("Missing a required header : Event", 0);
                                            }
                                        } else {
                                            throw new ParseException("Missing a required header : Subscription-State", 0);
                                        }
                                    } else if (getMethod().equals(TokenNames.PUBLISH) && getHeader(SIPHeaderNames.EVENT) == null) {
                                        throw new ParseException("Missing a required header : Event", 0);
                                    }
                                    String method = this.requestLine.getMethod();
                                    if (SIPTransactionStack.isDialogCreated(method) && getContactHeader() == null && getToTag() == null) {
                                        throw new ParseException("Missing a required header : Contact", 0);
                                    }
                                    if (this.requestLine != null && method != null && getCSeq().getMethod() != null && method.compareTo(getCSeq().getMethod()) != 0) {
                                        throw new ParseException("CSEQ method mismatch with  Request-Line ", 0);
                                    }
                                    return;
                                }
                                throw new ParseException("No via header in request! ", 0);
                            }
                            throw new ParseException("Missing a required header : Max-Forwards", 0);
                        }
                        throw new ParseException("Missing a required header : Via", 0);
                    }
                    throw new ParseException("Missing a required header : From", 0);
                }
                throw new ParseException("Missing a required header : Call-ID", 0);
            }
            throw new ParseException("Missing a required header : To", 0);
        }
        throw new ParseException("Missing a required header : CSeq", 0);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public void cleanUp() {
        super.cleanUp();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public Object clone() {
        SIPRequest sIPRequest = (SIPRequest) super.clone();
        sIPRequest.transactionPointer = null;
        RequestLine requestLine = this.requestLine;
        if (requestLine != null) {
            sIPRequest.requestLine = (RequestLine) requestLine.clone();
        }
        return sIPRequest;
    }

    public SIPRequest createAckRequest(To to) {
        SIPRequest sIPRequest = (SIPRequest) clone();
        sIPRequest.setMethod(TokenNames.ACK);
        sIPRequest.removeHeader(SIPHeaderNames.ROUTE);
        sIPRequest.removeHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        sIPRequest.removeContent();
        sIPRequest.removeHeader(SIPHeaderNames.CONTENT_TYPE);
        try {
            sIPRequest.getCSeq().setMethod(TokenNames.ACK);
        } catch (ParseException unused) {
        }
        if (to != null) {
            sIPRequest.setTo(to);
        }
        sIPRequest.removeHeader(SIPHeaderNames.CONTACT);
        sIPRequest.removeHeader(SIPHeaderNames.EXPIRES);
        ViaList viaHeaders = sIPRequest.getViaHeaders();
        if (viaHeaders != null && viaHeaders.size() > 1) {
            for (int i10 = 2; i10 < viaHeaders.size(); i10++) {
                viaHeaders.remove(i10);
            }
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public SIPRequest createCancelRequest() {
        if (getMethod().equals(TokenNames.INVITE)) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestLine((RequestLine) this.requestLine.clone());
            sIPRequest.setMethod("CANCEL");
            sIPRequest.setHeader((AbstractC2268x) this.callIdHeader.clone());
            sIPRequest.setHeader((AbstractC2268x) this.toHeader.clone());
            sIPRequest.setHeader((AbstractC2268x) this.cSeqHeader.clone());
            try {
                sIPRequest.getCSeq().setMethod("CANCEL");
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
            sIPRequest.setHeader((AbstractC2268x) this.fromHeader.clone());
            sIPRequest.addFirst((AbstractC2268x) getTopmostVia().clone());
            sIPRequest.setHeader((AbstractC2268x) this.maxForwardsHeader.clone());
            if (getRouteHeaders() != null) {
                sIPRequest.setHeader((AbstractC2268x) ((SIPHeaderList) getRouteHeaders().clone()));
            }
            if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
                sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
            }
            return sIPRequest;
        }
        throw new n("Attempt to create CANCEL for " + getMethod());
    }

    public final SIPRequest createErrorAck(To to) {
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestLine((RequestLine) this.requestLine.clone());
        sIPRequest.setMethod(TokenNames.ACK);
        sIPRequest.setHeader((AbstractC2268x) this.callIdHeader.clone());
        sIPRequest.setHeader((AbstractC2268x) this.maxForwardsHeader.clone());
        sIPRequest.setHeader((AbstractC2268x) this.fromHeader.clone());
        sIPRequest.setHeader((AbstractC2268x) to.clone());
        sIPRequest.addFirst((AbstractC2268x) getTopmostVia().clone());
        sIPRequest.setHeader((AbstractC2268x) this.cSeqHeader.clone());
        sIPRequest.getCSeq().setMethod(TokenNames.ACK);
        if (getRouteHeaders() != null) {
            sIPRequest.setHeader((SIPHeaderList) getRouteHeaders().clone());
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public SIPResponse createResponse(int i10) {
        return createResponse(i10, SIPResponse.getReasonPhrase(i10));
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        String debugDump = super.debugDump();
        this.stringRepresentation = "";
        sprint(SIPRequest.class.getName());
        sprint("{");
        RequestLine requestLine = this.requestLine;
        if (requestLine != null) {
            sprint(requestLine.debugDump());
        }
        sprint(debugDump);
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        if (this.requestLine != null) {
            setRequestLineDefaults();
            return this.requestLine.encode() + super.encode();
        } else if (isNullRequest()) {
            return "\r\n\r\n";
        } else {
            return super.encode();
        }
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public byte[] encodeAsBytes(String str) {
        byte[] bytes;
        if (isNullRequest()) {
            return "\r\n\r\n".getBytes();
        }
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return new byte[0];
        }
        if (requestLine != null) {
            try {
                bytes = requestLine.encode().getBytes("UTF-8");
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
        if (this.requestLine != null) {
            setRequestLineDefaults();
            this.requestLine.encode(sb2);
            encodeSIPHeaders(sb2);
            return sb2;
        } else if (isNullRequest()) {
            sb2.append("\r\n\r\n");
            return sb2;
        } else {
            return encodeSIPHeaders(sb2);
        }
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || !this.requestLine.equals(((SIPRequest) obj).requestLine) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getFirstLine() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.encode();
    }

    public Object getInviteTransaction() {
        return this.inviteTransaction;
    }

    public String getMergeId() {
        String fromTag = getFromTag();
        String sIPHeader = this.cSeqHeader.toString();
        String callId = this.callIdHeader.getCallId();
        String abstractC2096f = getRequestURI().toString();
        if (fromTag != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(abstractC2096f);
            sb2.append(":");
            sb2.append(fromTag);
            sb2.append(":");
            sb2.append(sIPHeader);
            return a.t(sb2, ":", callId);
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public LinkedList getMessageAsEncodedStrings() {
        LinkedList<String> messageAsEncodedStrings = super.getMessageAsEncodedStrings();
        if (this.requestLine != null) {
            setRequestLineDefaults();
            messageAsEncodedStrings.addFirst(this.requestLine.encode());
        }
        return messageAsEncodedStrings;
    }

    public Object getMessageChannel() {
        return this.messageChannel;
    }

    @Override // d.AbstractC2561b
    public String getMethod() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getMethod();
    }

    public RequestLine getRequestLine() {
        return this.requestLine;
    }

    @Override // d.AbstractC2561b
    public AbstractC2096f getRequestURI() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getUri();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getSIPVersion() {
        return this.requestLine.getSipVersion();
    }

    public Object getTransaction() {
        return this.transactionPointer;
    }

    public String getViaHost() {
        return ((Via) getViaHeaders().getFirst()).getHost();
    }

    public int getViaPort() {
        Via via = (Via) getViaHeaders().getFirst();
        if (via.hasPort()) {
            return via.getPort();
        }
        return SIPConstants.DEFAULT_PORT;
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
        RequestLine requestLine = ((SIPRequest) obj).requestLine;
        RequestLine requestLine2 = this.requestLine;
        if (requestLine2 == null && requestLine != null) {
            return false;
        }
        if (requestLine2 == requestLine) {
            return super.match(obj);
        }
        if (requestLine2.match(requestLine) && super.match(obj)) {
            return true;
        }
        return false;
    }

    public final boolean mustCopyRR(int i10) {
        if (i10 <= 100 || i10 >= 300 || !isDialogCreating(getMethod()) || getToTag() != null) {
            return false;
        }
        return true;
    }

    public void setDefaults() {
        String method;
        GenericURI uri;
        RequestLine requestLine = this.requestLine;
        if (requestLine == null || (method = requestLine.getMethod()) == null || (uri = this.requestLine.getUri()) == null) {
            return;
        }
        if ((method.compareTo(TokenNames.REGISTER) == 0 || method.compareTo(TokenNames.INVITE) == 0) && (uri instanceof SipUri)) {
            SipUri sipUri = (SipUri) uri;
            sipUri.setUserParam(DEFAULT_USER);
            try {
                sipUri.setTransportParam("udp");
            } catch (ParseException unused) {
            }
        }
    }

    public void setInviteTransaction(Object obj) {
        this.inviteTransaction = obj;
    }

    public void setMessageChannel(Object obj) {
        this.messageChannel = obj;
    }

    @Override // android.gov.nist.javax.sip.message.RequestExt
    public void setMethod(String str) {
        if (str != null) {
            if (this.requestLine == null) {
                this.requestLine = new RequestLine();
            }
            String cannonicalName = getCannonicalName(str);
            this.requestLine.setMethod(cannonicalName);
            CSeq cSeq = this.cSeqHeader;
            if (cSeq != null) {
                try {
                    cSeq.setMethod(cannonicalName);
                    return;
                } catch (ParseException unused) {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("null method");
    }

    public void setRequestLine(RequestLine requestLine) {
        this.requestLine = requestLine;
    }

    public void setRequestLineDefaults() {
        CSeq cSeq;
        if (this.requestLine.getMethod() == null && (cSeq = (CSeq) getCSeq()) != null) {
            this.requestLine.setMethod(getCannonicalName(cSeq.getMethod()));
        }
    }

    @Override // android.gov.nist.javax.sip.message.RequestExt
    public void setRequestURI(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            if (this.requestLine == null) {
                this.requestLine = new RequestLine();
            }
            this.requestLine.setUri((GenericURI) abstractC2096f);
            this.nullRequest = false;
            return;
        }
        throw new NullPointerException("Null request URI");
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public void setSIPVersion(String str) {
        if (str != null && str.equalsIgnoreCase(SIPConstants.SIP_VERSION_STRING)) {
            this.requestLine.setSipVersion(str);
            return;
        }
        throw new ParseException("sipVersion", 0);
    }

    public void setTransaction(Object obj) {
        this.transactionPointer = obj;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public String toString() {
        return encode();
    }

    public SIPResponse createResponse(int i10, String str) {
        boolean z10;
        SIPResponse sIPResponse = new SIPResponse();
        try {
            sIPResponse.setStatusCode(i10);
            if (str != null) {
                sIPResponse.setReasonPhrase(str);
            } else {
                sIPResponse.setReasonPhrase(SIPResponse.getReasonPhrase(i10));
            }
            for (String str2 : headersToIncludeInResponse) {
                SIPHeader sIPHeader = this.headerTable.get(str2);
                if (sIPHeader != null && (!((z10 = sIPHeader instanceof RecordRouteList)) || (z10 && mustCopyRR(i10)))) {
                    try {
                        sIPResponse.attachHeader((SIPHeader) sIPHeader.clone(), false);
                    } catch (SIPDuplicateHeaderException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            if (MessageFactoryImpl.getDefaultServerHeader() != null) {
                sIPResponse.setHeader(MessageFactoryImpl.getDefaultServerHeader());
            }
            Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponse.setHeader(defaultServerHeader);
            }
            return sIPResponse;
        } catch (ParseException unused) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Bad code ", i10));
        }
    }
}
