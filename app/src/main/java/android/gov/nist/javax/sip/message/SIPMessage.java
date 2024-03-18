package android.gov.nist.javax.sip.message;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.AlertInfo;
import android.gov.nist.javax.sip.header.Authorization;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.ContactList;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.ErrorInfo;
import android.gov.nist.javax.sip.header.ErrorInfoList;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.InReplyTo;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.Priority;
import android.gov.nist.javax.sip.header.ProxyAuthenticate;
import android.gov.nist.javax.sip.header.ProxyAuthorization;
import android.gov.nist.javax.sip.header.ProxyRequire;
import android.gov.nist.javax.sip.header.ProxyRequireList;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.RetryAfter;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPETag;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.SIPHeaderNamesCache;
import android.gov.nist.javax.sip.header.SIPIfMatch;
import android.gov.nist.javax.sip.header.Server;
import android.gov.nist.javax.sip.header.Subject;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Unsupported;
import android.gov.nist.javax.sip.header.UserAgent;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.header.WWWAuthenticate;
import android.gov.nist.javax.sip.header.Warning;
import android.gov.nist.javax.sip.parser.ParserFactory;
import android.javax.sip.g;
import android.javax.sip.n;
import c.AbstractC2230B;
import c.AbstractC2244P;
import c.AbstractC2254i;
import c.AbstractC2255j;
import c.AbstractC2258m;
import c.AbstractC2259n;
import c.AbstractC2260o;
import c.AbstractC2261p;
import c.AbstractC2262q;
import c.AbstractC2265u;
import c.AbstractC2267w;
import c.AbstractC2268x;
import c.d0;
import c.g0;
import d.AbstractC2560a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class SIPMessage extends MessageObject implements AbstractC2560a, MessageExt {
    protected Object applicationData;
    protected CSeq cSeqHeader;
    protected CallID callIdHeader;
    protected ContentLength contentLengthHeader;
    protected String forkId;
    protected From fromHeader;
    private InetAddress localAddress;
    private int localPort;
    protected MaxForwards maxForwardsHeader;
    protected String messageContent;
    protected byte[] messageContentBytes;
    protected Object messageContentObject;
    protected boolean nullRequest;
    private InetAddress peerPacketSourceAddress;
    private int peerPacketSourcePort;
    private InetAddress remoteAddress;
    private int remotePort;
    protected int size;
    protected To toHeader;
    private static final String CONTENT_TYPE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_TYPE);
    private static final String ERROR_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.ERROR_INFO);
    private static final String CONTACT_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTACT);
    private static final String VIA_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.VIA);
    private static final String AUTHORIZATION_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.AUTHORIZATION);
    private static final String ROUTE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.ROUTE);
    private static final String RECORDROUTE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.RECORD_ROUTE);
    private static final String CONTENT_DISPOSITION_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_DISPOSITION);
    private static final String CONTENT_ENCODING_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_ENCODING);
    private static final String CONTENT_LANGUAGE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_LANGUAGE);
    private static final String EXPIRES_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.EXPIRES);
    private String contentEncodingCharset = MessageFactoryImpl.getDefaultContentEncodingCharset();
    protected LinkedList<String> unrecognizedHeaders = new LinkedList<>();
    protected ConcurrentLinkedQueue<SIPHeader> headers = new ConcurrentLinkedQueue<>();
    protected Map<String, SIPHeader> headerTable = new ConcurrentHashMap();

    public SIPMessage() {
        try {
            attachHeader(new ContentLength(0), false);
        } catch (Exception unused) {
        }
    }

    private void attachHeader(SIPHeader sIPHeader) {
        if (sIPHeader != null) {
            try {
                if ((sIPHeader instanceof SIPHeaderList) && ((SIPHeaderList) sIPHeader).isEmpty()) {
                    return;
                }
                attachHeader(sIPHeader, false, false);
                return;
            } catch (SIPDuplicateHeaderException unused) {
                return;
            }
        }
        throw new IllegalArgumentException("null header!");
    }

    private void computeContentLength(Object obj) {
        int i10;
        try {
            if (obj != null) {
                if (obj instanceof String) {
                    try {
                        i10 = ((String) obj).getBytes(getCharset()).length;
                    } catch (UnsupportedEncodingException e10) {
                        InternalErrorHandler.handleException(e10);
                    }
                } else if (obj instanceof byte[]) {
                    i10 = ((byte[]) obj).length;
                } else {
                    i10 = obj.toString().length();
                }
                this.contentLengthHeader.setContentLength(i10);
                return;
            }
            this.contentLengthHeader.setContentLength(i10);
            return;
        } catch (g unused) {
            return;
        }
        i10 = 0;
    }

    private List<SIPHeader> getHeaderList(String str) {
        SIPHeader sIPHeader = this.headerTable.get(SIPHeaderNamesCache.toLowerCase(str));
        if (sIPHeader == null) {
            return null;
        }
        if (sIPHeader instanceof SIPHeaderList) {
            return ((SIPHeaderList) sIPHeader).getHeaderList();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(sIPHeader);
        return linkedList;
    }

    public static boolean isRequestHeader(SIPHeader sIPHeader) {
        if (!(sIPHeader instanceof AlertInfo) && !(sIPHeader instanceof InReplyTo) && !(sIPHeader instanceof Authorization) && !(sIPHeader instanceof MaxForwards) && !(sIPHeader instanceof UserAgent) && !(sIPHeader instanceof Priority) && !(sIPHeader instanceof ProxyAuthorization) && !(sIPHeader instanceof ProxyRequire) && !(sIPHeader instanceof ProxyRequireList) && !(sIPHeader instanceof Route) && !(sIPHeader instanceof RouteList) && !(sIPHeader instanceof Subject) && !(sIPHeader instanceof SIPIfMatch)) {
            return false;
        }
        return true;
    }

    public static boolean isResponseHeader(SIPHeader sIPHeader) {
        if (!(sIPHeader instanceof ErrorInfo) && !(sIPHeader instanceof ProxyAuthenticate) && !(sIPHeader instanceof Server) && !(sIPHeader instanceof Unsupported) && !(sIPHeader instanceof RetryAfter) && !(sIPHeader instanceof Warning) && !(sIPHeader instanceof WWWAuthenticate) && !(sIPHeader instanceof SIPETag) && !(sIPHeader instanceof RSeq)) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void addFirst(AbstractC2268x abstractC2268x) {
        if (abstractC2268x != null) {
            try {
                attachHeader((SIPHeader) abstractC2268x, false, true);
                return;
            } catch (SIPDuplicateHeaderException unused) {
                throw new n("Cannot add header - header already exists");
            }
        }
        throw new NullPointerException("null arg!");
    }

    @Override // d.AbstractC2560a
    public void addHeader(AbstractC2268x abstractC2268x) {
        SIPHeader sIPHeader = (SIPHeader) abstractC2268x;
        try {
            try {
                if (!(abstractC2268x instanceof g0) && !(abstractC2268x instanceof AbstractC2244P)) {
                    attachHeader(sIPHeader, false, false);
                }
                attachHeader(sIPHeader, false, true);
            } catch (SIPDuplicateHeaderException unused) {
                if (!(abstractC2268x instanceof ContentLength)) {
                    return;
                }
                this.contentLengthHeader.setContentLength(((ContentLength) abstractC2268x).getContentLength());
            }
        } catch (g unused2) {
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void addLast(AbstractC2268x abstractC2268x) {
        if (abstractC2268x != null) {
            try {
                attachHeader((SIPHeader) abstractC2268x, false, false);
                return;
            } catch (SIPDuplicateHeaderException unused) {
                throw new n("Cannot add header - header already exists");
            }
        }
        throw new NullPointerException("null arg!");
    }

    public void addUnparsed(String str) {
        getUnrecognizedHeadersList().add(str);
    }

    public void cleanUp() {
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SIPMessage sIPMessage = (SIPMessage) super.clone();
        sIPMessage.headerTable = new ConcurrentHashMap();
        sIPMessage.fromHeader = null;
        sIPMessage.toHeader = null;
        sIPMessage.cSeqHeader = null;
        sIPMessage.callIdHeader = null;
        sIPMessage.contentLengthHeader = null;
        sIPMessage.maxForwardsHeader = null;
        sIPMessage.forkId = null;
        if (this.headers != null) {
            sIPMessage.headers = new ConcurrentLinkedQueue<>();
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                sIPMessage.attachHeader((SIPHeader) it.next().clone());
            }
        }
        byte[] bArr = this.messageContentBytes;
        if (bArr != null) {
            sIPMessage.messageContentBytes = (byte[]) bArr.clone();
        }
        Object obj = this.messageContentObject;
        if (obj != null) {
            sIPMessage.messageContentObject = GenericObject.makeClone(obj);
        }
        sIPMessage.unrecognizedHeaders = this.unrecognizedHeaders;
        sIPMessage.remoteAddress = this.remoteAddress;
        sIPMessage.remotePort = this.remotePort;
        return sIPMessage;
    }

    @Override // android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        Field[] declaredFields;
        this.stringRepresentation = "";
        sprint("SIPMessage:");
        sprint("{");
        try {
            for (Field field : getClass().getDeclaredFields()) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (field.get(this) != null && SIPHeader.class.isAssignableFrom(type) && name.compareTo("headers") != 0) {
                    sprint(name + Separators.EQUALS);
                    sprint(((SIPHeader) field.get(this)).debugDump());
                }
            }
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
        }
        sprint("List of headers : ");
        sprint(this.headers.toString());
        sprint("messageContent = ");
        sprint("{");
        sprint(this.messageContent);
        sprint("}");
        if (getContent() != null) {
            sprint(getContent().toString());
        }
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<SIPHeader> it = this.headers.iterator();
        while (it.hasNext()) {
            SIPHeader next = it.next();
            if (!(next instanceof ContentLength)) {
                next.encode(sb2);
            }
        }
        LinkedList<String> linkedList = this.unrecognizedHeaders;
        if (linkedList != null) {
            Iterator<String> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next());
                sb2.append(Separators.NEWLINE);
            }
        }
        this.contentLengthHeader.encode(sb2).append(Separators.NEWLINE);
        if (this.messageContentObject != null) {
            sb2.append(getContent().toString());
        } else {
            String str = this.messageContent;
            if (str != null || this.messageContentBytes != null) {
                if (str == null) {
                    try {
                        str = new String(this.messageContentBytes, getCharset());
                    } catch (UnsupportedEncodingException e10) {
                        InternalErrorHandler.handleException(e10);
                        str = null;
                    }
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public byte[] encodeAsBytes(String str) {
        if ((this instanceof SIPRequest) && ((SIPRequest) this).isNullRequest()) {
            return "\r\n\r\n".getBytes();
        }
        try {
            ((g0) getHeader(SIPHeaderNames.VIA)).setTransport(str);
        } catch (ParseException e10) {
            InternalErrorHandler.handleException(e10);
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.headers) {
            try {
                Iterator<SIPHeader> it = this.headers.iterator();
                while (it.hasNext()) {
                    SIPHeader next = it.next();
                    if (!(next instanceof ContentLength)) {
                        next.encode(sb2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.contentLengthHeader.encode(sb2);
        sb2.append(Separators.NEWLINE);
        byte[] rawContent = getRawContent();
        byte[] bArr = null;
        if (rawContent != null) {
            try {
                bArr = sb2.toString().getBytes(getCharset());
            } catch (UnsupportedEncodingException e11) {
                InternalErrorHandler.handleException(e11);
            }
            byte[] bArr2 = new byte[bArr.length + rawContent.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(rawContent, 0, bArr2, bArr.length, rawContent.length);
            return bArr2;
        }
        try {
            return sb2.toString().getBytes(getCharset());
        } catch (UnsupportedEncodingException e12) {
            InternalErrorHandler.handleException(e12);
            return null;
        }
    }

    public abstract StringBuilder encodeMessage(StringBuilder sb2);

    public StringBuilder encodeSIPHeaders(StringBuilder sb2) {
        Iterator<SIPHeader> it = this.headers.iterator();
        while (it.hasNext()) {
            SIPHeader next = it.next();
            if (!(next instanceof ContentLength)) {
                next.encode(sb2);
            }
        }
        StringBuilder encode = this.contentLengthHeader.encode(sb2);
        encode.append(Separators.NEWLINE);
        return encode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // android.gov.nist.core.GenericObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        SIPMessage sIPMessage = (SIPMessage) obj;
        if (this.headerTable.size() != sIPMessage.headerTable.size()) {
            return false;
        }
        for (SIPHeader sIPHeader : this.headerTable.values()) {
            SIPHeader sIPHeader2 = sIPMessage.headerTable.get(SIPHeaderNamesCache.toLowerCase(sIPHeader.getName()));
            if (sIPHeader2 == null || !sIPHeader2.equals(sIPHeader)) {
                return false;
            }
            while (r0.hasNext()) {
            }
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public Object getApplicationData() {
        return this.applicationData;
    }

    public Authorization getAuthorization() {
        return (Authorization) getHeaderLowerCase(AUTHORIZATION_LOWERCASE);
    }

    public AbstractC2254i getCSeq() {
        return this.cSeqHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2254i getCSeqHeader() {
        return this.cSeqHeader;
    }

    public AbstractC2255j getCallId() {
        return this.callIdHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2255j getCallIdHeader() {
        return this.callIdHeader;
    }

    public final String getCharset() {
        ContentType contentTypeHeader = getContentTypeHeader();
        if (contentTypeHeader != null) {
            String charset = contentTypeHeader.getCharset();
            if (charset == null) {
                return this.contentEncodingCharset;
            }
            return charset;
        }
        return this.contentEncodingCharset;
    }

    public Contact getContactHeader() {
        ContactList contactHeaders = getContactHeaders();
        if (contactHeaders != null) {
            return (Contact) contactHeaders.getFirst();
        }
        return null;
    }

    public ContactList getContactHeaders() {
        return (ContactList) getSIPHeaderListLowerCase(CONTACT_LOWERCASE);
    }

    @Override // d.AbstractC2560a
    public Object getContent() {
        Object obj = this.messageContentObject;
        if (obj != null) {
            return obj;
        }
        String str = this.messageContent;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.messageContentBytes;
        if (bArr != null) {
            return bArr;
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2258m getContentDisposition() {
        return (AbstractC2258m) getHeaderLowerCase(CONTENT_DISPOSITION_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2259n getContentEncoding() {
        return (AbstractC2259n) getHeaderLowerCase(CONTENT_ENCODING_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2260o getContentLanguage() {
        return (AbstractC2260o) getHeaderLowerCase(CONTENT_LANGUAGE_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2261p getContentLength() {
        return this.contentLengthHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2261p getContentLengthHeader() {
        return getContentLength();
    }

    public final String getDialogId(boolean z10) {
        return getDialogId(z10, ((To) getTo()).getTag());
    }

    public ErrorInfoList getErrorInfoHeaders() {
        return (ErrorInfoList) getSIPHeaderListLowerCase(ERROR_LOWERCASE);
    }

    @Override // d.AbstractC2560a
    public AbstractC2265u getExpires() {
        return (AbstractC2265u) getHeaderLowerCase(EXPIRES_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract String getFirstLine();

    public String getForkId() {
        String str = this.forkId;
        if (str != null) {
            return str;
        }
        String callId = getCallId().getCallId();
        String fromTag = getFromTag();
        if (fromTag != null) {
            String lowerCase = (callId + ":" + fromTag).toLowerCase();
            this.forkId = lowerCase;
            return lowerCase;
        }
        throw new IllegalStateException("From tag is not yet set. Cannot compute forkId");
    }

    public AbstractC2267w getFrom() {
        return this.fromHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public AbstractC2267w getFromHeader() {
        return this.fromHeader;
    }

    public String getFromTag() {
        From from = this.fromHeader;
        if (from == null) {
            return null;
        }
        return from.getTag();
    }

    @Override // d.AbstractC2560a
    public AbstractC2268x getHeader(String str) {
        return getHeaderLowerCase(SIPHeaderNamesCache.toLowerCase(str));
    }

    public String getHeaderAsFormattedString(String str) {
        String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
        if (this.headerTable.containsKey(lowerCase)) {
            return this.headerTable.get(lowerCase).toString();
        }
        return getHeader(str).toString();
    }

    public AbstractC2268x getHeaderLowerCase(String str) {
        if (str != null) {
            SIPHeader sIPHeader = this.headerTable.get(str);
            if (sIPHeader instanceof SIPHeaderList) {
                return ((SIPHeaderList) sIPHeader).getFirst();
            }
            return sIPHeader;
        }
        throw new NullPointerException("bad name");
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ListIterator<String> getHeaderNames() {
        Iterator<SIPHeader> it = this.headers.iterator();
        LinkedList linkedList = new LinkedList();
        while (it.hasNext()) {
            linkedList.add(it.next().getName());
        }
        return linkedList.listIterator();
    }

    public Iterator<SIPHeader> getHeaders() {
        return this.headers.iterator();
    }

    public InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public int getLocalPort() {
        return this.localPort;
    }

    public AbstractC2230B getMaxForwards() {
        return this.maxForwardsHeader;
    }

    public LinkedList<String> getMessageAsEncodedStrings() {
        LinkedList<String> linkedList = new LinkedList<>();
        Iterator<SIPHeader> it = this.headers.iterator();
        while (it.hasNext()) {
            SIPHeader next = it.next();
            if (next instanceof SIPHeaderList) {
                linkedList.addAll(((SIPHeaderList) next).getHeadersAsEncodedStrings());
            } else {
                linkedList.add(next.encode());
            }
        }
        return linkedList;
    }

    public String getMessageContent() {
        String str = this.messageContent;
        if (str == null && this.messageContentBytes == null) {
            return null;
        }
        if (str == null) {
            this.messageContent = new String(this.messageContentBytes, getCharset());
        }
        return this.messageContent;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public MultipartMimeContent getMultipartMimeContent() {
        if (this.contentLengthHeader.getContentLength() == 0) {
            return null;
        }
        MultipartMimeContentImpl multipartMimeContentImpl = new MultipartMimeContentImpl(getContentTypeHeader());
        try {
            multipartMimeContentImpl.createContentList(new String(getRawContent(), getCharset()));
            return multipartMimeContentImpl;
        } catch (UnsupportedEncodingException e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public InetAddress getPeerPacketSourceAddress() {
        return this.peerPacketSourceAddress;
    }

    public int getPeerPacketSourcePort() {
        return this.peerPacketSourcePort;
    }

    @Override // d.AbstractC2560a
    public byte[] getRawContent() {
        try {
            if (this.messageContentBytes == null) {
                Object obj = this.messageContentObject;
                if (obj != null) {
                    this.messageContentBytes = obj.toString().getBytes(getCharset());
                } else {
                    String str = this.messageContent;
                    if (str != null) {
                        this.messageContentBytes = str.getBytes(getCharset());
                    }
                }
            }
            return this.messageContentBytes;
        } catch (UnsupportedEncodingException e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public RecordRouteList getRecordRouteHeaders() {
        return (RecordRouteList) getSIPHeaderListLowerCase(RECORDROUTE_LOWERCASE);
    }

    public InetAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public RouteList getRouteHeaders() {
        return (RouteList) getSIPHeaderListLowerCase(ROUTE_LOWERCASE);
    }

    public SIPHeader getSIPHeaderListLowerCase(String str) {
        return this.headerTable.get(str);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract String getSIPVersion();

    public int getSize() {
        return this.size;
    }

    public d0 getTo() {
        return this.toHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public d0 getToHeader() {
        return this.toHeader;
    }

    public String getToTag() {
        To to = this.toHeader;
        if (to == null) {
            return null;
        }
        return to.getTag();
    }

    public Via getTopmostVia() {
        if (getViaHeaders() == null) {
            return null;
        }
        return (Via) getViaHeaders().getFirst();
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public g0 getTopmostViaHeader() {
        return getTopmostVia();
    }

    public String getTransactionId() {
        Via topmostVia = getTopmostVia();
        if (topmostVia != null && topmostVia.getBranch() != null && topmostVia.getBranch().toUpperCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_UPPER_CASE)) {
            if (getCSeq().getMethod().equals("CANCEL")) {
                return (topmostVia.getBranch() + ":" + getCSeq().getMethod()).toLowerCase();
            }
            return topmostVia.getBranch().toLowerCase();
        }
        StringBuilder sb2 = new StringBuilder();
        From from = (From) getFrom();
        To to = (To) getTo();
        if (from.hasTag()) {
            sb2.append(from.getTag());
            sb2.append("-");
        }
        sb2.append(this.callIdHeader.getCallId());
        sb2.append("-");
        sb2.append(this.cSeqHeader.getSequenceNumber());
        sb2.append("-");
        sb2.append(this.cSeqHeader.getMethod());
        if (topmostVia != null) {
            sb2.append("-");
            sb2.append(topmostVia.getSentBy().encode());
            if (!topmostVia.getSentBy().hasPort()) {
                sb2.append("-5060");
            }
        }
        if (getCSeq().getMethod().equals("CANCEL")) {
            sb2.append("CANCEL");
        }
        return sb2.toString().toLowerCase().replace(":", "-").replace(Separators.AT, "-") + Utils.getSignature();
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ListIterator<String> getUnrecognizedHeaders() {
        return getUnrecognizedHeadersList().listIterator();
    }

    public LinkedList<String> getUnrecognizedHeadersList() {
        if (this.unrecognizedHeaders == null) {
            this.unrecognizedHeaders = new LinkedList<>();
        }
        return this.unrecognizedHeaders;
    }

    public ViaList getViaHeaders() {
        return (ViaList) getSIPHeaderListLowerCase(VIA_LOWERCASE);
    }

    public boolean hasContent() {
        if (this.messageContent == null && this.messageContentBytes == null) {
            return false;
        }
        return true;
    }

    public boolean hasFromTag() {
        From from = this.fromHeader;
        if (from != null && from.getTag() != null) {
            return true;
        }
        return false;
    }

    public boolean hasHeader(String str) {
        return this.headerTable.containsKey(SIPHeaderNamesCache.toLowerCase(str));
    }

    public boolean hasToTag() {
        To to = this.toHeader;
        if (to != null && to.getTag() != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        CallID callID = this.callIdHeader;
        if (callID != null) {
            return callID.getCallId().hashCode();
        }
        throw new RuntimeException("Invalid message! Cannot compute hashcode! call-id header is missing !");
    }

    public boolean isNullRequest() {
        return this.nullRequest;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        Iterator<SIPHeader> headers = ((SIPMessage) obj).getHeaders();
        while (headers.hasNext()) {
            SIPHeader next = headers.next();
            List<SIPHeader> headerList = getHeaderList(next.getHeaderName());
            if (headerList != null && headerList.size() != 0) {
                if (next instanceof SIPHeaderList) {
                    ListIterator listIterator = ((SIPHeaderList) next).listIterator();
                    while (listIterator.hasNext()) {
                        SIPHeader sIPHeader = (SIPHeader) listIterator.next();
                        if (!(sIPHeader instanceof ContentLength)) {
                            ListIterator<SIPHeader> listIterator2 = headerList.listIterator();
                            while (listIterator2.hasNext()) {
                                if (listIterator2.next().match(sIPHeader)) {
                                    break;
                                }
                            }
                            return false;
                        }
                    }
                    continue;
                } else {
                    ListIterator<SIPHeader> listIterator3 = headerList.listIterator();
                    while (listIterator3.hasNext()) {
                        if (listIterator3.next().match(next)) {
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.core.GenericObject
    public void merge(Object obj) {
        if (obj.getClass().equals(getClass())) {
            for (Object obj2 : ((SIPMessage) obj).headers.toArray()) {
                SIPHeader sIPHeader = (SIPHeader) obj2;
                List<SIPHeader> headerList = getHeaderList(sIPHeader.getHeaderName());
                if (headerList == null) {
                    attachHeader(sIPHeader);
                } else {
                    ListIterator<SIPHeader> listIterator = headerList.listIterator();
                    while (listIterator.hasNext()) {
                        listIterator.next().merge(sIPHeader);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Bad class " + obj.getClass());
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void removeContent() {
        this.messageContent = null;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        try {
            this.contentLengthHeader.setContentLength(0);
        } catch (g unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void removeFirst(String str) {
        if (str != null) {
            removeHeader(str, true);
            return;
        }
        throw new NullPointerException("Null argument Provided!");
    }

    public void removeHeader(String str, boolean z10) {
        String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
        SIPHeader sIPHeader = this.headerTable.get(lowerCase);
        if (sIPHeader == null) {
            return;
        }
        if (sIPHeader instanceof SIPHeaderList) {
            SIPHeaderList sIPHeaderList = (SIPHeaderList) sIPHeader;
            if (z10) {
                sIPHeaderList.removeFirst();
            } else {
                sIPHeaderList.removeLast();
            }
            if (!sIPHeaderList.isEmpty()) {
                return;
            }
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equalsIgnoreCase(lowerCase)) {
                    it.remove();
                }
            }
            this.headerTable.remove(lowerCase);
            return;
        }
        this.headerTable.remove(lowerCase);
        if (sIPHeader instanceof From) {
            this.fromHeader = null;
        } else if (sIPHeader instanceof To) {
            this.toHeader = null;
        } else if (sIPHeader instanceof CSeq) {
            this.cSeqHeader = null;
        } else if (sIPHeader instanceof CallID) {
            this.callIdHeader = null;
        } else if (sIPHeader instanceof MaxForwards) {
            this.maxForwardsHeader = null;
        } else if (sIPHeader instanceof ContentLength) {
            this.contentLengthHeader = null;
        }
        Iterator<SIPHeader> it2 = this.headers.iterator();
        while (it2.hasNext()) {
            if (it2.next().getName().equalsIgnoreCase(str)) {
                it2.remove();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void removeLast(String str) {
        if (str != null) {
            removeHeader(str, false);
            return;
        }
        throw new NullPointerException("Null argument Provided!");
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setApplicationData(Object obj) {
        this.applicationData = obj;
    }

    public void setCSeq(AbstractC2254i abstractC2254i) {
        setHeader(abstractC2254i);
    }

    public void setCallId(AbstractC2255j abstractC2255j) {
        setHeader(abstractC2255j);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContent(Object obj, AbstractC2262q abstractC2262q) {
        if (obj != null) {
            setHeader(abstractC2262q);
            this.messageContent = null;
            this.messageContentBytes = null;
            this.messageContentObject = null;
            if (obj instanceof String) {
                this.messageContent = (String) obj;
            } else if (obj instanceof byte[]) {
                this.messageContentBytes = (byte[]) obj;
            } else {
                this.messageContentObject = obj;
            }
            computeContentLength(obj);
            return;
        }
        throw new NullPointerException("null content");
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentDisposition(AbstractC2258m abstractC2258m) {
        setHeader(abstractC2258m);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentEncoding(AbstractC2259n abstractC2259n) {
        setHeader(abstractC2259n);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentLanguage(AbstractC2260o abstractC2260o) {
        setHeader(abstractC2260o);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentLength(AbstractC2261p abstractC2261p) {
        try {
            this.contentLengthHeader.setContentLength(abstractC2261p.getContentLength());
        } catch (g unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setExpires(AbstractC2265u abstractC2265u) {
        setHeader(abstractC2265u);
    }

    public void setFrom(AbstractC2267w abstractC2267w) {
        setHeader(abstractC2267w);
    }

    public void setFromTag(String str) {
        try {
            this.fromHeader.setTag(str);
        } catch (ParseException unused) {
        }
    }

    @Override // d.AbstractC2560a
    public void setHeader(AbstractC2268x abstractC2268x) {
        SIPHeader sIPHeader = (SIPHeader) abstractC2268x;
        if (sIPHeader != null) {
            try {
                if ((sIPHeader instanceof SIPHeaderList) && ((SIPHeaderList) sIPHeader).isEmpty()) {
                    return;
                }
                removeHeader(sIPHeader.getHeaderName());
                attachHeader(sIPHeader, true, false);
                return;
            } catch (SIPDuplicateHeaderException e10) {
                InternalErrorHandler.handleException(e10);
                return;
            }
        }
        throw new IllegalArgumentException("null header!");
    }

    public void setHeaders(List<SIPHeader> list) {
        ListIterator<SIPHeader> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            try {
                attachHeader(listIterator.next(), false);
            } catch (SIPDuplicateHeaderException unused) {
            }
        }
    }

    public void setLocalAddress(InetAddress inetAddress) {
        this.localAddress = inetAddress;
    }

    public void setLocalPort(int i10) {
        this.localPort = i10;
    }

    public void setMaxForwards(AbstractC2230B abstractC2230B) {
        setHeader(abstractC2230B);
    }

    public void setMessageContent(String str, String str2, String str3) {
        if (str3 != null) {
            setHeader(new ContentType(str, str2));
            this.messageContent = str3;
            this.messageContentBytes = null;
            this.messageContentObject = null;
            computeContentLength(str3);
            return;
        }
        throw new IllegalArgumentException("messgeContent is null");
    }

    public void setNullRequest() {
        this.nullRequest = true;
    }

    public void setPeerPacketSourceAddress(InetAddress inetAddress) {
        this.peerPacketSourceAddress = inetAddress;
    }

    public void setPeerPacketSourcePort(int i10) {
        this.peerPacketSourcePort = i10;
    }

    public void setRemoteAddress(InetAddress inetAddress) {
        this.remoteAddress = inetAddress;
    }

    public void setRemotePort(int i10) {
        this.remotePort = i10;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract void setSIPVersion(String str);

    public void setSize(int i10) {
        this.size = i10;
    }

    public void setTo(d0 d0Var) {
        setHeader(d0Var);
    }

    public void setToTag(String str) {
        try {
            this.toHeader.setTag(str);
        } catch (ParseException unused) {
        }
    }

    public void setUnrecognizedHeadersList(LinkedList<String> linkedList) {
        this.unrecognizedHeaders = linkedList;
    }

    public void setVia(List list) {
        ViaList viaList = new ViaList();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            viaList.add((ViaList) ((Via) listIterator.next()));
        }
        setHeader((SIPHeaderList<Via>) viaList);
    }

    public abstract String toString();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ContentType getContentTypeHeader() {
        return (ContentType) getHeaderLowerCase(CONTENT_TYPE_LOWERCASE);
    }

    @Override // d.AbstractC2560a
    public ListIterator<SIPHeader> getHeaders(String str) {
        if (str != null) {
            SIPHeader sIPHeader = this.headerTable.get(SIPHeaderNamesCache.toLowerCase(str));
            if (sIPHeader == null) {
                return new LinkedList().listIterator();
            }
            if (sIPHeader instanceof SIPHeaderList) {
                return ((SIPHeaderList) sIPHeader).listIterator();
            }
            return new HeaderIterator(this, sIPHeader);
        }
        throw new NullPointerException("null headerName");
    }

    public void setCallId(String str) {
        if (this.callIdHeader == null) {
            setHeader(new CallID());
        }
        this.callIdHeader.setCallId(str);
    }

    public final String getDialogId(boolean z10, String str) {
        From from = (From) getFrom();
        StringBuffer stringBuffer = new StringBuffer(((CallID) getCallId()).getCallId());
        if (!z10) {
            if (from.getTag() != null) {
                stringBuffer.append(":");
                stringBuffer.append(from.getTag());
            }
            if (str != null) {
                stringBuffer.append(":");
                stringBuffer.append(str);
            }
        } else {
            if (str != null) {
                stringBuffer.append(":");
                stringBuffer.append(str);
            }
            if (from.getTag() != null) {
                stringBuffer.append(":");
                stringBuffer.append(from.getTag());
            }
        }
        return stringBuffer.toString().toLowerCase();
    }

    public void attachHeader(SIPHeader sIPHeader, boolean z10) {
        attachHeader(sIPHeader, z10, false);
    }

    public void attachHeader(SIPHeader sIPHeader, boolean z10, boolean z11) {
        SIPHeaderList<SIPHeader> sIPHeaderList;
        if (sIPHeader != null) {
            if (!ListMap.hasList(sIPHeader) || SIPHeaderList.class.isAssignableFrom(sIPHeader.getClass())) {
                sIPHeaderList = sIPHeader;
            } else {
                SIPHeaderList<SIPHeader> list = ListMap.getList(sIPHeader);
                list.add((SIPHeaderList<SIPHeader>) sIPHeader);
                sIPHeaderList = list;
            }
            String lowerCase = SIPHeaderNamesCache.toLowerCase(sIPHeaderList.getName());
            if (z10) {
                this.headerTable.remove(lowerCase);
            } else if (this.headerTable.containsKey(lowerCase) && !(sIPHeaderList instanceof SIPHeaderList)) {
                if (!(sIPHeaderList instanceof ContentLength)) {
                    return;
                }
                try {
                    this.contentLengthHeader.setContentLength(((ContentLength) sIPHeaderList).getContentLength());
                    return;
                } catch (g unused) {
                    return;
                }
            }
            SIPHeader sIPHeader2 = (SIPHeader) getHeader(sIPHeader.getName());
            if (sIPHeader2 != null) {
                Iterator<SIPHeader> it = this.headers.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(sIPHeader2)) {
                        it.remove();
                    }
                }
            }
            if (!this.headerTable.containsKey(lowerCase)) {
                this.headerTable.put(lowerCase, sIPHeaderList);
                this.headers.add(sIPHeaderList);
            } else if (sIPHeaderList instanceof SIPHeaderList) {
                SIPHeaderList sIPHeaderList2 = (SIPHeaderList) this.headerTable.get(lowerCase);
                if (sIPHeaderList2 != null) {
                    sIPHeaderList2.concatenate((SIPHeaderList) sIPHeaderList, z11);
                } else {
                    this.headerTable.put(lowerCase, sIPHeaderList);
                }
            } else {
                this.headerTable.put(lowerCase, sIPHeaderList);
            }
            if (sIPHeaderList instanceof From) {
                this.fromHeader = (From) sIPHeaderList;
                return;
            } else if (sIPHeaderList instanceof ContentLength) {
                this.contentLengthHeader = (ContentLength) sIPHeaderList;
                return;
            } else if (sIPHeaderList instanceof To) {
                this.toHeader = (To) sIPHeaderList;
                return;
            } else if (sIPHeaderList instanceof CSeq) {
                this.cSeqHeader = (CSeq) sIPHeaderList;
                return;
            } else if (sIPHeaderList instanceof CallID) {
                this.callIdHeader = (CallID) sIPHeaderList;
                return;
            } else if (!(sIPHeaderList instanceof MaxForwards)) {
                return;
            } else {
                this.maxForwardsHeader = (MaxForwards) sIPHeaderList;
                return;
            }
        }
        throw new NullPointerException("null header");
    }

    public void addHeader(String str) {
        try {
            attachHeader(ParserFactory.createParser(str + Separators.RETURN).parse(), false);
        } catch (ParseException unused) {
            getUnrecognizedHeadersList().add(str);
        }
    }

    public void setMessageContent(String str, String str2, byte[] bArr) {
        setHeader(new ContentType(str, str2));
        setMessageContent(bArr);
        computeContentLength(bArr);
    }

    public void setHeader(SIPHeaderList<Via> sIPHeaderList) {
        setHeader((AbstractC2268x) sIPHeaderList);
    }

    public void setMessageContent(byte[] bArr, boolean z10, boolean z11, int i10) {
        computeContentLength(bArr);
        if (!z11 && ((!z10 && this.contentLengthHeader.getContentLength() != i10) || this.contentLengthHeader.getContentLength() < i10)) {
            throw new ParseException("Invalid content length " + this.contentLengthHeader.getContentLength() + " / " + i10, 0);
        }
        this.messageContent = null;
        this.messageContentBytes = bArr;
        this.messageContentObject = null;
    }

    public void setMessageContent(byte[] bArr) {
        computeContentLength(bArr);
        this.messageContentBytes = bArr;
        this.messageContent = null;
        this.messageContentObject = null;
    }

    public void setMessageContent(byte[] bArr, boolean z10, int i10) {
        computeContentLength(bArr);
        if (!z10 && this.contentLengthHeader.getContentLength() < i10) {
            throw new ParseException("Invalid content length " + this.contentLengthHeader.getContentLength() + " / " + i10, 0);
        }
        this.messageContentBytes = bArr;
        this.messageContent = null;
        this.messageContentObject = null;
    }

    @Override // d.AbstractC2560a
    public void removeHeader(String str) {
        if (str != null) {
            String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
            SIPHeader remove = this.headerTable.remove(lowerCase);
            if (remove == null) {
                return;
            }
            if (remove instanceof From) {
                this.fromHeader = null;
            } else if (remove instanceof To) {
                this.toHeader = null;
            } else if (remove instanceof CSeq) {
                this.cSeqHeader = null;
            } else if (remove instanceof CallID) {
                this.callIdHeader = null;
            } else if (remove instanceof MaxForwards) {
                this.maxForwardsHeader = null;
            } else if (remove instanceof ContentLength) {
                this.contentLengthHeader = null;
            }
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equalsIgnoreCase(lowerCase)) {
                    it.remove();
                }
            }
            return;
        }
        throw new NullPointerException("null arg");
    }
}
