package lc;

import Gf.A0;
import Gf.C0649x;
import H0.ViewTreeObserver$OnGlobalLayoutListenerC0691m;
import H0.n1;
import Ii.AbstractC0801f;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Uc.C1422g;
import Ve.C1503i0;
import Ve.H0;
import Ve.r0;
import Wh.C1656a;
import Wh.C1662g;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.U0;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import cf.AbstractC2408g;
import d1.C2571f;
import fa.AbstractC2965B;
import fa.C2976e;
import gb.C3234k;
import id.AbstractC3557B;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import l8.AbstractC4344b;
import ld.C4429b;
import lg.AbstractC4457b;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import m.AbstractActivityC4532l;
import mh.C4678h;
import nd.C4812a;
import nf.AbstractC4828h;
import pc.C5129h;
import pc.b0;
import pc.g0;
import pc.h0;
import wf.AbstractC6216a;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* renamed from: lc.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4385I extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38090Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38091Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f38092h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f38093i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4385I(Tc.f fVar, AbstractC1710f0 abstractC1710f0, AbstractC1708e0 abstractC1708e0) {
        super(0);
        this.f38090Y = 1;
        this.f38092h0 = fVar;
        this.f38091Z = abstractC1710f0;
        this.f38093i0 = abstractC1708e0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f38090Y;
        Object obj = this.f38091Z;
        Object obj2 = this.f38093i0;
        Object obj3 = this.f38092h0;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                mo122invoke();
                return yVar;
            case 3:
                File file = new File(((Application) obj2).getCacheDir(), R.a.r("whisper/", ((C4812a) obj3).f40278e));
                C4429b c4429b = (C4429b) obj;
                file.mkdirs();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                c4429b.a(new Fc.b(file, null));
                return file;
            case 4:
                mo122invoke();
                return yVar;
            case 5:
                mo122invoke();
                return yVar;
            case 6:
                mo122invoke();
                return yVar;
            case 7:
                mo122invoke();
                return yVar;
            case 8:
                mo122invoke();
                return yVar;
            case 9:
                AbstractC1000i k10 = ((Bg.A) obj3).y0().k();
                if (k10 instanceof AbstractC0997f) {
                    Class k11 = A0.k((AbstractC0997f) k10);
                    if (k11 != null) {
                        Gf.B b10 = (Gf.B) obj;
                        boolean K10 = AbstractC3557B.K(b10.f6332Z.getSuperclass(), k11);
                        Class cls = b10.f6332Z;
                        if (K10) {
                            Type genericSuperclass = cls.getGenericSuperclass();
                            AbstractC3557B.Z(genericSuperclass);
                            return genericSuperclass;
                        }
                        Class<?>[] interfaces = cls.getInterfaces();
                        AbstractC3557B.b0("getInterfaces(...)", interfaces);
                        int o32 = kf.q.o3(k11, interfaces);
                        if (o32 >= 0) {
                            Type type = cls.getGenericInterfaces()[o32];
                            AbstractC3557B.Z(type);
                            return type;
                        }
                        throw new Lc.l("No superclass of " + ((C0649x) obj2) + " in Java reflection for " + k10, 3);
                    }
                    throw new Lc.l("Unsupported superclass of " + ((C0649x) obj2) + ": " + k10, 3);
                }
                throw new Lc.l("Supertype not a class: " + k10, 3);
            case 10:
                return ((AbstractC4457b) ((lg.y) obj3)).a((ByteArrayInputStream) obj2, ((xg.m) ((zg.p) obj).f52075b.f11536a).f50025p);
            case 11:
                return mo122invoke();
            case 12:
                return mo122invoke();
            case 13:
                mo122invoke();
                return yVar;
            default:
                mo122invoke();
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4385I(AbstractC1710f0 abstractC1710f0, Object obj, Object obj2, int i10) {
        super(0);
        this.f38090Y = i10;
        this.f38091Z = abstractC1710f0;
        this.f38092h0 = obj;
        this.f38093i0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4385I(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f38090Y = i10;
        this.f38092h0 = obj;
        this.f38093i0 = obj2;
        this.f38091Z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4385I(List list, wf.k kVar, AbstractC2965B abstractC2965B) {
        super(0);
        this.f38090Y = 4;
        this.f38093i0 = list;
        this.f38092h0 = kVar;
        this.f38091Z = abstractC2965B;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final List mo122invoke() {
        int i10 = this.f38090Y;
        Object obj = this.f38091Z;
        Object obj2 = this.f38093i0;
        Object obj3 = this.f38092h0;
        switch (i10) {
            case 11:
                A7.b bVar = ((C1662g) obj3).f21187b;
                List<Certificate> n02 = bVar != null ? bVar.n0((String) obj, (List) obj2) : (List) obj2;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(n02, 10));
                for (Certificate certificate : n02) {
                    AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                A7.b bVar2 = ((C1662g) obj3).f21187b;
                AbstractC3557B.Z(bVar2);
                return bVar2.n0(((C1656a) obj).f21166i.f21253d, ((Wh.o) obj2).a());
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v21, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        C3959i c3959i;
        Object obj;
        int i10 = this.f38090Y;
        We.C c10 = null;
        int i11 = 0;
        Object obj2 = this.f38091Z;
        Object obj3 = this.f38093i0;
        Object obj4 = this.f38092h0;
        switch (i10) {
            case 0:
                ((AbstractC1710f0) obj2).setValue(Boolean.FALSE);
                ((wf.k) obj4).invoke((zd.d) obj3);
                return;
            case 1:
                if (((Boolean) ((AbstractC1710f0) obj2).getValue()).booleanValue()) {
                    ((Tc.f) obj4).f17057b.p();
                }
                ((U0) ((AbstractC1708e0) obj3)).i(0);
                return;
            case 2:
                AbstractActivityC4532l abstractActivityC4532l = (AbstractActivityC4532l) obj3;
                String str = ((C5129h) obj2).f42992a;
                h0 h0Var = (h0) ((b0) obj4);
                h0Var.getClass();
                AbstractC3557B.c0("activity", abstractActivityC4532l);
                AbstractC3557B.c0("purchasePackageId", str);
                Ad.l.O0(AbstractC4828h.Q(h0Var), null, null, new g0(h0Var, abstractActivityC4532l, str, null), 3);
                return;
            case 3:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                View rootView = ((Window) obj4).getDecorView().getRootView();
                WeakReference weakReference = new WeakReference(rootView);
                ?? obj5 = new Object();
                ?? obj6 = new Object();
                Ii.I i12 = (Ii.I) obj3;
                final C2571f c2571f = new C2571f(obj5, weakReference, (AbstractC6216a) obj2, i12, obj6);
                switch (((Ii.q) i12).f8680Y) {
                    case 0:
                        obj = new ViewTreeObserver$OnGlobalLayoutListenerC0691m(1, c2571f);
                        break;
                    default:
                        obj = new ViewTreeObserver.OnPreDrawListener() { // from class: Ii.r
                            @Override // android.view.ViewTreeObserver.OnPreDrawListener
                            public final boolean onPreDraw() {
                                AbstractC6216a abstractC6216a = c2571f;
                                AbstractC3557B.c0("$callback", abstractC6216a);
                                abstractC6216a.mo122invoke();
                                return true;
                            }
                        };
                        break;
                }
                obj6.f37622Y = obj;
                AbstractC3557B.b0("rootView", rootView);
                C4678h c4678h = new C4678h(i12, 8, obj6);
                if (rootView.getViewTreeObserver().isAlive() && rootView.isAttachedToWindow()) {
                    ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                    AbstractC3557B.b0("viewTreeObserver", viewTreeObserver);
                    c4678h.invoke(viewTreeObserver);
                    return;
                }
                rootView.addOnAttachStateChangeListener(new n1(c4678h, 3, rootView));
                return;
            case 4:
                List list = (List) obj3;
                AbstractC2965B abstractC2965B = (AbstractC2965B) obj2;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                    } else if (!AbstractC3557B.K(((C3234k) it.next()).f31470a, ((C2976e) abstractC2965B).f30060b.f48372a)) {
                        i11++;
                    }
                }
                ((wf.k) obj4).invoke(new gb.b0(i11, list));
                return;
            case 5:
                Context context = (Context) obj3;
                context.startActivity(x8.W.D(context, C1422g.f17674i.p1(((Cd.X) obj4).f3026a), AbstractC4344b.G0(268435456, 67108864)));
                ((AbstractActivityC4532l) obj2).finish();
                return;
            case 6:
                Ed.i iVar = (Ed.i) ((AbstractC1710f0) obj2).getValue();
                if (iVar == null) {
                    return;
                }
                ((Id.g) obj4).j(new Id.h(iVar));
                ((AbstractC6216a) obj3).mo122invoke();
                return;
            case 7:
                ((AbstractC1710f0) obj2).setValue(Boolean.TRUE);
                ((AbstractC1710f0) obj4).setValue((Ed.i) obj3);
                return;
            case 8:
                RtpReceiver rtpReceiver = (RtpReceiver) obj4;
                MediaStreamTrack track = rtpReceiver.track();
                if (track == null) {
                    return;
                }
                MediaStream[] mediaStreamArr = (MediaStream[]) obj2;
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                    track.kind();
                    track.id();
                    String str2 = "";
                    for (MediaStream mediaStream : mediaStreamArr) {
                        str2 = str2 + ", " + mediaStream;
                    }
                    Mi.a.e(new Object[0]);
                }
                Ve.F f6 = ((H0) obj3).f18663a.f18778d;
                if (f6 == null) {
                    return;
                }
                r0 r0Var = (r0) f6;
                AbstractC3557B.c0("streams", mediaStreamArr);
                if (mediaStreamArr.length < 0) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(2, 7) < 0 || Mi.a.d() <= 0) {
                        return;
                    }
                    Mi.a.c(new Object[0]);
                    return;
                }
                String id2 = ((MediaStream) kf.q.i3(mediaStreamArr)).getId();
                AbstractC3557B.b0("streams.first().id", id2);
                List F22 = Lg.n.F2(id2, new char[]{'|'});
                if (F22.size() != 2) {
                    c3959i = new C3959i(id2, null);
                } else {
                    c3959i = new C3959i(F22.get(0), F22.get(1));
                }
                String str3 = (String) c3959i.f36156Z;
                String id3 = (str3 == null || !Lg.n.I2(str3, "TR", false)) ? track.id() : str3;
                String str4 = (String) c3959i.f36155Y;
                AbstractC3557B.c0("sid", str4);
                We.w f10 = r0Var.f(str4);
                if (f10 instanceof We.C) {
                    c10 = (We.C) f10;
                }
                We.C c11 = c10;
                if (c11 == null) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(5, 7) < 0 || Mi.a.d() <= 0) {
                        return;
                    }
                    "Tried to add a track for a participant that is not present. sid: ".concat(str4);
                    Mi.a.b(new Object[0]);
                    return;
                }
                C1503i0 c1503i0 = r0Var.f18863b;
                c1503i0.getClass();
                Oc.c cVar = new Oc.c(c1503i0.f18791q, 16, rtpReceiver);
                AbstractC3557B.Z(id3);
                boolean z10 = r0Var.f18881t;
                We.A a5 = We.C.Companion;
                c11.j(track, id3, cVar, rtpReceiver, z10, 20);
                return;
            case 13:
                AbstractC0801f.a(new Ii.l((io.sentry.android.core.z) obj4, (String) obj3, (Ii.m) obj2, 0));
                return;
        }
    }
}
