package ca;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import fa.AbstractC2965B;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: ca.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2317i extends AbstractC2313e {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC2323o f26392a;

    /* renamed from: b  reason: collision with root package name */
    public final List f26393b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2965B f26394c;

    /* renamed from: d  reason: collision with root package name */
    public final N f26395d;

    public C2317i(EnumC2323o enumC2323o, List list, AbstractC2965B abstractC2965B, N n10) {
        AbstractC3557B.c0("status", enumC2323o);
        AbstractC3557B.c0("messages", list);
        AbstractC3557B.c0("summary", n10);
        this.f26392a = enumC2323o;
        this.f26393b = list;
        this.f26394c = abstractC2965B;
        this.f26395d = n10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2317i)) {
            return false;
        }
        C2317i c2317i = (C2317i) obj;
        if (this.f26392a == c2317i.f26392a && AbstractC3557B.K(this.f26393b, c2317i.f26393b) && AbstractC3557B.K(this.f26394c, c2317i.f26394c) && AbstractC3557B.K(this.f26395d, c2317i.f26395d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f26393b, this.f26392a.hashCode() * 31, 31);
        AbstractC2965B abstractC2965B = this.f26394c;
        if (abstractC2965B == null) {
            i10 = 0;
        } else {
            i10 = abstractC2965B.hashCode();
        }
        return this.f26395d.hashCode() + ((s10 + i10) * 31);
    }

    public final String toString() {
        return "Tool(status=" + this.f26392a + ", messages=" + this.f26393b + ", content=" + this.f26394c + ", summary=" + this.f26395d + Separators.RPAREN;
    }
}
