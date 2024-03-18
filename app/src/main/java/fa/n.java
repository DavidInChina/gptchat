package fa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import jf.C3963m;

@AbstractC1998i
/* loaded from: classes.dex */
public final class n extends AbstractC2965B {
    public static final l Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final C3963m f30069d = R4.b.D1(k.f30067Y);

    /* renamed from: b  reason: collision with root package name */
    public final String f30070b;

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f30071c;

    public n(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f30070b = str;
            this.f30071c = R4.b.D1(new d9.h(5, this));
            return;
        }
        R4.b.e2(i10, 1, C2980i.f30066b);
        throw null;
    }

    public final wi.s a() {
        Object value = this.f30071c.getValue();
        AbstractC3557B.b0("getValue(...)", value);
        return (wi.s) value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && AbstractC3557B.K(this.f30070b, ((n) obj).f30070b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30070b.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Markdown(content="), this.f30070b, Separators.RPAREN);
    }

    public n(String str) {
        AbstractC3557B.c0("content", str);
        this.f30070b = str;
        this.f30071c = R4.b.D1(new d9.h(5, this));
    }
}
