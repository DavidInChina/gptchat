package k5;

/* loaded from: classes2.dex */
public final class G extends J {
    public G(String str) {
        super(android.gov.nist.core.a.h("Could not find a public key for kid \"", str, '\"'), null);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return G.class.getSuperclass().getName() + ": " + getMessage();
    }
}
