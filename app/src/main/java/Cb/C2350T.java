package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.T  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350T {
    public static final C2349S Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f26485f = {null, new C2695d(C2357a.f26503a, 0), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final C2353W f26486a;

    /* renamed from: b  reason: collision with root package name */
    public final List f26487b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26488c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26489d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26490e;

    public C2350T(int i10, C2353W c2353w, List list, String str, String str2, String str3) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, C2348Q.f26484b);
            throw null;
        }
        this.f26486a = c2353w;
        this.f26487b = list;
        this.f26488c = str;
        String str4 = "";
        if ((i10 & 8) == 0) {
            String str5 = c2353w.f26494b;
            this.f26489d = str5 == null ? str4 : str5;
        } else {
            this.f26489d = str2;
        }
        if ((i10 & 16) != 0) {
            this.f26490e = str3;
            return;
        }
        String str6 = c2353w.f26495c;
        this.f26490e = str6 != null ? str6 : str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2350T)) {
            return false;
        }
        C2350T c2350t = (C2350T) obj;
        if (AbstractC3557B.K(this.f26486a, c2350t.f26486a) && AbstractC3557B.K(this.f26487b, c2350t.f26487b) && AbstractC3557B.K(this.f26488c, c2350t.f26488c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f26487b, this.f26486a.hashCode() * 31, 31);
        String str = this.f26488c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return s10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoCategory(info=");
        sb2.append(this.f26486a);
        sb2.append(", list=");
        sb2.append(this.f26487b);
        sb2.append(", cursor=");
        return R.a.t(sb2, this.f26488c, Separators.RPAREN);
    }

    public C2350T(C2353W c2353w, List list, String str) {
        this.f26486a = c2353w;
        this.f26487b = list;
        this.f26488c = str;
        String str2 = "";
        String str3 = c2353w.f26494b;
        this.f26489d = str3 == null ? str2 : str3;
        String str4 = c2353w.f26495c;
        this.f26490e = str4 != null ? str4 : str2;
    }
}
