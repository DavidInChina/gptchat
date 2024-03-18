package android.javax.sip;

/* loaded from: classes.dex */
public class n extends Exception {
    protected Throwable m_Cause;

    public n() {
        this.m_Cause = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.m_Cause;
    }

    public n(String str) {
        super(str);
        this.m_Cause = null;
    }

    public n(String str, Throwable th2) {
        super(str);
        this.m_Cause = th2;
    }
}
