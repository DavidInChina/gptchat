package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.r;
import d.AbstractC2562c;
import java.io.IOException;

/* loaded from: classes2.dex */
public class CongestionControlMessageValve implements SIPMessageValve {
    private static StackLogger logger = CommonLogger.getLogger(CongestionControlMessageValve.class);
    protected int dropResponseStatus;
    protected int serverTransactionTableHighwaterMark;
    protected SipStackImpl sipStack;

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public void destroy() {
        StackLogger stackLogger = logger;
        stackLogger.logInfo("Destorying the congestion control valve " + this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public void init(r rVar) {
        this.sipStack = (SipStackImpl) rVar;
        logger.logInfo("Initializing congestion control valve");
        this.serverTransactionTableHighwaterMark = new Integer(this.sipStack.getConfigurationProperties().getProperty("android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS", "10000")).intValue();
        this.dropResponseStatus = new Integer(this.sipStack.getConfigurationProperties().getProperty("DROP_RESPONSE_STATUS", "503")).intValue();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public boolean processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        String method = sIPRequest.getMethod();
        if (method.equals(TokenNames.BYE) || method.equals(TokenNames.ACK) || method.equals("PRACK") || method.equals("CANCEL") || this.serverTransactionTableHighwaterMark > this.sipStack.getServerTransactionTableSize() || sIPRequest.getToTag() != null) {
            return true;
        }
        int i10 = this.dropResponseStatus;
        if (i10 > 0) {
            SIPResponse createResponse = sIPRequest.createResponse(i10);
            try {
                messageChannel.sendMessage(createResponse);
                return false;
            } catch (IOException e10) {
                StackLogger stackLogger = logger;
                stackLogger.logError("Failed to send congestion control error response" + createResponse, e10);
                return false;
            }
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public boolean processResponse(AbstractC2562c abstractC2562c, MessageChannel messageChannel) {
        return true;
    }
}
