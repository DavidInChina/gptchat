package S9;

import android.gov.nist.core.Separators;
import ba.C2143a;
import ba.C2146d;
import ba.C2147e;
import ca.C2317i;
import ca.C2324p;
import ca.EnumC2323o;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.EnumC2971H;
import ha.U;
import ha.X;
import ha.Y;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import l8.AbstractC4344b;
import x8.W;

/* loaded from: classes.dex */
public final class a extends N9.f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16402a;

    /* renamed from: b  reason: collision with root package name */
    public EnumC2323o f16403b = EnumC2323o.f26406Y;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f16404c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public AbstractC2965B f16405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C2969F c2969f) {
        super(c2969f);
        AbstractC3557B.c0("message", c2969f);
        this.f16402a = AbstractC4344b.N0(c2969f);
    }

    @Override // N9.f
    public final boolean a(C2969F c2969f) {
        U u10;
        int i10;
        boolean z10;
        this.f16403b = W.J(c2969f);
        if (c2969f.f30011d == EnumC2971H.f30047Z) {
            this.f16402a.add(c2969f);
        }
        X x10 = c2969f.f30021n;
        String str = null;
        Object obj = null;
        if (x10 != null) {
            u10 = x10.f32044a;
        } else {
            u10 = null;
        }
        if (u10 == null) {
            i10 = -1;
        } else {
            i10 = b.f16406a[u10.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    obj = new C2146d(K8.d.D0(c2969f));
                }
            } else {
                String D02 = K8.d.D0(c2969f);
                if (x10.f32046c == Y.f32052Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj = new C2143a(D02, z10);
            }
        } else {
            kotlinx.serialization.json.a aVar = x10.f32045b;
            if (aVar != null) {
                str = t.m2(aVar, Separators.SP, null, null, c.f16407Y, 30);
            }
            if (str == null) {
                str = "";
            }
            obj = new C2147e(str);
        }
        if (obj != null) {
            this.f16404c = t.x2(obj, this.f16404c);
        }
        if (!W.O(c2969f) && !W.N(c2969f)) {
            return false;
        }
        this.f16405d = c2969f.f30015h;
        return true;
    }

    @Override // N9.f
    public final List b(EnumC2323o enumC2323o) {
        AbstractC3557B.c0("replaceInProgress", enumC2323o);
        AbstractC2965B abstractC2965B = this.f16405d;
        return AbstractC4344b.F0(new C2317i(this.f16403b.b(enumC2323o), this.f16402a, abstractC2965B, new C2324p(this.f16404c)));
    }
}
