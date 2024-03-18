package zc;

import Gf.r0;
import Gf.s0;
import Gf.u0;
import Kd.C0830f;
import Ng.C1079o0;
import Ve.C1498g;
import Ve.C1503i0;
import Ve.C1519y;
import Xe.AbstractC1685g;
import androidx.lifecycle.C2088x;
import com.openai.voice.assistant.AssistantActivity;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C4303b;
import l8.AbstractC4344b;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.VideoSink;
import me.C4647u;
import nf.C4832l;
import rd.AbstractC5482f;
import wf.AbstractC6216a;
import yf.AbstractC6583a;
import ze.AbstractC6846e;
import ze.AbstractC6848g;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51943Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51944Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, Object obj) {
        super(0);
        this.f51943Y = i10;
        this.f51944Z = obj;
    }

    public static final void c(DataChannel dataChannel) {
        dataChannel.unregisterObserver();
        dataChannel.close();
        dataChannel.dispose();
    }

    public final Iterator a() {
        int i10 = this.f51943Y;
        Object obj = this.f51944Z;
        switch (i10) {
            case 17:
                return com.google.android.gms.internal.play_billing.N.f0((Object[]) obj);
            case 18:
                float[] fArr = (float[]) obj;
                AbstractC3557B.c0("array", fArr);
                return new C4303b(fArr);
            default:
                return ((Iterable) obj).iterator();
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f51943Y;
        Object obj = this.f51944Z;
        switch (i11) {
            case 0:
                return (Va.e) ((Q) obj).f51862n.get();
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                return (Yc.f) ((Mc.c) obj).f12018a.get();
            case 3:
                return ((AbstractC5482f) obj).f44959c;
            case 4:
                mo122invoke();
                return yVar;
            case 5:
                mo122invoke();
                return yVar;
            case 6:
                Kd.I i12 = (Kd.I) obj;
                return new C0830f(i12.f9680c, i12.f9678a, null, true, 4);
            case 7:
                mo122invoke();
                return yVar;
            case 8:
                mo122invoke();
                return yVar;
            case 9:
                je.d dVar = (je.d) obj;
                return AbstractC4344b.Q0(new C1079o0(null), new S0.x(2)).plus(dVar.f36129Z).plus(new Ng.E(R.a.t(new StringBuilder(), dVar.f36128Y, "-context")));
            case 10:
                return ((AbstractC6846e) ((AbstractC6848g) obj)).e();
            case 11:
                return Boolean.valueOf(((C4647u) obj).f39263c);
            case 12:
                byte[] bArr = (byte[]) obj;
                Me.c cVar = new Me.c();
                try {
                    P4.a.V0(cVar, bArr);
                    return cVar.p();
                } catch (Throwable th2) {
                    cVar.close();
                    throw th2;
                }
            case 13:
                mo122invoke();
                return yVar;
            case 14:
                mo122invoke();
                return yVar;
            case 15:
                mo122invoke();
                return yVar;
            case 16:
                mo122invoke();
                return yVar;
            case 17:
                return a();
            case 18:
                return a();
            case 19:
                return a();
            case 20:
                return u0.a(((Gf.H) obj).f());
            case 21:
                return new Gf.K((Gf.L) obj);
            case 22:
                return new Gf.M((Gf.N) obj);
            case 23:
                return new Gf.O((Gf.P) obj);
            case 24:
                List<Bg.A> upperBounds = ((s0) obj).f6471Y.getUpperBounds();
                AbstractC3557B.b0("getUpperBounds(...)", upperBounds);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(upperBounds, 10));
                for (Bg.A a5 : upperBounds) {
                    arrayList.add(new r0(a5, null));
                }
                return arrayList;
            case 25:
                int i13 = 0;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        i10 = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        i10 = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        i10 = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        i10 = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        i10 = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        i10 = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        i10 = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        i10 = Arrays.hashCode((double[]) value);
                    } else {
                        i10 = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    i13 += i10 ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i13);
            case 26:
                switch (i11) {
                    case 26:
                        return ((Pf.A) ((Mf.B) obj).r(Jf.q.f9202i)).f13979l0;
                    default:
                        Mf.T t10 = (Mf.T) obj;
                        return (ug.n) t10.f12072b.invoke(t10.f12073c);
                }
            case 27:
                Lf.j jVar = (Lf.j) obj;
                AbstractC6216a abstractC6216a = jVar.f11096f;
                if (abstractC6216a != null) {
                    Lf.i iVar = (Lf.i) abstractC6216a.mo122invoke();
                    jVar.f11096f = null;
                    return iVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            case 28:
                switch (i11) {
                    case 26:
                        return ((Pf.A) ((Mf.B) obj).r(Jf.q.f9202i)).f13979l0;
                    default:
                        Mf.T t11 = (Mf.T) obj;
                        return (ug.n) t11.f12072b.invoke(t11.f12073c);
                }
            default:
                Nf.k kVar = (Nf.k) obj;
                return kVar.f12825a.i(kVar.f12826b).n();
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f51943Y;
        jf.y yVar = null;
        Object obj = this.f51944Z;
        switch (i10) {
            case 1:
                a7.g gVar = (a7.g) ((a7.h) obj);
                K4.J j6 = gVar.f23920e;
                if (j6 != null) {
                    j6.K(gVar.f23916a);
                    yVar = jf.y.f36177a;
                }
                if (yVar == null) {
                    throw new IllegalStateException("ActivityResultLauncher cannot be null");
                }
                return;
            case 2:
            case 3:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                Xe.J j10 = (Xe.J) obj;
                Iterator it = j10.f21882i.iterator();
                while (it.hasNext()) {
                    j10.b().removeSink((VideoSink) it.next());
                }
                j10.f21882i.clear();
                return;
            case 4:
                ((AssistantActivity) obj).finish();
                return;
            case 5:
                ((Id.g) obj).j(Id.i.f8555a);
                return;
            case 7:
                Od.u uVar = (Od.u) obj;
                C2088x c2088x = uVar.f13738p0;
                if (c2088x != null) {
                    c2088x.a(uVar);
                    return;
                } else {
                    AbstractC3557B.C2("lifecycle");
                    throw null;
                }
            case 8:
                Vd.g.a((Vd.g) obj);
                return;
            case 13:
                ((Ve.C) obj).f18615a.i();
                return;
            case 14:
                C1503i0 c1503i0 = (C1503i0) obj;
                c1503i0.f18788n.f18617c = null;
                c1503i0.f18789o.f18666d = null;
                C1519y c1519y = c1503i0.f18790p;
                if (c1519y != null) {
                    Ad.l.a1(C4832l.f40334Y, new C1498g(c1519y, null));
                }
                c1503i0.f18790p = null;
                C1519y c1519y2 = c1503i0.f18791q;
                if (c1519y2 != null) {
                    Ad.l.a1(C4832l.f40334Y, new C1498g(c1519y2, null));
                }
                c1503i0.f18791q = null;
                DataChannel dataChannel = c1503i0.f18792r;
                if (dataChannel != null) {
                    c(dataChannel);
                }
                c1503i0.f18792r = null;
                DataChannel dataChannel2 = c1503i0.f18793s;
                if (dataChannel2 != null) {
                    c(dataChannel2);
                }
                c1503i0.f18793s = null;
                DataChannel dataChannel3 = c1503i0.f18794t;
                if (dataChannel3 != null) {
                    c(dataChannel3);
                }
                c1503i0.f18794t = null;
                DataChannel dataChannel4 = c1503i0.f18795u;
                if (dataChannel4 != null) {
                    c(dataChannel4);
                }
                c1503i0.f18795u = null;
                c1503i0.f18796v = false;
                return;
            case 15:
                ((AbstractC1685g) obj).c();
                return;
        }
    }
}
