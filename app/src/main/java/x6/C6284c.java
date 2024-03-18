package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6284c {

    /* renamed from: a  reason: collision with root package name */
    public final String f49266a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49267b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49268c;

    public C6284c(String str, int i10, Boolean bool) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC2469q0.q("type", i10);
        this.f49266a = str;
        this.f49267b = i10;
        this.f49268c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6284c)) {
            return false;
        }
        C6284c c6284c = (C6284c) obj;
        if (AbstractC3557B.K(this.f49266a, c6284c.f49266a) && this.f49267b == c6284c.f49267b && AbstractC3557B.K(this.f49268c, c6284c.f49268c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int d10 = AbstractC6708l.d(this.f49267b, this.f49266a.hashCode() * 31, 31);
        Boolean bool = this.f49268c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        return "ActionEventSession(id=" + this.f49266a + ", type=" + AbstractC6287d.b0(this.f49267b) + ", hasReplay=" + this.f49268c + Separators.RPAREN;
    }
}
