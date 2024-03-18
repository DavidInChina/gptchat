package mh;

import Z.C1724m0;
import android.view.MotionEvent;
import id.AbstractC3557B;
import java.io.Serializable;
import jf.C3959i;
import k6.AbstractC4194d;
import oh.C5017d;
import q0.C5251c;
import z.C6712n;

/* renamed from: mh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4679i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39448Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f39449Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f39450h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Serializable f39451i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f39452j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f39453k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4679i(kotlin.jvm.internal.B b10, long j6, String str, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.B b11) {
        super(1);
        this.f39450h0 = b10;
        this.f39449Z = j6;
        this.f39451i0 = str;
        this.f39452j0 = zVar;
        this.f39453k0 = b11;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39448Y;
        Object obj2 = this.f39453k0;
        Object obj3 = this.f39452j0;
        Serializable serializable = this.f39451i0;
        long j6 = this.f39449Z;
        Object obj4 = this.f39450h0;
        switch (i10) {
            case 0:
                C6712n c6712n = (C6712n) obj;
                AbstractC3557B.c0("$this$animateDecay", c6712n);
                long j10 = ((C4674d) obj4).f39439c;
                C1724m0 c1724m0 = c6712n.f51333e;
                kotlin.jvm.internal.A a5 = (kotlin.jvm.internal.A) serializable;
                long g10 = C5251c.g(((C5251c) c1724m0.getValue()).f43623a, a5.f37621Y);
                C4686p c4686p = (C4686p) obj2;
                if (R4.b.v1(g10)) {
                    AbstractC4194d.P((C5017d) obj3, 0.0f, g10, j10, 5);
                    a5.f37621Y = ((C5251c) c1724m0.getValue()).f43623a;
                    return yVar;
                }
                i0.r rVar = C4686p.f39480r;
                throw new IllegalStateException(android.gov.nist.core.a.k("Can't fling with an invalid pan = ", C5251c.j(g10), ". ", c4686p.c(new C3959i("value", c1724m0.getValue()), new C3959i("previous", new C5251c(a5.f37621Y)), new C3959i("velocity", new Z0.p(j6)))).toString());
            default:
                long j11 = ((Mg.b) obj).f12130Y;
                kotlin.jvm.internal.B b10 = (kotlin.jvm.internal.B) obj4;
                Object obj5 = b10.f37622Y;
                AbstractC3557B.Z(obj5);
                MotionEvent motionEvent = (MotionEvent) obj5;
                long eventTime = j6 - motionEvent.getEventTime();
                long e10 = Mg.b.e(j11) - j6;
                Hi.m mVar = Hi.n.f7898a;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj3;
                kotlin.jvm.internal.B b11 = (kotlin.jvm.internal.B) obj2;
                Hi.l lVar = new Hi.l((String) serializable, zVar.f37647Y, eventTime, e10, (String) b11.f37622Y);
                mVar.getClass();
                Hi.m.a(lVar);
                motionEvent.recycle();
                b10.f37622Y = null;
                zVar.f37647Y = 0;
                b11.f37622Y = null;
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4679i(C4674d c4674d, kotlin.jvm.internal.A a5, C5017d c5017d, C4686p c4686p, long j6) {
        super(1);
        this.f39450h0 = c4674d;
        this.f39451i0 = a5;
        this.f39452j0 = c5017d;
        this.f39453k0 = c4686p;
        this.f39449Z = j6;
    }
}
