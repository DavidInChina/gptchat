package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2364e {
    public static final C2363d Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f26512d = {null, null, new C2695d(u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f26513a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26514b;

    /* renamed from: c  reason: collision with root package name */
    public final List f26515c;

    public C2364e(int i10, String str, String str2, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C2361c.f26508b);
            throw null;
        }
        this.f26513a = str;
        this.f26514b = str2;
        if ((i10 & 4) == 0) {
            this.f26515c = kf.v.f37483Y;
        } else {
            this.f26515c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2364e)) {
            return false;
        }
        C2364e c2364e = (C2364e) obj;
        if (AbstractC3557B.K(this.f26513a, c2364e.f26513a) && AbstractC3557B.K(this.f26514b, c2364e.f26514b) && AbstractC3557B.K(this.f26515c, c2364e.f26515c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f26513a.hashCode() * 31;
        String str = this.f26514b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f26515c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoCommand(name=");
        sb2.append(this.f26513a);
        sb2.append(", description=");
        sb2.append(this.f26514b);
        sb2.append(", arguments=");
        return android.gov.nist.core.a.o(sb2, this.f26515c, Separators.RPAREN);
    }

    public C2364e(String str, String str2, List list) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("arguments", list);
        this.f26513a = str;
        this.f26514b = str2;
        this.f26515c = list;
    }
}
