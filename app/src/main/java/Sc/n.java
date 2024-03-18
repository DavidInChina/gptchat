package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2676B;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6190g0;
import wd.EnumC6212z;

@AbstractC1998i
/* loaded from: classes.dex */
public final class n {
    public static final m Companion = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer[] f16532i;

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6212z f16533a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16534b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16535c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16536d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16537e;

    /* renamed from: f  reason: collision with root package name */
    public final List f16538f;

    /* renamed from: g  reason: collision with root package name */
    public final List f16539g;

    /* renamed from: h  reason: collision with root package name */
    public final u f16540h;

    /* JADX WARN: Type inference failed for: r2v0, types: [Sc.m, java.lang.Object] */
    static {
        C2676B E10 = P4.a.E("com.openai.types.CategoryType", EnumC6212z.values());
        u0 u0Var = u0.f28491a;
        f16532i = new KSerializer[]{E10, null, null, null, null, new C2695d(u0Var, 0), new C2695d(u0Var, 0), null};
    }

    public n(int i10, EnumC6212z enumC6212z, String str, int i11, String str2, String str3, List list, List list2, u uVar) {
        if (63 != (i10 & 63)) {
            R4.b.e2(i10, 63, l.f16531b);
            throw null;
        }
        this.f16533a = enumC6212z;
        this.f16534b = str;
        this.f16535c = i11;
        this.f16536d = str2;
        this.f16537e = str3;
        this.f16538f = list;
        if ((i10 & 64) == 0) {
            this.f16539g = null;
        } else {
            this.f16539g = list2;
        }
        if ((i10 & 128) == 0) {
            this.f16540h = null;
        } else {
            this.f16540h = uVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f16533a == nVar.f16533a && AbstractC3557B.K(this.f16534b, nVar.f16534b) && this.f16535c == nVar.f16535c && AbstractC3557B.K(this.f16536d, nVar.f16536d) && AbstractC3557B.K(this.f16537e, nVar.f16537e) && AbstractC3557B.K(this.f16538f, nVar.f16538f) && AbstractC3557B.K(this.f16539g, nVar.f16539g) && AbstractC3557B.K(this.f16540h, nVar.f16540h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f16538f, E9.f.v(this.f16537e, E9.f.v(this.f16536d, (E9.f.v(this.f16534b, this.f16533a.hashCode() * 31, 31) + this.f16535c) * 31, 31), 31), 31);
        int i11 = 0;
        List list = this.f16539g;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i12 = (s10 + i10) * 31;
        u uVar = this.f16540h;
        if (uVar != null) {
            i11 = uVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        String b10 = C6190g0.b(this.f16534b);
        return "Model(category=" + this.f16533a + ", slug=" + b10 + ", maxTokens=" + this.f16535c + ", title=" + this.f16536d + ", description=" + this.f16537e + ", tags=" + this.f16538f + ", enabledTools=" + this.f16539g + ", productFeatures=" + this.f16540h + Separators.RPAREN;
    }

    public n(EnumC6212z enumC6212z, String str, int i10, String str2, String str3, List list, List list2, u uVar) {
        AbstractC3557B.c0("slug", str);
        AbstractC3557B.c0("title", str2);
        AbstractC3557B.c0("description", str3);
        AbstractC3557B.c0("tags", list);
        this.f16533a = enumC6212z;
        this.f16534b = str;
        this.f16535c = i10;
        this.f16536d = str2;
        this.f16537e = str3;
        this.f16538f = list;
        this.f16539g = list2;
        this.f16540h = uVar;
    }
}
