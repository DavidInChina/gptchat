package y;

import I9.C0;
import I9.H0;
import android.view.MotionEvent;
import android.view.View;
import bb.C2149A;
import bb.C2150B;
import bb.C2172l;
import bb.C2173m;
import bb.C2184y;
import cb.C2334C;
import cb.C2364e;
import cb.C2373n;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import e4.AbstractC2802j;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import j0.C3891g;
import na.EnumC4797v0;
import za.C6799p;
import za.C6800q;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50169Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f50170Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i10, wf.k kVar) {
        super(1);
        this.f50169Y = i10;
        this.f50170Z = kVar;
    }

    private C3891g c(Object obj) {
        int i10;
        j0.n nVar = (j0.n) obj;
        synchronized (j0.p.f35918b) {
            i10 = j0.p.f35920d;
            j0.p.f35920d = i10 + 1;
        }
        return new C3891g(i10, nVar, this.f50170Z);
    }

    public final void a(C2334C c2334c) {
        int i10 = this.f50169Y;
        wf.k kVar = this.f50170Z;
        switch (i10) {
            case 18:
                AbstractC3557B.c0("it", c2334c);
                kVar.invoke(new C0(c2334c));
                return;
            case 19:
                AbstractC3557B.c0("it", c2334c);
                kVar.invoke(new H0(c2334c));
                return;
            default:
                AbstractC3557B.c0("it", c2334c);
                kVar.invoke(new C6800q(c2334c));
                return;
        }
    }

    public final long e(long j6) {
        int i10 = this.f50169Y;
        wf.k kVar = this.f50170Z;
        switch (i10) {
            case 4:
                return kotlin.jvm.internal.m.c(((Number) kVar.invoke(Integer.valueOf((int) (j6 >> 32)))).intValue(), 0);
            case 5:
                return kotlin.jvm.internal.m.c(0, ((Number) kVar.invoke(Integer.valueOf((int) (j6 & 4294967295L)))).intValue());
            case 6:
                return kotlin.jvm.internal.m.c(((Number) kVar.invoke(Integer.valueOf((int) (j6 >> 32)))).intValue(), 0);
            default:
                return kotlin.jvm.internal.m.c(0, ((Number) kVar.invoke(Integer.valueOf((int) (j6 & 4294967295L)))).intValue());
        }
    }

    public final long f(long j6) {
        int i10 = this.f50169Y;
        wf.k kVar = this.f50170Z;
        switch (i10) {
            case 0:
                return Ng.H.c(((Number) kVar.invoke(Integer.valueOf((int) (j6 >> 32)))).intValue(), (int) (j6 & 4294967295L));
            case 1:
                return Ng.H.c((int) (j6 >> 32), ((Number) kVar.invoke(Integer.valueOf((int) (j6 & 4294967295L)))).intValue());
            case 2:
                return Ng.H.c(((Number) kVar.invoke(Integer.valueOf((int) (j6 >> 32)))).intValue(), (int) (j6 & 4294967295L));
            default:
                return Ng.H.c((int) (j6 >> 32), ((Number) kVar.invoke(Integer.valueOf((int) (j6 & 4294967295L)))).intValue());
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f50169Y;
        switch (i10) {
            case 0:
                return new Z0.k(f(((Z0.k) obj).f22804a));
            case 1:
                return new Z0.k(f(((Z0.k) obj).f22804a));
            case 2:
                return new Z0.k(f(((Z0.k) obj).f22804a));
            case 3:
                return new Z0.k(f(((Z0.k) obj).f22804a));
            case 4:
                return new Z0.i(e(((Z0.k) obj).f22804a));
            case 5:
                return new Z0.i(e(((Z0.k) obj).f22804a));
            case 6:
                return new Z0.i(e(((Z0.k) obj).f22804a));
            case 7:
                return new Z0.i(e(((Z0.k) obj).f22804a));
            case 8:
                long longValue = ((Number) obj).longValue();
                int i11 = this.f50169Y;
                wf.k kVar = this.f50170Z;
                switch (i11) {
                    case 8:
                        return kVar.invoke(Long.valueOf(longValue));
                    default:
                        return kVar.invoke(Long.valueOf(longValue / 1000000));
                }
            case 9:
                AbstractC2469q0.p(obj);
                switch (this.f50169Y) {
                    case 9:
                        throw null;
                    default:
                        throw null;
                }
            case 10:
            case 14:
            default:
                this.f50170Z.invoke(new C2149A(((Boolean) obj).booleanValue()));
                return jf.y.f36177a;
            case 11:
                long longValue2 = ((Number) obj).longValue();
                int i12 = this.f50169Y;
                wf.k kVar2 = this.f50170Z;
                switch (i12) {
                    case 8:
                        return kVar2.invoke(Long.valueOf(longValue2));
                    default:
                        return kVar2.invoke(Long.valueOf(longValue2 / 1000000));
                }
            case 12:
                return c(obj);
            case 13:
                AbstractC3893i abstractC3893i = (AbstractC3893i) this.f50170Z.invoke((j0.n) obj);
                synchronized (j0.p.f35918b) {
                    j0.p.f35919c = j0.p.f35919c.M(abstractC3893i.d());
                }
                return abstractC3893i;
            case 15:
                View view = (View) obj;
                wf.k kVar3 = this.f50170Z;
                switch (i10) {
                    case 15:
                        Object tag = view.getTag(R.id.binding_reference);
                        AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding", tag);
                        kVar3.invoke((J3.a) tag);
                        break;
                    default:
                        Object tag2 = view.getTag(R.id.binding_reference);
                        AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding", tag2);
                        kVar3.invoke((J3.a) tag2);
                        break;
                }
                return jf.y.f36177a;
            case 16:
                View view2 = (View) obj;
                wf.k kVar4 = this.f50170Z;
                switch (i10) {
                    case 15:
                        Object tag3 = view2.getTag(R.id.binding_reference);
                        AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding", tag3);
                        kVar4.invoke((J3.a) tag3);
                        break;
                    default:
                        Object tag4 = view2.getTag(R.id.binding_reference);
                        AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding", tag4);
                        kVar4.invoke((J3.a) tag4);
                        break;
                }
                return jf.y.f36177a;
            case 17:
                AbstractC2802j abstractC2802j = (AbstractC2802j) obj;
                AbstractC3557B.c0("$this$execute", abstractC2802j);
                return abstractC2802j.d(this.f50170Z);
            case 18:
                a((C2334C) obj);
                return jf.y.f36177a;
            case 19:
                a((C2334C) obj);
                return jf.y.f36177a;
            case 20:
                MotionEvent motionEvent = (MotionEvent) obj;
                AbstractC3557B.c0("it", motionEvent);
                if (motionEvent.getAction() == 0) {
                    this.f50170Z.invoke(new na.V(EnumC4797v0.f40131h0));
                }
                return Boolean.FALSE;
            case 21:
                Sc.n nVar = (Sc.n) obj;
                AbstractC3557B.c0("it", nVar);
                this.f50170Z.invoke(new na.O(nVar));
                return jf.y.f36177a;
            case 22:
                invoke((String) obj);
                return jf.y.f36177a;
            case 23:
                a((C2334C) obj);
                return jf.y.f36177a;
            case 24:
                C2364e c2364e = (C2364e) obj;
                AbstractC3557B.c0("it", c2364e);
                this.f50170Z.invoke(new C6799p(c2364e));
                return jf.y.f36177a;
            case 25:
                C2373n c2373n = (C2373n) obj;
                AbstractC3557B.c0("it", c2373n);
                this.f50170Z.invoke(new C2172l(c2373n));
                return jf.y.f36177a;
            case 26:
                invoke((String) obj);
                return jf.y.f36177a;
            case 27:
                this.f50170Z.invoke(new C2184y(Integer.valueOf(((Number) obj).intValue())));
                return jf.y.f36177a;
            case 28:
                invoke((String) obj);
                return jf.y.f36177a;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f50169Y;
        wf.k kVar = this.f50170Z;
        switch (i10) {
            case 22:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new gb.S(str));
                return;
            case 26:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new C2173m(str));
                return;
            default:
                AbstractC3557B.c0("it", str);
                kVar.invoke(new C2150B(str));
                return;
        }
    }
}
