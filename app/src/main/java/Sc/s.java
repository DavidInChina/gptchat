package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class s {
    public static final r Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f16550d = {P4.a.E("com.openai.models.model.Models.ProductFeatures.AttachmentType", p.values()), new C2695d(u0.f28491a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final p f16551a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16552b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16553c;

    public s(int i10, p pVar, List list, boolean z10) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, q.f16549b);
            throw null;
        }
        this.f16551a = pVar;
        if ((i10 & 2) == 0) {
            this.f16552b = kf.v.f37483Y;
        } else {
            this.f16552b = list;
        }
        if ((i10 & 4) == 0) {
            this.f16553c = false;
        } else {
            this.f16553c = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16551a == sVar.f16551a && AbstractC3557B.K(this.f16552b, sVar.f16552b) && this.f16553c == sVar.f16553c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f16552b, this.f16551a.hashCode() * 31, 31);
        if (this.f16553c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return s10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Attachments(type=");
        sb2.append(this.f16551a);
        sb2.append(", acceptedMimeTypes=");
        sb2.append(this.f16552b);
        sb2.append(", canAcceptAllMimeTypes=");
        return AbstractC4194d.w(sb2, this.f16553c, Separators.RPAREN);
    }

    public s(p pVar, ArrayList arrayList) {
        this.f16551a = pVar;
        this.f16552b = arrayList;
        this.f16553c = false;
    }
}
