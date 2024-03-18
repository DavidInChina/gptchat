package U3;

import B2.C0203d;
import B2.C0207h;
import G0.C0571a;
import K4.F;
import K4.G;
import K4.I;
import K4.J;
import S0.Q;
import V1.D;
import Z.C1745x0;
import Z.l1;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.lifecycle.AbstractC2077l;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import c7.C2303a;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.AbstractC2473t;
import com.google.android.gms.internal.play_billing.AbstractC2475u;
import com.google.android.gms.internal.play_billing.N0;
import com.google.android.gms.internal.play_billing.Q0;
import com.google.android.gms.internal.play_billing.W0;
import com.google.android.gms.internal.play_billing.Y0;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.b1;
import com.google.android.gms.internal.play_billing.c1;
import com.google.android.gms.internal.play_billing.g1;
import com.google.android.gms.internal.play_billing.h1;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import h7.C3327a;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.L0;
import io.sentry.S;
import j7.C3913c;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.lang.reflect.Constructor;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.AbstractC4332c;
import l2.C4330a;
import l2.C4333d;
import l8.C4345c;
import l8.C4347e;
import l8.C4348f;
import l8.C4350h;
import o5.AbstractC4918b;
import p1.AbstractC5042g;
import p2.C5065s;
import p2.O;
import p3.AbstractC5074B;
import p3.H;
import p5.AbstractC5092d;
import q.C5243x;
import q1.AbstractC5260f;
import q7.C5281b;
import r4.C5365b;
import s2.AbstractC5530A;
import s3.z;
import u4.AbstractC5838a;
import u7.C5848d;
import v2.AbstractC5969h;
import x3.C6270B;
import x3.y;
import x8.L;
import x8.N;

/* loaded from: classes.dex */
public final class u implements H1.k, G1.g, AbstractC5074B, G, m8.c {

    /* renamed from: j0  reason: collision with root package name */
    public static u f17490j0;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17491Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f17492Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f17493h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f17494i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(int i10) {
        this(new long[10], new long[10], new long[10], 28);
        this.f17491Y = i10;
        if (i10 == 17) {
            this.f17492Z = Collections.emptyList();
            this.f17493h0 = Collections.emptyList();
        } else if (i10 != 28) {
        }
    }

    public static u I(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new u(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public static q4.e k(q4.j jVar, Throwable th2) {
        Drawable drawable;
        if (th2 instanceof q4.m) {
            drawable = u4.d.b(jVar, jVar.f43839K, jVar.f43838J, jVar.f43841M.f43764l);
            if (drawable == null) {
                drawable = u4.d.b(jVar, jVar.f43837I, jVar.f43836H, jVar.f43841M.f43763k);
            }
        } else {
            drawable = u4.d.b(jVar, jVar.f43837I, jVar.f43836H, jVar.f43841M.f43763k);
        }
        return new q4.e(drawable, jVar, th2);
    }

    public final String A(int i10) {
        return ((TypedArray) this.f17493h0).getString(i10);
    }

    public final ArrayList B(String str) {
        S s10;
        String str2;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkTagDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        ((y) this.f17492Z).b();
        Cursor t12 = A7.b.t1((y) this.f17492Z, a5, false);
        try {
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = t12.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final CharSequence C(int i10) {
        return ((TypedArray) this.f17493h0).getText(i10);
    }

    public final z D(b7.b bVar) {
        I i10 = I.f9378a;
        if (((Set) this.f17492Z).contains(bVar)) {
            return new z((e7.i) this.f17493h0, "PLAY_BILLING_LIBRARY", bVar, i10, (e7.p) this.f17494i0);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, (Set) this.f17492Z));
    }

    public final boolean E(int i10) {
        return ((TypedArray) this.f17493h0).hasValue(i10);
    }

    public final void F(AbstractC5969h abstractC5969h, Uri uri, Map map, long j6, long j10, L2.s sVar) {
        boolean z10;
        L2.m mVar = new L2.m(abstractC5969h, j6, j10);
        this.f17494i0 = mVar;
        if (((L2.q) this.f17493h0) != null) {
            return;
        }
        L2.q[] a5 = ((L2.t) this.f17492Z).a(uri, map);
        boolean z11 = true;
        if (a5.length == 1) {
            this.f17493h0 = a5[0];
        } else {
            int length = a5.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                L2.q qVar = a5[i10];
                try {
                } catch (EOFException unused) {
                    if (((L2.q) this.f17493h0) == null && mVar.f10626d != j6) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    if (((L2.q) this.f17493h0) == null && mVar.f10626d != j6) {
                        z11 = false;
                    }
                    Gi.e.n(z11);
                    mVar.f10628f = 0;
                    throw th2;
                }
                if (qVar.g(mVar)) {
                    this.f17493h0 = qVar;
                    mVar.f10628f = 0;
                    break;
                }
                if (((L2.q) this.f17493h0) == null && mVar.f10626d != j6) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Gi.e.n(z10);
                mVar.f10628f = 0;
                i10++;
            }
            if (((L2.q) this.f17493h0) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i11 = AbstractC5530A.f45131a;
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < a5.length; i12++) {
                    sb3.append(a5[i12].getClass().getSimpleName());
                    if (i12 < a5.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String sb4 = sb2.toString();
                uri.getClass();
                throw new O(sb4, null, false, 1);
            }
        }
        ((L2.q) this.f17493h0).d(sVar);
    }

    public final boolean G() {
        if (((l1) this.f17492Z).getValue() == this.f17494i0) {
            Object obj = this.f17493h0;
            if (((u) obj) == null || !((u) obj).G()) {
                return false;
            }
        }
        return true;
    }

    public final boolean H(k1.f fVar, i1.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j1.b bVar = (j1.b) this.f17493h0;
        int[] iArr = dVar.f32491c0;
        bVar.f35954a = iArr[0];
        boolean z15 = true;
        bVar.f35955b = iArr[1];
        bVar.f35956c = dVar.m();
        ((j1.b) this.f17493h0).f35957d = dVar.j();
        j1.b bVar2 = (j1.b) this.f17493h0;
        bVar2.f35962i = false;
        bVar2.f35963j = z10;
        if (bVar2.f35954a == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bVar2.f35955b == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && dVar.f32475L > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && dVar.f32475L > 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        int[] iArr2 = dVar.f32500l;
        if (z13 && iArr2[0] == 4) {
            bVar2.f35954a = 1;
        }
        if (z14 && iArr2[1] == 4) {
            bVar2.f35955b = 1;
        }
        fVar.a(dVar, bVar2);
        dVar.z(((j1.b) this.f17493h0).f35958e);
        dVar.w(((j1.b) this.f17493h0).f35959f);
        Object obj = this.f17493h0;
        j1.b bVar3 = (j1.b) obj;
        dVar.f32511w = bVar3.f35961h;
        int i10 = bVar3.f35960g;
        dVar.P = i10;
        if (i10 <= 0) {
            z15 = false;
        }
        dVar.f32511w = z15;
        j1.b bVar4 = (j1.b) obj;
        bVar4.f35963j = false;
        return bVar4.f35962i;
    }

    public final boolean J() {
        Iterator it = ((CopyOnWriteArrayList) this.f17493h0).iterator();
        while (it.hasNext()) {
            if (((D) it.next()).f18020a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void K(Exception exc, boolean z10) {
        int i10;
        this.f17493h0 = null;
        N V10 = N.V((Set) this.f17492Z);
        ((Set) this.f17492Z).clear();
        L listIterator = V10.listIterator(0);
        while (listIterator.hasNext()) {
            C0203d c0203d = (C0203d) listIterator.next();
            c0203d.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            c0203d.j(i10, exc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (((u4.h) r19.f17494i0).a(r21) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q4.n L(q4.j jVar, r4.h hVar) {
        Bitmap.Config config;
        AbstractC5260f abstractC5260f;
        C5365b c5365b;
        r4.g gVar;
        boolean z10;
        List list = jVar.f43853l;
        boolean isEmpty = list.isEmpty();
        Bitmap.Config config2 = jVar.f43848g;
        if (isEmpty || kf.q.S2(config2, u4.e.f46388a)) {
            if (R4.b.w1(config2)) {
                if (!R4.b.w1(config2) || jVar.f43858q) {
                }
            }
            config = config2;
            abstractC5260f = hVar.f44441a;
            c5365b = C5365b.f44430h;
            if (AbstractC3557B.K(abstractC5260f, c5365b) && !AbstractC3557B.K(hVar.f44442b, c5365b)) {
                gVar = jVar.f43831C;
            } else {
                gVar = r4.g.f44438Z;
            }
            r4.g gVar2 = gVar;
            if (!jVar.f43859r && list.isEmpty() && config != Bitmap.Config.ALPHA_8) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            return new q4.n(jVar.f43842a, config, jVar.f43849h, hVar, gVar2, u4.d.a(jVar), z11, jVar.f43860s, jVar.f43847f, jVar.f43855n, jVar.f43856o, jVar.f43832D, jVar.f43861t, jVar.f43862u, jVar.f43863v);
        }
        config = Bitmap.Config.ARGB_8888;
        abstractC5260f = hVar.f44441a;
        c5365b = C5365b.f44430h;
        if (AbstractC3557B.K(abstractC5260f, c5365b)) {
        }
        gVar = r4.g.f44438Z;
        r4.g gVar22 = gVar;
        if (!jVar.f43859r) {
        }
        z10 = false;
        boolean z112 = z10;
        return new q4.n(jVar.f43842a, config, jVar.f43849h, hVar, gVar22, u4.d.a(jVar), z112, jVar.f43860s, jVar.f43847f, jVar.f43855n, jVar.f43856o, jVar.f43832D, jVar.f43861t, jVar.f43862u, jVar.f43863v);
    }

    public final void M(EnumC2081p enumC2081p) {
        X x10 = (X) this.f17494i0;
        if (x10 != null) {
            x10.run();
        }
        X x11 = new X((C2088x) this.f17492Z, enumC2081p);
        this.f17494i0 = x11;
        ((Handler) this.f17493h0).postAtFrontOfQueue(x11);
    }

    public final void N() {
        ((TypedArray) this.f17493h0).recycle();
    }

    public final void O(String str) {
        if (str != null) {
            this.f17492Z = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public final void P(b7.c cVar) {
        if (cVar != null) {
            this.f17494i0 = cVar;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    public final void Q(i1.e eVar, int i10, int i11) {
        int i12 = eVar.Q;
        int i13 = eVar.f32479R;
        eVar.Q = 0;
        eVar.f32479R = 0;
        eVar.z(i10);
        eVar.w(i11);
        if (i12 < 0) {
            eVar.Q = 0;
        } else {
            eVar.Q = i12;
        }
        if (i13 < 0) {
            eVar.f32479R = 0;
        } else {
            eVar.f32479R = i13;
        }
        ((i1.e) this.f17494i0).F();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q4.n R(q4.n nVar) {
        Bitmap.Config config;
        boolean z10;
        q4.b bVar;
        boolean z11;
        Bitmap.Config config2 = nVar.f43870b;
        q4.b bVar2 = nVar.f43883o;
        boolean z12 = true;
        if (R4.b.w1(config2) && !((u4.h) this.f17494i0).d()) {
            config = Bitmap.Config.ARGB_8888;
            z10 = true;
        } else {
            z10 = false;
            config = config2;
        }
        if (nVar.f43883o.f43751Y) {
            u4.k kVar = (u4.k) this.f17493h0;
            synchronized (kVar) {
                kVar.a();
                z11 = kVar.f46409j0;
            }
            if (!z11) {
                bVar = q4.b.f43749j0;
                if (z12) {
                    return nVar;
                }
                return new q4.n(nVar.f43869a, config, nVar.f43871c, nVar.f43872d, nVar.f43873e, nVar.f43874f, nVar.f43875g, nVar.f43876h, nVar.f43877i, nVar.f43878j, nVar.f43879k, nVar.f43880l, nVar.f43881m, nVar.f43882n, bVar);
            }
        }
        bVar = bVar2;
        z12 = z10;
        if (z12) {
        }
    }

    public final void S(N0 n02) {
        if (n02 == null) {
            return;
        }
        try {
            g1 t10 = h1.t();
            a1 a1Var = (a1) this.f17492Z;
            if (a1Var != null) {
                t10.e();
                h1.q((h1) t10.f26877Z, a1Var);
            }
            t10.e();
            h1.r((h1) t10.f26877Z, n02);
            ((C1745x0) this.f17494i0).e((h1) t10.c());
        } catch (Throwable th2) {
            AbstractC2468q.f("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void T(Q0 q02) {
        if (q02 == null) {
            return;
        }
        try {
            g1 t10 = h1.t();
            a1 a1Var = (a1) this.f17492Z;
            if (a1Var != null) {
                t10.e();
                h1.q((h1) t10.f26877Z, a1Var);
            }
            t10.e();
            h1.s((h1) t10.f26877Z, q02);
            ((C1745x0) this.f17494i0).e((h1) t10.c());
        } catch (Throwable th2) {
            AbstractC2468q.f("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void U(int i10, List list, boolean z10) {
        Y0 y02;
        try {
            int i11 = F.f9348a;
            try {
                W0 u10 = Y0.u();
                u10.e();
                Y0.t((Y0) u10.f26877Z, i10);
                u10.e();
                Y0.r((Y0) u10.f26877Z);
                u10.e();
                Y0.q((Y0) u10.f26877Z, z10);
                u10.e();
                Y0.s((Y0) u10.f26877Z, (AbstractCollection) list);
                y02 = (Y0) u10.c();
            } catch (Exception e10) {
                AbstractC2468q.f("BillingLogger", "Unable to create logging payload", e10);
                y02 = null;
            }
            V(y02);
        } catch (Throwable th2) {
            AbstractC2468q.f("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void V(Y0 y02) {
        ContentResolver contentResolver;
        int i10;
        if (y02 != null) {
            try {
                if (((a1) this.f17492Z) != null) {
                    try {
                        Context context = (Context) this.f17493h0;
                        String str = null;
                        if (context == null) {
                            contentResolver = null;
                        } else {
                            contentResolver = context.getContentResolver();
                        }
                        if (contentResolver != null) {
                            str = Settings.Secure.getString(contentResolver, "android_id");
                        }
                        if (str == null) {
                            i10 = 0;
                        } else {
                            int i11 = AbstractC2475u.f26975a;
                            i10 = AbstractC2473t.f26974a.a(str).a();
                        }
                        long j6 = (i10 % 100) % 100;
                        if (j6 < 0) {
                            j6 += 100;
                        }
                        if (((int) j6) < 0) {
                            g1 t10 = h1.t();
                            a1 a1Var = (a1) this.f17492Z;
                            if (a1Var != null) {
                                t10.e();
                                h1.q((h1) t10.f26877Z, a1Var);
                            }
                            t10.e();
                            h1.o((h1) t10.f26877Z, y02);
                            b1 o10 = c1.o();
                            synchronized (J.class) {
                                if (!J.f9379Y) {
                                    J.f9379Y = true;
                                }
                            }
                            o10.e();
                            c1.n((c1) o10.f26877Z);
                            t10.e();
                            h1.p((h1) t10.f26877Z, (c1) o10.c());
                            ((C1745x0) this.f17494i0).e((h1) t10.c());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                AbstractC2468q.f("BillingLogger", "Unable to log.", th2);
            }
        }
    }

    @Override // G1.g
    public final Uri a() {
        return (Uri) this.f17492Z;
    }

    @Override // p3.AbstractC5074B
    public final void b(s2.u uVar) {
        long d10;
        long j6;
        Gi.e.o((s2.z) this.f17493h0);
        int i10 = AbstractC5530A.f45131a;
        s2.z zVar = (s2.z) this.f17493h0;
        synchronized (zVar) {
            try {
                long j10 = zVar.f45204c;
                if (j10 != -9223372036854775807L) {
                    d10 = j10 + zVar.f45203b;
                } else {
                    d10 = zVar.d();
                }
                j6 = d10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long e10 = ((s2.z) this.f17493h0).e();
        if (j6 != -9223372036854775807L && e10 != -9223372036854775807L) {
            C5065s c5065s = (C5065s) this.f17492Z;
            if (e10 != c5065s.f42323u0) {
                p2.r b10 = c5065s.b();
                b10.f42241o = e10;
                C5065s c5065s2 = new C5065s(b10);
                this.f17492Z = c5065s2;
                ((L2.G) this.f17494i0).b(c5065s2);
            }
            int a5 = uVar.a();
            ((L2.G) this.f17494i0).a(a5, uVar);
            ((L2.G) this.f17494i0).e(j6, 1, a5, 0, null);
        }
    }

    @Override // p3.AbstractC5074B
    public final void c(s2.z zVar, L2.s sVar, H h10) {
        this.f17493h0 = zVar;
        h10.c();
        h10.i();
        L2.G f6 = sVar.f(h10.f42432c, 5);
        this.f17494i0 = f6;
        f6.b((C5065s) this.f17492Z);
    }

    @Override // G1.g
    public final Uri e() {
        return (Uri) this.f17494i0;
    }

    @Override // G1.g
    public final Object f() {
        return null;
    }

    @Override // m8.c
    public final Object g() {
        Object g10 = ((m8.c) this.f17492Z).g();
        C4345c c4345c = (C4345c) ((m8.c) this.f17493h0).g();
        Context context = ((C4348f) ((m8.c) this.f17494i0)).f37872Y.f24351a;
        if (context != null) {
            return new C4347e((C4350h) g10, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // G1.g
    public final ClipDescription getDescription() {
        return (ClipDescription) this.f17493h0;
    }

    public final e7.i h() {
        String str;
        if (((String) this.f17492Z) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((b7.c) this.f17494i0) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new e7.i((String) this.f17492Z, (byte[]) this.f17493h0, (b7.c) this.f17494i0);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final C3913c i() {
        String str;
        if (((Long) this.f17492Z) == null) {
            str = " delta";
        } else {
            str = "";
        }
        if (((Long) this.f17493h0) == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (((Set) this.f17494i0) == null) {
            str = android.gov.nist.core.a.g(str, " flags");
        }
        if (str.isEmpty()) {
            return new C3913c(((Long) this.f17492Z).longValue(), ((Long) this.f17493h0).longValue(), (Set) this.f17494i0);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void j(C3327a c3327a, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f17492Z;
        H8.f fVar = new H8.f(byteArrayOutputStream, map, (Map) this.f17493h0, (E8.d) this.f17494i0);
        E8.d dVar = (E8.d) map.get(C3327a.class);
        if (dVar != null) {
            dVar.a(c3327a, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + C3327a.class);
    }

    public final Y l(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final Y m(Class cls, String str) {
        Y y10;
        c0 c0Var;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        d0 d0Var = (d0) this.f17492Z;
        d0Var.getClass();
        Y y11 = (Y) d0Var.f25359a.get(str);
        if (cls.isInstance(y11)) {
            b0 b0Var = (b0) this.f17493h0;
            if (b0Var instanceof c0) {
                c0Var = (c0) b0Var;
            } else {
                c0Var = null;
            }
            if (c0Var != null) {
                AbstractC3557B.Z(y11);
                c0Var.a(y11);
            }
            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", y11);
            return y11;
        }
        C4333d c4333d = new C4333d((AbstractC4332c) this.f17494i0);
        c4333d.a(Z.f25348Z, str);
        try {
            y10 = ((b0) this.f17493h0).d(cls, c4333d);
        } catch (AbstractMethodError unused) {
            y10 = ((b0) this.f17493h0).b(cls);
        }
        d0 d0Var2 = (d0) this.f17492Z;
        d0Var2.getClass();
        AbstractC3557B.c0("viewModel", y10);
        Y y12 = (Y) d0Var2.f25359a.put(str, y10);
        if (y12 != null) {
            y12.c();
        }
        return y10;
    }

    public final AbstractC5092d n() {
        u5.f fVar;
        Boolean bool;
        AbstractC5092d abstractC5092d = (AbstractC5092d) ((AtomicReference) this.f17494i0).get();
        AbstractC5092d abstractC5092d2 = null;
        if (abstractC5092d == null) {
            synchronized (((AtomicReference) this.f17494i0)) {
                AbstractC5092d abstractC5092d3 = (AbstractC5092d) ((AtomicReference) this.f17494i0).get();
                if (abstractC5092d3 != null) {
                    abstractC5092d2 = abstractC5092d3;
                } else if (AbstractC4918b.b((String) this.f17492Z)) {
                    abstractC5092d2 = AbstractC4918b.a((String) this.f17492Z);
                    ((AtomicReference) this.f17494i0).set(abstractC5092d2);
                    ((wf.k) this.f17493h0).invoke(abstractC5092d2);
                }
            }
        } else {
            if (abstractC5092d instanceof u5.f) {
                fVar = (u5.f) abstractC5092d;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                bool = Boolean.valueOf(fVar.r().f50785c.get());
            } else {
                bool = null;
            }
            if (bool != null && !bool.booleanValue()) {
                AtomicReference atomicReference = (AtomicReference) this.f17494i0;
                while (!atomicReference.compareAndSet(abstractC5092d, null) && atomicReference.get() == abstractC5092d) {
                }
            } else {
                return abstractC5092d;
            }
        }
        return abstractC5092d2;
    }

    public final boolean o(int i10, boolean z10) {
        return ((TypedArray) this.f17493h0).getBoolean(i10, z10);
    }

    public final ColorStateList p(int i10) {
        int resourceId;
        ColorStateList b10;
        if (((TypedArray) this.f17493h0).hasValue(i10) && (resourceId = ((TypedArray) this.f17493h0).getResourceId(i10, 0)) != 0 && (b10 = AbstractC5042g.b((Context) this.f17492Z, resourceId)) != null) {
            return b10;
        }
        return ((TypedArray) this.f17493h0).getColorStateList(i10);
    }

    public final long q() {
        Object obj = this.f17494i0;
        if (((L2.r) obj) != null) {
            return ((L2.r) obj).o();
        }
        return -1L;
    }

    public final int r(int i10, int i11) {
        return ((TypedArray) this.f17493h0).getDimensionPixelOffset(i10, i11);
    }

    public final int s(int i10, int i11) {
        return ((TypedArray) this.f17493h0).getDimensionPixelSize(i10, i11);
    }

    public final Drawable t(int i10) {
        int resourceId;
        if (((TypedArray) this.f17493h0).hasValue(i10) && (resourceId = ((TypedArray) this.f17493h0).getResourceId(i10, 0)) != 0) {
            return kotlin.jvm.internal.m.u((Context) this.f17492Z, resourceId);
        }
        return ((TypedArray) this.f17493h0).getDrawable(i10);
    }

    public final String toString() {
        switch (this.f17491Y) {
            case 16:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f17492Z) != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf((Uri) this.f17492Z));
                }
                if (((String) this.f17493h0) != null) {
                    sb2.append(" action=");
                    sb2.append((String) this.f17493h0);
                }
                if (((String) this.f17494i0) != null) {
                    sb2.append(" mimetype=");
                    sb2.append((String) this.f17494i0);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                AbstractC3557B.b0("sb.toString()", sb3);
                return sb3;
            default:
                return super.toString();
        }
    }

    public final Drawable u(int i10) {
        int resourceId;
        Drawable g10;
        if (((TypedArray) this.f17493h0).hasValue(i10) && (resourceId = ((TypedArray) this.f17493h0).getResourceId(i10, 0)) != 0) {
            C5243x a5 = C5243x.a();
            Context context = (Context) this.f17492Z;
            synchronized (a5) {
                g10 = a5.f43586a.g(context, resourceId, true);
            }
            return g10;
        }
        return null;
    }

    public final L2.q v(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.f17493h0)) {
            if (((AtomicBoolean) this.f17493h0).get()) {
                constructor = (Constructor) this.f17494i0;
            } else {
                try {
                    try {
                        constructor = ((L2.n) this.f17492Z).a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f17493h0).set(true);
                        constructor = (Constructor) this.f17494i0;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (L2.q) constructor.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public final Typeface w(int i10, int i11, q.Y y10) {
        int resourceId = ((TypedArray) this.f17493h0).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f17494i0) == null) {
            this.f17494i0 = new TypedValue();
        }
        Context context = (Context) this.f17492Z;
        TypedValue typedValue = (TypedValue) this.f17494i0;
        ThreadLocal threadLocal = r1.p.f44306a;
        if (context.isRestricted()) {
            return null;
        }
        return r1.p.c(context, resourceId, typedValue, i11, y10, true, false);
    }

    public final int x(int i10, int i11) {
        return ((TypedArray) this.f17493h0).getInt(i10, i11);
    }

    public final Location y(String str) {
        try {
            if (((LocationManager) this.f17493h0).isProviderEnabled(str)) {
                return ((LocationManager) this.f17493h0).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public final int z(int i10, int i11) {
        return ((TypedArray) this.f17493h0).getResourceId(i10, i11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z.x0, java.lang.Object] */
    public u(Context context, a1 a1Var) {
        this.f17491Y = 20;
        ?? obj = new Object();
        try {
            e7.q.b(context);
            obj.f22768b = e7.q.a().c(C2303a.f26329e).D(new b7.b("proto"));
        } catch (Throwable unused) {
            obj.f22767a = true;
        }
        this.f17494i0 = obj;
        this.f17492Z = a1Var;
        this.f17493h0 = context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 16);
        this.f17491Y = 16;
        AbstractC3557B.c0("intent", intent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(d0 d0Var, b0 b0Var) {
        this(d0Var, b0Var, 0);
        this.f17491Y = 10;
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, d0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(d0 d0Var, b0 b0Var, int i10) {
        this(d0Var, b0Var, C4330a.f37738b);
        this.f17491Y = 10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, androidx.lifecycle.Z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(e0 e0Var) {
        this(r0, r2, r4);
        b0 b0Var;
        AbstractC4332c abstractC4332c;
        this.f17491Y = 10;
        AbstractC3557B.c0("owner", e0Var);
        d0 e10 = e0Var.e();
        boolean z10 = e0Var instanceof AbstractC2077l;
        if (z10) {
            b0Var = ((AbstractC2077l) e0Var).b();
        } else {
            if (Z.f25349h0 == null) {
                Z.f25349h0 = new Object();
            }
            b0Var = Z.f25349h0;
            AbstractC3557B.Z(b0Var);
        }
        if (z10) {
            abstractC4332c = ((AbstractC2077l) e0Var).c();
        } else {
            abstractC4332c = C4330a.f37738b;
        }
    }

    @Override // G1.g
    public final void d() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(e0 e0Var, b0 b0Var) {
        this(r0, b0Var, r3);
        AbstractC4332c abstractC4332c;
        this.f17491Y = 10;
        AbstractC3557B.c0("owner", e0Var);
        d0 e10 = e0Var.e();
        if (e0Var instanceof AbstractC2077l) {
            abstractC4332c = ((AbstractC2077l) e0Var).c();
        } else {
            abstractC4332c = C4330a.f37738b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(C3636c1 c3636c1) {
        this(28);
        this.f17491Y = 28;
        C8.c.h((long[]) this.f17492Z, (long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) c3636c1.f34286h0);
        u uVar = (u) c3636c1.f34285Z;
        C8.c.h((long[]) this.f17493h0, (long[]) uVar.f17493h0, (long[]) uVar.f17494i0);
        C8.c.h((long[]) this.f17494i0, (long[]) ((u) c3636c1.f34285Z).f17494i0, (long[]) c3636c1.f34286h0);
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i10) {
        this.f17491Y = i10;
        this.f17492Z = obj;
        this.f17493h0 = obj2;
        this.f17494i0 = obj3;
    }

    public u(String str, C5281b c5281b, C5848d c5848d) {
        this.f17491Y = 26;
        this.f17494i0 = str;
        this.f17492Z = c5281b;
        this.f17493h0 = c5848d;
    }

    public u(l5.d dVar) {
        this.f17491Y = 21;
        this.f17492Z = dVar;
        this.f17493h0 = new LinkedHashMap();
        this.f17494i0 = new LinkedHashMap();
    }

    public u(List list) {
        this.f17491Y = 19;
        this.f17494i0 = list;
        this.f17492Z = new ArrayList(list.size());
        this.f17493h0 = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((List) this.f17492Z).add(new y4.n(((D4.f) list.get(i10)).f3367b.f2681Z));
            ((List) this.f17493h0).add(((D4.f) list.get(i10)).f3368c.s());
        }
    }

    public u(f4.i iVar, u4.k kVar) {
        Object obj;
        this.f17491Y = 18;
        this.f17492Z = iVar;
        this.f17493h0 = kVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            boolean z10 = AbstractC5838a.f46381a;
        } else if (!AbstractC5838a.f46381a) {
            if (i10 != 26 && i10 != 27) {
                obj = new G6.a(true);
            } else {
                obj = new Object();
            }
            this.f17494i0 = obj;
        }
        obj = new G6.a(false);
        this.f17494i0 = obj;
    }

    public u(String str, C0571a c0571a) {
        this.f17491Y = 22;
        this.f17492Z = str;
        this.f17493h0 = c0571a;
        this.f17494i0 = new AtomicReference(null);
    }

    public u(AbstractC2086v abstractC2086v) {
        this.f17491Y = 9;
        AbstractC3557B.c0("provider", abstractC2086v);
        this.f17492Z = new C2088x(abstractC2086v);
        this.f17493h0 = new Handler();
    }

    public u(y yVar) {
        this.f17491Y = 0;
        this.f17492Z = yVar;
        this.f17493h0 = new b(this, yVar, 6);
        this.f17494i0 = new h(this, yVar, 2);
    }

    public u(d0 d0Var, b0 b0Var, AbstractC4332c abstractC4332c) {
        this.f17491Y = 10;
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, d0Var);
        AbstractC3557B.c0("factory", b0Var);
        AbstractC3557B.c0("defaultCreationExtras", abstractC4332c);
        this.f17492Z = d0Var;
        this.f17493h0 = b0Var;
        this.f17494i0 = abstractC4332c;
    }

    public u(String str) {
        this.f17491Y = 15;
        p2.r rVar = new p2.r();
        rVar.f42237k = str;
        this.f17492Z = new C5065s(rVar);
    }

    public u(L2.t tVar) {
        this.f17491Y = 13;
        this.f17492Z = tVar;
    }

    public u(Runnable runnable) {
        this.f17491Y = 6;
        this.f17493h0 = new CopyOnWriteArrayList();
        this.f17494i0 = new HashMap();
        this.f17492Z = runnable;
    }

    public u(Context context, TypedArray typedArray) {
        this.f17491Y = 3;
        this.f17492Z = context;
        this.f17493h0 = typedArray;
    }

    public u(Context context, LocationManager locationManager) {
        this.f17491Y = 2;
        this.f17494i0 = new Object();
        this.f17492Z = context;
        this.f17493h0 = locationManager;
    }

    public u(i1.e eVar) {
        this.f17491Y = 5;
        this.f17492Z = new ArrayList();
        this.f17493h0 = new Object();
        this.f17494i0 = eVar;
    }

    public u(u uVar) {
        this.f17491Y = 28;
        this.f17492Z = Arrays.copyOf((long[]) uVar.f17492Z, 10);
        this.f17493h0 = Arrays.copyOf((long[]) uVar.f17493h0, 10);
        this.f17494i0 = Arrays.copyOf((long[]) uVar.f17494i0, 10);
    }

    public u(Q q10, u uVar) {
        this.f17491Y = 4;
        this.f17492Z = q10;
        this.f17493h0 = uVar;
        this.f17494i0 = q10.getValue();
    }

    public u(L2.n nVar) {
        this.f17491Y = 14;
        this.f17492Z = nVar;
        this.f17493h0 = new AtomicBoolean(false);
    }

    public u(C0207h c0207h) {
        this.f17491Y = 12;
        this.f17494i0 = c0207h;
        this.f17492Z = new HashSet();
    }
}
