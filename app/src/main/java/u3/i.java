package U3;

import Bg.A;
import Bg.C0213f;
import Bg.I;
import Bg.Q;
import Bg.Y;
import Bg.c0;
import Bg.k0;
import Bg.m0;
import Bg.o0;
import Bg.p0;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.b0;
import Rh.AbstractC1315n;
import Rh.C0;
import Rh.K;
import Rh.e1;
import Sf.E;
import Sf.G;
import Uf.v;
import V1.AbstractComponentCallbacksC1480v;
import V1.M;
import V1.P;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import bg.AbstractC2198f;
import bg.AbstractC2199g;
import bg.AbstractC2201i;
import bg.AbstractC2206n;
import bg.AbstractC2207o;
import bg.AbstractC2209q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import d1.C2571f;
import e.AbstractBinderC2736d;
import e.AbstractC2737e;
import e.C2735c;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3169l;
import h1.C3299f;
import h8.C3335e;
import id.AbstractC3557B;
import io.sentry.C;
import io.sentry.C1;
import io.sentry.C3636c1;
import io.sentry.D;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.L0;
import io.sentry.S;
import io.sentry.android.core.B;
import j3.C3908a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import l8.AbstractC4344b;
import ng.AbstractC4838e;
import p.F;
import p.w;
import rg.AbstractC5493d;
import s2.AbstractC5530A;
import s2.AbstractC5535e;
import s3.z;
import sg.EnumC5626c;
import th.AbstractC5809q;
import u.C5822d;
import w.C6049A;
import w1.AbstractMenuItemC6082b;
import x3.C6270B;
import x3.y;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class i implements androidx.appcompat.view.b, AbstractC3170m, D, AbstractC1315n {

    /* renamed from: j0  reason: collision with root package name */
    public static i f17413j0;

    /* renamed from: Y  reason: collision with root package name */
    public Object f17414Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f17415Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f17416h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f17417i0;

    public i(int i10) {
        if (i10 == 4) {
            this.f17414Y = new C3299f(10, 1);
            this.f17415Z = new C6049A(0);
            this.f17416h0 = new ArrayList();
            this.f17417i0 = new HashSet();
        } else if (i10 == 9) {
            this.f17414Y = new Object();
            this.f17415Z = new Handler(Looper.getMainLooper(), new C3335e(this));
        } else if (i10 == 11) {
            this.f17414Y = new LinkedHashSet();
            this.f17415Z = new LinkedHashMap();
            this.f17417i0 = Lg.a.f11131a;
        } else if (i10 == 6) {
            this.f17414Y = new ArrayList();
            this.f17415Z = new HashMap();
            this.f17416h0 = new HashMap();
        } else if (i10 != 7) {
        } else {
            this.f17414Y = new s2.u();
            this.f17415Z = new s2.u();
            this.f17416h0 = new C3908a();
        }
    }

    public static boolean H(Context context, H h10, B b10, ConnectivityManager.NetworkCallback networkCallback) {
        b10.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            h10.f(EnumC3642e1.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager y10 = y(context, h10);
        if (y10 == null) {
            return false;
        }
        if (AbstractC3557B.B1(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                y10.registerDefaultNetworkCallback(networkCallback);
                return true;
            } catch (Throwable th2) {
                h10.d(EnumC3642e1.WARNING, "registerDefaultNetworkCallback failed", th2);
                return false;
            }
        }
        h10.f(EnumC3642e1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
        return false;
    }

    public static ConnectivityManager y(Context context, H h10) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            h10.f(EnumC3642e1.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    public final Menu A(p.o oVar) {
        Menu menu = (Menu) ((C6049A) this.f17417i0).get(oVar);
        if (menu == null) {
            F f6 = new F((Context) this.f17415Z, oVar);
            ((C6049A) this.f17417i0).put(oVar, f6);
            return f6;
        }
        return menu;
    }

    public final g B(j jVar) {
        S s10;
        AbstractC3557B.c0(ParameterNames.ID, jVar);
        S d10 = L0.d();
        g gVar = null;
        String str = null;
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str2 = jVar.f17418a;
        if (str2 == null) {
            a5.s0(1);
        } else {
            a5.b(1, str2);
        }
        a5.T(2, jVar.f17419b);
        ((y) this.f17414Y).b();
        Cursor t12 = A7.b.t1((y) this.f17414Y, a5, false);
        try {
            int m02 = r9.y.m0(t12, "work_spec_id");
            int m03 = r9.y.m0(t12, "generation");
            int m04 = r9.y.m0(t12, "system_id");
            if (t12.moveToFirst()) {
                if (!t12.isNull(m02)) {
                    str = t12.getString(m02);
                }
                gVar = new g(str, t12.getInt(m03), t12.getInt(m04));
            }
            return gVar;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final void C(g gVar) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao");
        } else {
            s10 = null;
        }
        ((y) this.f17414Y).b();
        ((y) this.f17414Y).c();
        try {
            ((x3.g) this.f17415Z).i(gVar);
            ((y) this.f17414Y).n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            ((y) this.f17414Y).j();
            if (s10 != null) {
                s10.b();
            }
        }
    }

    public final void D(P p10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
        if (((HashMap) this.f17415Z).get(abstractComponentCallbacksC1480v.f18289j0) != null) {
            return;
        }
        ((HashMap) this.f17415Z).put(abstractComponentCallbacksC1480v.f18289j0, p10);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC1480v);
        }
    }

    public final void E(P p10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
        if (abstractComponentCallbacksC1480v.f18265F0) {
            ((M) this.f17417i0).h(abstractComponentCallbacksC1480v);
        }
        if (((HashMap) this.f17415Z).get(abstractComponentCallbacksC1480v.f18289j0) == p10 && ((P) ((HashMap) this.f17415Z).put(abstractComponentCallbacksC1480v.f18289j0, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC1480v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Binder, android.os.IInterface, u.a, android.os.IBinder] */
    public final C5822d F(PendingIntent pendingIntent) {
        ?? binder = new Binder();
        binder.attachInterface(binder, "android.support.customtabs.ICustomTabsCallback");
        new Handler(Looper.getMainLooper());
        boolean z10 = false;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                C2735c c2735c = (C2735c) ((AbstractC2737e) this.f17414Y);
                c2735c.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                obtain.writeStrongBinder(binder);
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                if (!c2735c.f28679a.transact(10, obtain, obtain2, 0)) {
                    int i10 = AbstractBinderC2736d.f28680a;
                }
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z10 = true;
                }
                obtain2.recycle();
                obtain.recycle();
            } else {
                C2735c c2735c2 = (C2735c) ((AbstractC2737e) this.f17414Y);
                c2735c2.getClass();
                Parcel obtain3 = Parcel.obtain();
                Parcel obtain4 = Parcel.obtain();
                obtain3.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                obtain3.writeStrongBinder(binder);
                if (!c2735c2.f28679a.transact(3, obtain3, obtain4, 0)) {
                    int i11 = AbstractBinderC2736d.f28680a;
                }
                obtain4.readException();
                if (obtain4.readInt() != 0) {
                    z10 = true;
                }
                obtain4.recycle();
                obtain3.recycle();
            }
            if (!z10) {
                return null;
            }
            return new C5822d(binder, (ComponentName) this.f17415Z, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void G() {
        synchronized (this.f17414Y) {
            AbstractC2469q0.p(this.f17416h0);
        }
    }

    public final void I(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        synchronized (((ArrayList) this.f17414Y)) {
            ((ArrayList) this.f17414Y).remove(abstractComponentCallbacksC1480v);
        }
        abstractComponentCallbacksC1480v.f18295p0 = false;
    }

    public final Bundle J(Bundle bundle, String str) {
        if (bundle != null) {
            return (Bundle) ((HashMap) this.f17416h0).put(str, bundle);
        }
        return (Bundle) ((HashMap) this.f17416h0).remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 K(AbstractC2198f abstractC2198f, Zf.a aVar, boolean z10) {
        AbstractC2206n abstractC2206n;
        Jf.n nVar;
        p0 p0Var;
        AbstractC3557B.c0("arrayType", abstractC2198f);
        Sf.D d10 = ((Sf.i) abstractC2198f).f16612b;
        if (d10 instanceof AbstractC2206n) {
            abstractC2206n = (AbstractC2206n) d10;
        } else {
            abstractC2206n = null;
        }
        if (abstractC2206n != null) {
            Class cls = Void.TYPE;
            Class cls2 = ((Sf.B) abstractC2206n).f16589a;
            if (!AbstractC3557B.K(cls2, cls)) {
                nVar = EnumC5626c.b(cls2.getName()).d();
                Xf.d dVar = new Xf.d((z) this.f17414Y, abstractC2198f, true);
                boolean z11 = aVar.f23716d;
                if (nVar == null) {
                    Bg.D q10 = ((z) this.f17414Y).d().j().q(nVar);
                    A y12 = Bi.c.y1(q10, new Nf.j(new Nf.i[]{q10.getAnnotations(), dVar}));
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", y12);
                    Bg.D d11 = (Bg.D) y12;
                    if (!z11) {
                        return C0213f.f(d11, d11.C0(true));
                    }
                    return d11;
                }
                A L10 = L(d10, A7.b.N1(k0.f2132Z, z11, false, null, 6));
                if (z11) {
                    if (z10) {
                        p0Var = p0.f2148j0;
                    } else {
                        p0Var = p0.f2146h0;
                    }
                    return ((z) this.f17414Y).d().j().h(p0Var, L10, dVar);
                }
                return C0213f.f(((z) this.f17414Y).d().j().h(p0.f2146h0, L10, dVar), ((z) this.f17414Y).d().j().h(p0.f2148j0, L10, dVar).C0(true));
            }
        }
        nVar = null;
        Xf.d dVar2 = new Xf.d((z) this.f17414Y, abstractC2198f, true);
        boolean z112 = aVar.f23716d;
        if (nVar == null) {
        }
    }

    public final A L(AbstractC2207o abstractC2207o, Zf.a aVar) {
        A a5;
        Bg.D d10;
        Jf.n nVar = null;
        if (abstractC2207o instanceof AbstractC2206n) {
            Class cls = Void.TYPE;
            Class cls2 = ((Sf.B) ((AbstractC2206n) abstractC2207o)).f16589a;
            if (!AbstractC3557B.K(cls2, cls)) {
                nVar = EnumC5626c.b(cls2.getName()).d();
            }
            if (nVar != null) {
                d10 = ((z) this.f17414Y).d().j().s(nVar);
            } else {
                d10 = ((z) this.f17414Y).d().j().w();
            }
            AbstractC3557B.Z(d10);
            return d10;
        }
        boolean z10 = false;
        if (abstractC2207o instanceof AbstractC2201i) {
            AbstractC2201i abstractC2201i = (AbstractC2201i) abstractC2207o;
            if (!aVar.f23716d) {
                if (aVar.f23713a != k0.f2131Y) {
                    z10 = true;
                }
            }
            Sf.s sVar = (Sf.s) abstractC2201i;
            boolean c10 = sVar.c();
            Type type = sVar.f16623a;
            if (!c10 && !z10) {
                Bg.D q10 = q(sVar, aVar, null);
                if (q10 == null) {
                    return Dg.m.c(Dg.l.f3688h0, type.toString());
                }
                return q10;
            }
            Bg.D q11 = q(sVar, aVar.g(Zf.b.f23721h0), null);
            if (q11 == null) {
                return Dg.m.c(Dg.l.f3688h0, type.toString());
            }
            Bg.D q12 = q(sVar, aVar.g(Zf.b.f23720Z), q11);
            if (q12 == null) {
                return Dg.m.c(Dg.l.f3688h0, type.toString());
            }
            if (c10) {
                a5 = new Zf.f(q11, q12);
            } else {
                a5 = C0213f.f(q11, q12);
            }
            return a5;
        } else if (abstractC2207o instanceof AbstractC2198f) {
            return K((AbstractC2198f) abstractC2207o, aVar, false);
        } else {
            if (abstractC2207o instanceof AbstractC2209q) {
                AbstractC2207o b10 = ((G) ((AbstractC2209q) abstractC2207o)).b();
                if (b10 != null) {
                    return L(b10, aVar);
                }
                return ((z) this.f17414Y).d().j().m();
            } else if (abstractC2207o == null) {
                return ((z) this.f17414Y).d().j().m();
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + abstractC2207o);
            }
        }
    }

    @Override // io.sentry.D
    public final String a() {
        Context context = (Context) this.f17414Y;
        H h10 = (H) this.f17415Z;
        B b10 = (B) this.f17416h0;
        ConnectivityManager y10 = y(context, h10);
        String str = null;
        if (y10 != null) {
            if (!AbstractC3557B.B1(context, "android.permission.ACCESS_NETWORK_STATE")) {
                h10.f(EnumC3642e1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            } else {
                try {
                    b10.getClass();
                    Network activeNetwork = y10.getActiveNetwork();
                    if (activeNetwork == null) {
                        h10.f(EnumC3642e1.INFO, "Network is null and cannot check network status", new Object[0]);
                    } else {
                        NetworkCapabilities networkCapabilities = y10.getNetworkCapabilities(activeNetwork);
                        if (networkCapabilities == null) {
                            h10.f(EnumC3642e1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                        } else {
                            boolean hasTransport = networkCapabilities.hasTransport(3);
                            boolean hasTransport2 = networkCapabilities.hasTransport(1);
                            boolean hasTransport3 = networkCapabilities.hasTransport(0);
                            if (hasTransport) {
                                str = "ethernet";
                            } else if (hasTransport2) {
                                str = "wifi";
                            } else if (hasTransport3) {
                                str = "cellular";
                            }
                        }
                    }
                } catch (Throwable th2) {
                    h10.d(EnumC3642e1.ERROR, "Failed to retrieve network info", th2);
                }
            }
        }
        return str;
    }

    @Override // Rh.AbstractC1315n
    public final void c() {
        e1 e1Var = (e1) this.f17417i0;
        e1Var.f15835d.h((String) this.f17415Z, new C0(e1Var.f15837f.f15910y, new K((String) this.f17414Y, (Map) this.f17416h0)));
    }

    @Override // androidx.appcompat.view.b
    public final void d(androidx.appcompat.view.c cVar) {
        ((ActionMode.Callback) this.f17414Y).onDestroyActionMode(u(cVar));
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.E(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        r6.reset();
        r2 = (s2.u) r37.f17415Z;
        r0.D(r2.f45195c, r2.f45193a);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v30 */
    @Override // g3.AbstractC3170m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        r2.b bVar;
        char c10;
        int i12;
        int i13;
        ?? r22;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int w10;
        Inflater inflater;
        ((s2.u) this.f17414Y).D(i10 + i11, bArr);
        ((s2.u) this.f17414Y).F(i10);
        s2.u uVar = (s2.u) this.f17414Y;
        char c11 = '\u00ff';
        int i19 = 0;
        int i20 = 2;
        if (uVar.a() > 0 && (uVar.f45193a[uVar.f45194b] & 255) == 120) {
            if (((Inflater) this.f17417i0) == null) {
                this.f17417i0 = new Inflater();
            }
            s2.u uVar2 = (s2.u) this.f17415Z;
            inflater = (Inflater) this.f17417i0;
            int i21 = AbstractC5530A.f45131a;
            if (uVar.a() > 0) {
                if (uVar2.f45193a.length < uVar.a()) {
                    uVar2.b(uVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(uVar.f45193a, uVar.f45194b, uVar.a());
                int i22 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = uVar2.f45193a;
                        i22 += inflater.inflate(bArr2, i22, bArr2.length - i22);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr3 = uVar2.f45193a;
                            if (i22 == bArr3.length) {
                                uVar2.b(bArr3.length * 2);
                            }
                        } else {
                            break;
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th2) {
                        inflater.reset();
                        throw th2;
                    }
                }
            }
        }
        C3908a c3908a = (C3908a) this.f17416h0;
        c3908a.f36013d = 0;
        c3908a.f36014e = 0;
        c3908a.f36015f = 0;
        c3908a.f36016g = 0;
        c3908a.f36017h = 0;
        c3908a.f36018i = 0;
        c3908a.f36010a.C(0);
        c3908a.f36012c = false;
        ArrayList arrayList = new ArrayList();
        while (((s2.u) this.f17414Y).a() >= 3) {
            s2.u uVar3 = (s2.u) this.f17414Y;
            C3908a c3908a2 = (C3908a) this.f17416h0;
            int i23 = uVar3.f45195c;
            int u10 = uVar3.u();
            int z10 = uVar3.z();
            int i24 = uVar3.f45194b + z10;
            if (i24 > i23) {
                uVar3.F(i23);
                c10 = c11;
                i12 = i19;
                bVar = null;
            } else {
                if (u10 != 128) {
                    switch (u10) {
                        case 20:
                            c3908a2.getClass();
                            if (z10 % 5 == i20) {
                                uVar3.G(i20);
                                int[] iArr = c3908a2.f36011b;
                                Arrays.fill(iArr, i19);
                                int i25 = z10 / 5;
                                int i26 = i19;
                                while (i26 < i25) {
                                    int u11 = uVar3.u();
                                    double u12 = uVar3.u();
                                    double u13 = uVar3.u() - 128;
                                    double u14 = uVar3.u() - 128;
                                    iArr[u11] = (AbstractC5530A.i((int) ((1.402d * u13) + u12), 0, 255) << 16) | (uVar3.u() << 24) | (AbstractC5530A.i((int) ((u12 - (0.34414d * u14)) - (u13 * 0.71414d)), 0, 255) << 8) | AbstractC5530A.i((int) ((u14 * 1.772d) + u12), 0, 255);
                                    i26++;
                                    c3908a2 = c3908a2;
                                    c11 = '\u00ff';
                                }
                                c10 = c11;
                                c3908a2.f36012c = true;
                                break;
                            }
                            c10 = c11;
                            break;
                        case 21:
                            c3908a2.getClass();
                            if (z10 >= 4) {
                                uVar3.G(3);
                                if ((uVar3.u() & 128) != 0) {
                                    i18 = 1;
                                } else {
                                    i18 = i19;
                                }
                                int i27 = z10 - 4;
                                s2.u uVar4 = c3908a2.f36010a;
                                if (i18 != 0) {
                                    if (i27 >= 7 && (w10 = uVar3.w()) >= 4) {
                                        c3908a2.f36017h = uVar3.z();
                                        c3908a2.f36018i = uVar3.z();
                                        uVar4.C(w10 - 4);
                                        i27 = z10 - 11;
                                    }
                                }
                                int i28 = uVar4.f45194b;
                                int i29 = uVar4.f45195c;
                                if (i28 < i29 && i27 > 0) {
                                    int min = Math.min(i27, i29 - i28);
                                    uVar3.e(uVar4.f45193a, i28, min);
                                    uVar4.F(i28 + min);
                                }
                            }
                            c10 = c11;
                            break;
                        case 22:
                            c3908a2.getClass();
                            if (z10 >= 19) {
                                c3908a2.f36013d = uVar3.z();
                                c3908a2.f36014e = uVar3.z();
                                uVar3.G(11);
                                c3908a2.f36015f = uVar3.z();
                                c3908a2.f36016g = uVar3.z();
                            }
                            c10 = c11;
                            break;
                        default:
                            c10 = c11;
                            break;
                    }
                    i13 = 0;
                    bVar = null;
                } else {
                    c10 = c11;
                    int i30 = c3908a2.f36013d;
                    s2.u uVar5 = c3908a2.f36010a;
                    if (i30 != 0 && c3908a2.f36014e != 0 && c3908a2.f36017h != 0 && c3908a2.f36018i != 0 && (i14 = uVar5.f45195c) != 0 && uVar5.f45194b == i14 && c3908a2.f36012c) {
                        uVar5.F(0);
                        int i31 = c3908a2.f36017h * c3908a2.f36018i;
                        int[] iArr2 = new int[i31];
                        int i32 = 0;
                        while (i32 < i31) {
                            int u15 = uVar5.u();
                            int[] iArr3 = c3908a2.f36011b;
                            if (u15 != 0) {
                                i15 = i32 + 1;
                                iArr2[i32] = iArr3[u15];
                            } else {
                                int u16 = uVar5.u();
                                if (u16 != 0) {
                                    if ((u16 & 64) == 0) {
                                        i16 = u16 & 63;
                                    } else {
                                        i16 = ((u16 & 63) << 8) | uVar5.u();
                                    }
                                    if ((u16 & 128) == 0) {
                                        i17 = 0;
                                    } else {
                                        i17 = iArr3[uVar5.u()];
                                    }
                                    i15 = i16 + i32;
                                    Arrays.fill(iArr2, i32, i15, i17);
                                }
                            }
                            i32 = i15;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, c3908a2.f36017h, c3908a2.f36018i, Bitmap.Config.ARGB_8888);
                        float f6 = c3908a2.f36013d;
                        float f10 = c3908a2.f36014e;
                        bVar = new r2.b(null, null, null, createBitmap, c3908a2.f36016g / f10, 0, 0, c3908a2.f36015f / f6, 0, Integer.MIN_VALUE, -3.4028235E38f, c3908a2.f36017h / f6, c3908a2.f36018i / f10, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        r22 = 0;
                    } else {
                        r22 = 0;
                        bVar = null;
                    }
                    int i33 = r22 == true ? 1 : 0;
                    int i34 = r22 == true ? 1 : 0;
                    int i35 = r22 == true ? 1 : 0;
                    int i36 = r22 == true ? 1 : 0;
                    c3908a2.f36013d = i33;
                    c3908a2.f36014e = r22;
                    c3908a2.f36015f = r22;
                    c3908a2.f36016g = r22;
                    c3908a2.f36017h = r22;
                    c3908a2.f36018i = r22;
                    uVar5.C(r22);
                    c3908a2.f36012c = r22;
                    i13 = r22;
                }
                uVar3.F(i24);
                i12 = i13;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            int i37 = i12 == 1 ? 1 : 0;
            boolean z11 = i12 == 1 ? 1 : 0;
            boolean z12 = i12 == 1 ? 1 : 0;
            boolean z13 = i12 == 1 ? 1 : 0;
            boolean z14 = i12 == 1 ? 1 : 0;
            i19 = i37;
            c11 = c10;
            i20 = 2;
        }
        abstractC5535e.accept(new C3158a(-9223372036854775807L, -9223372036854775807L, arrayList));
        inflater.reset();
        C3908a c3908a3 = (C3908a) this.f17416h0;
        c3908a3.f36013d = 0;
        c3908a3.f36014e = 0;
        c3908a3.f36015f = 0;
        c3908a3.f36016g = 0;
        c3908a3.f36017h = 0;
        c3908a3.f36018i = 0;
        c3908a3.f36010a.C(0);
        c3908a3.f36012c = false;
        ArrayList arrayList2 = new ArrayList();
        while (((s2.u) this.f17414Y).a() >= 3) {
        }
        abstractC5535e.accept(new C3158a(-9223372036854775807L, -9223372036854775807L, arrayList2));
    }

    @Override // io.sentry.D
    public final io.sentry.B g() {
        io.sentry.B b10;
        ConnectivityManager y10 = y((Context) this.f17414Y, (H) this.f17415Z);
        if (y10 == null) {
            return io.sentry.B.UNKNOWN;
        }
        H h10 = (H) this.f17415Z;
        if (!AbstractC3557B.B1((Context) this.f17414Y, "android.permission.ACCESS_NETWORK_STATE")) {
            h10.f(EnumC3642e1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return io.sentry.B.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = y10.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                h10.f(EnumC3642e1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                b10 = io.sentry.B.DISCONNECTED;
            } else if (activeNetworkInfo.isConnected()) {
                b10 = io.sentry.B.CONNECTED;
            } else {
                b10 = io.sentry.B.DISCONNECTED;
            }
            return b10;
        } catch (Throwable th2) {
            h10.d(EnumC3642e1.WARNING, "Could not retrieve Connection Status", th2);
            return io.sentry.B.UNKNOWN;
        }
    }

    @Override // Rh.AbstractC1315n
    public final void h(String str, AbstractC5809q abstractC5809q) {
        ((Map) this.f17416h0).put(str, abstractC5809q);
    }

    @Override // io.sentry.D
    public final boolean i(C c10) {
        ((B) this.f17416h0).getClass();
        io.sentry.android.core.internal.util.a aVar = new io.sentry.android.core.internal.util.a(this, c10);
        ((Map) this.f17417i0).put(c10, aVar);
        return H((Context) this.f17414Y, (H) this.f17415Z, (B) this.f17416h0, aVar);
    }

    @Override // androidx.appcompat.view.b
    public final boolean j(androidx.appcompat.view.c cVar, p.o oVar) {
        return ((ActionMode.Callback) this.f17414Y).onCreateActionMode(u(cVar), A(oVar));
    }

    @Override // io.sentry.D
    public final void k(C c10) {
        ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) ((Map) this.f17417i0).remove(c10);
        if (networkCallback != null) {
            H h10 = (H) this.f17415Z;
            ((B) this.f17416h0).getClass();
            ConnectivityManager y10 = y((Context) this.f17414Y, h10);
            if (y10 != null) {
                try {
                    y10.unregisterNetworkCallback(networkCallback);
                } catch (Throwable th2) {
                    h10.d(EnumC3642e1.WARNING, "unregisterNetworkCallback failed", th2);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.b
    public final boolean l(androidx.appcompat.view.c cVar, p.o oVar) {
        return ((ActionMode.Callback) this.f17414Y).onPrepareActionMode(u(cVar), A(oVar));
    }

    @Override // androidx.appcompat.view.b
    public final boolean m(androidx.appcompat.view.c cVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f17414Y).onActionItemClicked(u(cVar), new w((Context) this.f17415Z, (AbstractMenuItemC6082b) menuItem));
    }

    public final void n(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (!((ArrayList) this.f17414Y).contains(abstractComponentCallbacksC1480v)) {
            synchronized (((ArrayList) this.f17414Y)) {
                ((ArrayList) this.f17414Y).add(abstractComponentCallbacksC1480v);
            }
            abstractComponentCallbacksC1480v.f18295p0 = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC1480v);
    }

    public final n o() {
        return new n((Integer) this.f17414Y, (Integer) this.f17415Z, (Integer) this.f17416h0, (Integer) this.f17417i0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        if ((!r0.isEmpty()) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List p(AbstractC2201i abstractC2201i, Zf.a aVar, Y y10) {
        boolean z10;
        boolean z11;
        I i10;
        p0 p0Var;
        Object obj;
        Nf.i iVar;
        I i11;
        Sf.s sVar = (Sf.s) abstractC2201i;
        boolean z12 = false;
        boolean z13 = true;
        if (!sVar.c()) {
            if (sVar.b().isEmpty()) {
                AbstractC3557B.b0("getParameters(...)", y10.getParameters());
            }
            z10 = false;
            List<b0> parameters = y10.getParameters();
            AbstractC3557B.b0("getParameters(...)", parameters);
            Y y11 = null;
            if (!z10) {
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
                for (b0 b0Var : parameters) {
                    if (Bi.c.X0(b0Var, y11, aVar.f23717e)) {
                        i11 = m0.l(b0Var, aVar);
                    } else {
                        Bg.B b10 = new Bg.B(((z) this.f17414Y).e(), new C2571f(this, b0Var, aVar, y10, sVar, 3));
                        ((P5.c) this.f17416h0).getClass();
                        i11 = P5.c.t(b0Var, Zf.a.f(aVar, null, sVar.c(), null, null, 59), (c0) this.f17417i0, b10);
                    }
                    arrayList.add(i11);
                    y11 = null;
                }
                return arrayList;
            } else if (parameters.size() != sVar.b().size()) {
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(parameters, 10));
                for (b0 b0Var2 : parameters) {
                    Dg.l lVar = Dg.l.f3704x0;
                    String b11 = b0Var2.getName().b();
                    AbstractC3557B.b0("asString(...)", b11);
                    arrayList2.add(new I(Dg.m.c(lVar, b11)));
                }
                return kf.t.K2(arrayList2);
            } else {
                kf.o R22 = kf.t.R2(sVar.b());
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(R22, 10));
                Iterator it = R22.iterator();
                while (it.hasNext()) {
                    kf.y yVar = (kf.y) it.next();
                    int i12 = yVar.f37486a;
                    AbstractC2207o abstractC2207o = (AbstractC2207o) yVar.f37487b;
                    parameters.size();
                    b0 b0Var3 = (b0) parameters.get(i12);
                    Zf.a N1 = A7.b.N1(k0.f2132Z, z12, z12, null, 7);
                    AbstractC3557B.Z(b0Var3);
                    if (abstractC2207o instanceof AbstractC2209q) {
                        AbstractC2209q abstractC2209q = (AbstractC2209q) abstractC2207o;
                        G g10 = (G) abstractC2209q;
                        Sf.D b12 = g10.b();
                        Type[] upperBounds = g10.f16597a.getUpperBounds();
                        AbstractC3557B.b0("getUpperBounds(...)", upperBounds);
                        if (AbstractC3557B.K(kf.q.j3(upperBounds), Object.class) ^ z13) {
                            p0Var = p0.f2148j0;
                        } else {
                            p0Var = p0.f2147i0;
                        }
                        if (b12 == null || (b0Var3.J() != p0.f2146h0 && p0Var != b0Var3.J())) {
                            z11 = z12;
                            i10 = m0.l(b0Var3, N1);
                        } else {
                            z zVar = (z) this.f17414Y;
                            AbstractC3557B.c0("c", zVar);
                            AbstractC3557B.c0("wildcardType", abstractC2209q);
                            if (((G) abstractC2209q).b() != null) {
                                Iterator it2 = new Xf.d(zVar, abstractC2209q, z12).iterator();
                                while (true) {
                                    Kg.e eVar = (Kg.e) it2;
                                    if (eVar.hasNext()) {
                                        obj = eVar.next();
                                        Nf.c cVar = (Nf.c) obj;
                                        C4291c[] c4291cArr = v.f17839b;
                                        int length = c4291cArr.length;
                                        int i13 = z12;
                                        while (i13 < length) {
                                            if (AbstractC3557B.K(cVar.a(), c4291cArr[i13])) {
                                                break;
                                            }
                                            i13++;
                                            z12 = false;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                Nf.c cVar2 = (Nf.c) obj;
                                z11 = false;
                                A L10 = L(b12, A7.b.N1(k0.f2132Z, false, false, null, 7));
                                if (cVar2 != null) {
                                    ArrayList v22 = kf.t.v2(L10.getAnnotations(), cVar2);
                                    if (v22.isEmpty()) {
                                        iVar = Nf.h.f12822a;
                                    } else {
                                        iVar = new Nf.j(0, v22);
                                    }
                                    L10 = Bi.c.y1(L10, iVar);
                                }
                                i10 = Bi.c.I0(L10, p0Var, b0Var3);
                            } else {
                                throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
                            }
                        }
                    } else {
                        z11 = z12;
                        i10 = new I(L(abstractC2207o, N1), p0.f2146h0);
                    }
                    arrayList3.add(i10);
                    z12 = z11;
                    z13 = true;
                }
                return kf.t.K2(arrayList3);
            }
        }
        z10 = true;
        List<b0> parameters2 = y10.getParameters();
        AbstractC3557B.b0("getParameters(...)", parameters2);
        Y y112 = null;
        if (!z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0135, code lost:
        if (r9 != Bg.p0.f2148j0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bg.D q(AbstractC2201i abstractC2201i, Zf.a aVar, Bg.D d10) {
        Q q10;
        Y y10;
        boolean z10;
        Y y11;
        boolean z11;
        AbstractC0997f abstractC0997f;
        AbstractC2209q abstractC2209q;
        Type[] upperBounds;
        AbstractC0997f abstractC0997f2;
        if (d10 == null || (q10 = d10.x0()) == null) {
            q10 = A7.b.P1(new Xf.d((z) this.f17414Y, abstractC2201i, false));
        }
        Sf.s sVar = (Sf.s) abstractC2201i;
        Sf.u uVar = sVar.f16624b;
        if (uVar != null) {
            boolean z12 = uVar instanceof AbstractC2199g;
            k0 k0Var = aVar.f23713a;
            Zf.b bVar = aVar.f23714b;
            boolean z13 = aVar.f23716d;
            if (z12) {
                AbstractC2199g abstractC2199g = (AbstractC2199g) uVar;
                C4291c b10 = ((Sf.q) abstractC2199g).b();
                if (z13 && AbstractC3557B.K(b10, Zf.c.f23723a)) {
                    Jf.o oVar = ((Xf.a) ((z) this.f17414Y).f45394a).f21967p;
                    oVar.getClass();
                    Df.v vVar = Jf.o.f9139e[0];
                    G4.m mVar = oVar.f9142c;
                    mVar.getClass();
                    AbstractC3557B.c0("property", vVar);
                    String r10 = Df.H.r(vVar.getName());
                    int i10 = mVar.f6018Y;
                    C4294f e10 = C4294f.e(r10);
                    AbstractC1000i e11 = ((ug.n) oVar.f9141b.getValue()).e(e10, Tf.d.f17212Z);
                    if (e11 instanceof AbstractC0997f) {
                        abstractC0997f2 = (AbstractC0997f) e11;
                    } else {
                        abstractC0997f2 = null;
                    }
                    abstractC0997f = abstractC0997f2 == null ? oVar.f9140a.x(new C4290b(Jf.q.f9202i, e10), AbstractC4344b.F0(Integer.valueOf(i10))) : abstractC0997f2;
                } else {
                    abstractC0997f = Lf.e.b(Lf.e.f11081Y, b10, ((z) this.f17414Y).d().j());
                    if (abstractC0997f == null) {
                        abstractC0997f = null;
                    } else {
                        String str = Lf.d.f11067a;
                        C4293e g10 = AbstractC4838e.g(abstractC0997f);
                        HashMap hashMap = Lf.d.f11077k;
                        if (hashMap.containsKey(g10)) {
                            if (bVar != Zf.b.f23721h0 && k0Var != k0.f2131Y) {
                                AbstractC2207o abstractC2207o = (AbstractC2207o) kf.t.p2(sVar.b());
                                if (abstractC2207o instanceof AbstractC2209q) {
                                    abstractC2209q = (AbstractC2209q) abstractC2207o;
                                } else {
                                    abstractC2209q = null;
                                }
                                if (abstractC2209q != null) {
                                    G g11 = (G) abstractC2209q;
                                    if (g11.b() != null) {
                                        AbstractC3557B.b0("getUpperBounds(...)", g11.f16597a.getUpperBounds());
                                        if (!(!AbstractC3557B.K(kf.q.j3(upperBounds), Object.class))) {
                                            C4293e g12 = AbstractC4838e.g(abstractC0997f);
                                            String str2 = Lf.d.f11067a;
                                            C4291c c4291c = (C4291c) hashMap.get(g12);
                                            if (c4291c != null) {
                                                List parameters = AbstractC5493d.e(abstractC0997f).i(c4291c).f().getParameters();
                                                AbstractC3557B.b0("getParameters(...)", parameters);
                                                b0 b0Var = (b0) kf.t.p2(parameters);
                                                if (b0Var != null) {
                                                    p0 J10 = b0Var.J();
                                                    if (J10 != null) {
                                                    }
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Given class " + abstractC0997f + " is not a read-only collection");
                                            }
                                        }
                                    }
                                }
                            }
                            abstractC0997f = Lf.e.a(abstractC0997f);
                        }
                    }
                }
                if (abstractC0997f == null) {
                    C3636c1 c3636c1 = ((Xf.a) ((z) this.f17414Y).f45394a).f21962k.f21991a;
                    if (c3636c1 != null) {
                        abstractC0997f = c3636c1.p(abstractC2199g);
                    } else {
                        AbstractC3557B.C2("resolver");
                        throw null;
                    }
                }
                if (abstractC0997f == null || (y10 = abstractC0997f.f()) == null) {
                    sVar.getClass();
                    throw new UnsupportedOperationException("Type not found: " + sVar.f16623a);
                }
            } else if (uVar instanceof E) {
                b0 a5 = ((Xf.i) this.f17415Z).a((E) uVar);
                if (a5 != null) {
                    y10 = a5.f();
                } else {
                    y10 = null;
                }
            } else {
                throw new IllegalStateException("Unknown classifier kind: " + uVar);
            }
            if (y10 == null) {
                return null;
            }
            if (bVar == Zf.b.f23721h0) {
                z10 = false;
            } else {
                if (!z13 && k0Var != k0.f2131Y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z10 = z11;
            }
            if (d10 != null) {
                y11 = d10.y0();
            } else {
                y11 = null;
            }
            if (AbstractC3557B.K(y11, y10) && !sVar.c() && z10) {
                return d10.C0(true);
            }
            return C0213f.m(q10, y10, p(abstractC2201i, aVar, y10), z10);
        }
        sVar.getClass();
        throw new UnsupportedOperationException("Type not found: " + sVar.f16623a);
    }

    public final void r(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((C6049A) this.f17415Z).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    r(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public final AbstractComponentCallbacksC1480v s(String str) {
        P p10 = (P) ((HashMap) this.f17415Z).get(str);
        if (p10 != null) {
            return p10.f18101c;
        }
        return null;
    }

    public final AbstractComponentCallbacksC1480v t(String str) {
        for (P p10 : ((HashMap) this.f17415Z).values()) {
            if (p10 != null) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
                if (!str.equals(abstractComponentCallbacksC1480v.f18289j0)) {
                    abstractComponentCallbacksC1480v = abstractComponentCallbacksC1480v.f18304y0.f18046c.t(str);
                }
                if (abstractComponentCallbacksC1480v != null) {
                    return abstractComponentCallbacksC1480v;
                }
            }
        }
        return null;
    }

    public final androidx.appcompat.view.h u(androidx.appcompat.view.c cVar) {
        int size = ((ArrayList) this.f17416h0).size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.h hVar = (androidx.appcompat.view.h) ((ArrayList) this.f17416h0).get(i10);
            if (hVar != null && hVar.f24367b == cVar) {
                return hVar;
            }
        }
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h((Context) this.f17415Z, cVar);
        ((ArrayList) this.f17416h0).add(hVar2);
        return hVar2;
    }

    public final ArrayList v() {
        ArrayList arrayList = new ArrayList();
        for (P p10 : ((HashMap) this.f17415Z).values()) {
            if (p10 != null) {
                arrayList.add(p10);
            }
        }
        return arrayList;
    }

    public final ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (P p10 : ((HashMap) this.f17415Z).values()) {
            if (p10 != null) {
                arrayList.add(p10.f18101c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final AbstractC0997f x(C4290b c4290b, List list) {
        AbstractC3557B.c0("classId", c4290b);
        return (AbstractC0997f) ((Ag.n) ((Ag.r) this.f17417i0)).invoke(new Mf.D(c4290b, list));
    }

    public final List z() {
        ArrayList arrayList;
        if (((ArrayList) this.f17414Y).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f17414Y)) {
            arrayList = new ArrayList((ArrayList) this.f17414Y);
        }
        return arrayList;
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }

    public i(Ag.u uVar, Mf.B b10) {
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("module", b10);
        this.f17414Y = uVar;
        this.f17415Z = b10;
        this.f17416h0 = ((Ag.q) uVar).b(new Mf.F(this, 1));
        this.f17417i0 = ((Ag.q) ((Ag.u) this.f17414Y)).b(new Mf.F(this, 0));
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f17414Y = obj;
        this.f17415Z = obj2;
        this.f17416h0 = obj3;
        this.f17417i0 = obj4;
    }
}
