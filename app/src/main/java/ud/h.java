package ud;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import jf.C3970t;
import kotlinx.serialization.KSerializer;
import r0.r;

@AbstractC1998i
/* loaded from: classes.dex */
public final class h {
    public static final C5905d Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f46690d = {null, null, new C2695d(e.f46684a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final r f46691a;

    /* renamed from: b  reason: collision with root package name */
    public final r f46692b;

    /* renamed from: c  reason: collision with root package name */
    public final List f46693c;

    public h(int i10, r rVar, r rVar2, List list) {
        if (4 == (i10 & 4)) {
            if ((i10 & 1) == 0) {
                this.f46691a = null;
            } else {
                this.f46691a = rVar;
            }
            if ((i10 & 2) == 0) {
                this.f46692b = null;
            } else {
                this.f46692b = rVar2;
            }
            this.f46693c = list;
            return;
        }
        R4.b.e2(i10, 4, C5904c.f46683b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f46691a, hVar.f46691a) && AbstractC3557B.K(this.f46692b, hVar.f46692b) && AbstractC3557B.K(this.f46693c, hVar.f46693c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        r rVar = this.f46691a;
        if (rVar == null) {
            i10 = 0;
        } else {
            i10 = C3970t.a(rVar.f44265a);
        }
        int i12 = i10 * 31;
        r rVar2 = this.f46692b;
        if (rVar2 != null) {
            i11 = C3970t.a(rVar2.f44265a);
        }
        return this.f46693c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        return "CodeBlockMetadata(background=" + this.f46691a + ", color=" + this.f46692b + ", children=" + this.f46693c + Separators.RPAREN;
    }
}
