package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import jf.C3961k;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class M implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final N f15276a;

    /* renamed from: b  reason: collision with root package name */
    public final F f15277b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15278c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15279d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f15280e;

    /* renamed from: f  reason: collision with root package name */
    public final C f15281f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15282g;

    public /* synthetic */ M(F f6, int i10) {
        this(null, (i10 & 2) != 0 ? null : f6, new ArrayList(), false, kf.w.f37484Y);
    }

    public static M e(M m10, N n10, F f6, List list, boolean z10, Map map, int i10) {
        if ((i10 & 1) != 0) {
            n10 = m10.f15276a;
        }
        N n11 = n10;
        if ((i10 & 2) != 0) {
            f6 = m10.f15277b;
        }
        F f10 = f6;
        if ((i10 & 4) != 0) {
            list = m10.f15278c;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            z10 = m10.f15279d;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            map = m10.f15280e;
        }
        Map map2 = map;
        m10.getClass();
        AbstractC3557B.c0("reportReasonStack", list2);
        AbstractC3557B.c0("collectedAdditionalFields", map2);
        return new M(n11, f10, list2, z11, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        if (this.f15276a == m10.f15276a && AbstractC3557B.K(this.f15277b, m10.f15277b) && AbstractC3557B.K(this.f15278c, m10.f15278c) && this.f15279d == m10.f15279d && AbstractC3557B.K(this.f15280e, m10.f15280e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        N n10 = this.f15276a;
        if (n10 == null) {
            i10 = 0;
        } else {
            i10 = n10.hashCode();
        }
        int i13 = i10 * 31;
        F f6 = this.f15277b;
        if (f6 != null) {
            i12 = f6.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f15278c, (i13 + i12) * 31, 31);
        if (this.f15279d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return this.f15280e.hashCode() + ((s10 + i11) * 31);
    }

    public final String toString() {
        return "ReportContentState(contentType=" + this.f15276a + ", reportReasons=" + this.f15277b + ", reportReasonStack=" + this.f15278c + ", submissionInProgress=" + this.f15279d + ", collectedAdditionalFields=" + this.f15280e + Separators.RPAREN;
    }

    public M(N n10, F f6, List list, boolean z10, Map map) {
        List<C1265k> list2;
        boolean z11;
        Object obj;
        AbstractC3557B.c0("reportReasonStack", list);
        AbstractC3557B.c0("collectedAdditionalFields", map);
        this.f15276a = n10;
        this.f15277b = f6;
        this.f15278c = list;
        this.f15279d = z10;
        this.f15280e = map;
        C c10 = (C) kf.t.p2(list);
        this.f15281f = c10;
        boolean z12 = true;
        if (c10 != null && (list2 = c10.f15258j) != null && !list2.isEmpty()) {
            for (C1265k c1265k : list2) {
                String str = (String) this.f15280e.get(c1265k);
                if (str == null) {
                    z11 = !c1265k.f15361d;
                } else {
                    int ordinal = c1265k.f15359b.ordinal();
                    if (ordinal == 0) {
                        try {
                            new URL(str).toURI();
                            obj = Boolean.TRUE;
                        } catch (Throwable th2) {
                            obj = com.google.android.gms.internal.play_billing.N.w(th2);
                        }
                        z11 = ((Boolean) (C3961k.a(obj) != null ? Boolean.FALSE : obj)).booleanValue();
                    } else if (ordinal == 1) {
                        if (Lg.n.n2(str)) {
                            z12 = false;
                            break;
                        }
                    } else if (ordinal == 2) {
                        if (Lg.n.n2(str)) {
                            z12 = false;
                            break;
                        }
                    } else if (ordinal == 3) {
                        Pattern compile = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
                        AbstractC3557B.b0("compile(...)", compile);
                        z11 = compile.matcher(str).matches();
                    } else {
                        throw new RuntimeException();
                    }
                }
                if (!z11) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f15282g = z12;
    }
}
