package Df;

import A.AbstractC0044t0;
import A.Z0;
import Ah.U;
import B.M0;
import B.N0;
import B0.C0194k;
import B0.EnumC0195l;
import D1.Z;
import E.C0419e;
import E.g0;
import E.i0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Gf.r0;
import Gf.v0;
import H0.AbstractC0701r0;
import H0.B0;
import K4.C0822j;
import Mf.AbstractC0994c;
import N.o0;
import Ng.C1052b;
import Ng.C1059e0;
import Ng.C1072l;
import Ng.C1086u;
import Ng.Q;
import Q1.AbstractC1180h;
import Q1.C1175c;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Sg.AbstractC1389a;
import Uf.AbstractC1447i;
import W.C1548f1;
import W.C1634w3;
import W.H1;
import W.I1;
import W.J;
import W.K;
import W.L1;
import W.P0;
import W.R0;
import Z.AbstractC1703c;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1718j0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.O;
import Z.o1;
import ah.AbstractC2002m;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.glance.appwidget.protobuf.AbstractC2049i;
import androidx.lifecycle.AbstractC2086v;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d1.AbstractC2575j;
import d1.C2587v;
import dh.AbstractC2704h0;
import dh.C2715q;
import eh.AbstractC2911k;
import eh.C2918r;
import g.AbstractC3106E;
import g.C3104C;
import g.C3107F;
import h.AbstractC3286l;
import h.C3280f;
import h.C3281g;
import h.C3282h;
import h.C3283i;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.EnumC3642e1;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import jf.C3960j;
import ji.C4116E;
import ji.C4133h;
import ji.C4135j;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import m.C4528h;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import pf.AbstractC5156c;
import q1.AbstractC5260f;
import r0.P;
import rg.AbstractC5493d;
import v0.AbstractC5944H;
import v0.C5937A;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;
import v0.C5958k;
import v4.C5971a;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import yf.AbstractC6583a;
import yh.l1;
import z.C6684Y;

/* loaded from: classes.dex */
public abstract class H implements U, zh.s {

    /* renamed from: a  reason: collision with root package name */
    public static C5953f f3634a;

    /* renamed from: b  reason: collision with root package name */
    public static C5953f f3635b;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f3636c;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f3637d;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f3638e;

    public static Object A(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final String A0(String str) {
        char c10;
        AbstractC3557B.c0("<this>", str);
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                char charAt = str.charAt(i10);
                if ('A' <= charAt && charAt < '[') {
                    c10 = (char) (charAt + ' ');
                } else if (charAt >= 0 && charAt < '\u0080') {
                    c10 = charAt;
                } else {
                    c10 = Character.toLowerCase(charAt);
                }
                if (c10 != charAt) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int g22 = Lg.n.g2(str);
        if (i10 <= g22) {
            while (true) {
                char charAt2 = str.charAt(i10);
                if ('A' <= charAt2 && charAt2 < '[') {
                    charAt2 = (char) (charAt2 + ' ');
                } else if (charAt2 < 0 || charAt2 >= '\u0080') {
                    charAt2 = Character.toLowerCase(charAt2);
                }
                sb2.append(charAt2);
                if (i10 == g22) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder(capacity).\u2026builderAction).toString()", sb3);
        return sb3;
    }

    public static final long B(long j6) {
        long j10 = (j6 << 1) + 1;
        Mg.a aVar = Mg.b.f12127Z;
        ThreadLocal[] threadLocalArr = Mg.c.f12131a;
        return j10;
    }

    public static void B0(C4133h c4133h, byte[] bArr) {
        long j6;
        AbstractC3557B.c0("cursor", c4133h);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, bArr);
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = c4133h.f36715j0;
            int i11 = c4133h.f36716k0;
            int i12 = c4133h.f36717l0;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
            long j10 = c4133h.f36714i0;
            C4135j c4135j = c4133h.f36711Y;
            AbstractC3557B.Z(c4135j);
            if (j10 != c4135j.f36721Z) {
                long j11 = c4133h.f36714i0;
                if (j11 == -1) {
                    j6 = 0;
                } else {
                    j6 = j11 + (c4133h.f36717l0 - c4133h.f36716k0);
                }
            } else {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (c4133h.h(j6) != -1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.i, Cf.l] */
    public static final long C(long j6) {
        if (new Cf.i(-4611686018426L, 4611686018426L).r(j6)) {
            return D(j6 * ((long) UtilsKt.MICROS_MULTIPLIER));
        }
        return B(N.q(j6, -4611686018427387903L, 4611686018427387903L));
    }

    public static final void C0(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(AbstractC2469q0.i("minLines ", i10, " must be less than or equal to maxLines ", i11).toString());
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("both minLines ", i10, " and maxLines ", i11, " must be greater than zero").toString());
    }

    public static final long D(long j6) {
        long j10 = j6 << 1;
        Mg.a aVar = Mg.b.f12127Z;
        ThreadLocal[] threadLocalArr = Mg.c.f12131a;
        return j10;
    }

    public static C4528h D0(Bundle bundle, String str) {
        C0822j c0822j = K4.H.f9359h;
        if (bundle == null) {
            AbstractC2468q.e("BillingClient", str.concat(" got null owned items list"));
            return new C4528h(54, c0822j);
        }
        int a5 = AbstractC2468q.a(bundle, "BillingClient");
        String c10 = AbstractC2468q.c(bundle, "BillingClient");
        r2.d a10 = C0822j.a();
        a10.f44376a = a5;
        a10.f44377b = c10;
        C0822j c11 = a10.c();
        if (a5 != 0) {
            AbstractC2468q.e("BillingClient", str + " failed. Response code: " + a5);
            return new C4528h(23, c11);
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                AbstractC2468q.e("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
                return new C4528h(56, c0822j);
            } else if (stringArrayList2 == null) {
                AbstractC2468q.e("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
                return new C4528h(57, c0822j);
            } else if (stringArrayList3 == null) {
                AbstractC2468q.e("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
                return new C4528h(58, c0822j);
            } else {
                return new C4528h(1, K4.H.f9360i);
            }
        } else {
            AbstractC2468q.e("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new C4528h(55, c0822j);
        }
    }

    public static void E(Encoder encoder, KSerializer kSerializer, Object obj) {
        AbstractC3557B.c0("serializer", kSerializer);
        if (kSerializer.getDescriptor().c()) {
            encoder.w(kSerializer, obj);
        } else if (obj == null) {
            encoder.e();
        } else {
            encoder.getClass();
            encoder.w(kSerializer, obj);
        }
    }

    public static void E0(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(android.gov.nist.core.a.e("at index ", i11));
            }
        }
    }

    public static String F(AbstractC2049i abstractC2049i) {
        StringBuilder sb2 = new StringBuilder(abstractC2049i.size());
        for (int i10 = 0; i10 < abstractC2049i.size(); i10++) {
            byte f6 = abstractC2049i.f(i10);
            if (f6 != 34) {
                if (f6 != 39) {
                    if (f6 != 92) {
                        switch (f6) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (f6 >= 32 && f6 <= 126) {
                                    sb2.append((char) f6);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((f6 >>> 6) & 3) + 48));
                                    sb2.append((char) (((f6 >>> 3) & 7) + 48));
                                    sb2.append((char) ((f6 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static final long G(long j6, boolean z10, int i10, float f6) {
        int i11;
        if ((z10 || AbstractC3557B.D0(i10, 2)) && Z0.a.d(j6)) {
            i11 = Z0.a.h(j6);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (Z0.a.j(j6) != i11) {
            i11 = N.p(AbstractC4828h.t(f6), Z0.a.j(j6), i11);
        }
        return A7.b.n(0, i11, 0, Z0.a.g(j6), 5);
    }

    public static final int H(int i10, ArrayList arrayList) {
        char c10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            N0.m mVar = (N0.m) arrayList.get(i12);
            if (mVar.f12540b > i10) {
                c10 = 1;
            } else if (mVar.f12541c <= i10) {
                c10 = '\uffff';
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final int I(int i10, ArrayList arrayList) {
        char c10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            N0.m mVar = (N0.m) arrayList.get(i12);
            if (mVar.f12542d > i10) {
                c10 = 1;
            } else if (mVar.f12543e <= i10) {
                c10 = '\uffff';
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final int J(float f6, ArrayList arrayList) {
        char c10;
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            N0.m mVar = (N0.m) arrayList.get(i11);
            if (mVar.f12544f > f6) {
                c10 = 1;
            } else if (mVar.f12545g <= f6) {
                c10 = '\uffff';
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final void K(ArrayList arrayList, long j6, wf.k kVar) {
        int size = arrayList.size();
        for (int H6 = H(N0.D.e(j6), arrayList); H6 < size; H6++) {
            N0.m mVar = (N0.m) arrayList.get(H6);
            if (mVar.f12540b < N0.D.d(j6)) {
                if (mVar.f12540b != mVar.f12541c) {
                    kVar.invoke(mVar);
                }
            } else {
                return;
            }
        }
    }

    public static final long L(int i10, int i11) {
        int i12;
        int min = Math.min(i10, 262142);
        if (min < 8191) {
            i12 = Math.min(i11, 262142);
        } else if (min < 32767) {
            i12 = Math.min(i11, 65534);
        } else if (min < 65535) {
            i12 = Math.min(i11, 32766);
        } else {
            i12 = Math.min(i11, 8190);
        }
        return B0.d(min, i12);
    }

    public static void M(Fe.v vVar, Jb.c cVar) {
        for (Map.Entry entry : vVar.a()) {
            cVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static Set N() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Type O(w wVar) {
        Type type;
        AbstractC3557B.c0("<this>", wVar);
        if (wVar instanceof kotlin.jvm.internal.n) {
            v0 v0Var = ((r0) ((kotlin.jvm.internal.n) wVar)).f6461Z;
            if (v0Var != null) {
                type = (Type) v0Var.mo122invoke();
            } else {
                type = null;
            }
            if (type != null) {
                return type;
            }
        }
        return v(wVar, false);
    }

    public static final Type P(z zVar) {
        A a5 = zVar.f3649a;
        if (a5 == null) {
            return I.f3639h0;
        }
        w wVar = zVar.f3650b;
        AbstractC3557B.Z(wVar);
        int ordinal = a5.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new I(v(wVar, true), null);
                }
                throw new RuntimeException();
            }
            return new I(null, v(wVar, true));
        }
        return v(wVar, true);
    }

    public static final C5953f Q() {
        C5953f c5953f = f3636c;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        long j6 = r0.r.f44254b;
        r0.N n10 = new r0.N(j6);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new v0.n(12.0f, 14.0f));
        arrayList.add(new v0.s(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f));
        arrayList.add(new C5937A(5.0f));
        arrayList.add(new v0.s(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f));
        arrayList.add(new v0.p(9.0f, 3.34f, 9.0f, 5.0f));
        arrayList.add(new v0.z(6.0f));
        arrayList.add(new C5958k(9.0f, 12.66f, 10.34f, 14.0f, 12.0f, 14.0f));
        arrayList.add(C5957j.f46979c);
        C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
        r0.N n11 = new r0.N(j6);
        Wh.p p10 = R.a.p(0, 17.0f, 11.0f);
        p10.h(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        p10.u(-5.0f, -2.24f, -5.0f, -5.0f);
        p10.l(5.0f);
        p10.h(0.0f, 3.53f, 2.61f, 6.43f, 6.0f, 6.92f);
        p10.w(21.0f);
        p10.m(2.0f);
        p10.x(-3.08f);
        p10.h(3.39f, -0.49f, 6.0f, -3.39f, 6.0f, -6.92f);
        p10.l(17.0f);
        p10.f();
        C5952e.b(c5952e, p10.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f3636c = c10;
        return c10;
    }

    public static final C1072l R(AbstractC4825e abstractC4825e) {
        C1072l c1072l;
        C1072l c1072l2;
        if (!(abstractC4825e instanceof Sg.i)) {
            return new C1072l(1, abstractC4825e);
        }
        Sg.i iVar = (Sg.i) abstractC4825e;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sg.i.f16655m0;
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            Q1.u uVar = AbstractC1389a.f16644d;
            c1072l = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(iVar, uVar);
                c1072l2 = null;
                break;
            } else if (obj instanceof C1072l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                        break;
                    }
                }
                c1072l2 = (C1072l) obj;
                break loop0;
            } else if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1072l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1072l.f12953l0;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1072l2);
            if ((obj2 instanceof C1086u) && ((C1086u) obj2).f12980d != null) {
                c1072l2.n();
            } else {
                C1072l.f12952k0.set(c1072l2, 536870911);
                atomicReferenceFieldUpdater2.set(c1072l2, C1052b.f12923Y);
                c1072l = c1072l2;
            }
            if (c1072l != null) {
                return c1072l;
            }
        }
        return new C1072l(2, abstractC4825e);
    }

    public static final J1.a S(View view) {
        J1.a aVar = (J1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar == null) {
            J1.a aVar2 = new J1.a();
            view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static final Sg.z T(Object obj) {
        if (obj != AbstractC1389a.f16642b) {
            return (Sg.z) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final C0419e U(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1816710665);
        rVar.W(-282936756);
        WeakHashMap weakHashMap = E.B0.f3736v;
        E.B0 c10 = E.G.c(rVar);
        rVar.t(false);
        rVar.t(false);
        return c10.f3743g;
    }

    public static final C5953f V() {
        C5953f c5953f = f3637d;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p pVar = new Wh.p(0);
        pVar.p(14.0f, 6.0f);
        pVar.n(14.0f, 4.0f);
        pVar.m(-4.0f);
        pVar.x(2.0f);
        pVar.m(4.0f);
        pVar.f();
        pVar.p(4.0f, 8.0f);
        pVar.x(11.0f);
        pVar.m(16.0f);
        E9.f.C(pVar, 20.0f, 8.0f, 4.0f, 8.0f);
        pVar.p(20.0f, 6.0f);
        pVar.h(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pVar.x(11.0f);
        pVar.h(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
        pVar.n(4.0f, 21.0f);
        pVar.h(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        pVar.o(0.01f, -11.0f);
        pVar.h(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
        pVar.m(4.0f);
        pVar.n(8.0f, 4.0f);
        pVar.h(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pVar.m(4.0f);
        pVar.h(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pVar.x(2.0f);
        pVar.m(4.0f);
        pVar.f();
        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f3637d = c10;
        return c10;
    }

    public static boolean W(AbstractC0994c abstractC0994c) {
        AbstractC3557B.c0("callableMemberDescriptor", abstractC0994c);
        if (!AbstractC1447i.f17824d.contains(abstractC0994c.getName())) {
            return false;
        }
        if (kf.t.X1(AbstractC1447i.f17823c, AbstractC5493d.c(abstractC0994c)) && abstractC0994c.S().isEmpty()) {
            return true;
        }
        if (!Jf.l.z(abstractC0994c)) {
            return false;
        }
        Collection m10 = abstractC0994c.m();
        AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
        Collection<AbstractC0994c> collection = m10;
        if (collection.isEmpty()) {
            return false;
        }
        for (AbstractC0994c abstractC0994c2 : collection) {
            AbstractC3557B.Z(abstractC0994c2);
            if (W(abstractC0994c2)) {
                return true;
            }
        }
        return false;
    }

    public static final String X(byte[] bArr) {
        char[] cArr = Fe.n.f5337a;
        AbstractC3557B.c0("bytes", bArr);
        char[] cArr2 = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr3 = Fe.n.f5337a;
            cArr2[i10] = cArr3[(b10 & 255) >> 4];
            i10 += 2;
            cArr2[i11] = cArr3[b10 & 15];
        }
        return new String(cArr2);
    }

    public static final boolean Z(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f6 * f14) - (f10 * f13);
        float f26 = (f6 * f15) - (f11 * f13);
        float f27 = (f6 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 == 0.0f) {
            return false;
        }
        float f38 = 1.0f / f37;
        fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
        fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
        fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
        fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
        float f39 = -f13;
        fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
        fArr2[5] = ((f12 * f32) + ((f36 * f6) - (f11 * f33))) * f38;
        float f40 = -f21;
        fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
        fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
        fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
        fArr2[9] = (((f33 * f10) + ((-f6) * f35)) - (f12 * f31)) * f38;
        fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
        fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
        fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
        fArr2[13] = ((f11 * f31) + ((f6 * f34) - (f10 * f32))) * f38;
        fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
        fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        return true;
    }

    public static final boolean a0(Object obj) {
        if (obj == AbstractC1389a.f16642b) {
            return true;
        }
        return false;
    }

    public static boolean b0(View view) {
        WeakHashMap weakHashMap = Z.f3247a;
        if (D1.I.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static boolean c0(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static final Fe.l d() {
        return new Fe.l(0);
    }

    public static final boolean d0(String str, int i10) {
        char charAt = str.charAt(i10);
        if ('A' > charAt || charAt >= '[') {
            return false;
        }
        return true;
    }

    public static final void e(boolean z10, AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-361453782);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(z10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC6216a)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            if (i15 != 0) {
                z10 = true;
            }
            AbstractC1710f0 g02 = AbstractC4828h.g0(abstractC6216a, rVar);
            rVar.W(-3687241);
            Object K10 = rVar.K();
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (K10 == iVar) {
                K10 = new C3283i(z10, g02);
                rVar.h0(K10);
            }
            rVar.t(false);
            C3283i c3283i = (C3283i) K10;
            Boolean valueOf = Boolean.valueOf(z10);
            rVar.W(-3686552);
            boolean g10 = rVar.g(valueOf) | rVar.g(c3283i);
            Object K11 = rVar.K();
            if (g10 || K11 == iVar) {
                K11 = new C3280f(c3283i, z10, 0);
                rVar.h0(K11);
            }
            rVar.t(false);
            AbstractC1734s.g((AbstractC6216a) K11, rVar);
            O o10 = AbstractC3286l.f31675a;
            rVar.W(-2068013981);
            AbstractC3106E abstractC3106E = (AbstractC3106E) rVar.m(AbstractC3286l.f31675a);
            rVar.W(1680121597);
            if (abstractC3106E == null) {
                View view = (View) rVar.m(H0.Z.f6892f);
                AbstractC3557B.c0("<this>", view);
                abstractC3106E = (AbstractC3106E) Kg.m.j1(Kg.m.o1(Kg.p.c1(view, C3107F.f30937Z), C3107F.f30938h0));
            }
            rVar.t(false);
            if (abstractC3106E == null) {
                Context context = (Context) rVar.m(H0.Z.f6888b);
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof AbstractC3106E) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                        break;
                    }
                }
                abstractC3106E = (AbstractC3106E) context;
            }
            rVar.t(false);
            if (abstractC3106E != null) {
                C3104C a5 = abstractC3106E.a();
                AbstractC2086v abstractC2086v = (AbstractC2086v) rVar.m(H0.Z.f6890d);
                AbstractC1734s.a(abstractC2086v, a5, new C3281g(a5, abstractC2086v, c3283i, 0), rVar);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        boolean z11 = z10;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C3282h(z11, abstractC6216a, i10, i11, 0);
        }
    }

    public static final void e0(Runnable runnable, Throwable th2, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("logger", abstractC5091c);
        if (th2 == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                try {
                    ((Future) runnable).get();
                } catch (SecurityException e10) {
                    P4.a.m0(abstractC5091c, 5, EnumC5090b.f42739Z, N5.c.f12713Z, e10, false, 48);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                th2 = e11;
            } catch (ExecutionException e12) {
                th2 = e12.getCause();
            }
        }
        Throwable th3 = th2;
        if (th3 != null) {
            P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), N5.c.f12714h0, th3, 48);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(boolean z10, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, long j6, Z0 z02, C2587v c2587v, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        long j10;
        Z0 z03;
        int i14;
        Object obj;
        Object obj2;
        long j11;
        Z0 z04;
        long j12;
        AbstractC4326r abstractC4326r3;
        Object K10;
        Object obj3;
        C6684Y c6684y;
        Object K11;
        boolean z11;
        boolean g10;
        Object K12;
        AbstractC4326r abstractC4326r4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1137929566);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(z10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.i(abstractC6216a)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        int i22 = i11 & 4;
        if (i22 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
                j10 = j6;
            } else {
                j10 = j6;
                if ((i10 & 3072) == 0) {
                    if (rVar.f(j10)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 24576) != 0) {
                if ((i11 & 16) == 0) {
                    z03 = z02;
                    if (rVar.g(z03)) {
                        i17 = 16384;
                        i12 |= i17;
                    }
                } else {
                    z03 = z02;
                }
                i17 = 8192;
                i12 |= i17;
            } else {
                z03 = z02;
            }
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                obj = c2587v;
                if (rVar.g(obj)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (rVar.i(oVar)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                    if ((i12 & 599187) != 599186 && rVar.B()) {
                        rVar.P();
                        j11 = j10;
                        obj2 = obj;
                    } else {
                        rVar.R();
                        if ((i10 & 1) == 0 && !rVar.A()) {
                            rVar.P();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            j12 = j10;
                            obj2 = obj;
                            abstractC4326r3 = abstractC4326r2;
                        } else {
                            if (i22 == 0) {
                                abstractC4326r4 = C4323o.f37719b;
                            } else {
                                abstractC4326r4 = abstractC4326r2;
                            }
                            if (i13 != 0) {
                                float f6 = 0;
                                j10 = AbstractC4828h.f(f6, f6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                z03 = androidx.compose.foundation.a.l(rVar);
                            }
                            if (i14 == 0) {
                                obj2 = new C2587v(true, false, 62);
                                z04 = z03;
                                j12 = j10;
                                abstractC4326r3 = abstractC4326r4;
                                rVar.u();
                                rVar.W(463006278);
                                K10 = rVar.K();
                                obj3 = C1723m.f22654Y;
                                if (K10 == obj3) {
                                    K10 = new C6684Y(Boolean.FALSE);
                                    rVar.h0(K10);
                                }
                                c6684y = (C6684Y) K10;
                                rVar.t(false);
                                c6684y.f51197c.setValue(Boolean.valueOf(z10));
                                if (!((Boolean) c6684y.f51196b.getValue()).booleanValue() || ((Boolean) c6684y.f51197c.getValue()).booleanValue()) {
                                    rVar.W(463006465);
                                    K11 = rVar.K();
                                    if (K11 == obj3) {
                                        K11 = AbstractC4828h.Z(new P(P.f44225b), o1.f22665a);
                                        rVar.h0(K11);
                                    }
                                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K11;
                                    rVar.t(false);
                                    Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                                    rVar.W(463006596);
                                    if ((i12 & 7168) != 2048) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    g10 = z11 | rVar.g(bVar);
                                    K12 = rVar.K();
                                    if (!g10 || K12 == obj3) {
                                        K12 = new C1548f1(j12, bVar, new C1634w3(2, abstractC1710f0));
                                        rVar.h0(K12);
                                    }
                                    rVar.t(false);
                                    AbstractC2575j.a((C1548f1) K12, abstractC6216a, obj2, R4.b.X(rVar, -848116919, new W.I(c6684y, abstractC1710f0, z04, abstractC4326r3, oVar, 0)), rVar, (i12 & 112) | 3072 | ((i12 >> 9) & 896), 0);
                                }
                                abstractC4326r2 = abstractC4326r3;
                                j11 = j12;
                                z03 = z04;
                            } else {
                                j12 = j10;
                                obj2 = obj;
                                abstractC4326r3 = abstractC4326r4;
                            }
                        }
                        z04 = z03;
                        rVar.u();
                        rVar.W(463006278);
                        K10 = rVar.K();
                        obj3 = C1723m.f22654Y;
                        if (K10 == obj3) {
                        }
                        c6684y = (C6684Y) K10;
                        rVar.t(false);
                        c6684y.f51197c.setValue(Boolean.valueOf(z10));
                        if (!((Boolean) c6684y.f51196b.getValue()).booleanValue()) {
                        }
                        rVar.W(463006465);
                        K11 = rVar.K();
                        if (K11 == obj3) {
                        }
                        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K11;
                        rVar.t(false);
                        Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                        rVar.W(463006596);
                        if ((i12 & 7168) != 2048) {
                        }
                        g10 = z11 | rVar.g(bVar2);
                        K12 = rVar.K();
                        if (!g10) {
                        }
                        K12 = new C1548f1(j12, bVar2, new C1634w3(2, abstractC1710f02));
                        rVar.h0(K12);
                        rVar.t(false);
                        AbstractC2575j.a((C1548f1) K12, abstractC6216a, obj2, R4.b.X(rVar, -848116919, new W.I(c6684y, abstractC1710f02, z04, abstractC4326r3, oVar, 0)), rVar, (i12 & 112) | 3072 | ((i12 >> 9) & 896), 0);
                        abstractC4326r2 = abstractC4326r3;
                        j11 = j12;
                        z03 = z04;
                    }
                    C1741v0 v10 = rVar.v();
                    if (v10 != null) {
                        v10.f22739d = new J(z10, abstractC6216a, abstractC4326r2, j11, z03, obj2, oVar, i10, i11);
                        return;
                    }
                    return;
                }
                if ((i12 & 599187) != 599186) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i22 == 0) {
                }
                if (i13 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if (i14 == 0) {
                }
            }
            obj = c2587v;
            if ((i11 & 64) != 0) {
            }
            if ((i12 & 599187) != 599186) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i22 == 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if (i14 == 0) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        if ((i10 & 24576) != 0) {
        }
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        obj = c2587v;
        if ((i11 & 64) != 0) {
        }
        if ((i12 & 599187) != 599186) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i22 == 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if (i14 == 0) {
        }
    }

    public static final v4.p f0(Context context, z4.s sVar, final String str) {
        String str2;
        if (sVar instanceof z4.r) {
            if (AbstractC3557B.K(str, "__LottieInternalDefaultCacheKey__")) {
                final int i10 = ((z4.r) sVar).f51709a;
                HashMap hashMap = v4.e.f47174a;
                StringBuilder sb2 = new StringBuilder("rawRes");
                if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                    str2 = "_night_";
                } else {
                    str2 = "_day_";
                }
                sb2.append(str2);
                sb2.append(i10);
                final String sb3 = sb2.toString();
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                return v4.e.a(sb3, new Callable() { // from class: v4.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C5971a c5971a;
                        o oVar;
                        int i11 = i10;
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        String str3 = sb3;
                        if (str3 == null) {
                            c5971a = null;
                        } else {
                            c5971a = B4.e.f1861b.a(str3);
                        }
                        if (c5971a != null) {
                            return new o(c5971a);
                        }
                        try {
                            C4116E J10 = R4.b.J(R4.b.Z1(context2.getResources().openRawResource(i11)));
                            if (e.f(J10, e.f47176c).booleanValue()) {
                                return e.d(context2, new ZipInputStream(J10.Q0()), str3);
                            }
                            if (e.f(J10, e.f47177d).booleanValue()) {
                                try {
                                    return e.b(new GZIPInputStream(J10.Q0()), str3);
                                } catch (IOException e10) {
                                    oVar = new o(e10);
                                    return oVar;
                                }
                            }
                            return e.b(J10.Q0(), str3);
                        } catch (Resources.NotFoundException e11) {
                            oVar = new o(e11);
                            return oVar;
                        }
                    }
                }, null);
            }
            final int i11 = ((z4.r) sVar).f51709a;
            HashMap hashMap2 = v4.e.f47174a;
            final WeakReference weakReference2 = new WeakReference(context);
            final Context applicationContext2 = context.getApplicationContext();
            return v4.e.a(str, new Callable() { // from class: v4.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C5971a c5971a;
                    o oVar;
                    int i112 = i11;
                    Context context2 = (Context) weakReference2.get();
                    if (context2 == null) {
                        context2 = applicationContext2;
                    }
                    String str3 = str;
                    if (str3 == null) {
                        c5971a = null;
                    } else {
                        c5971a = B4.e.f1861b.a(str3);
                    }
                    if (c5971a != null) {
                        return new o(c5971a);
                    }
                    try {
                        C4116E J10 = R4.b.J(R4.b.Z1(context2.getResources().openRawResource(i112)));
                        if (e.f(J10, e.f47176c).booleanValue()) {
                            return e.d(context2, new ZipInputStream(J10.Q0()), str3);
                        }
                        if (e.f(J10, e.f47177d).booleanValue()) {
                            try {
                                return e.b(new GZIPInputStream(J10.Q0()), str3);
                            } catch (IOException e10) {
                                oVar = new o(e10);
                                return oVar;
                            }
                        }
                        return e.b(J10.Q0(), str3);
                    } catch (Resources.NotFoundException e11) {
                        oVar = new o(e11);
                        return oVar;
                    }
                }
            }, null);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(wf.n nVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, wf.n nVar2, wf.n nVar3, boolean z10, I1 i12, g0 g0Var, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i13;
        int i14;
        int i15;
        wf.n nVar4;
        int i16;
        wf.n nVar5;
        int i17;
        boolean z11;
        I1 i18;
        int i19;
        int i20;
        D.m mVar2;
        g0 g0Var2;
        I1 i110;
        boolean z12;
        wf.n nVar6;
        wf.n nVar7;
        AbstractC4326r abstractC4326r2;
        int i21;
        g0 g0Var3;
        wf.n nVar8;
        D.m mVar3;
        I1 i111;
        I1 i112;
        int i22;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1826340448);
        if ((i11 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (rVar.i(nVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= rVar.i(abstractC6216a) ? 32 : 16;
            i14 = i11 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                i13 |= rVar.g(abstractC4326r) ? 256 : 128;
                i15 = i11 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    nVar4 = nVar2;
                    i13 |= rVar.i(nVar4) ? 2048 : 1024;
                    i16 = i11 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        nVar5 = nVar3;
                        i13 |= rVar.i(nVar5) ? 16384 : 8192;
                        i17 = i11 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            z11 = z10;
                            i13 |= rVar.h(z11) ? 131072 : 65536;
                            if ((1572864 & i10) != 0) {
                                if ((i11 & 64) == 0) {
                                    i18 = i12;
                                    if (rVar.g(i18)) {
                                        i22 = 1048576;
                                        i13 |= i22;
                                    }
                                } else {
                                    i18 = i12;
                                }
                                i22 = 524288;
                                i13 |= i22;
                            } else {
                                i18 = i12;
                            }
                            i19 = i11 & 128;
                            if (i19 == 0) {
                                i13 |= 12582912;
                            } else if ((i10 & 12582912) == 0) {
                                i13 |= rVar.g(g0Var) ? 8388608 : 4194304;
                            }
                            i20 = i11 & 256;
                            if (i20 == 0) {
                                i13 |= 100663296;
                            } else if ((i10 & 100663296) == 0) {
                                i13 |= rVar.g(mVar) ? 67108864 : 33554432;
                            }
                            if ((i13 & 38347923) != 38347922 && rVar.B()) {
                                rVar.P();
                                abstractC4326r2 = abstractC4326r;
                                g0Var2 = g0Var;
                                nVar7 = nVar4;
                                nVar6 = nVar5;
                                z12 = z11;
                                i110 = i18;
                                mVar2 = mVar;
                            } else {
                                rVar.R();
                                if ((i10 & 1) == 0 && !rVar.A()) {
                                    rVar.P();
                                    if ((i11 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    abstractC4326r2 = abstractC4326r;
                                    g0Var3 = g0Var;
                                    i21 = i13;
                                    nVar8 = nVar5;
                                    z12 = z11;
                                    i111 = i18;
                                } else {
                                    abstractC4326r2 = i14 == 0 ? C4323o.f37719b : abstractC4326r;
                                    nVar8 = null;
                                    if (i15 != 0) {
                                        nVar4 = null;
                                    }
                                    if (i16 == 0) {
                                        nVar8 = nVar5;
                                    }
                                    z12 = i17 == 0 ? true : z11;
                                    if ((i11 & 64) == 0) {
                                        i0 i0Var = H1.f19182a;
                                        rVar.W(1326531516);
                                        P0 p02 = (P0) rVar.m(R0.f19593a);
                                        i112 = p02.f19512X;
                                        if (i112 == null) {
                                            i112 = new I1(R0.d(p02, X.v.f21657e), R0.d(p02, X.v.f21660h), R0.d(p02, X.v.f21663k), r0.r.b(R0.d(p02, X.v.f21656d), 0.38f), r0.r.b(R0.d(p02, X.v.f21659g), 0.38f), r0.r.b(R0.d(p02, X.v.f21662j), 0.38f));
                                            p02.f19512X = i112;
                                        }
                                        rVar.t(false);
                                        i13 &= -3670017;
                                    } else {
                                        i112 = i18;
                                    }
                                    g0Var3 = i19 == 0 ? H1.f19182a : g0Var;
                                    if (i20 == 0) {
                                        rVar.W(1989948114);
                                        Object K10 = rVar.K();
                                        if (K10 == C1723m.f22654Y) {
                                            K10 = kotlin.jvm.internal.m.d();
                                            rVar.h0(K10);
                                        }
                                        rVar.t(false);
                                        i21 = i13;
                                        mVar3 = (D.m) K10;
                                        i111 = i112;
                                        rVar.u();
                                        L1.b(nVar, abstractC6216a, abstractC4326r2, nVar4, nVar8, z12, i111, g0Var3, mVar3, rVar, (i21 & 14) | (i21 & 112) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (29360128 & i21) | (i21 & 234881024));
                                        mVar2 = mVar3;
                                        g0Var2 = g0Var3;
                                        nVar6 = nVar8;
                                        nVar7 = nVar4;
                                        i110 = i111;
                                    } else {
                                        i21 = i13;
                                        i111 = i112;
                                    }
                                }
                                mVar3 = mVar;
                                rVar.u();
                                L1.b(nVar, abstractC6216a, abstractC4326r2, nVar4, nVar8, z12, i111, g0Var3, mVar3, rVar, (i21 & 14) | (i21 & 112) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (29360128 & i21) | (i21 & 234881024));
                                mVar2 = mVar3;
                                g0Var2 = g0Var3;
                                nVar6 = nVar8;
                                nVar7 = nVar4;
                                i110 = i111;
                            }
                            C1741v0 v10 = rVar.v();
                            if (v10 == null) {
                                return;
                            }
                            v10.f22739d = new K(nVar, abstractC6216a, abstractC4326r2, nVar7, nVar6, z12, i110, g0Var2, mVar2, i10, i11);
                            return;
                        }
                        z11 = z10;
                        if ((1572864 & i10) != 0) {
                        }
                        i19 = i11 & 128;
                        if (i19 == 0) {
                        }
                        i20 = i11 & 256;
                        if (i20 == 0) {
                        }
                        if ((i13 & 38347923) != 38347922) {
                        }
                        rVar.R();
                        if ((i10 & 1) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        nVar8 = null;
                        if (i15 != 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i20 == 0) {
                        }
                    }
                    nVar5 = nVar3;
                    i17 = i11 & 32;
                    if (i17 != 0) {
                    }
                    z11 = z10;
                    if ((1572864 & i10) != 0) {
                    }
                    i19 = i11 & 128;
                    if (i19 == 0) {
                    }
                    i20 = i11 & 256;
                    if (i20 == 0) {
                    }
                    if ((i13 & 38347923) != 38347922) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    nVar8 = null;
                    if (i15 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i20 == 0) {
                    }
                }
                nVar4 = nVar2;
                i16 = i11 & 16;
                if (i16 == 0) {
                }
                nVar5 = nVar3;
                i17 = i11 & 32;
                if (i17 != 0) {
                }
                z11 = z10;
                if ((1572864 & i10) != 0) {
                }
                i19 = i11 & 128;
                if (i19 == 0) {
                }
                i20 = i11 & 256;
                if (i20 == 0) {
                }
                if ((i13 & 38347923) != 38347922) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i14 == 0) {
                }
                nVar8 = null;
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
            }
            i15 = i11 & 8;
            if (i15 != 0) {
            }
            nVar4 = nVar2;
            i16 = i11 & 16;
            if (i16 == 0) {
            }
            nVar5 = nVar3;
            i17 = i11 & 32;
            if (i17 != 0) {
            }
            z11 = z10;
            if ((1572864 & i10) != 0) {
            }
            i19 = i11 & 128;
            if (i19 == 0) {
            }
            i20 = i11 & 256;
            if (i20 == 0) {
            }
            if ((i13 & 38347923) != 38347922) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i14 == 0) {
            }
            nVar8 = null;
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if ((i11 & 64) == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
        }
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        i15 = i11 & 8;
        if (i15 != 0) {
        }
        nVar4 = nVar2;
        i16 = i11 & 16;
        if (i16 == 0) {
        }
        nVar5 = nVar3;
        i17 = i11 & 32;
        if (i17 != 0) {
        }
        z11 = z10;
        if ((1572864 & i10) != 0) {
        }
        i19 = i11 & 128;
        if (i19 == 0) {
        }
        i20 = i11 & 256;
        if (i20 == 0) {
        }
        if ((i13 & 38347923) != 38347922) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i14 == 0) {
        }
        nVar8 = null;
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i11 & 64) == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
    }

    public static int g0(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static S0.I h(int i10) {
        return new S0.I(i10, S0.D.f15971j0, 0, new S0.C(new S0.B[0]), 0);
    }

    public static final C1718j0 h0(float f6) {
        int i10 = AbstractC1703c.f22606b;
        return new C1718j0(f6);
    }

    public static final Z0.j i(long j6, long j10) {
        int i10 = Z0.i.f22798c;
        int i11 = (int) (j6 >> 32);
        int i12 = (int) (j6 & 4294967295L);
        return new Z0.j(i11, i12, ((int) (j10 >> 32)) + i11, ((int) (j10 & 4294967295L)) + i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Type inference failed for: r4v2, types: [Cf.c, Cf.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i0(String str) {
        int i10;
        int length = str.length();
        if (length > 0 && Lg.n.a2("+-", str.charAt(0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (length - i10 > 16) {
            Cf.e eVar = new Cf.e(i10, Lg.n.g2(str), 1);
            if (!(eVar instanceof Collection) || !((Collection) eVar).isEmpty()) {
                Cf.f it = eVar.iterator();
                while (it.f3111h0) {
                    if (!new Cf.a('0', '9').r(str.charAt(it.a()))) {
                        if (Lg.n.I2(str, "+", false)) {
                            str = Lg.o.W2(1, str);
                        }
                        return Long.parseLong(str);
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        if (Lg.n.I2(str, "+", false)) {
        }
        return Long.parseLong(str);
    }

    public static final void j(AbstractC4326r abstractC4326r, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2105228848);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(nVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            if (i15 != 0) {
                abstractC4326r = C4323o.f37719b;
            }
            o0 o0Var = o0.f12389a;
            rVar.W(-1323940314);
            int i16 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i17 = androidx.compose.ui.layout.a.i(abstractC4326r);
            int i18 = (((((i12 << 3) & 112) | (((i12 >> 3) & 14) | 384)) << 9) & 7168) | 6;
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, o0Var, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i16))) {
                    AbstractC6463a.q(i16, rVar, i16, c0581j);
                }
                AbstractC6463a.r(0, i17, new L0(rVar), rVar, 2058660585);
                AbstractC6463a.s((i18 >> 9) & 14, nVar, rVar, false, true);
                rVar.t(false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new N.A(abstractC4326r2, nVar, i10, i11, 1);
        }
    }

    public static PorterDuff.Mode j0(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(Context context, z4.s sVar, String str, String str2, String str3, String str4, AbstractC4825e abstractC4825e) {
        z4.w wVar;
        EnumC5000a enumC5000a;
        int i10;
        Object obj;
        Context context2;
        String str5;
        String str6;
        C5971a c5971a;
        Object n12;
        Context context3;
        String str7;
        String str8;
        C5971a c5971a2;
        Object obj2;
        if (abstractC4825e instanceof z4.w) {
            z4.w wVar2 = (z4.w) abstractC4825e;
            int i11 = wVar2.f51724k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar2.f51724k0 = i11 - Integer.MIN_VALUE;
                wVar = wVar2;
                Object obj3 = wVar.f51723j0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = wVar.f51724k0;
                obj = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                c5971a = (C5971a) wVar.f51719Y;
                                N.B0(obj3);
                                return c5971a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5971a = (C5971a) wVar.f51722i0;
                        String str9 = wVar.f51721h0;
                        String str10 = wVar.f51720Z;
                        context2 = (Context) wVar.f51719Y;
                        N.B0(obj3);
                        str6 = str9;
                        str5 = str10;
                        wVar.f51719Y = c5971a;
                        wVar.f51720Z = null;
                        wVar.f51721h0 = null;
                        wVar.f51722i0 = null;
                        wVar.f51724k0 = 3;
                        if (!c5971a.f47153f.isEmpty() && (n12 = Ad.l.n1(wVar, Q.f12906c, new z4.u(context2, c5971a, str5, str6, null))) == enumC5000a) {
                            obj = n12;
                        }
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return c5971a;
                    }
                    str8 = (String) wVar.f51722i0;
                    str5 = wVar.f51721h0;
                    str7 = wVar.f51720Z;
                    context3 = (Context) wVar.f51719Y;
                    N.B0(obj3);
                } else {
                    N.B0(obj3);
                    v4.p f02 = f0(context, sVar, str4);
                    wVar.f51719Y = context;
                    wVar.f51720Z = str;
                    wVar.f51721h0 = str2;
                    wVar.f51722i0 = str3;
                    wVar.f51724k0 = 1;
                    C1072l c1072l = new C1072l(1, AbstractC5260f.z(wVar));
                    c1072l.u();
                    f02.b(new z4.t(0, c1072l));
                    f02.a(new z4.t(1, c1072l));
                    obj3 = c1072l.t();
                    if (obj3 == enumC5000a) {
                        N.k0(wVar);
                    }
                    if (obj3 != enumC5000a) {
                        context3 = context;
                        str8 = str3;
                        str7 = str;
                        str5 = str2;
                    } else {
                        return enumC5000a;
                    }
                }
                c5971a2 = (C5971a) obj3;
                wVar.f51719Y = context3;
                wVar.f51720Z = str5;
                wVar.f51721h0 = str8;
                wVar.f51722i0 = c5971a2;
                wVar.f51724k0 = 2;
                if ((!c5971a2.f47151d.isEmpty()) || (obj2 = Ad.l.n1(wVar, Q.f12906c, new z4.v(context3, c5971a2, str7, null))) != enumC5000a) {
                    obj2 = obj;
                }
                if (obj2 == enumC5000a) {
                    context2 = context3;
                    str6 = str8;
                    c5971a = c5971a2;
                    wVar.f51719Y = c5971a;
                    wVar.f51720Z = null;
                    wVar.f51721h0 = null;
                    wVar.f51722i0 = null;
                    wVar.f51724k0 = 3;
                    if (!c5971a.f47153f.isEmpty()) {
                        obj = n12;
                    }
                    if (obj == enumC5000a) {
                    }
                    return c5971a;
                }
                return enumC5000a;
            }
        }
        wVar = new AbstractC5156c(abstractC4825e);
        Object obj32 = wVar.f51723j0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = wVar.f51724k0;
        obj = jf.y.f36177a;
        if (i10 == 0) {
        }
        c5971a2 = (C5971a) obj32;
        wVar.f51719Y = context3;
        wVar.f51720Z = str5;
        wVar.f51721h0 = str8;
        wVar.f51722i0 = c5971a2;
        wVar.f51724k0 = 2;
        if (!c5971a2.f47151d.isEmpty()) {
        }
        obj2 = obj;
        if (obj2 == enumC5000a) {
        }
    }

    public static final kotlinx.serialization.json.b k0(androidx.lifecycle.D d10, String str, String str2) {
        return d10.m(str, AbstractC2911k.b(str2));
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [Cf.c, Cf.a] */
    public static final long l(String str) {
        int i10;
        boolean z10;
        boolean z11;
        Mg.d dVar;
        int length = str.length();
        if (length != 0) {
            Mg.a aVar = Mg.b.f12127Z;
            char charAt = str.charAt(0);
            if (charAt == '+' || charAt == '-') {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && Lg.n.J2(str, '-')) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (length > i10) {
                if (str.charAt(i10) == 'P') {
                    int i11 = i10 + 1;
                    if (i11 != length) {
                        Mg.d dVar2 = null;
                        long j6 = 0;
                        boolean z12 = false;
                        while (i11 < length) {
                            if (str.charAt(i11) == 'T') {
                                if (!z12 && (i11 = i11 + 1) != length) {
                                    z12 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i12 = i11;
                                while (i12 < str.length()) {
                                    char charAt2 = str.charAt(i12);
                                    if (!new Cf.a('0', '9').r(charAt2) && !Lg.n.a2("+-.", charAt2)) {
                                        break;
                                    }
                                    i12++;
                                }
                                String substring = str.substring(i11, i12);
                                AbstractC3557B.b0("substring(...)", substring);
                                if (substring.length() != 0) {
                                    int length2 = substring.length() + i11;
                                    if (length2 >= 0 && length2 <= Lg.n.g2(str)) {
                                        char charAt3 = str.charAt(length2);
                                        int i13 = length2 + 1;
                                        if (!z12) {
                                            if (charAt3 == 'D') {
                                                dVar = Mg.d.f12137l0;
                                            } else {
                                                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                                            }
                                        } else if (charAt3 == 'H') {
                                            dVar = Mg.d.f12136k0;
                                        } else if (charAt3 == 'M') {
                                            dVar = Mg.d.f12135j0;
                                        } else if (charAt3 == 'S') {
                                            dVar = Mg.d.f12134i0;
                                        } else {
                                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                        }
                                        if (dVar2 != null && dVar2.compareTo(dVar) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int k22 = Lg.n.k2(substring, '.', 0, false, 6);
                                        if (dVar == Mg.d.f12134i0 && k22 > 0) {
                                            String substring2 = substring.substring(0, k22);
                                            AbstractC3557B.b0("substring(...)", substring2);
                                            long i14 = Mg.b.i(j6, y0(i0(substring2), dVar));
                                            String substring3 = substring.substring(k22);
                                            AbstractC3557B.b0("substring(...)", substring3);
                                            j6 = Mg.b.i(i14, w0(Double.parseDouble(substring3), dVar));
                                        } else {
                                            j6 = Mg.b.i(j6, y0(i0(substring), dVar));
                                        }
                                        dVar2 = dVar;
                                        i11 = i13;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                        if (z11) {
                            return Mg.b.o(j6);
                        }
                        return j6;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final void l0(androidx.lifecycle.D d10, String str, Boolean bool) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
        d10.m(str, new C2918r(bool, false, null));
    }

    public static final String m(Type type) {
        String str;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                Kg.k c12 = Kg.p.c1(type, G.f3633Y);
                str = ((Class) Kg.m.m1(c12)).getName() + Lg.n.y2(Kg.m.f1(c12), "[]");
            } else {
                str = cls.getName();
            }
            AbstractC3557B.Z(str);
            return str;
        }
        return type.toString();
    }

    public static final void m0(androidx.lifecycle.D d10, String str, Number number) {
        d10.m(str, AbstractC2911k.a(number));
    }

    public static final void n(Fe.x xVar, Fe.w wVar) {
        AbstractC3557B.c0("<this>", xVar);
        AbstractC3557B.c0("builder", wVar);
        for (Map.Entry entry : wVar.a()) {
            xVar.e((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J0.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [R1.c, R1.b] */
    public static R1.b n0(MappedByteBuffer mappedByteBuffer) {
        long j6;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        ?? obj = new Object();
        obj.f8729Y = duplicate;
        duplicate.order(ByteOrder.BIG_ENDIAN);
        obj.Q(4);
        int i10 = ((ByteBuffer) obj.f8729Y).getShort() & 65535;
        if (i10 <= 100) {
            obj.Q(6);
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    int i12 = ((ByteBuffer) obj.f8729Y).getInt();
                    obj.Q(4);
                    j6 = obj.P();
                    obj.Q(4);
                    if (1835365473 == i12) {
                        break;
                    }
                    i11++;
                } else {
                    j6 = -1;
                    break;
                }
            }
            if (j6 != -1) {
                obj.Q((int) (j6 - ((ByteBuffer) obj.f8729Y).position()));
                obj.Q(12);
                long P = obj.P();
                for (int i13 = 0; i13 < P; i13++) {
                    int i14 = ((ByteBuffer) obj.f8729Y).getInt();
                    long P10 = obj.P();
                    obj.P();
                    if (1164798569 == i14 || 1701669481 == i14) {
                        duplicate.position((int) (P10 + j6));
                        ?? cVar = new R1.c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        cVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final z4.q o0(z4.r rVar, AbstractC1725n abstractC1725n) {
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1248473602);
        B.B0 b02 = new B.B0(4, null);
        Context context = (Context) rVar2.m(H0.Z.f6888b);
        rVar2.W(1388713885);
        boolean g10 = rVar2.g(rVar);
        Object K10 = rVar2.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (g10 || K10 == iVar) {
            K10 = AbstractC4828h.Z(new z4.q(), o1.f22665a);
            rVar2.h0(K10);
        }
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar2.t(false);
        rVar2.W(1388714176);
        boolean g11 = rVar2.g(rVar) | rVar2.g("__LottieInternalDefaultCacheKey__");
        Object K11 = rVar2.K();
        if (g11 || K11 == iVar) {
            K11 = f0(context, rVar, "__LottieInternalDefaultCacheKey__");
            rVar2.h0(K11);
        }
        v4.p pVar = (v4.p) K11;
        rVar2.t(false);
        AbstractC1734s.d(rVar, "__LottieInternalDefaultCacheKey__", new z4.x(b02, context, rVar, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", abstractC1710f0, null), rVar2);
        z4.q qVar = (z4.q) abstractC1710f0.getValue();
        rVar2.t(false);
        return qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if ((!r8) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:26:0x0062). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(B0.N n10, AbstractC4825e abstractC4825e) {
        M0 m02;
        int i10;
        boolean z10;
        if (abstractC4825e instanceof M0) {
            M0 m03 = (M0) abstractC4825e;
            int i11 = m03.f1130h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m03.f1130h0 = i11 - Integer.MIN_VALUE;
                m02 = m03;
                Object obj = m02.f1129Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = m02.f1130h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        B0.N n11 = m02.f1128Y;
                        N.B0(obj);
                        n10 = n11;
                        List list = ((C0194k) obj).f1652a;
                        int size = list.size();
                        int i12 = 0;
                        while (i12 < size) {
                            if (((B0.u) list.get(i12)).f1673d) {
                                EnumC0195l enumC0195l = EnumC0195l.f1658h0;
                                m02.f1128Y = n10;
                                m02.f1130h0 = 1;
                                obj = n10.c(enumC0195l, m02);
                                n10 = n10;
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                List list2 = ((C0194k) obj).f1652a;
                                int size2 = list2.size();
                                int i122 = 0;
                                while (i122 < size2) {
                                }
                            } else {
                                i122++;
                            }
                        }
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                List list3 = n10.f1614j0.f1619u0.f1652a;
                int size3 = list3.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        if (((B0.u) list3.get(i13)).f1673d) {
                            z10 = true;
                            break;
                        }
                        i13++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        m02 = new AbstractC5156c(abstractC4825e);
        Object obj2 = m02.f1129Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = m02.f1130h0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        t0(r1, r12, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r13[r5] = g0(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int p0(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int v02 = M3.H.v0(obj);
        int i11 = v02 & i10;
        int s02 = s0(i11, obj3);
        if (s02 == 0) {
            return -1;
        }
        int i12 = ~i10;
        int i13 = v02 & i12;
        int i14 = -1;
        while (true) {
            int i15 = s02 - 1;
            int i16 = iArr[i15];
            if ((i16 & i12) != i13 || !M3.H.O(obj, objArr[i15]) || (objArr2 != null && !M3.H.O(obj2, objArr2[i15]))) {
                int i17 = i16 & i10;
                if (i17 == 0) {
                    return -1;
                }
                i14 = i15;
                s02 = i17;
            }
        }
    }

    public static final Object q(B0.A a5, wf.n nVar, AbstractC4825e abstractC4825e) {
        Object A02 = ((B0.P) a5).A0(new N0(null, abstractC4825e.getContext(), nVar), abstractC4825e);
        if (A02 == EnumC5000a.f41328Y) {
            return A02;
        }
        return jf.y.f36177a;
    }

    public static final Resources q0(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.m(H0.Z.f6887a);
        return ((Context) rVar.m(H0.Z.f6888b)).getResources();
    }

    public static final String r(String str) {
        AbstractC3557B.c0("<this>", str);
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            AbstractC3557B.b0("substring(...)", substring);
            return upperCase + substring;
        }
        return str;
    }

    public static final KSerializer r0(gh.d dVar, w wVar, boolean z10) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        Object obj;
        AbstractC0405d c10 = AbstractC2704h0.c(wVar);
        boolean a5 = wVar.a();
        List<z> c11 = wVar.c();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(c11, 10));
        for (z zVar : c11) {
            AbstractC3557B.c0("<this>", zVar);
            w wVar2 = zVar.f3650b;
            if (wVar2 != null) {
                arrayList.add(wVar2);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + wVar2).toString());
            }
        }
        if (arrayList.isEmpty()) {
            C2715q c2715q = AbstractC2002m.f24213a;
            AbstractC3557B.c0("clazz", c10);
            if (!a5) {
                kSerializer = AbstractC2002m.f24213a.a(c10);
                if (kSerializer == null) {
                    kSerializer = null;
                }
            } else {
                kSerializer = AbstractC2002m.f24214b.a(c10);
            }
        } else {
            C2715q c2715q2 = AbstractC2002m.f24213a;
            AbstractC3557B.c0("clazz", c10);
            if (!a5) {
                obj = AbstractC2002m.f24215c.a(c10, arrayList);
            } else {
                obj = AbstractC2002m.f24216d.a(c10, arrayList);
            }
            if (obj instanceof C3960j) {
                obj = null;
            }
            kSerializer = (KSerializer) obj;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            kSerializer2 = dVar.a(c10, kf.v.f37483Y);
        } else {
            ArrayList H12 = Bi.c.H1(dVar, arrayList, z10);
            if (H12 == null) {
                return null;
            }
            KSerializer u12 = Bi.c.u1(c10, H12, new H.H(8, arrayList));
            if (u12 == null) {
                kSerializer2 = dVar.a(c10, H12);
            } else {
                kSerializer2 = u12;
            }
        }
        if (kSerializer2 == null) {
            return null;
        }
        if (a5) {
            kSerializer2 = A7.b.U0(kSerializer2);
        }
        return kSerializer2;
    }

    public static final Fe.k s(String str) {
        AbstractC3557B.c0("<this>", str);
        return new Fe.k(str);
    }

    public static int s0(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    public static final AbstractC1710f0 t(D.l lVar, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        Object i11 = AbstractC6463a.i(rVar, -1692965168, -492369756);
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (i11 == iVar) {
            i11 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            rVar.h0(i11);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) i11;
        rVar.W(1523189838);
        boolean g10 = rVar.g(lVar) | rVar.g(abstractC1710f0);
        Object K10 = rVar.K();
        if (g10 || K10 == iVar) {
            K10 = new D.r(lVar, abstractC1710f0, null);
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC1734s.e(lVar, (wf.n) K10, rVar);
        rVar.t(false);
        return abstractC1710f0;
    }

    public static void t0(int i10, Object obj, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static final Object u(AbstractC4825e abstractC4825e, AbstractC6216a abstractC6216a, wf.o oVar, AbstractC1207j abstractC1207j, AbstractC1206i[] abstractC1206iArr) {
        Rg.u uVar = new Rg.u(null, abstractC6216a, oVar, abstractC1207j, abstractC1206iArr);
        Sg.y yVar = new Sg.y(abstractC4825e, abstractC4825e.getContext());
        Object e12 = Ad.l.e1(yVar, yVar, uVar);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (e12 == enumC5000a) {
            N.k0(abstractC4825e);
        }
        if (e12 == enumC5000a) {
            return e12;
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable u0(io.ktor.utils.io.x xVar, AbstractC4825e abstractC4825e) {
        Fe.h hVar;
        int i10;
        if (abstractC4825e instanceof Fe.h) {
            Fe.h hVar2 = (Fe.h) abstractC4825e;
            int i11 = hVar2.f5325Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar2.f5325Z = i11 - Integer.MIN_VALUE;
                hVar = hVar2;
                Object obj = hVar.f5324Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f5325Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    hVar.f5325Z = 1;
                    obj = AbstractC3557B.o2(xVar, hVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return N.l0((Me.d) obj);
            }
        }
        hVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = hVar.f5324Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f5325Z;
        if (i10 == 0) {
        }
        return N.l0((Me.d) obj2);
    }

    public static final Type v(w wVar, boolean z10) {
        Class cls;
        int i10;
        AbstractC0406e e10 = wVar.e();
        if (e10 instanceof x) {
            return new E((x) e10);
        }
        if (e10 instanceof AbstractC0405d) {
            AbstractC0405d abstractC0405d = (AbstractC0405d) e10;
            if (z10) {
                cls = R4.b.l1(abstractC0405d);
            } else {
                cls = R4.b.k1(abstractC0405d);
            }
            List c10 = wVar.c();
            if (c10.isEmpty()) {
                return cls;
            }
            if (cls.isArray()) {
                if (cls.getComponentType().isPrimitive()) {
                    return cls;
                }
                z zVar = (z) kf.t.D2(c10);
                if (zVar != null) {
                    A a5 = zVar.f3649a;
                    if (a5 == null) {
                        i10 = -1;
                    } else {
                        i10 = F.f3632a[a5.ordinal()];
                    }
                    if (i10 != -1 && i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            throw new RuntimeException();
                        }
                        w wVar2 = zVar.f3650b;
                        AbstractC3557B.Z(wVar2);
                        Type v10 = v(wVar2, false);
                        if (!(v10 instanceof Class)) {
                            return new C0402a(v10);
                        }
                        return cls;
                    }
                    return cls;
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + wVar);
            }
            return z(cls, c10);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + wVar);
    }

    public static final char[] v0(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
        }
        return cArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Cf.i, Cf.l] */
    public static final long w0(double d10, Mg.d dVar) {
        AbstractC3557B.c0("unit", dVar);
        double v02 = A7.b.v0(d10, dVar, Mg.d.f12132Z);
        if (!Double.isNaN(v02)) {
            long Z02 = AbstractC4344b.Z0(v02);
            if (new Cf.i(-4611686018426999999L, 4611686018426999999L).r(Z02)) {
                return D(Z02);
            }
            return C(AbstractC4344b.Z0(A7.b.v0(d10, dVar, Mg.d.f12133h0)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final void x(io.ktor.utils.io.x xVar, io.ktor.utils.io.t tVar, io.ktor.utils.io.t tVar2) {
        AbstractC3557B.c0("<this>", xVar);
        AbstractC3557B.c0("first", tVar);
        Ad.l.O0(C1059e0.f12936Y, Q.f12905b, null, new Fe.d(xVar, tVar, tVar2, null), 2).V(new Oc.c(tVar, 13, tVar2));
    }

    public static final long x0(int i10, Mg.d dVar) {
        AbstractC3557B.c0("unit", dVar);
        if (dVar.compareTo(Mg.d.f12134i0) <= 0) {
            return D(A7.b.x0(i10, dVar, Mg.d.f12132Z));
        }
        return y0(i10, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Q1.y, Q1.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Q1.y y(Context context) {
        C1175c c1175c;
        ProviderInfo providerInfo;
        q.r rVar;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            c1175c = new C1175c();
        } else {
            c1175c = new C1175c();
        }
        PackageManager packageManager = context.getPackageManager();
        R4.b.U(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (it.hasNext()) {
                providerInfo = it.next().providerInfo;
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                    break;
                }
            } else {
                providerInfo = null;
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] F10 = c1175c.F(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : F10) {
                    arrayList.add(signature.toByteArray());
                }
                rVar = new q.r(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                AbstractC3612c.a("emoji2.text.DefaultEmojiConfig", EnumC3642e1.ERROR, null, e10);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
            }
            if (rVar != null) {
                return null;
            }
            return new AbstractC1180h(new Q1.x(context, rVar));
        }
        rVar = null;
        if (rVar != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Cf.i, Cf.l] */
    public static final long y0(long j6, Mg.d dVar) {
        AbstractC3557B.c0("unit", dVar);
        Mg.d dVar2 = Mg.d.f12132Z;
        long x02 = A7.b.x0(4611686018426999999L, dVar2, dVar);
        if (new Cf.i(-x02, x02).r(j6)) {
            return D(A7.b.x0(j6, dVar, dVar2));
        }
        return B(N.q(A7.b.w0(j6, dVar, Mg.d.f12133h0), -4611686018427387903L, 4611686018427387903L));
    }

    public static final D z(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(P((z) it.next()));
            }
            return new D(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(P((z) it2.next()));
            }
            return new D(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            D z10 = z(declaringClass, list.subList(length, list.size()));
            List<z> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(subList, 10));
            for (z zVar : subList) {
                arrayList3.add(P(zVar));
            }
            return new D(cls, z10, arrayList3);
        }
    }

    public static final String z0(String str) {
        AbstractC3557B.c0("<this>", str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public LinkedHashMap Y(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((l1) entry.getKey()).getName(), entry.getValue());
        }
        HashMap b10 = b(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (l1 l1Var : linkedHashMap.keySet()) {
            linkedHashMap3.put(l1Var, b10.get(l1Var.getName()));
        }
        return linkedHashMap3;
    }

    public abstract u7.m o(TimeUnit timeUnit);
}
