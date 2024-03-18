package android.gov.nist.javax.sip;

import android.javax.sip.a;
import android.javax.sip.b;
import java.util.EventObject;

/* loaded from: classes2.dex */
public class DialogTimeoutEvent extends EventObject {
    private static final long serialVersionUID = -2514000059989311925L;
    private b m_dialog;
    private a m_reInviteTransaction = null;
    private Reason m_reason;

    /* loaded from: classes2.dex */
    public enum Reason {
        AckNotReceived,
        AckNotSent,
        ReInviteTimeout,
        EarlyStateTimeout,
        CannotAcquireAckSemaphoreForOk
    }

    public DialogTimeoutEvent(Object obj, b bVar, Reason reason) {
        super(obj);
        this.m_dialog = bVar;
        this.m_reason = reason;
    }

    public a getClientTransaction() {
        return this.m_reInviteTransaction;
    }

    public b getDialog() {
        return this.m_dialog;
    }

    public Reason getReason() {
        return this.m_reason;
    }

    public void setClientTransaction(a aVar) {
        this.m_reInviteTransaction = aVar;
    }
}
