package Eh;

import Bh.AbstractC0248h0;
import Bh.AbstractC0252j0;
import Bh.c1;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import yh.l1;

/* renamed from: Eh.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509h extends AbstractC0510i {

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0252j0 f4787d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f4788e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f4789f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f4790g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f4791h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f4792i = new HashMap();

    public C0509h(l1 l1Var, ph.f fVar, AbstractC0252j0 abstractC0252j0, EnumC0516o enumC0516o) {
        super(l1Var, fVar, enumC0516o);
        this.f4787d = abstractC0252j0;
        new HashSet();
    }

    public final void a(AbstractC0248h0 abstractC0248h0, io.sentry.vendor.b bVar, Fh.n nVar) {
        for (Map.Entry entry : this.f4792i.entrySet()) {
            io.sentry.vendor.b j6 = bVar.j(((vh.c) entry.getValue()).u0(), null, ((vh.c) entry.getValue()).getName(), ((vh.c) entry.getValue()).getDescriptor(), ((vh.c) entry.getValue()).N0());
            if (j6 != null) {
                j6.g();
                AbstractC2469q0.p(entry.getKey());
                vh.g gVar = (vh.g) entry.getValue();
                throw null;
            }
        }
        abstractC0248h0.b(bVar, this.f4787d, this);
        for (c1 c1Var : this.f4788e.values()) {
            c1Var.f(bVar, this, nVar);
        }
        for (c1 c1Var2 : this.f4789f.values()) {
            c1Var2.f(bVar, this, nVar);
        }
        for (c1 c1Var3 : this.f4790g.values()) {
            c1Var3.f(bVar, this, nVar);
        }
    }
}
