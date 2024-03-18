package Qg;

import Rg.AbstractC1282c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1213p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f14885Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14886Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f14887h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14888i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f14889j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213p(AbstractC4825e abstractC4825e, kotlin.jvm.internal.B b10, AbstractC1207j abstractC1207j) {
        super(2, abstractC4825e);
        this.f14888i0 = b10;
        this.f14889j0 = abstractC1207j;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1213p c1213p = new C1213p(abstractC4825e, this.f14888i0, this.f14889j0);
        c1213p.f14887h0 = obj;
        return c1213p;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1213p) create(new Pg.s(((Pg.s) obj).f14247a), (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.B b10;
        kotlin.jvm.internal.B b11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14886Z;
        if (i10 != 0) {
            if (i10 == 1) {
                b11 = this.f14885Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Object obj2 = ((Pg.s) this.f14887h0).f14247a;
            boolean z10 = obj2 instanceof Pg.r;
            b10 = this.f14888i0;
            if (!z10) {
                b10.f37622Y = obj2;
            }
            if (z10) {
                Throwable a5 = Pg.s.a(obj2);
                if (a5 == null) {
                    Object obj3 = b10.f37622Y;
                    if (obj3 != null) {
                        if (obj3 == AbstractC1282c.f15530b) {
                            obj3 = null;
                        }
                        this.f14887h0 = obj2;
                        this.f14885Y = b10;
                        this.f14886Z = 1;
                        if (this.f14889j0.c(obj3, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        b11 = b10;
                    }
                    b10.f37622Y = AbstractC1282c.f15532d;
                } else {
                    throw a5;
                }
            }
            return jf.y.f36177a;
        }
        b10 = b11;
        b10.f37622Y = AbstractC1282c.f15532d;
        return jf.y.f36177a;
    }
}
