package android.gov.nist.javax.sip.stack;

import java.util.EventObject;

/* loaded from: classes2.dex */
public class SIPTransactionErrorEvent extends EventObject {
    public static final int TIMEOUT_ERROR = 1;
    public static final int TIMEOUT_RETRANSMIT = 3;
    public static final int TRANSPORT_ERROR = 2;
    private static final long serialVersionUID = -2713188471978065031L;
    private int errorID;

    public SIPTransactionErrorEvent(SIPTransaction sIPTransaction, int i10) {
        super(sIPTransaction);
        this.errorID = i10;
    }

    public int getErrorID() {
        return this.errorID;
    }
}
