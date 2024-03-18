package mh;

import nf.AbstractC4825e;
import of.EnumC5000a;
import oh.C5017d;
import pf.AbstractC5163j;
import q0.C5251c;
import y.r0;
import z.AbstractC6652A0;
import z.AbstractC6696f;
import z.C6716p;
import z.C6720r;
import z.C6736z;
import z.C6737z0;

/* renamed from: mh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4680j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39454Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39455Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4674d f39456h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f39457i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Z0.b f39458j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4686p f39459k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4680j(C4674d c4674d, long j6, Z0.b bVar, C4686p c4686p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39456h0 = c4674d;
        this.f39457i0 = j6;
        this.f39458j0 = bVar;
        this.f39459k0 = c4686p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4680j c4680j = new C4680j(this.f39456h0, this.f39457i0, this.f39458j0, this.f39459k0, abstractC4825e);
        c4680j.f39455Z = obj;
        return c4680j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4680j) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.A, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39454Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5017d c5017d = (C5017d) this.f39455Z;
            ?? obj2 = new Object();
            long j6 = this.f39456h0.f39437a;
            obj2.f37621Y = j6;
            int i11 = C5251c.f43622e;
            C6737z0 c6737z0 = AbstractC6652A0.f51121f;
            C5251c c5251c = new C5251c(j6);
            long j10 = this.f39457i0;
            C6716p c6716p = new C6716p(c6737z0, c5251c, new C6720r(Z0.p.b(j10), Z0.p.c(j10)), 56);
            C6736z c6736z = new C6736z(new r0(this.f39458j0));
            C4679i c4679i = new C4679i(this.f39456h0, (kotlin.jvm.internal.A) obj2, c5017d, this.f39459k0, this.f39457i0);
            this.f39454Y = 1;
            if (AbstractC6696f.e(c6716p, c6736z, false, c4679i, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
