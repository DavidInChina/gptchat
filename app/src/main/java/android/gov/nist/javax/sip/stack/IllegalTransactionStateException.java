package android.gov.nist.javax.sip.stack;

import android.javax.sip.n;

/* loaded from: classes.dex */
public class IllegalTransactionStateException extends n {
    Reason reason;

    /* loaded from: classes.dex */
    public enum Reason {
        RequestAlreadySent,
        MissingRequiredHeader,
        UnmatchingCSeq,
        ExpiresHeaderMandatory,
        ContactHeaderMandatory,
        GenericReason
    }

    public IllegalTransactionStateException(Reason reason) {
        Reason reason2 = Reason.RequestAlreadySent;
        this.reason = reason;
    }

    public Reason getReason() {
        return this.reason;
    }

    public IllegalTransactionStateException(String str, Reason reason) {
        super(str);
        Reason reason2 = Reason.RequestAlreadySent;
        this.reason = reason;
    }

    public IllegalTransactionStateException(String str, Throwable th2, Reason reason) {
        super(str, th2);
        Reason reason2 = Reason.RequestAlreadySent;
        this.reason = reason;
    }
}
