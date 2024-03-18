package Ve;

import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import df.AbstractC2645j;
import id.AbstractC3557B;
import jh.C4027i3;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* renamed from: Ve.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1487a0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18724Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18725Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18726h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ SessionDescription f18727i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1487a0(C1503i0 c1503i0, SessionDescription sessionDescription, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18726h0 = c1503i0;
        this.f18727i0 = sessionDescription;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1487a0 c1487a0 = new C1487a0(this.f18726h0, this.f18727i0, abstractC4825e);
        c1487a0.f18725Z = obj;
        return c1487a0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1487a0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Type inference failed for: r1v8, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionDescription sessionDescription;
        SessionDescription sessionDescription2;
        AbstractC2406e abstractC2406e;
        AbstractC2406e abstractC2406e2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18724Y;
        jf.y yVar = jf.y.f36177a;
        C1503i0 c1503i0 = this.f18726h0;
        AbstractC2406e abstractC2406e3 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sessionDescription2 = (SessionDescription) this.f18725Z;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        abstractC2406e3 = (AbstractC2406e) obj;
                        sessionDescription = sessionDescription2;
                        if (abstractC2406e3 == null) {
                            abstractC2406e3 = new C2405d("null");
                        }
                        if ((abstractC2406e3 instanceof C2404c) && (abstractC2406e3 instanceof C2405d)) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                                String str = (String) ((C2405d) abstractC2406e3).f26612a;
                                Mi.a.b(new Object[0]);
                            }
                            return yVar;
                        } else if (!c1503i0.f18797w) {
                            return yVar;
                        } else {
                            E0 e02 = c1503i0.f18775a;
                            e02.getClass();
                            AbstractC3557B.c0("answer", sessionDescription);
                            LivekitRtc$SessionDescription a5 = AbstractC2645j.a(sessionDescription);
                            C4027i3 newBuilder = LivekitRtc$SignalRequest.newBuilder();
                            newBuilder.d();
                            ((LivekitRtc$SignalRequest) newBuilder.f27507Z).setAnswer(a5);
                            e02.s((LivekitRtc$SignalRequest) newBuilder.b());
                            return yVar;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                abstractC2406e = (AbstractC2406e) obj;
                if (abstractC2406e == null) {
                    abstractC2406e = new C2405d("null");
                }
                if (abstractC2406e instanceof C2404c) {
                    sessionDescription = (SessionDescription) ((C2404c) abstractC2406e).f26611a;
                    if (c1503i0.f18797w) {
                        return yVar;
                    }
                    C1519y c1519y = c1503i0.f18791q;
                    if (c1519y != null) {
                        Y y10 = new Y(sessionDescription, null);
                        this.f18725Z = sessionDescription;
                        this.f18724Y = 3;
                        Object h10 = c1519y.h(y10, this);
                        if (h10 == enumC5000a) {
                            return enumC5000a;
                        }
                        sessionDescription2 = sessionDescription;
                        obj = h10;
                        abstractC2406e3 = (AbstractC2406e) obj;
                        sessionDescription = sessionDescription2;
                    }
                    if (abstractC2406e3 == null) {
                    }
                    if (abstractC2406e3 instanceof C2404c) {
                    }
                    if (!c1503i0.f18797w) {
                    }
                } else if (abstractC2406e instanceof C2405d) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                        String str2 = (String) ((C2405d) abstractC2406e).f26612a;
                        Mi.a.b(new Object[0]);
                    }
                    return yVar;
                } else {
                    throw new RuntimeException();
                }
            } else {
                Ng.F f6 = (Ng.F) this.f18725Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f10 = (Ng.F) this.f18725Z;
            C1519y c1519y2 = c1503i0.f18791q;
            if (c1519y2 != null) {
                this.f18725Z = f10;
                this.f18724Y = 1;
                obj = c1519y2.f(this.f18727i0, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                abstractC2406e2 = null;
                if (abstractC2406e2 == null) {
                    abstractC2406e2 = new C2405d("null");
                }
                if (!(abstractC2406e2 instanceof C2405d)) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                        String str3 = (String) ((C2405d) abstractC2406e2).f26612a;
                        Mi.a.b(new Object[0]);
                    }
                    return yVar;
                } else if (c1503i0.f18797w) {
                    return yVar;
                } else {
                    C1519y c1519y3 = c1503i0.f18791q;
                    if (c1519y3 != 0) {
                        ?? abstractC5163j = new AbstractC5163j(2, null);
                        this.f18725Z = null;
                        this.f18724Y = 2;
                        obj = c1519y3.h(abstractC5163j, this);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        abstractC2406e = (AbstractC2406e) obj;
                        if (abstractC2406e == null) {
                        }
                        if (abstractC2406e instanceof C2404c) {
                        }
                    } else {
                        abstractC2406e = null;
                        if (abstractC2406e == null) {
                        }
                        if (abstractC2406e instanceof C2404c) {
                        }
                    }
                }
            }
        }
        abstractC2406e2 = (AbstractC2406e) obj;
        if (abstractC2406e2 == null) {
        }
        if (!(abstractC2406e2 instanceof C2405d)) {
        }
    }
}
