package Ve;

import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class W extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18708Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18709Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ SessionDescription f18710h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C1503i0 c1503i0, SessionDescription sessionDescription, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18709Z = c1503i0;
        this.f18710h0 = sessionDescription;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new W(this.f18709Z, this.f18710h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC2406e abstractC2406e;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18708Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC2408g.Companion.getClass();
            int b10 = AbstractC6708l.b(2, 7);
            SessionDescription sessionDescription = this.f18710h0;
            if (b10 >= 0 && Mi.a.d() > 0) {
                sessionDescription.toString();
                Mi.a.c(new Object[0]);
            }
            C1519y c1519y = this.f18709Z.f18790p;
            if (c1519y != null) {
                this.f18708Y = 1;
                obj = c1519y.f(sessionDescription, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                abstractC2406e = null;
                if (abstractC2406e == null) {
                    abstractC2406e = new C2405d("null");
                }
                if (!(abstractC2406e instanceof C2404c) && (abstractC2406e instanceof C2405d)) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                        String str = (String) ((C2405d) abstractC2406e).f26612a;
                        Mi.a.b(new Object[0]);
                    }
                }
                return jf.y.f36177a;
            }
        }
        abstractC2406e = (AbstractC2406e) obj;
        if (abstractC2406e == null) {
        }
        if (!(abstractC2406e instanceof C2404c)) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(5, 7) >= 0) {
                String str2 = (String) ((C2405d) abstractC2406e).f26612a;
                Mi.a.b(new Object[0]);
            }
        }
        return jf.y.f36177a;
    }
}
