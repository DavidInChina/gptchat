package Qg;

import Pg.EnumC1170c;
import Rg.AbstractC1286g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;

/* renamed from: Qg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1196d extends AbstractC1286g {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14829k0 = AtomicIntegerFieldUpdater.newUpdater(C1196d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: i0  reason: collision with root package name */
    public final Pg.C f14830i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f14831j0;

    public /* synthetic */ C1196d(Pg.C c10, boolean z10) {
        this(c10, z10, C4832l.f40334Y, -3, EnumC1170c.f14192Y);
    }

    @Override // Rg.AbstractC1286g, Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        if (this.f15541Z == -3) {
            boolean z10 = this.f14831j0;
            if (z10 && f14829k0.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
            Object L02 = Bi.c.L0(abstractC1207j, this.f14830i0, z10, abstractC4825e);
            if (L02 == EnumC5000a.f41328Y) {
                return L02;
            }
            return yVar;
        }
        Object b10 = super.b(abstractC1207j, abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return yVar;
    }

    @Override // Rg.AbstractC1286g
    public final String d() {
        return "channel=" + this.f14830i0;
    }

    @Override // Rg.AbstractC1286g
    public final Object h(Pg.A a5, AbstractC4825e abstractC4825e) {
        Object L02 = Bi.c.L0(new Rg.F(a5), this.f14830i0, this.f14831j0, abstractC4825e);
        if (L02 == EnumC5000a.f41328Y) {
            return L02;
        }
        return jf.y.f36177a;
    }

    @Override // Rg.AbstractC1286g
    public final AbstractC1286g j(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        return new C1196d(this.f14830i0, this.f14831j0, abstractC4831k, i10, enumC1170c);
    }

    @Override // Rg.AbstractC1286g
    public final AbstractC1206i k() {
        return new C1196d(this.f14830i0, this.f14831j0);
    }

    @Override // Rg.AbstractC1286g
    public final Pg.C l(Ng.F f6) {
        if (this.f14831j0 && f14829k0.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        if (this.f15541Z == -3) {
            return this.f14830i0;
        }
        return super.l(f6);
    }

    public C1196d(Pg.C c10, boolean z10, AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        super(abstractC4831k, i10, enumC1170c);
        this.f14830i0 = c10;
        this.f14831j0 = z10;
        this.consumed$volatile = 0;
    }
}
