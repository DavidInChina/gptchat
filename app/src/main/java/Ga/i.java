package Ga;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f6211f = {null, null, r.Companion.serializer(), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final int f6212a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6213b;

    /* renamed from: c  reason: collision with root package name */
    public final r f6214c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6215d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6216e;

    public i(int i10, int i11, int i12, r rVar, boolean z10, boolean z11) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, C0624g.f6210b);
            throw null;
        }
        this.f6212a = i11;
        this.f6213b = i12;
        this.f6214c = rVar;
        if ((i10 & 8) == 0) {
            this.f6215d = true;
        } else {
            this.f6215d = z10;
        }
        if ((i10 & 16) == 0) {
            this.f6216e = false;
        } else {
            this.f6216e = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f6212a == iVar.f6212a && this.f6213b == iVar.f6213b && this.f6214c == iVar.f6214c && this.f6215d == iVar.f6215d && this.f6216e == iVar.f6216e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f6214c.hashCode() + (((this.f6212a * 31) + this.f6213b) * 31)) * 31;
        int i11 = 1237;
        if (this.f6215d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f6216e) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationListRequest(offset=");
        sb2.append(this.f6212a);
        sb2.append(", limit=");
        sb2.append(this.f6213b);
        sb2.append(", order=");
        sb2.append(this.f6214c);
        sb2.append(", expand=");
        sb2.append(this.f6215d);
        sb2.append(", isArchived=");
        return AbstractC4194d.w(sb2, this.f6216e, Separators.RPAREN);
    }

    public i(int i10, int i11, boolean z10) {
        r rVar = r.f6234Z;
        this.f6212a = i10;
        this.f6213b = i11;
        this.f6214c = rVar;
        this.f6215d = true;
        this.f6216e = z10;
    }
}
