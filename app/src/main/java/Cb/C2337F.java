package cb;

import ah.AbstractC1998i;
import ah.C1994e;
import android.gov.nist.core.Separators;
import dh.C2679E;
import dh.C2695d;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2337F {
    public static final C2336E Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f26466e = {null, new C2695d(P4.a.E("com.openai.feature.gizmos.model.Gizmo.ToolType", EnumC2333B.values()), 0), new C2695d(new C1994e(kotlin.jvm.internal.C.f37623a.b(AbstractC2338G.class), new Annotation[0]), 0), new C2695d(C2679E.f28388a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f26467a;

    /* renamed from: b  reason: collision with root package name */
    public final List f26468b;

    /* renamed from: c  reason: collision with root package name */
    public final List f26469c;

    /* renamed from: d  reason: collision with root package name */
    public final List f26470d;

    public C2337F(int i10, C2334C c2334c, List list, List list2, List list3) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C2335D.f26465b);
            throw null;
        }
        this.f26467a = c2334c;
        this.f26468b = list;
        if ((i10 & 4) == 0) {
            this.f26469c = null;
        } else {
            this.f26469c = list2;
        }
        if ((i10 & 8) == 0) {
            this.f26470d = null;
        } else {
            this.f26470d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2337F)) {
            return false;
        }
        C2337F c2337f = (C2337F) obj;
        if (AbstractC3557B.K(this.f26467a, c2337f.f26467a) && AbstractC3557B.K(this.f26468b, c2337f.f26468b) && AbstractC3557B.K(this.f26469c, c2337f.f26469c) && AbstractC3557B.K(this.f26470d, c2337f.f26470d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f26468b, this.f26467a.hashCode() * 31, 31);
        int i11 = 0;
        List list = this.f26469c;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i12 = (s10 + i10) * 31;
        List list2 = this.f26470d;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "GizmoAbout(gizmo=" + this.f26467a + ", toolTypes=" + this.f26468b + ", aboutBlocks=" + this.f26469c + ", ratingData=" + this.f26470d + Separators.RPAREN;
    }

    public C2337F(C2334C c2334c, ArrayList arrayList, ArrayList arrayList2, List list) {
        this.f26467a = c2334c;
        this.f26468b = arrayList;
        this.f26469c = arrayList2;
        this.f26470d = list;
    }
}
