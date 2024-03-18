package R4;

import A5.e;
import A5.j;
import B2.n;
import B2.q;
import B2.v;
import C5.c;
import E2.Y;
import E9.f;
import F5.l;
import G5.d;
import H2.r;
import M1.AbstractC0921b;
import M1.B;
import M1.C0924e;
import M1.C0926g;
import M3.H;
import Wh.p;
import Y2.i;
import a3.C1925c;
import aa.EnumC1940c;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import b9.EnumC2132a;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import com.statsig.androidsdk.ErrorBoundaryKt;
import f9.C2958j;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.y;
import kf.t;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p2.C5065s;
import p2.h0;
import p9.EnumC5099a;
import p9.o;
import p9.s;
import q5.C5271a;
import q5.C5274d;
import q5.EnumC5273c;
import qa.C5293c;
import qa.C5294d;
import qa.C5295e;
import t7.C5682d;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v7.AbstractC5992j;
import w.C6053E;
import w7.AbstractC6134f;
import w7.C6127E;
import wd.C6189g;
import wd.n0;
import wf.k;
import x2.h;
import x8.k0;
import z2.C6755D;

/* loaded from: classes.dex */
public final class a implements e, j, q, B3.e, c, D2.a, U5.a, Y, E5.e, l, d, r, M6.e, AbstractC5992j, K5.a, M5.a, M5.b, AbstractC0921b, O5.d {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ a f15039Y = new Object();

    public static final long S(List list, int i10) {
        return ((Number) t.E2(list).get(((int) Math.ceil((i10 / 100.0d) * list.size())) - 1)).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:22:0x0069). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:22:0x0069). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(a aVar, List list, B b10, AbstractC4825e abstractC4825e) {
        C0924e c0924e;
        int i10;
        kotlin.jvm.internal.B b11;
        Iterator it;
        Throwable th2;
        List list2;
        aVar.getClass();
        if (abstractC4825e instanceof C0924e) {
            c0924e = (C0924e) abstractC4825e;
            int i11 = c0924e.f11436j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0924e.f11436j0 = i11 - Integer.MIN_VALUE;
                Object obj = c0924e.f11434h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c0924e.f11436j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            it = c0924e.f11433Z;
                            b11 = (kotlin.jvm.internal.B) c0924e.f11432Y;
                            try {
                                N.B0(obj);
                            } catch (Throwable th3) {
                                Object obj3 = b11.f37622Y;
                                if (obj3 == null) {
                                    b11.f37622Y = th3;
                                } else {
                                    P4.a.m((Throwable) obj3, th3);
                                }
                            }
                            while (it.hasNext()) {
                                k kVar = (k) it.next();
                                c0924e.f11432Y = b11;
                                c0924e.f11433Z = it;
                                c0924e.f11436j0 = 2;
                                if (kVar.invoke(c0924e) == obj2) {
                                    return obj2;
                                }
                            }
                            th2 = (Throwable) b11.f37622Y;
                            if (th2 == null) {
                                return y.f36177a;
                            }
                            throw th2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) c0924e.f11432Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    ArrayList arrayList = new ArrayList();
                    C0926g c0926g = new C0926g(list, arrayList, null);
                    c0924e.f11432Y = arrayList;
                    c0924e.f11436j0 = 1;
                    if (b10.a(c0926g, c0924e) != obj2) {
                        list2 = arrayList;
                    } else {
                        return obj2;
                    }
                }
                Object obj4 = new Object();
                it = list2.iterator();
                b11 = obj4;
                while (it.hasNext()) {
                }
                th2 = (Throwable) b11.f37622Y;
                if (th2 == null) {
                }
            }
        }
        c0924e = new C0924e(aVar, abstractC4825e);
        Object obj5 = c0924e.f11434h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c0924e.f11436j0;
        if (i10 == 0) {
        }
        Object obj42 = new Object();
        it = list2.iterator();
        b11 = obj42;
        while (it.hasNext()) {
        }
        th2 = (Throwable) b11.f37622Y;
        if (th2 == null) {
        }
    }

    public static final String U(EnumC2132a enumC2132a) {
        List list = C9.l.f2792k;
        if (C9.b.f2751a[enumC2132a.ordinal()] == 1) {
            return "signup";
        }
        return null;
    }

    public static C5295e V(C6189g c6189g, s sVar) {
        C5294d c5294d;
        C5953f c5953f;
        AbstractC3557B.c0("stringResolver", sVar);
        Integer valueOf = Integer.valueOf((int) R.drawable.lock_key_hole);
        if (c6189g != null && c6189g.b()) {
            String str = c6189g.f48413d;
            if (str == null) {
                str = ((C2958j) sVar).a(R.string.disclosure_workspace_fallback_name);
            }
            C2958j c2958j = (C2958j) sVar;
            String a5 = c2958j.a(R.string.disclosure_workspace_title);
            String b10 = c2958j.b(R.string.disclosure_workspace_heading, str);
            String a10 = c2958j.a(R.string.disclosure_workspace_subheading);
            C5293c[] c5293cArr = new C5293c[3];
            c5293cArr[0] = new C5293c(c2958j.a(R.string.disclosure_workspace_work_title), c2958j.a(R.string.disclosure_workspace_work_subtitle), null, valueOf, EnumC5099a.f42757Y, 4);
            c5293cArr[1] = new C5293c(c2958j.a(R.string.disclosure_workspace_ask_away_title), c2958j.a(R.string.disclosure_workspace_ask_away_subtitle), null, Integer.valueOf((int) R.drawable.chat), EnumC5099a.f42758Z, 4);
            String a11 = c2958j.a(R.string.disclosure_workspace_check_title);
            String a12 = c2958j.a(R.string.disclosure_workspace_check_subtitle);
            C5953f c5953f2 = b.f15042c;
            if (c5953f2 != null) {
                c5953f = c5953f2;
            } else {
                C5952e c5952e = new C5952e("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = AbstractC5944H.f46870a;
                r0.N n10 = new r0.N(r0.r.f44254b);
                p pVar = new p(0);
                pVar.p(1.0f, 21.0f);
                pVar.m(22.0f);
                f.C(pVar, 12.0f, 2.0f, 1.0f, 21.0f);
                pVar.p(13.0f, 18.0f);
                pVar.m(-2.0f);
                pVar.x(-2.0f);
                pVar.m(2.0f);
                pVar.x(2.0f);
                pVar.f();
                pVar.p(13.0f, 14.0f);
                pVar.m(-2.0f);
                pVar.x(-4.0f);
                pVar.m(2.0f);
                pVar.x(4.0f);
                pVar.f();
                C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                C5953f c10 = c5952e.c();
                b.f15042c = c10;
                c5953f = c10;
            }
            c5293cArr[2] = new C5293c(a11, a12, c5953f, null, o.f42826x0, 8);
            c5294d = new C5294d(a5, b10, a10, AbstractC4344b.G0(c5293cArr), c2958j.a(R.string.disclosure_continue));
        } else {
            C2958j c2958j2 = (C2958j) sVar;
            c5294d = new C5294d(c2958j2.a(R.string.disclosure_title), c2958j2.a(R.string.disclosure_subheading), AbstractC4344b.G0(new C5293c(c2958j2.a(R.string.disclosure_inaccurate_title), c2958j2.a(R.string.disclosure_inaccurate_subtitle), null, Integer.valueOf((int) R.drawable.search), EnumC5099a.f42758Z, 4), new C5293c(c2958j2.a(R.string.disclosure_sensitive_title), c2958j2.a(R.string.disclosure_sensitive_subtitle), null, valueOf, o.f42813k0, 4), new C5293c(c2958j2.a(R.string.disclosure_controls_title), c2958j2.a(R.string.disclosure_controls_subtitle), null, Integer.valueOf((int) R.drawable.tuning), o.f42826x0, 4)), c2958j2.a(R.string.disclosure_continue), 2);
        }
        return new C5295e(new n0(c5294d));
    }

    public static C5295e W(s sVar) {
        AbstractC3557B.c0("stringResolver", sVar);
        C2958j c2958j = (C2958j) sVar;
        String a5 = c2958j.a(R.string.disclosure_vision_title);
        String a10 = c2958j.a(R.string.disclosure_vision_photo_title);
        String a11 = c2958j.a(R.string.disclosure_vision_photo_subtitle);
        Integer valueOf = Integer.valueOf((int) R.drawable.camera);
        o oVar = o.f42808Y;
        return new C5295e(new n0(new C5294d(a5, (String) null, AbstractC4344b.G0(new C5293c(a10, a11, null, valueOf, oVar, 4), new C5293c(c2958j.a(R.string.disclosure_vision_picture_title), c2958j.a(R.string.disclosure_vision_picture_subtitle), null, Integer.valueOf((int) R.drawable.remix_images), oVar, 4)), c2958j.a(R.string.disclosure_continue), 6)));
    }

    public static EnumC1940c Z(String str) {
        Object obj;
        Iterator it = EnumC1940c.f24040v0.iterator();
        while (true) {
            C6053E c6053e = (C6053E) it;
            if (c6053e.hasNext()) {
                obj = c6053e.next();
                if (AbstractC3557B.K(((EnumC1940c) obj).f24041Y, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (EnumC1940c) obj;
    }

    @Override // O5.d
    public long A() {
        return System.currentTimeMillis();
    }

    @Override // K5.a
    public h6.a B() {
        return h6.a.f31916Y;
    }

    @Override // M5.a
    public String D() {
        return "";
    }

    @Override // B2.q
    public /* synthetic */ B2.p E(n nVar, C5065s c5065s) {
        return B2.p.f1816b;
    }

    @Override // M5.a
    public String G() {
        return "";
    }

    @Override // F5.l
    public void I(C5271a c5271a, boolean z10, s3.r rVar) {
        AbstractC3557B.c0("datadogContext", c5271a);
    }

    @Override // G5.d
    public File J(Set set) {
        return null;
    }

    @Override // G5.d
    public File K() {
        return null;
    }

    @Override // M5.a
    public EnumC5273c L() {
        return EnumC5273c.f43919Y;
    }

    @Override // B2.q
    public int M(C5065s c5065s) {
        if (c5065s.f42322t0 != null) {
            return 1;
        }
        return 0;
    }

    @Override // C5.c
    public void O(File file, H h10) {
        AbstractC3557B.c0("batchFile", file);
    }

    @Override // B3.e
    public B3.f P(B3.d dVar) {
        return new C3.f(dVar.f1831a, dVar.f1832b, dVar.f1833c, dVar.f1834d, dVar.f1835e);
    }

    @Override // B2.q
    public B2.k Q(n nVar, C5065s c5065s) {
        if (c5065s.f42322t0 == null) {
            return null;
        }
        return new v(new B2.j(6001, new Exception()));
    }

    @Override // E5.e
    public C5274d R() {
        return new C5274d(0, null, null, null, null, null, null, 127);
    }

    public r.f X(C5065s c5065s) {
        String str = c5065s.f42319q0;
        if (str != null) {
            str.hashCode();
            char c10 = '\uffff';
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new U2.b(0);
                case 1:
                    return new X2.a();
                case 2:
                    return new i(null);
                case 3:
                    return new U2.b(1);
                case 4:
                    return new C1925c();
            }
        }
        throw new IllegalArgumentException(R.a.r("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public H2.s[] Y(H2.q[] qVarArr) {
        H2.s sVar;
        k0 l10 = H2.b.l(qVarArr);
        H2.s[] sVarArr = new H2.s[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            H2.q qVar = qVarArr[i10];
            if (qVar != null) {
                int[] iArr = qVar.f7327b;
                if (iArr.length != 0) {
                    int length = iArr.length;
                    h0 h0Var = qVar.f7326a;
                    if (length == 1) {
                        sVar = new H2.t(iArr[0], qVar.f7328c, h0Var);
                    } else {
                        x8.N n10 = (x8.N) l10.get(i10);
                        long j6 = (long) ErrorBoundaryKt.SAMPLING_RATE;
                        sVar = new H2.c(h0Var, iArr);
                        if (25000 < j6) {
                            s2.p.g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
                        }
                        x8.N.V(n10);
                    }
                    sVarArr[i10] = sVar;
                }
            }
        }
        return sVarArr;
    }

    public int a0(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override // v7.AbstractC5992j
    public void b(AbstractC6134f abstractC6134f, Object obj) {
        C5682d[] c5682dArr;
        C5682d[] c5682dArr2;
        C5682d c5682d;
        C5682d c5682d2;
        N7.f fVar = (N7.f) obj;
        J7.d dVar = (J7.d) abstractC6134f;
        K7.a aVar = new K7.a(Long.MAX_VALUE, 0, false, null);
        C6127E c6127e = dVar.f48159u;
        Parcelable parcelable = null;
        if (c6127e == null) {
            c5682dArr = null;
        } else {
            c5682dArr = c6127e.f48080Z;
        }
        if (c5682dArr != null) {
            int i10 = 0;
            while (true) {
                if (i10 < c5682dArr.length) {
                    c5682d2 = c5682dArr[i10];
                    if ("location_updates_with_callback".equals(c5682d2.f45767Y)) {
                        break;
                    }
                    i10++;
                } else {
                    c5682d2 = null;
                    break;
                }
            }
            if (c5682d2 != null && c5682d2.c() >= 1) {
                J7.e eVar = new J7.e(4, null, new J7.c(fVar), null, null);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i11 = J7.b.f8864a;
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                eVar.writeToParcel(obtain, 0);
                ((J7.o) dVar.l()).g(obtain, 90);
                return;
            }
        }
        C6127E c6127e2 = dVar.f48159u;
        if (c6127e2 == null) {
            c5682dArr2 = null;
        } else {
            c5682dArr2 = c6127e2.f48080Z;
        }
        if (c5682dArr2 != null) {
            int i12 = 0;
            while (true) {
                if (i12 < c5682dArr2.length) {
                    c5682d = c5682dArr2[i12];
                    if ("get_last_location_with_request".equals(c5682d.f45767Y)) {
                        break;
                    }
                    i12++;
                } else {
                    c5682d = null;
                    break;
                }
            }
            if (c5682d != null && c5682d.c() >= 1) {
                J7.c cVar = new J7.c(fVar);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i13 = J7.b.f8864a;
                obtain2.writeInt(1);
                aVar.writeToParcel(obtain2, 0);
                obtain2.writeStrongBinder(cVar);
                ((J7.o) dVar.l()).g(obtain2, 82);
                return;
            }
        }
        J7.o oVar = (J7.o) dVar.l();
        Parcel obtain3 = Parcel.obtain();
        obtain3.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Parcel obtain4 = Parcel.obtain();
        try {
            try {
                oVar.f8893a.transact(7, obtain3, obtain4, 0);
                obtain4.readException();
                obtain3.recycle();
                Parcelable.Creator creator = Location.CREATOR;
                int i14 = J7.b.f8864a;
                if (obtain4.readInt() != 0) {
                    parcelable = (Parcelable) creator.createFromParcel(obtain4);
                }
                obtain4.recycle();
                fVar.f12723a.g((Location) parcelable);
            } catch (RuntimeException e10) {
                obtain4.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            obtain3.recycle();
            throw th2;
        }
    }

    public boolean b0(C5065s c5065s) {
        String str = c5065s.f42319q0;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // F5.l
    public void c(F5.d dVar, H h10, boolean z10) {
        AbstractC3557B.c0("batchId", dVar);
    }

    @Override // K5.a
    public void d(h6.b bVar) {
        AbstractC3557B.c0("callback", bVar);
    }

    @Override // M5.b
    public String getVersion() {
        return "";
    }

    @Override // A5.e
    public A5.t i(C5271a c5271a, List list, byte[] bArr) {
        AbstractC3557B.c0("context", c5271a);
        AbstractC3557B.c0("batch", list);
        return A5.s.f691c;
    }

    @Override // E2.Y
    public boolean j() {
        return true;
    }

    @Override // U5.a
    public Object k(Object obj) {
        K6.l lVar = (K6.l) obj;
        AbstractC3557B.c0("event", lVar);
        return lVar;
    }

    @Override // M5.a
    public String l() {
        return "";
    }

    @Override // M5.a
    public String n() {
        return "";
    }

    @Override // E2.Y
    public int o(long j6) {
        return 0;
    }

    @Override // E2.Y
    public int q(C3636c1 c3636c1, h hVar, int i10) {
        hVar.f48626Z = 4;
        return -4;
    }

    @Override // M5.a
    public String r() {
        return "";
    }

    @Override // G5.d
    public File s(File file) {
        return null;
    }

    @Override // M5.a
    public String t() {
        return "";
    }

    @Override // M5.a
    public String u() {
        return "";
    }

    @Override // G5.d
    public File v(boolean z10) {
        return null;
    }

    @Override // F5.l
    public F5.c w() {
        return null;
    }

    @Override // K5.a
    public void x(h6.b bVar) {
        AbstractC3557B.c0("callback", bVar);
    }

    @Override // M5.a
    public String y() {
        return "";
    }

    @Override // O5.d
    public long z() {
        return System.currentTimeMillis();
    }

    @Override // K5.a
    public void C() {
    }

    @Override // A5.j
    public void H() {
    }

    @Override // K5.a
    public void f() {
    }

    @Override // B2.q
    public /* synthetic */ void g() {
    }

    @Override // E2.Y
    public void m() {
    }

    @Override // A5.j
    public void p() {
    }

    @Override // B2.q
    public /* synthetic */ void release() {
    }

    @Override // E5.e
    public void F(Context context) {
    }

    @Override // E5.e
    public void a(Context context) {
    }

    @Override // M5.b
    public void h(String str) {
    }

    @Override // C5.c
    public void N(File file, C5.a aVar) {
    }

    @Override // B2.q
    public void e(Looper looper, C6755D c6755d) {
    }
}
