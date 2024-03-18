package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: O9.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127s {
    public static final r Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f13588c = {EnumC1133v.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1133v f13589a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13590b;

    public C1127s(int i10, EnumC1133v enumC1133v, String str) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C1124q.f13582b);
            throw null;
        }
        this.f13589a = enumC1133v;
        if ((i10 & 2) == 0) {
            this.f13590b = null;
        } else {
            this.f13590b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1127s)) {
            return false;
        }
        C1127s c1127s = (C1127s) obj;
        if (this.f13589a == c1127s.f13589a && AbstractC3557B.K(this.f13590b, c1127s.f13590b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f13589a.hashCode() * 31;
        String str = this.f13590b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiConversationMessageAuthor(role=");
        sb2.append(this.f13589a);
        sb2.append(", name=");
        return R.a.t(sb2, this.f13590b, Separators.RPAREN);
    }

    public C1127s(EnumC1133v enumC1133v, String str) {
        this.f13589a = enumC1133v;
        this.f13590b = str;
    }
}
