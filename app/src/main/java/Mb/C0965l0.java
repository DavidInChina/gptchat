package Mb;

import Cb.C0294d;
import Cb.C0295e;
import Cb.C0296f;
import Cb.C0297g;
import Cb.C0298h;
import Cb.C0310u;
import android.os.Bundle;
import b5.C2126a;
import b5.C2127b;
import b5.C2128c;
import c5.C2294f;
import com.openai.chatgpt.R;
import e5.C2804a;
import f5.C2937a;
import f9.C2958j;
import java.lang.ref.WeakReference;
import nf.AbstractC4825e;
import nf.C4833m;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;
import wd.EnumC6206t;

/* renamed from: Mb.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965l0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Cb.F f11955Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0967m0 f11956Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f11957h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Cb.G f11958i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C0294d f11959j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0967m0 f11960k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ p9.s f11961l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ EnumC6206t f11962m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0965l0(Cb.G g10, C0294d c0294d, C0967m0 c0967m0, p9.s sVar, EnumC6206t enumC6206t, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11958i0 = g10;
        this.f11959j0 = c0294d;
        this.f11960k0 = c0967m0;
        this.f11961l0 = sVar;
        this.f11962m0 = enumC6206t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0965l0(this.f11958i0, this.f11959j0, this.f11960k0, this.f11961l0, this.f11962m0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0965l0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:2|(1:(1:(1:(4:7|48|54|55)(2:8|9))(3:10|42|(2:44|(1:46)(4:47|48|54|55))(4:49|(1:51)(2:52|(2:56|57))|54|55)))(1:11))(2:12|(1:14))|15|58|16|a6|21|24|(1:26)|27|(1:29)|30|(1:32)|33|(1:35)|36|(1:38)|(1:40)(3:41|42|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
        f5.C2937a.c("ArkoseChallenge", r1.getMessage(), new java.lang.Throwable[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, b5.b] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Cb.F f6;
        Cb.F f10;
        wd.v0 v0Var;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11957h0;
        C0967m0 c0967m0 = this.f11960k0;
        Cb.G g10 = this.f11958i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        c0967m0 = this.f11956Z;
                        f6 = this.f11955Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        c0967m0.f(new C0953f0(L4.a.H0(Cb.g0.f2945j0, f6), false));
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f10 = this.f11955Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    nb.d dVar = new nb.d(7, (C0310u) ((wd.u0) v0Var).f48468a);
                    this.f11955Y = f10;
                    this.f11956Z = c0967m0;
                    this.f11957h0 = 3;
                    if (((Cb.S) g10).e(dVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    f6 = f10;
                    c0967m0.f(new C0953f0(L4.a.H0(Cb.g0.f2945j0, f6), false));
                    return jf.y.f36177a;
                }
                if (v0Var instanceof wd.q0) {
                    C2958j c2958j = (C2958j) this.f11961l0;
                    c0967m0.f(new C0955g0(K8.d.I0((wd.q0) v0Var, c2958j, this.f11962m0, c2958j.a(R.string.onboarding_arkose_error))));
                    c0967m0.f(new C0953f0(Uc.J.f17617k.o1(), false));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f11957h0 = 1;
            obj = ((Cb.S) g10).b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        Cb.F f11 = (Cb.F) obj;
        String str = f11.f2872c;
        C2128c c2128c = this.f11959j0.f2935a;
        c2128c.f25638c = str;
        b5.d dVar2 = new b5.d(c2128c);
        C2804a.a().getClass();
        ?? obj2 = new Object();
        obj2.f25635Y = 0;
        obj2.f25635Y = obj2.hashCode();
        C2937a.d("ArkoseChallenge", "Instance Id: " + obj2.f25635Y, new Throwable[0]);
        Integer valueOf = Integer.valueOf(obj2.f25635Y);
        C2126a c2126a = new C2126a(obj2);
        int i11 = C2294f.f26254I1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_CONFIG", dVar2);
        bundle.putSerializable("KEY_INSTANCE_ID", valueOf);
        bundle.putSerializable("KEY_LISTENER", c2126a);
        C2294f c2294f = new C2294f();
        c2294f.N(bundle);
        int i12 = obj2.f25635Y;
        synchronized (C2127b.class) {
            if (i12 != 0) {
                C2127b.f25634Z.put(Integer.valueOf(i12), c2294f);
            }
        }
        c0967m0.l(new nb.d(6, obj2));
        this.f11955Y = f11;
        this.f11957h0 = 2;
        C4833m c4833m = new C4833m(AbstractC5260f.z(this));
        C0295e c0295e = C0295e.f2937a;
        c5.i a5 = c5.i.a(obj2.f25635Y);
        if (a5 != null) {
            a5.f26284g.add(new WeakReference(c0295e));
        }
        C0296f c0296f = new C0296f(c4833m);
        c5.i a10 = c5.i.a(obj2.f25635Y);
        if (a10 != null) {
            a10.f26280c.add(new WeakReference(c0296f));
        }
        C0297g c0297g = new C0297g(c4833m);
        c5.i a11 = c5.i.a(obj2.f25635Y);
        if (a11 != null) {
            a11.f26278a.add(c0297g);
        }
        C0298h c0298h = new C0298h(c4833m);
        c5.i a12 = c5.i.a(obj2.f25635Y);
        if (a12 != null) {
            a12.f26279b.add(new WeakReference(c0298h));
        }
        Object b10 = c4833m.b();
        if (b10 == EnumC5000a.f41328Y) {
            com.google.android.gms.internal.play_billing.N.k0(this);
        }
        if (b10 == enumC5000a) {
            return enumC5000a;
        }
        f10 = f11;
        obj = b10;
        v0Var = (wd.v0) obj;
        if (!(v0Var instanceof wd.u0)) {
        }
    }
}
