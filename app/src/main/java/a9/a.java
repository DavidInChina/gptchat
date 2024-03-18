package A9;

import C.q;
import Gi.e;
import L2.n;
import L3.A;
import L3.B;
import T0.I;
import U3.l;
import U3.p;
import U3.u;
import Y2.g;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1790d;
import Z8.C1806l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import c1.AbstractC2279d;
import i8.AbstractC3507y;
import id.AbstractC3557B;
import io.sentry.AbstractC3635c0;
import io.sentry.AbstractC3660k1;
import io.sentry.C3636c1;
import io.sentry.D0;
import io.sentry.E0;
import io.sentry.E1;
import io.sentry.O;
import io.sentry.android.core.C3610a;
import io.sentry.hints.j;
import j.AbstractC3873c;
import j.C3872b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k7.i;
import k7.k;
import kf.w;
import livekit.org.webrtc.Loggable;
import livekit.org.webrtc.Logging;
import n7.AbstractC4720a;
import p1.AbstractC5036a;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import p2.AbstractC5056i;
import p2.AbstractC5057j;
import p2.AbstractC5069w;
import p2.C;
import p2.C5047B;
import p2.C5048a;
import p2.C5049b;
import p2.C5059l;
import p2.C5063p;
import p2.C5065s;
import p2.C5066t;
import p2.C5067u;
import p2.C5068v;
import p2.C5070x;
import p2.C5072z;
import p2.D;
import p2.G;
import p2.H;
import p2.K;
import p2.M;
import p2.W;
import p2.Z;
import p2.b0;
import p2.r;
import s0.AbstractC5507i;
import s0.C5503e;
import s2.AbstractC5530A;
import s2.m;
import v.C5936e;
import v8.AbstractActivityC5998f;
import v8.AbstractC5995c;
import x8.L;
import x8.N;
import x8.P;
import x8.k0;
import x8.p0;
import yf.AbstractC6583a;
import z2.AbstractC6758c;
import z2.C6757b;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements N7.c, q, AbstractC5507i, I, AbstractC5056i, n, g, i, AbstractC3507y, AbstractC5995c, AbstractC3873c, AbstractC3660k1, Loggable, E0, AbstractC3635c0, io.sentry.util.a, io.sentry.transport.g, m {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f730Y;

    public /* synthetic */ a(int i10) {
        this.f730Y = i10;
    }

    @Override // L2.n
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(L2.q.class).getConstructor(new Class[0]);
    }

    @Override // io.sentry.util.a
    public void accept(Object obj) {
        ((j) obj).b(false);
    }

    @Override // k7.i
    public Object apply(Object obj) {
        L3.g gVar;
        A a5;
        long j6;
        boolean z10;
        boolean z11;
        byte[] bArr;
        long j10 = 0;
        boolean z12 = true;
        int i10 = 0;
        switch (this.f730Y) {
            case 3:
                List list = (List) obj;
                a aVar = U3.q.f17449x;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        p pVar = (p) it.next();
                        List list2 = pVar.f17448q;
                        if (list2.isEmpty() ^ z12) {
                            gVar = (L3.g) list2.get(i10);
                        } else {
                            gVar = L3.g.f10714c;
                        }
                        L3.g gVar2 = gVar;
                        UUID fromString = UUID.fromString(pVar.f17432a);
                        AbstractC3557B.b0("fromString(id)", fromString);
                        HashSet hashSet = new HashSet(pVar.f17447p);
                        AbstractC3557B.b0("progress", gVar2);
                        ArrayList arrayList2 = arrayList;
                        long j11 = pVar.f17436e;
                        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                        if (i11 != 0) {
                            a5 = new A(j11, pVar.f17437f);
                        } else {
                            a5 = null;
                        }
                        int i12 = pVar.f17439h;
                        Iterator it2 = it;
                        long j12 = pVar.f17435d;
                        int i13 = pVar.f17433b;
                        if (i13 == z12) {
                            a aVar2 = U3.q.f17449x;
                            if (i13 == z12 && i12 > 0) {
                                z10 = z12;
                            } else {
                                z10 = false;
                            }
                            if (i11 != 0) {
                                z11 = z12;
                            } else {
                                z11 = false;
                            }
                            j6 = P5.c.s(z10, i12, pVar.f17440i, pVar.f17441j, pVar.f17442k, pVar.f17443l, z11, j12, pVar.f17437f, j11, pVar.f17445n);
                        } else {
                            j6 = Long.MAX_VALUE;
                        }
                        arrayList2.add(new B(fromString, pVar.f17433b, hashSet, pVar.f17434c, gVar2, i12, pVar.f17444m, pVar.f17438g, j12, a5, j6, pVar.f17446o));
                        arrayList = arrayList2;
                        it = it2;
                        j10 = 0;
                        z12 = true;
                        i10 = 0;
                    }
                    return arrayList;
                }
                return null;
            case 4:
            case 5:
            case 6:
            default:
                Cursor cursor = (Cursor) obj;
                b7.b bVar = k.f37187k0;
                ArrayList arrayList3 = new ArrayList();
                int i14 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList3.add(blob);
                    i14 += blob.length;
                }
                byte[] bArr2 = new byte[i14];
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    byte[] bArr3 = (byte[]) arrayList3.get(i16);
                    System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
                    i15 += bArr3.length;
                }
                return bArr2;
            case 7:
                b7.b bVar2 = k.f37187k0;
                throw new RuntimeException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 8:
                b7.b bVar3 = k.f37187k0;
                throw new RuntimeException("Timed out while trying to open db.", (Throwable) obj);
            case 9:
                b7.b bVar4 = k.f37187k0;
                return (List) k.p(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new a(11));
            case 10:
                Cursor cursor2 = (Cursor) obj;
                b7.b bVar5 = k.f37187k0;
                if (cursor2.moveToNext()) {
                    return Long.valueOf(cursor2.getLong(0));
                }
                return 0L;
            case 11:
                Cursor cursor3 = (Cursor) obj;
                b7.b bVar6 = k.f37187k0;
                ArrayList arrayList4 = new ArrayList();
                while (cursor3.moveToNext()) {
                    u a10 = e7.i.a();
                    a10.O(cursor3.getString(1));
                    a10.P(AbstractC4720a.b(cursor3.getInt(2)));
                    String string = cursor3.getString(3);
                    if (string == null) {
                        bArr = null;
                    } else {
                        bArr = Base64.decode(string, 0);
                    }
                    a10.f17493h0 = bArr;
                    arrayList4.add(a10.h());
                }
                return arrayList4;
            case 12:
                Cursor cursor4 = (Cursor) obj;
                b7.b bVar7 = k.f37187k0;
                if (!cursor4.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor4.getLong(0));
            case 13:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 14:
                b7.b bVar8 = k.f37187k0;
                if (((Cursor) obj).getCount() <= 0) {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
        }
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, p2.y] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Object, p2.J] */
    /* JADX WARN: Type inference failed for: r8v16, types: [p2.F, java.lang.Object] */
    @Override // p2.AbstractC5056i
    public AbstractC5057j b(Bundle bundle) {
        C5048a[] c5048aArr;
        Uri[] uriArr;
        long[] jArr;
        C5047B c5047b;
        K k10;
        C5070x c5070x;
        D d10;
        boolean z10;
        P p10;
        C5072z c5072z;
        k0 m10;
        k0 m11;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        boolean z11 = true;
        C c10 = null;
        H h10 = null;
        byte[] bArr = null;
        C5067u c5067u = null;
        byte[] bArr2 = null;
        int i10 = 0;
        switch (this.f730Y) {
            case 7:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5049b.f41983n0);
                if (parcelableArrayList == null) {
                    c5048aArr = new C5048a[0];
                } else {
                    C5048a[] c5048aArr2 = new C5048a[parcelableArrayList.size()];
                    for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                        c5048aArr2[i11] = (C5048a) C5048a.f41967v0.b((Bundle) parcelableArrayList.get(i11));
                    }
                    c5048aArr = c5048aArr2;
                }
                return new C5049b(null, c5048aArr, bundle.getLong(C5049b.f41984o0, 0L), bundle.getLong(C5049b.f41985p0, -9223372036854775807L), bundle.getInt(C5049b.f41986q0, 0));
            case 8:
                long j6 = bundle.getLong(C5048a.f41959n0);
                int i12 = bundle.getInt(C5048a.f41960o0);
                int i13 = bundle.getInt(C5048a.f41966u0);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C5048a.f41961p0);
                int[] intArray = bundle.getIntArray(C5048a.f41962q0);
                long[] longArray = bundle.getLongArray(C5048a.f41963r0);
                long j10 = bundle.getLong(C5048a.f41964s0);
                boolean z12 = bundle.getBoolean(C5048a.f41965t0);
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                if (parcelableArrayList2 == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    jArr = new long[0];
                } else {
                    jArr = longArray;
                }
                return new C5048a(j6, i12, i13, iArr, uriArr2, jArr, j10, z12);
            case 9:
            case 11:
            case 12:
            default:
                int i14 = bundle.getInt(W.f41940o0, 0);
                Bundle bundle4 = bundle.getBundle(W.f41941p0);
                if (bundle4 != null) {
                    h10 = (H) H.f41806s0.b(bundle4);
                }
                return new W(null, i14, h10, null, bundle.getInt(W.f41942q0, 0), bundle.getLong(W.f41943r0, 0L), bundle.getLong(W.f41944s0, 0L), bundle.getInt(W.f41945t0, -1), bundle.getInt(W.f41946u0, -1));
            case 10:
                return new C5059l(bundle.getInt(C5059l.f42097n0, -1), bundle.getInt(C5059l.f42098o0, -1), bundle.getInt(C5059l.f42099p0, -1), bundle.getInt(C5059l.f42101r0, -1), bundle.getInt(C5059l.f42102s0, -1), bundle.getByteArray(C5059l.f42100q0));
            case 13:
                C5065s c5065s = C5065s.f42262O0;
                r rVar = new r();
                if (bundle != null) {
                    ClassLoader classLoader = AbstractC2279d.class.getClassLoader();
                    int i15 = AbstractC5530A.f45131a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(C5065s.f42263P0);
                C5065s c5065s2 = C5065s.f42262O0;
                String str = c5065s2.f42308Y;
                if (string == null) {
                    string = str;
                }
                rVar.f42227a = string;
                String string2 = bundle.getString(C5065s.f42264Q0);
                if (string2 == null) {
                    string2 = c5065s2.f42309Z;
                }
                rVar.f42228b = string2;
                String string3 = bundle.getString(C5065s.f42265R0);
                if (string3 == null) {
                    string3 = c5065s2.f42310h0;
                }
                rVar.f42229c = string3;
                rVar.f42230d = bundle.getInt(C5065s.f42266S0, c5065s2.f42311i0);
                rVar.f42231e = bundle.getInt(C5065s.f42267T0, c5065s2.f42312j0);
                rVar.f42232f = bundle.getInt(C5065s.f42268U0, c5065s2.f42313k0);
                rVar.f42233g = bundle.getInt(C5065s.f42269V0, c5065s2.f42314l0);
                String string4 = bundle.getString(C5065s.f42270W0);
                if (string4 == null) {
                    string4 = c5065s2.f42316n0;
                }
                rVar.f42234h = string4;
                M m12 = (M) bundle.getParcelable(C5065s.f42271X0);
                if (m12 == null) {
                    m12 = c5065s2.f42317o0;
                }
                rVar.f42235i = m12;
                String string5 = bundle.getString(C5065s.f42272Y0);
                if (string5 == null) {
                    string5 = c5065s2.f42318p0;
                }
                rVar.f42236j = string5;
                String string6 = bundle.getString(C5065s.f42273Z0);
                if (string6 == null) {
                    string6 = c5065s2.f42319q0;
                }
                rVar.f42237k = string6;
                rVar.f42238l = bundle.getInt(C5065s.f42274a1, c5065s2.f42320r0);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(C5065s.b1 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        rVar.f42239m = arrayList;
                        rVar.f42240n = (C5063p) bundle.getParcelable(C5065s.f42275c1);
                        rVar.f42241o = bundle.getLong(C5065s.f42276d1, c5065s2.f42323u0);
                        rVar.f42242p = bundle.getInt(C5065s.f42277e1, c5065s2.f42324v0);
                        rVar.f42243q = bundle.getInt(C5065s.f42278f1, c5065s2.f42325w0);
                        rVar.f42244r = bundle.getFloat(C5065s.g1, c5065s2.f42326x0);
                        rVar.f42245s = bundle.getInt(C5065s.f42279h1, c5065s2.f42327y0);
                        rVar.f42246t = bundle.getFloat(C5065s.f42280i1, c5065s2.f42328z0);
                        rVar.f42247u = bundle.getByteArray(C5065s.f42281j1);
                        rVar.f42248v = bundle.getInt(C5065s.f42282k1, c5065s2.f42295B0);
                        Bundle bundle5 = bundle.getBundle(C5065s.f42283l1);
                        if (bundle5 != null) {
                            rVar.f42249w = (C5059l) C5059l.f42103t0.b(bundle5);
                        }
                        rVar.f42250x = bundle.getInt(C5065s.f42284m1, c5065s2.f42297D0);
                        rVar.f42251y = bundle.getInt(C5065s.f42285n1, c5065s2.f42298E0);
                        rVar.f42252z = bundle.getInt(C5065s.f42286o1, c5065s2.f42299F0);
                        rVar.f42220A = bundle.getInt(C5065s.f42287p1, c5065s2.f42300G0);
                        rVar.f42221B = bundle.getInt(C5065s.f42288q1, c5065s2.f42301H0);
                        rVar.f42222C = bundle.getInt(C5065s.f42289r1, c5065s2.f42302I0);
                        rVar.f42224E = bundle.getInt(C5065s.f42291t1, c5065s2.f42304K0);
                        rVar.f42225F = bundle.getInt(C5065s.f42292u1, c5065s2.f42305L0);
                        rVar.f42226G = bundle.getInt(C5065s.f42290s1, c5065s2.f42306M0);
                        return new C5065s(rVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 14:
                String str2 = C5066t.f42329j0;
                if (bundle.getInt(Z.f41957Y, -1) != 0) {
                    z11 = false;
                }
                e.l(z11);
                if (bundle.getBoolean(C5066t.f42329j0, false)) {
                    return new C5066t(bundle.getBoolean(C5066t.f42330k0, false));
                }
                return new C5066t();
            case 15:
                String string7 = bundle.getString(H.f41800m0, "");
                string7.getClass();
                Bundle bundle6 = bundle.getBundle(H.f41801n0);
                if (bundle6 == null) {
                    c5047b = C5047B.f41739k0;
                } else {
                    c5047b = (C5047B) C5047B.f41745q0.b(bundle6);
                }
                C5047B c5047b2 = c5047b;
                Bundle bundle7 = bundle.getBundle(H.f41802o0);
                if (bundle7 == null) {
                    k10 = K.f41848N0;
                } else {
                    k10 = (K) K.f41880v1.b(bundle7);
                }
                K k11 = k10;
                Bundle bundle8 = bundle.getBundle(H.f41803p0);
                if (bundle8 == null) {
                    c5070x = C5070x.f42355r0;
                } else {
                    c5070x = (C5070x) AbstractC5069w.f42349q0.b(bundle8);
                }
                C5070x c5070x2 = c5070x;
                Bundle bundle9 = bundle.getBundle(H.f41804q0);
                if (bundle9 == null) {
                    d10 = D.f41769i0;
                } else {
                    d10 = (D) D.f41773m0.b(bundle9);
                }
                D d11 = d10;
                Bundle bundle10 = bundle.getBundle(H.f41805r0);
                if (bundle10 != null) {
                    c10 = (C) C.f41759w0.b(bundle10);
                }
                return new H(string7, c5070x2, c10, c5047b2, k11, d11);
            case 16:
                Uri uri = (Uri) bundle.getParcelable(C5067u.f42334h0);
                uri.getClass();
                return new C5067u(new C3636c1(uri));
            case 17:
                C5068v c5068v = new C5068v();
                C5070x c5070x3 = AbstractC5069w.f42343k0;
                long j11 = bundle.getLong(AbstractC5069w.f42344l0, c5070x3.f42350Y);
                if (j11 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e.l(z10);
                c5068v.f42338a = j11;
                long j12 = bundle.getLong(AbstractC5069w.f42345m0, c5070x3.f42351Z);
                if (j12 != Long.MIN_VALUE && j12 < 0) {
                    z11 = false;
                }
                e.l(z11);
                c5068v.f42339b = j12;
                c5068v.f42340c = bundle.getBoolean(AbstractC5069w.f42346n0, c5070x3.f42352h0);
                c5068v.f42341d = bundle.getBoolean(AbstractC5069w.f42347o0, c5070x3.f42353i0);
                c5068v.f42342e = bundle.getBoolean(AbstractC5069w.f42348p0, c5070x3.f42354j0);
                return new AbstractC5069w(c5068v);
            case 18:
                String string8 = bundle.getString(C5072z.f42364n0);
                string8.getClass();
                UUID fromString = UUID.fromString(string8);
                Uri uri2 = (Uri) bundle.getParcelable(C5072z.f42365o0);
                Bundle bundle11 = Bundle.EMPTY;
                Bundle bundle12 = bundle.getBundle(C5072z.f42366p0);
                if (bundle12 == null) {
                    bundle12 = bundle11;
                }
                p0 p0Var = p0.f49595l0;
                if (bundle12 == bundle11) {
                    p10 = p0Var;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle12 != bundle11) {
                        for (String str3 : bundle12.keySet()) {
                            String string9 = bundle12.getString(str3);
                            if (string9 != null) {
                                hashMap.put(str3, string9);
                            }
                        }
                    }
                    p10 = P.b(hashMap);
                }
                boolean z13 = bundle.getBoolean(C5072z.f42367q0, false);
                boolean z14 = bundle.getBoolean(C5072z.f42368r0, false);
                boolean z15 = bundle.getBoolean(C5072z.f42369s0, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(C5072z.f42370t0);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                N V10 = N.V(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(C5072z.f42371u0);
                ?? obj = new Object();
                obj.f42359d = fromString;
                obj.f42361f = p0Var;
                obj.f42362g = k0.f49573j0;
                obj.f42360e = uri2;
                obj.f42361f = P.b(p10);
                obj.f42356a = z13;
                obj.f42358c = z15;
                obj.f42357b = z14;
                obj.f42362g = N.V(V10);
                if (byteArray2 != null) {
                    bArr2 = Arrays.copyOf(byteArray2, byteArray2.length);
                }
                obj.f42363h = bArr2;
                return new C5072z(obj);
            case 19:
                return new C5047B(bundle.getLong(C5047B.f41740l0, -9223372036854775807L), bundle.getLong(C5047B.f41741m0, -9223372036854775807L), bundle.getLong(C5047B.f41742n0, -9223372036854775807L), bundle.getFloat(C5047B.f41743o0, -3.4028235E38f), bundle.getFloat(C5047B.f41744p0, -3.4028235E38f));
            case 20:
                return new b0(bundle.getInt(b0.f41994i0, 0), bundle.getInt(b0.f41995j0, 0), bundle.getInt(b0.f41996k0, 0));
            case 21:
                Bundle bundle13 = bundle.getBundle(C.f41753q0);
                if (bundle13 == null) {
                    c5072z = null;
                } else {
                    c5072z = (C5072z) C5072z.f42372v0.b(bundle13);
                }
                Bundle bundle14 = bundle.getBundle(C.f41754r0);
                if (bundle14 != null) {
                    c5067u = (C5067u) C5067u.f42335i0.b(bundle14);
                }
                C5067u c5067u2 = c5067u;
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(C.f41755s0);
                if (parcelableArrayList3 == null) {
                    L l10 = N.f49523Z;
                    m10 = k0.f49573j0;
                } else {
                    m10 = AbstractC2279d.m(new a(20), parcelableArrayList3);
                }
                k0 k0Var = m10;
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(C.f41757u0);
                if (parcelableArrayList4 == null) {
                    L l11 = N.f49523Z;
                    m11 = k0.f49573j0;
                } else {
                    m11 = AbstractC2279d.m(G.f41791t0, parcelableArrayList4);
                }
                k0 k0Var2 = m11;
                long j13 = bundle.getLong(C.f41758v0, -9223372036854775807L);
                Uri uri3 = (Uri) bundle.getParcelable(C.f41751o0);
                uri3.getClass();
                return new C(uri3, bundle.getString(C.f41752p0), c5072z, c5067u2, k0Var, bundle.getString(C.f41756t0), k0Var2, null, j13);
            case 22:
                D d12 = D.f41769i0;
                u uVar = new u(11);
                uVar.f17492Z = (Uri) bundle.getParcelable(D.f41770j0);
                uVar.f17493h0 = bundle.getString(D.f41771k0);
                uVar.f17494i0 = bundle.getBundle(D.f41772l0);
                return new D(uVar);
            case 23:
                Uri uri4 = (Uri) bundle.getParcelable(G.f41784m0);
                uri4.getClass();
                String string10 = bundle.getString(G.f41785n0);
                String string11 = bundle.getString(G.f41786o0);
                int i16 = bundle.getInt(G.f41787p0, 0);
                int i17 = bundle.getInt(G.f41788q0, 0);
                String string12 = bundle.getString(G.f41789r0);
                String string13 = bundle.getString(G.f41790s0);
                ?? obj2 = new Object();
                obj2.f41779c = uri4;
                obj2.f41780d = string10;
                obj2.f41781e = string11;
                obj2.f41777a = i16;
                obj2.f41778b = i17;
                obj2.f41782f = string12;
                obj2.f41783g = string13;
                return new G(obj2);
            case 24:
                ?? obj3 = new Object();
                obj3.f41822a = bundle.getCharSequence(K.f41849O0);
                obj3.f41823b = bundle.getCharSequence(K.f41850P0);
                obj3.f41824c = bundle.getCharSequence(K.f41851Q0);
                obj3.f41825d = bundle.getCharSequence(K.f41852R0);
                obj3.f41826e = bundle.getCharSequence(K.f41853S0);
                obj3.f41827f = bundle.getCharSequence(K.f41854T0);
                obj3.f41828g = bundle.getCharSequence(K.f41855U0);
                byte[] byteArray3 = bundle.getByteArray(K.f41858X0);
                String str4 = K.f41875q1;
                if (bundle.containsKey(str4)) {
                    num = Integer.valueOf(bundle.getInt(str4));
                } else {
                    num = null;
                }
                if (byteArray3 != null) {
                    bArr = (byte[]) byteArray3.clone();
                }
                obj3.f41831j = bArr;
                obj3.f41832k = num;
                obj3.f41833l = (Uri) bundle.getParcelable(K.f41859Y0);
                obj3.f41845x = bundle.getCharSequence(K.f41868j1);
                obj3.f41846y = bundle.getCharSequence(K.f41869k1);
                obj3.f41847z = bundle.getCharSequence(K.f41870l1);
                obj3.f41817C = bundle.getCharSequence(K.f41873o1);
                obj3.f41818D = bundle.getCharSequence(K.f41874p1);
                obj3.f41819E = bundle.getCharSequence(K.f41876r1);
                obj3.f41821G = bundle.getBundle(K.f41879u1);
                String str5 = K.f41856V0;
                if (bundle.containsKey(str5) && (bundle3 = bundle.getBundle(str5)) != null) {
                    obj3.f41829h = (Z) Z.f41958Z.b(bundle3);
                }
                String str6 = K.f41857W0;
                if (bundle.containsKey(str6) && (bundle2 = bundle.getBundle(str6)) != null) {
                    obj3.f41830i = (Z) Z.f41958Z.b(bundle2);
                }
                String str7 = K.f41860Z0;
                if (bundle.containsKey(str7)) {
                    obj3.f41834m = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = K.f41861a1;
                if (bundle.containsKey(str8)) {
                    obj3.f41835n = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = K.b1;
                if (bundle.containsKey(str9)) {
                    obj3.f41836o = Integer.valueOf(bundle.getInt(str9));
                }
                String str10 = K.f41878t1;
                if (bundle.containsKey(str10)) {
                    obj3.f41837p = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = K.f41862c1;
                if (bundle.containsKey(str11)) {
                    obj3.f41838q = Boolean.valueOf(bundle.getBoolean(str11));
                }
                String str12 = K.f41863d1;
                if (bundle.containsKey(str12)) {
                    obj3.f41839r = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = K.f41864e1;
                if (bundle.containsKey(str13)) {
                    obj3.f41840s = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = K.f41865f1;
                if (bundle.containsKey(str14)) {
                    obj3.f41841t = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = K.g1;
                if (bundle.containsKey(str15)) {
                    obj3.f41842u = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = K.f41866h1;
                if (bundle.containsKey(str16)) {
                    obj3.f41843v = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = K.f41867i1;
                if (bundle.containsKey(str17)) {
                    obj3.f41844w = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = K.f41871m1;
                if (bundle.containsKey(str18)) {
                    obj3.f41815A = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = K.f41872n1;
                if (bundle.containsKey(str19)) {
                    obj3.f41816B = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = K.f41877s1;
                if (bundle.containsKey(str20)) {
                    obj3.f41820F = Integer.valueOf(bundle.getInt(str20));
                }
                return new K(obj3);
            case 25:
                String str21 = p2.P.f41921i0;
                if (bundle.getInt(Z.f41957Y, -1) != 1) {
                    z11 = false;
                }
                e.l(z11);
                float f6 = bundle.getFloat(p2.P.f41921i0, -1.0f);
                if (f6 == -1.0f) {
                    return new p2.P();
                }
                return new p2.P(f6);
        }
    }

    @Override // s0.AbstractC5507i
    public double c(double d10) {
        double d11;
        double d12;
        double d13;
        double d14;
        switch (this.f730Y) {
            case 2:
                float[] fArr = C5503e.f45026a;
                if (d10 < 0.0d) {
                    d11 = -d10;
                } else {
                    d11 = d10;
                }
                if (d11 >= 0.0031308049535603718d) {
                    d12 = (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d12 = d11 / 0.07739938080495357d;
                }
                return Math.copySign(d12, d10);
            case 3:
                float[] fArr2 = C5503e.f45026a;
                if (d10 < 0.0d) {
                    d13 = -d10;
                } else {
                    d13 = d10;
                }
                if (d13 >= 0.04045d) {
                    d14 = Math.pow((0.9478672985781991d * d13) + 0.05213270142180095d, 2.4d);
                } else {
                    d14 = 0.07739938080495357d * d13;
                }
                return Math.copySign(d14, d10);
            default:
                return d10;
        }
    }

    @Override // j.AbstractC3873c
    public void d(Object obj) {
        AbstractC1805k0 a5 = AbstractC1809m0.a();
        C1790d c1790d = C1790d.f23338c;
        int i10 = ((C3872b) obj).f35796Y;
        a5.c(c1790d, "Result: " + i10);
    }

    @Override // io.sentry.AbstractC3635c0
    public Object e() {
        return null;
    }

    @Override // io.sentry.E0
    public void f(io.sentry.N n10) {
        D0 d02 = (D0) n10;
        d02.f33762a = null;
        d02.f33765d = null;
        d02.f33766e = null;
        d02.f33767f.clear();
        E1 e12 = d02.f33768g;
        e12.clear();
        for (O o10 : d02.f33772k.getScopeObservers()) {
            o10.f(e12);
        }
        d02.f33769h.clear();
        d02.f33770i.clear();
        d02.f33771j.clear();
        d02.a();
        d02.f33778q.clear();
    }

    @Override // N7.c
    public void g(Exception exc) {
        switch (this.f730Y) {
            case 0:
                AbstractC3557B.c0("it", exc);
                AbstractC1805k0 a5 = AbstractC1809m0.a();
                C1790d c1790d = C1790d.f23338c;
                String message = exc.getMessage();
                a5.c(c1790d, "Get info failed: " + message);
                return;
            case 1:
                AbstractC1809m0.a().b(C1806l.f23365c, w.f37484Y);
                return;
            default:
                Lg.i iVar = Lb.c.f10979a;
                AbstractC3557B.c0("it", exc);
                x8.W.F(Pc.e.a(), "OTP retriever failed to start", null, 6);
                return;
        }
    }

    @Override // io.sentry.transport.g
    public long getCurrentTimeMillis() {
        int i10 = C3610a.f34073q0;
        return SystemClock.uptimeMillis();
    }

    public void h(Context context, C5936e c5936e, String str, Runnable runnable) {
        Bundle bundle;
        switch (this.f730Y) {
            case 17:
                l a5 = c5936e.f46838b.a();
                if (str != null) {
                    ((Intent) a5.f17423Z).setPackage(str);
                }
                if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                    ((Intent) a5.f17423Z).putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                }
                ((Intent) a5.f17423Z).setData(c5936e.f46837a);
                Object obj = AbstractC5042g.f41723a;
                AbstractC5036a.b(context, (Intent) a5.f17423Z, (Bundle) a5.f17424h0);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Uri uri = c5936e.f46837a;
                Resources resources = context.getResources();
                List list = null;
                try {
                    bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.getString("android.support.customtabs.trusted.DEFAULT_URL");
                int i10 = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR", 17170443);
                bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR_DARK", i10);
                int i11 = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR", 17170443);
                bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR_DARK", i11);
                bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR", 17170445);
                bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR_DARK", i11);
                bundle.getInt("android.support.customtabs.trusted.SPLASH_IMAGE_DRAWABLE", 0);
                bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_BACKGROUND_COLOR", 17170443);
                bundle.getString("android.support.customtabs.trusted.FILE_PROVIDER_AUTHORITY");
                bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_FADE_OUT_DURATION", 0);
                if (bundle.containsKey("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")) {
                    list = Arrays.asList(resources.getStringArray(bundle.getInt("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")));
                }
                bundle.getString("android.support.customtabs.trusted.FALLBACK_STRATEGY");
                String string = bundle.getString("android.support.customtabs.trusted.DISPLAY_MODE");
                if (!"immersive".equals(string)) {
                    "sticky-immersive".equals(string);
                }
                bundle.getString("android.support.customtabs.trusted.SCREEN_ORIENTATION");
                int i12 = bundle.getInt("android.support.customtabs.trusted.METADATA_SHARE_TARGET", 0);
                if (i12 != 0) {
                    resources.getString(i12);
                }
                int i13 = AbstractActivityC5998f.f47377Y;
                Intent intent = new Intent(context, AbstractActivityC5998f.class);
                intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL", uri);
                Object obj2 = AbstractC5042g.f41723a;
                intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", AbstractC5039d.a(context, i10));
                intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", AbstractC5039d.a(context, i11));
                if (list != null) {
                    intent.putStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS", new ArrayList<>(list));
                }
                context.startActivity(intent);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override // s2.m
    public void invoke(Object obj) {
        AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
        switch (this.f730Y) {
            case 0:
                abstractC6758c.getClass();
                return;
            case 1:
                abstractC6758c.getClass();
                return;
            case 2:
                abstractC6758c.getClass();
                return;
            default:
                abstractC6758c.getClass();
                return;
        }
    }

    public /* synthetic */ a(C6757b c6757b, int i10, int i11) {
        this.f730Y = i11;
    }

    @Override // livekit.org.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
    }
}
