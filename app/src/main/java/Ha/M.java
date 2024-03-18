package ha;

import Df.AbstractC0405d;
import ah.AbstractC1998i;
import ah.C1996g;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import y.AbstractC6463a;

@AbstractC1998i
/* loaded from: classes.dex */
public final class M {
    public static final L Companion = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer[] f32016h;

    /* renamed from: a  reason: collision with root package name */
    public final String f32017a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32018b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32019c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32020d;

    /* renamed from: e  reason: collision with root package name */
    public final List f32021e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f32022f;

    /* renamed from: g  reason: collision with root package name */
    public final List f32023g;

    /* JADX WARN: Type inference failed for: r6v0, types: [ha.L, java.lang.Object] */
    static {
        C2695d c2695d = new C2695d(N.f32024a, 0);
        u0 u0Var = u0.f28491a;
        C2682H c2682h = new C2682H(u0Var, A7.b.U0(u0Var), 1);
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f32016h = new KSerializer[]{null, null, null, null, c2695d, c2682h, new C2695d(new C1996g("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action", d10.b(K.class), new AbstractC0405d[]{d10.b(C3381y.class), d10.b(C3349B.class), d10.b(C3354G.class), d10.b(C3357J.class)}, new KSerializer[]{C3378v.f32081a, z.f32091a, C3351D.f31999a, C3355H.f32009a}, new Annotation[0]), 0)};
    }

    public M(String str, String str2, String str3, String str4, List list, Map map, List list2) {
        AbstractC3557B.c0("files", list);
        AbstractC3557B.c0("params", map);
        AbstractC3557B.c0("actions", list2);
        this.f32017a = str;
        this.f32018b = str2;
        this.f32019c = str3;
        this.f32020d = str4;
        this.f32021e = list;
        this.f32022f = map;
        this.f32023g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        if (AbstractC3557B.K(this.f32017a, m10.f32017a) && AbstractC3557B.K(this.f32018b, m10.f32018b) && AbstractC3557B.K(this.f32019c, m10.f32019c) && AbstractC3557B.K(this.f32020d, m10.f32020d) && AbstractC3557B.K(this.f32021e, m10.f32021e) && AbstractC3557B.K(this.f32022f, m10.f32022f) && AbstractC3557B.K(this.f32023g, m10.f32023g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f32017a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f32018b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f32019c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f32020d;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return this.f32023g.hashCode() + AbstractC6463a.f(this.f32022f, AbstractC4194d.s(this.f32021e, (i16 + i13) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomActionCall(type=");
        sb2.append(this.f32017a);
        sb2.append(", domain=");
        sb2.append(this.f32018b);
        sb2.append(", privacyPolicy=");
        sb2.append(this.f32019c);
        sb2.append(", operation=");
        sb2.append(this.f32020d);
        sb2.append(", files=");
        sb2.append(this.f32021e);
        sb2.append(", params=");
        sb2.append(this.f32022f);
        sb2.append(", actions=");
        return android.gov.nist.core.a.o(sb2, this.f32023g, Separators.RPAREN);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(String str, String str2, Map map, List list, int i10) {
        this(null, r4, null, r6, r7, (i10 & 32) != 0 ? kf.w.f37484Y : map, (i10 & 64) != 0 ? r7 : list);
        String str3 = (i10 & 2) != 0 ? null : str;
        String str4 = (i10 & 8) != 0 ? null : str2;
        kf.v vVar = kf.v.f37483Y;
    }

    public M(int i10, String str, String str2, String str3, String str4, List list, Map map, List list2) {
        if ((i10 & 1) == 0) {
            this.f32017a = null;
        } else {
            this.f32017a = str;
        }
        if ((i10 & 2) == 0) {
            this.f32018b = null;
        } else {
            this.f32018b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f32019c = null;
        } else {
            this.f32019c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f32020d = null;
        } else {
            this.f32020d = str4;
        }
        int i11 = i10 & 16;
        kf.v vVar = kf.v.f37483Y;
        if (i11 == 0) {
            this.f32021e = vVar;
        } else {
            this.f32021e = list;
        }
        if ((i10 & 32) == 0) {
            this.f32022f = kf.w.f37484Y;
        } else {
            this.f32022f = map;
        }
        if ((i10 & 64) == 0) {
            this.f32023g = vVar;
        } else {
            this.f32023g = list2;
        }
    }
}
