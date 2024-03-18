package Qg;

import Rg.AbstractC1282c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1221y extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f14944Y;

    /* renamed from: Z  reason: collision with root package name */
    public Pg.C f14945Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14946h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f14947i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f14948j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f14949k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14950l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221y(long j6, AbstractC4825e abstractC4825e, AbstractC1206i abstractC1206i) {
        super(3, abstractC4825e);
        this.f14949k0 = j6;
        this.f14950l0 = abstractC1206i;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1221y c1221y = new C1221y(this.f14949k0, (AbstractC4825e) obj3, this.f14950l0);
        c1221y.f14947i0 = (Ng.F) obj;
        c1221y.f14948j0 = (AbstractC1207j) obj2;
        return c1221y.invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC1207j abstractC1207j;
        Pg.C c10;
        kotlin.jvm.internal.B b10;
        Pg.C c11;
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14946h0;
        if (i10 != 0) {
            if (i10 == 1) {
                c11 = this.f14945Z;
                b10 = this.f14944Y;
                c10 = (Pg.C) this.f14948j0;
                abstractC1207j = (AbstractC1207j) this.f14947i0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f6 = (Ng.F) this.f14947i0;
            Pg.z s12 = A7.b.s1(f6, -1, new C1220x(this.f14950l0, null), 1);
            Object obj3 = new Object();
            Pg.z s13 = A7.b.s1(f6, 0, new C1216t(this.f14949k0, null), 1);
            abstractC1207j = (AbstractC1207j) this.f14948j0;
            c11 = s13;
            c10 = s12;
            b10 = obj3;
        }
        while (b10.f37622Y != AbstractC1282c.f15532d) {
            Ug.f fVar = new Ug.f(getContext());
            fVar.i(c10.c(), new C1217u(b10, c11, null));
            fVar.i(c11.b(), new C1218v(null, b10, abstractC1207j));
            this.f14947i0 = abstractC1207j;
            this.f14948j0 = c10;
            this.f14944Y = b10;
            this.f14945Z = c11;
            this.f14946h0 = 1;
            if (Ug.f.f17871k0.get(fVar) instanceof Ug.d) {
                obj2 = fVar.e(this);
                continue;
            } else {
                obj2 = fVar.f(this);
                continue;
            }
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
