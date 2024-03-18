package r;

import A.AbstractC0044t0;
import Ad.g;
import Bg.A;
import Bg.D;
import Bg.m0;
import Cd.AbstractC0324i;
import Cd.B;
import Cd.F;
import Cd.X;
import Df.AbstractC0405d;
import Df.AbstractC0406e;
import Df.w;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E0.d0;
import Fd.z;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Gf.A0;
import H0.E0;
import H0.Z;
import K4.J;
import Lc.l;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.C;
import Mf.G;
import Mf.H;
import Mf.L;
import Mf.P;
import Mf.f0;
import Mf.h0;
import Mf.i0;
import N0.E;
import Ng.C1059e0;
import Ng.Q;
import Pf.AbstractC1146d;
import Pf.I;
import Pf.c0;
import Qd.i;
import Qg.F0;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.o1;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.SystemClock;
import androidx.lifecycle.e0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import gb.l0;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import io.sentry.C3636c1;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import jf.C3959i;
import jf.y;
import k6.AbstractC4194d;
import kf.s;
import kf.v;
import kg.C4291c;
import kg.C4294f;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import l8.AbstractC4344b;
import lc.C4385I;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import ng.AbstractC4842i;
import of.EnumC5000a;
import p2.M;
import pf.AbstractC5156c;
import q1.AbstractC5260f;
import qe.C5313e;
import qe.p;
import r0.N;
import r0.r;
import rg.AbstractC5493d;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;
import v0.m;
import v0.n;
import v0.u;
import we.C6213a;
import wf.AbstractC6216a;
import wf.k;
import wf.o;
import y.AbstractC6463a;
import y.C6477o;
import yf.AbstractC6583a;
import ze.AbstractC6844c;
import ze.AbstractC6846e;
import ze.AbstractC6847f;
import ze.AbstractC6848g;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static C5953f f44157a;

    /* renamed from: b  reason: collision with root package name */
    public static C5953f f44158b;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f44159c;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f44160d;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f44161e;

    public static Date A() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f34790a).getTime();
    }

    public static Date B(long j6) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f34790a);
        calendar.setTimeInMillis(j6);
        return calendar.getTime();
    }

    public static Date C(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(R.a.r("timestamp is not ISO format ", str));
        }
    }

    public static Date D(String str) {
        try {
            return B(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format ".concat(str));
        }
    }

    public static final A E(AbstractC0994c abstractC0994c) {
        AbstractC0997f abstractC0997f;
        AbstractC1146d Z10 = abstractC0994c.Z();
        AbstractC1146d W6 = abstractC0994c.W();
        if (Z10 != null) {
            return Z10.getType();
        }
        if (W6 != null) {
            if (abstractC0994c instanceof AbstractC1002k) {
                return W6.getType();
            }
            AbstractC1003l mo20k = abstractC0994c.mo20k();
            if (mo20k instanceof AbstractC0997f) {
                abstractC0997f = (AbstractC0997f) mo20k;
            } else {
                abstractC0997f = null;
            }
            if (abstractC0997f != null) {
                return abstractC0997f.n();
            }
        }
        return null;
    }

    public static final Method F(Class cls, AbstractC0994c abstractC0994c) {
        AbstractC3557B.c0("descriptor", abstractC0994c);
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            AbstractC3557B.Z(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new l("No unbox method found in inline class: " + cls + " (calling " + abstractC0994c + ')', 3);
        }
    }

    public static final C5953f G() {
        C5953f c5953f = f44159c;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        N n10 = new N(r.f44254b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(7.41f, 8.59f));
        arrayList.add(new m(12.0f, 13.17f));
        arrayList.add(new u(4.59f, -4.58f));
        arrayList.add(new m(18.0f, 10.0f));
        arrayList.add(new u(-6.0f, 6.0f));
        arrayList.add(new u(-6.0f, -6.0f));
        arrayList.add(new u(1.41f, -1.41f));
        arrayList.add(C5957j.f46979c);
        C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f44159c = c10;
        return c10;
    }

    public static final ArrayList H(D d10) {
        ArrayList I10 = I(J.i(d10));
        if (I10 != null) {
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(I10, 10));
            Iterator it = I10.iterator();
            while (it.hasNext()) {
                arrayList.add("unbox-impl-" + ((String) it.next()));
            }
            AbstractC1000i k10 = d10.y0().k();
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", k10);
            Class k11 = A0.k((AbstractC0997f) k10);
            AbstractC3557B.Z(k11);
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(k11.getDeclaredMethod((String) it2.next(), new Class[0]));
            }
            return arrayList2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList I(D d10) {
        ?? r32;
        C c10 = null;
        if (!AbstractC4842i.g(d10)) {
            return null;
        }
        AbstractC1000i k10 = d10.y0().k();
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", k10);
        int i10 = AbstractC5493d.f44985a;
        f0 j02 = ((AbstractC0997f) k10).j0();
        if (j02 instanceof C) {
            c10 = (C) j02;
        }
        AbstractC3557B.Z(c10);
        ArrayList arrayList = new ArrayList();
        for (C3959i c3959i : c10.f12056a) {
            C4294f c4294f = (C4294f) c3959i.f36155Y;
            ArrayList I10 = I((D) c3959i.f36156Z);
            if (I10 != null) {
                r32 = new ArrayList(AbstractC6583a.H1(I10, 10));
                Iterator it = I10.iterator();
                while (it.hasNext()) {
                    r32.add(c4294f.c() + '-' + ((String) it.next()));
                }
            } else {
                r32 = AbstractC4344b.F0(c4294f.c());
            }
            s.N1(r32, arrayList);
        }
        return arrayList;
    }

    public static final int J(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
            return i11;
        } else if (i12 < 0) {
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i11 + i19;
            }
            return i11;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static String K(Date date) {
        int i10;
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.f34790a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = io.sentry.vendor.gson.internal.bind.util.a.f34790a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        if (timeZone2.getRawOffset() == 0) {
            i10 = 1;
        } else {
            i10 = 6;
        }
        StringBuilder sb2 = new StringBuilder(23 + i10);
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(1), 4);
        char c10 = '-';
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int abs = Math.abs(i11 / 60);
            int abs2 = Math.abs(i11 % 60);
            if (offset >= 0) {
                c10 = '+';
            }
            sb2.append(c10);
            io.sentry.vendor.gson.internal.bind.util.a.b(sb2, abs, 2);
            sb2.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static final boolean L(H h10, C4291c c4291c) {
        AbstractC3557B.c0("<this>", h10);
        AbstractC3557B.c0("fqName", c4291c);
        if (h10 instanceof L) {
            return ((L) h10).b(c4291c);
        }
        return R(h10, c4291c).isEmpty();
    }

    public static void M(i iVar, String str) {
        AbstractC3557B.c0("<this>", iVar);
        AbstractC3557B.c0("message", str);
        AbstractC2469q0.q("kind", 3);
        AbstractC3557B.s2(i.Companion, str, 3);
    }

    public static final float N(float f6, float f10, float f11) {
        return (f10 * f11) + ((1 - f11) * f6);
    }

    public static final float[] O(byte[] bArr) {
        AbstractC3557B.c0("buffer", bArr);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        int length = bArr.length / 2;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = order.getShort() / 32767.0f;
        }
        return fArr;
    }

    public static final io.ktor.utils.io.u P(x xVar, AbstractC4831k abstractC4831k, Long l10, o oVar) {
        AbstractC3557B.c0("<this>", xVar);
        AbstractC3557B.c0("context", abstractC4831k);
        AbstractC3557B.c0("listener", oVar);
        return R4.b.r2(C1059e0.f12936Y, abstractC4831k, true, new C6213a(l10, xVar, oVar, null)).f33364Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Type inference failed for: r0v10, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [io.ktor.utils.io.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(AbstractC6848g abstractC6848g, t tVar, AbstractC4825e abstractC4825e) {
        qe.o oVar;
        int i10;
        t tVar2;
        C5313e c5313e;
        if (abstractC4825e instanceof qe.o) {
            qe.o oVar2 = (qe.o) abstractC4825e;
            int i11 = oVar2.f44127i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar2.f44127i0 = i11 - Integer.MIN_VALUE;
                oVar = oVar2;
                Object obj = oVar.f44126h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = oVar.f44127i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ?? r62 = oVar.f44125Z;
                        abstractC6848g = oVar.f44124Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        tVar2 = r62;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (abstractC6848g instanceof AbstractC6844c) {
                        byte[] e10 = ((AbstractC6844c) abstractC6848g).e();
                        oVar.f44124Y = abstractC6848g;
                        oVar.f44125Z = tVar;
                        oVar.f44127i0 = 1;
                        Object T02 = P4.a.T0(tVar, e10, oVar);
                        tVar2 = tVar;
                        if (T02 == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        if (abstractC6848g instanceof AbstractC6846e) {
                            t b10 = b();
                            Df.H.x(((AbstractC6846e) abstractC6848g).e(), tVar, b10);
                            c5313e = new C5313e(abstractC6848g, b10);
                        } else if (abstractC6848g instanceof AbstractC6847f) {
                            t b11 = b();
                            Df.H.x(R4.b.r2(C1059e0.f12936Y, Q.f12904a, false, new p((AbstractC6847f) abstractC6848g, null)).f33364Z, tVar, b11);
                            c5313e = new C5313e(abstractC6848g, b11);
                        } else {
                            P4.a.y(tVar);
                            return abstractC6848g;
                        }
                        return c5313e;
                    }
                }
                P4.a.y(tVar2);
                return abstractC6848g;
            }
        }
        oVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = oVar.f44126h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = oVar.f44127i0;
        if (i10 == 0) {
        }
        P4.a.y(tVar2);
        return abstractC6848g;
    }

    public static final ArrayList R(H h10, C4291c c4291c) {
        AbstractC3557B.c0("<this>", h10);
        AbstractC3557B.c0("fqName", c4291c);
        ArrayList arrayList = new ArrayList();
        m(h10, c4291c, arrayList);
        return arrayList;
    }

    public static final void U(Me.d dVar, ByteBuffer byteBuffer) {
        AbstractC3557B.c0("<this>", dVar);
        while (true) {
            if (byteBuffer.hasRemaining()) {
                Ne.c k10 = dVar.k();
                if (dVar.f12037j0 - dVar.f12036i0 < 1) {
                    k10 = dVar.p(1, k10);
                }
                if (k10 == null) {
                    break;
                }
                int remaining = byteBuffer.remaining();
                int i10 = k10.f12023c - k10.f12022b;
                if (remaining >= i10) {
                    com.google.android.gms.internal.play_billing.N.m0(k10, byteBuffer, i10);
                    dVar.O(k10);
                } else {
                    com.google.android.gms.internal.play_billing.N.m0(k10, byteBuffer, remaining);
                    dVar.f12036i0 = k10.f12022b;
                    break;
                }
            } else {
                break;
            }
        }
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + byteBuffer.remaining() + " more bytes required");
    }

    public static final void V(Tf.c cVar, Tf.d dVar, G g10, C4294f c4294f) {
        AbstractC3557B.c0("<this>", cVar);
        AbstractC3557B.c0("scopeOwner", g10);
        AbstractC3557B.c0("name", c4294f);
        ((I) g10).f14010j0.b();
        AbstractC3557B.b0("asString(...)", c4294f.b());
    }

    public static final ByteBuffer W(ByteBuffer byteBuffer, int i10, int i11) {
        AbstractC3557B.c0("<this>", byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        AbstractC3557B.b0("myDuplicate$lambda$1", duplicate);
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer slice = duplicate.slice();
        AbstractC3557B.b0("mySlice$lambda$2", slice);
        return slice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Hi.d] */
    public static List X(List list) {
        long j6;
        ComponentName componentName;
        Intent intent;
        int i10;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = null;
                try {
                    ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it.next()).getTaskInfo();
                    try {
                        String obj = taskInfo.toString();
                        AbstractC3557B.b0("taskInfo.toString()", obj);
                        j6 = SystemClock.elapsedRealtime() - Long.parseLong(Lg.n.Q2(Lg.n.O2(obj, "lastActiveTime=", ""), Separators.SP, ""));
                    } catch (NumberFormatException unused) {
                        j6 = 0;
                    }
                    componentName = taskInfo.topActivity;
                    if (componentName != null) {
                        str = componentName.toShortString();
                    }
                    intent = taskInfo.baseIntent;
                    String intent2 = intent.toString();
                    i10 = taskInfo.numActivities;
                    str = new Hi.d(str, Long.valueOf(j6), Integer.valueOf(i10), intent2);
                } catch (IllegalArgumentException unused2) {
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
        return v.f37483Y;
    }

    public static final Class Y(A a5) {
        Class Z10 = Z(a5.y0().k());
        if (Z10 == null) {
            return null;
        }
        if (!m0.f(a5)) {
            return Z10;
        }
        D h10 = AbstractC4842i.h(a5);
        if (h10 == null || m0.f(h10) || Jf.l.F(h10)) {
            return null;
        }
        return Z10;
    }

    public static final Class Z(AbstractC1003l abstractC1003l) {
        if ((abstractC1003l instanceof AbstractC0997f) && AbstractC4842i.b(abstractC1003l)) {
            AbstractC0997f abstractC0997f = (AbstractC0997f) abstractC1003l;
            Class k10 = A0.k(abstractC0997f);
            if (k10 == null) {
                throw new l("Class object for the class " + abstractC0997f.getName() + " cannot be found (classId=" + AbstractC5493d.f((AbstractC1000i) abstractC1003l) + ')', 3);
            }
            return k10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Tc.f fVar, k kVar, AbstractC4326r abstractC4326r, Fd.v vVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Fd.v vVar2;
        AbstractC1710f0 T;
        Z9.a X02;
        g y02;
        C1741v0 v10;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("appState", fVar);
        AbstractC3557B.c0("onDismiss", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("AssistantScreen");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(270011805);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    vVar2 = vVar;
                    if (rVar.g(vVar2)) {
                        i13 = 2048;
                        i12 |= i13;
                    }
                } else {
                    vVar2 = vVar;
                }
                i13 = 1024;
                i12 |= i13;
            } else {
                vVar2 = vVar;
            }
            if ((i12 & 5851) != 1170 && rVar.B()) {
                rVar.P();
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                } else {
                    if (i17 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if ((i11 & 8) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar3 = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b10 = d10.b(Fd.v.class);
                            AbstractC0405d b11 = d10.b(Fd.u.class);
                            AbstractC4326r abstractC4326r3 = abstractC4326r2;
                            rVar.W(608026872);
                            boolean g10 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar3) | rVar.h(booleanValue);
                            Object K10 = rVar.K();
                            if (g10 || K10 == C1723m.f22654Y) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(Fd.u.class), d10.b(Fd.v.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(Fd.v.class), a10, vVar3, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K10 = y02;
                                rVar.h0(K10);
                            }
                            rVar.t(false);
                            rVar.t(false);
                            abstractC4326r2 = abstractC4326r3;
                            vVar2 = (Fd.v) ((g) K10);
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    }
                }
                rVar.u();
                T = Ad.l.T(vVar2.f808e, Fd.c.f5240h0, rVar);
                AbstractC1734s.e((Boolean) T.getValue(), new Fd.m((Context) rVar.m(Z.f6888b), (AbstractActivityC4532l) rVar.m(p9.m.f42797a), T, null), rVar);
                if (AbstractC3557B.K((Boolean) T.getValue(), Boolean.FALSE) && (X02 = Ad.l.X0(null, rVar, 1)) != null) {
                    AbstractC3256b.a(new Object[]{X02}, R4.b.X(rVar, 1854126806, new N.D((Object) fVar, kVar, abstractC4326r2, 26)), rVar, 56);
                }
            }
            AbstractC4326r abstractC4326r4 = abstractC4326r2;
            Fd.v vVar4 = vVar2;
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new Gd.b(fVar, kVar, abstractC4326r4, vVar4, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i17 != 0) {
        }
        if ((i11 & 8) == 0) {
        }
        rVar.u();
        T = Ad.l.T(vVar2.f808e, Fd.c.f5240h0, rVar);
        AbstractC1734s.e((Boolean) T.getValue(), new Fd.m((Context) rVar.m(Z.f6888b), (AbstractActivityC4532l) rVar.m(p9.m.f42797a), T, null), rVar);
        if (AbstractC3557B.K((Boolean) T.getValue(), Boolean.FALSE)) {
            AbstractC3256b.a(new Object[]{X02}, R4.b.X(rVar, 1854126806, new N.D((Object) fVar, kVar, abstractC4326r2, 26)), rVar, 56);
        }
        AbstractC4326r abstractC4326r42 = abstractC4326r2;
        Fd.v vVar42 = vVar2;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final double a0(long j6) {
        return ((j6 >>> 11) * 2048) + (j6 & 2047);
    }

    public static t b() {
        return new t(false, io.ktor.utils.io.internal.f.f33454c, 8);
    }

    public static int b0(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Tc.f fVar, k kVar, AbstractC4326r abstractC4326r, Cd.J j6, Fd.v vVar, gb.m0 m0Var, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Cd.J j10;
        Fd.v vVar2;
        gb.m0 m0Var2;
        gb.m0 m0Var3;
        Fd.v vVar3;
        Cd.J j11;
        AbstractC4326r abstractC4326r3;
        Z.r rVar;
        int i13;
        io.sentry.hints.i iVar;
        C4323o c4323o;
        String str;
        Cd.J j12;
        AbstractC4326r abstractC4326r4;
        Fd.v vVar4;
        gb.m0 m0Var4;
        int i14;
        Object K10;
        boolean z10;
        gb.m0 m0Var5;
        boolean z11;
        ?? r32;
        androidx.compose.foundation.layout.b bVar;
        Fd.v vVar5;
        Object[] objArr;
        AbstractC4326r abstractC4326r5;
        Cd.J j13;
        Fd.v vVar6;
        g y02;
        g y03;
        g y04;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C4323o c4323o2 = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("AssistantScreenContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1079885821);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(fVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.i(kVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    j10 = j6;
                    if (rVar2.g(j10)) {
                        i17 = 2048;
                        i12 |= i17;
                    }
                } else {
                    j10 = j6;
                }
                i17 = 1024;
                i12 |= i17;
            } else {
                j10 = j6;
            }
            if ((i10 & 57344) != 0) {
                if ((i11 & 16) == 0) {
                    vVar2 = vVar;
                    if (rVar2.g(vVar2)) {
                        i16 = 16384;
                        i12 |= i16;
                    }
                } else {
                    vVar2 = vVar;
                }
                i16 = 8192;
                i12 |= i16;
            } else {
                vVar2 = vVar;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    m0Var2 = m0Var;
                    if (rVar2.g(m0Var2)) {
                        i15 = 131072;
                        i12 |= i15;
                    }
                } else {
                    m0Var2 = m0Var;
                }
                i15 = 65536;
                i12 |= i15;
            } else {
                m0Var2 = m0Var;
            }
            if ((i12 & 374491) != 74898 && rVar2.B()) {
                rVar2.P();
                rVar = rVar2;
                abstractC4326r3 = abstractC4326r2;
                j11 = j10;
                vVar3 = vVar2;
                m0Var3 = m0Var2;
            } else {
                rVar2.R();
                i13 = i10 & 1;
                iVar = C1723m.f22654Y;
                if (i13 == 0 && !rVar2.A()) {
                    rVar2.P();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    str = "AssistantScreenContent";
                    c4323o = c4323o2;
                    i14 = i12;
                    abstractC4326r4 = abstractC4326r2;
                    j12 = j10;
                    vVar4 = vVar2;
                    m0Var4 = m0Var2;
                } else {
                    if (i21 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if ((i11 & 8) != 0) {
                        str = "AssistantScreenContent";
                        c4323o = c4323o2;
                        abstractC4326r5 = abstractC4326r2;
                    } else {
                        rVar2.W(-490350905);
                        Context context = (Context) rVar2.m(Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar2.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar2.m(Ad.k.f814a);
                        e0 a10 = m2.b.a(rVar2);
                        if (a10 != null) {
                            Ad.v vVar7 = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            abstractC4326r5 = abstractC4326r2;
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b10 = d10.b(Cd.J.class);
                            c4323o = c4323o2;
                            AbstractC0405d b11 = d10.b(X.class);
                            str = "AssistantScreenContent";
                            rVar2.W(608026872);
                            boolean g10 = rVar2.g(b10) | rVar2.g(b11) | rVar2.g(list) | rVar2.g(vVar7) | rVar2.h(booleanValue);
                            Object K11 = rVar2.K();
                            if (g10 || K11 == iVar) {
                                if (booleanValue) {
                                    y04 = AbstractC4344b.z0(d10.b(X.class), d10.b(Cd.J.class), context, list2);
                                } else if (!booleanValue) {
                                    y04 = AbstractC4344b.y0(d10.b(Cd.J.class), a10, vVar7, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K11 = y04;
                                rVar2.h0(K11);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            i12 &= -7169;
                            j10 = (Cd.J) ((g) K11);
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    }
                    if ((i11 & 16) == 0) {
                        rVar2.W(-490350905);
                        Context context2 = (Context) rVar2.m(Z.f6888b);
                        boolean booleanValue2 = ((Boolean) rVar2.m(E0.f6720a)).booleanValue();
                        List list3 = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list4 = (List) rVar2.m(Ad.k.f814a);
                        e0 a11 = m2.b.a(rVar2);
                        if (a11 != null) {
                            Ad.v vVar8 = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d11 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b12 = d11.b(Fd.v.class);
                            AbstractC0405d b13 = d11.b(Fd.u.class);
                            j13 = j10;
                            rVar2.W(608026872);
                            boolean g11 = rVar2.g(b12) | rVar2.g(b13) | rVar2.g(list3) | rVar2.g(vVar8) | rVar2.h(booleanValue2);
                            Object K12 = rVar2.K();
                            if (g11 || K12 == iVar) {
                                if (booleanValue2) {
                                    y03 = AbstractC4344b.z0(d11.b(Fd.u.class), d11.b(Fd.v.class), context2, list4);
                                } else if (!booleanValue2) {
                                    y03 = AbstractC4344b.y0(d11.b(Fd.v.class), a11, vVar8, list3);
                                } else {
                                    throw new RuntimeException();
                                }
                                K12 = y03;
                                rVar2.h0(K12);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            vVar6 = (Fd.v) ((g) K12);
                            i12 &= -57345;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        j13 = j10;
                        vVar6 = vVar;
                    }
                    if ((i11 & 32) == 0) {
                        rVar2.W(-490350905);
                        Context context3 = (Context) rVar2.m(Z.f6888b);
                        boolean booleanValue3 = ((Boolean) rVar2.m(E0.f6720a)).booleanValue();
                        List list5 = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list6 = (List) rVar2.m(Ad.k.f814a);
                        e0 a12 = m2.b.a(rVar2);
                        if (a12 != null) {
                            Ad.v vVar9 = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d12 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b14 = d12.b(gb.m0.class);
                            AbstractC0405d b15 = d12.b(l0.class);
                            rVar2.W(608026872);
                            boolean g12 = rVar2.g(b14) | rVar2.g(b15) | rVar2.g(list5) | rVar2.g(vVar9) | rVar2.h(booleanValue3);
                            Object K13 = rVar2.K();
                            if (g12 || K13 == iVar) {
                                if (booleanValue3) {
                                    y02 = AbstractC4344b.z0(d12.b(l0.class), d12.b(gb.m0.class), context3, list6);
                                } else if (!booleanValue3) {
                                    y02 = AbstractC4344b.y0(d12.b(gb.m0.class), a12, vVar9, list5);
                                } else {
                                    throw new RuntimeException();
                                }
                                K13 = y02;
                                rVar2.h0(K13);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            i12 &= -458753;
                            j12 = j13;
                            vVar4 = vVar6;
                            m0Var4 = (gb.m0) ((g) K13);
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        j12 = j13;
                        m0Var4 = m0Var;
                        vVar4 = vVar6;
                    }
                    i14 = i12;
                    abstractC4326r4 = abstractC4326r5;
                }
                rVar2.u();
                AbstractActivityC4532l abstractActivityC4532l = (AbstractActivityC4532l) rVar2.m(p9.m.f42797a);
                Context context4 = (Context) rVar2.m(Z.f6888b);
                X x10 = (X) AbstractC4828h.z(j12.f808e, rVar2).getValue();
                rVar2.W(488562916);
                K10 = rVar2.K();
                if (K10 == iVar) {
                    K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                    rVar2.h0(K10);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                rVar2.t(false);
                C4385I c4385i = new C4385I(x10, context4, abstractActivityC4532l, 5);
                int i22 = i14;
                AbstractC1734s.e(j12, new Fd.o(j12, fVar, context4, kVar, null), rVar2);
                AbstractC1734s.e(m0Var4, new Fd.r(vVar4, m0Var4, abstractActivityC4532l, j12, fVar, context4, null), rVar2);
                R4.b.u(new B(j12, 4), rVar2, 0);
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                rVar2.W(-1323940314);
                int i23 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i24 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                z10 = rVar2.f22696a instanceof AbstractC1707e;
                if (!z10) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar2, c10, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i23))) {
                        AbstractC6463a.q(i23, rVar2, i23, c0581j3);
                    }
                    AbstractC6463a.r(0, i24, new L0(rVar2), rVar2, 2058660585);
                    androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f24731a;
                    AbstractC4326r a13 = io.sentry.compose.b.a(str);
                    C4316h c4316h = C4310b.f37706s0;
                    AbstractC4326r a14 = AbstractC4194d.a((G0.X) a13, androidx.compose.foundation.layout.a.v(B0.I.a(androidx.compose.foundation.layout.e.f24739c, y.f36177a, new Fd.s(j12, abstractC1710f0, null)), 0.0f, 0.0f, 0.0f, p9.r.f42841e, 7));
                    rVar2.W(-483455358);
                    E0.N a15 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar2);
                    rVar2.W(-1323940314);
                    int i25 = rVar2.P;
                    AbstractC1732q0 p11 = rVar2.p();
                    C3288a i26 = androidx.compose.ui.layout.a.i(a14);
                    if (z10) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, a15, c0581j);
                        U3.f.n0(rVar2, p11, c0581j2);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i25))) {
                            AbstractC6463a.q(i25, rVar2, i25, c0581j3);
                        }
                        AbstractC6463a.r(0, i26, new L0(rVar2), rVar2, 2058660585);
                        E.A a16 = E.A.f3733a;
                        AbstractC4326r a17 = io.sentry.compose.b.a(str);
                        zc.Q q10 = (zc.Q) j12;
                        C4323o c4323o3 = c4323o;
                        AbstractC4326r P = AbstractC0044t0.P(a16, c4323o3);
                        F0 f02 = j12.f808e;
                        Ad.l.z(f02, q10.f51867s, q10.f51866r, P, 0, rVar2, 584, 16);
                        AbstractC3557B.G(f02, q10.f51867s, q10.f51866r, a17, rVar2, 584, 8);
                        gb.m0 m0Var6 = m0Var4;
                        Fd.v vVar10 = vVar4;
                        P4.a.h(x10, androidx.compose.foundation.layout.a.v(c4323o3, 0.0f, p9.r.f42839c, 0.0f, 0.0f, 13), rVar2, 0, 0);
                        rVar2.W(-574725070);
                        if (x10.f3029d) {
                            String v10 = Ng.H.v(R.string.voice_mode_poor_connection_quality, rVar2);
                            E e10 = ((p4) rVar2.m(q4.f20361a)).f20310k;
                            m0Var5 = m0Var6;
                            bVar = bVar2;
                            j4.b(v10, a17, ((P0) rVar2.m(R0.f19593a)).f19539w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, e10, rVar2, 0, 0, 65530);
                            rVar = rVar2;
                            r32 = 1;
                            z11 = false;
                        } else {
                            bVar = bVar2;
                            m0Var5 = m0Var6;
                            z11 = false;
                            rVar = rVar2;
                            r32 = 1;
                        }
                        AbstractC6463a.v(rVar, z11, z11, r32, z11);
                        rVar.t(z11);
                        AbstractC4326r a18 = bVar.a(c4323o3, C4310b.f37701n0);
                        float f6 = p9.r.f42840d;
                        R4.b.o(c4385i, androidx.compose.foundation.layout.a.t(a18, f6, 0.0f, 2), false, null, null, z.f5296a, rVar, 196608, 28);
                        AbstractC1710f0 T = Ad.l.T(vVar10.f808e, Fd.c.f5241i0, rVar);
                        rVar.W(-574724122);
                        if (((Boolean) T.getValue()).booleanValue()) {
                            rVar.W(-574724041);
                            if ((((i22 & 57344) ^ 24576) > 16384 && rVar.g(vVar10)) || (i22 & 24576) == 16384) {
                                Object[] objArr2 = r32 == true ? 1 : 0;
                                Object[] objArr3 = r32 == true ? 1 : 0;
                                objArr = objArr2;
                            } else {
                                Object[] objArr4 = z11 ? 1 : 0;
                                Object[] objArr5 = z11 ? 1 : 0;
                                objArr = objArr4;
                            }
                            Object K14 = rVar.K();
                            if (objArr != null || K14 == iVar) {
                                int i27 = r32 == true ? 1 : 0;
                                int i28 = r32 == true ? 1 : 0;
                                K14 = new Fd.b(vVar10, i27);
                                rVar.h0(K14);
                            }
                            rVar.t(z11);
                            vVar5 = vVar10;
                            R4.b.o((AbstractC6216a) K14, androidx.compose.foundation.layout.a.t(bVar.a(c4323o3, C4310b.f37699l0), f6, 0.0f, 2), false, null, null, z.f5297b, rVar, 196608, 28);
                        } else {
                            vVar5 = vVar10;
                        }
                        rVar.t(z11);
                        rVar.W(-574723453);
                        if (x10.f3034i) {
                            F0 f03 = m0Var5.f808e;
                            B b16 = new B(j12, 5);
                            int i29 = z11 ? 1 : 0;
                            int i30 = z11 ? 1 : 0;
                            AbstractC5260f.e(x10, f03, b16, new Fd.t(i29, m0Var5), a13, null, rVar, 64, 48);
                        }
                        rVar.t(z11);
                        rVar.W(488569620);
                        if (x10.f3035j) {
                            AbstractC0324i.b(new B(j12, 6), new Fd.t(r32, m0Var5), new F(j12, 2), a13, x10.f3037l, null, rVar, 0, 40);
                        }
                        AbstractC6463a.v(rVar, z11, z11, r32, z11);
                        rVar.t(z11);
                        abstractC4326r3 = abstractC4326r4;
                        j11 = j12;
                        m0Var3 = m0Var5;
                        vVar3 = vVar5;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v11 = rVar.v();
            if (v11 != null) {
                v11.f22739d = new C6477o(fVar, kVar, abstractC4326r3, j11, vVar3, m0Var3, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i10 & 57344) != 0) {
        }
        if ((458752 & i10) != 0) {
        }
        if ((i12 & 374491) != 74898) {
        }
        rVar2.R();
        i13 = i10 & 1;
        iVar = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i21 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        if ((i11 & 16) == 0) {
        }
        if ((i11 & 32) == 0) {
        }
        i14 = i12;
        abstractC4326r4 = abstractC4326r5;
        rVar2.u();
        AbstractActivityC4532l abstractActivityC4532l2 = (AbstractActivityC4532l) rVar2.m(p9.m.f42797a);
        Context context42 = (Context) rVar2.m(Z.f6888b);
        X x102 = (X) AbstractC4828h.z(j12.f808e, rVar2).getValue();
        rVar2.W(488562916);
        K10 = rVar2.K();
        if (K10 == iVar) {
        }
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K10;
        rVar2.t(false);
        C4385I c4385i2 = new C4385I(x102, context42, abstractActivityC4532l2, 5);
        int i222 = i14;
        AbstractC1734s.e(j12, new Fd.o(j12, fVar, context42, kVar, null), rVar2);
        AbstractC1734s.e(m0Var4, new Fd.r(vVar4, m0Var4, abstractActivityC4532l2, j12, fVar, context42, null), rVar2);
        R4.b.u(new B(j12, 4), rVar2, 0);
        rVar2.W(733328855);
        E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i232 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i242 = androidx.compose.ui.layout.a.i(abstractC4326r4);
        z10 = rVar2.f22696a instanceof AbstractC1707e;
        if (!z10) {
        }
    }

    public static long c0(long j6) {
        return (j6 >>> 1) ^ (-(1 & j6));
    }

    public static void e(Class cls) {
        C3636c1.l().a(cls.getSimpleName().replace("Sentry", "").replace("Integration", "").replace("Interceptor", "").replace("EventProcessor", ""));
    }

    public static final Je.a g(Je.a aVar) {
        AbstractC3557B.c0("<this>", aVar);
        w wVar = aVar.f9099c;
        AbstractC3557B.Z(wVar);
        w wVar2 = ((Df.z) wVar.c().get(0)).f3650b;
        AbstractC3557B.Z(wVar2);
        AbstractC0406e e10 = wVar2.e();
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.reflect.KClass<*>", e10);
        return new Je.a(Df.H.O(wVar2), (AbstractC0405d) e10, wVar2);
    }

    public static final Object l(Object obj, AbstractC0994c abstractC0994c) {
        Class Y7;
        if ((abstractC0994c instanceof P) && AbstractC4842i.d((i0) abstractC0994c)) {
            return obj;
        }
        A E10 = E(abstractC0994c);
        if (E10 != null && (Y7 = Y(E10)) != null) {
            return F(Y7, abstractC0994c).invoke(obj, new Object[0]);
        }
        return obj;
    }

    public static final void m(H h10, C4291c c4291c, ArrayList arrayList) {
        AbstractC3557B.c0("<this>", h10);
        AbstractC3557B.c0("fqName", c4291c);
        if (h10 instanceof L) {
            ((L) h10).a(c4291c, arrayList);
        } else {
            arrayList.addAll(h10.c(c4291c));
        }
    }

    public static int n(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void o(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        AbstractC3557B.c0("$this$copyTo", byteBuffer);
        int remaining = byteBuffer2.remaining();
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly() && byteBuffer2.hasArray() && !byteBuffer2.isReadOnly()) {
            int position = byteBuffer2.position();
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + position, remaining);
            byteBuffer2.position(position + remaining);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(remaining + i10);
        duplicate.position(i10);
        byteBuffer2.put(duplicate);
    }

    public static io.sentry.instrumentation.file.e p(FileOutputStream fileOutputStream, File file) {
        return new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.a(file, false, fileOutputStream));
    }

    public static io.sentry.instrumentation.file.e q(FileOutputStream fileOutputStream, File file, boolean z10) {
        return new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.a(file, z10, fileOutputStream));
    }

    public static io.sentry.instrumentation.file.e r(FileOutputStream fileOutputStream, String str) {
        File file;
        if (str != null) {
            file = new File(str);
        } else {
            file = null;
        }
        return new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.a(file, false, fileOutputStream));
    }

    public static final Hf.g s(Hf.g gVar, AbstractC1013w abstractC1013w, boolean z10) {
        A E10;
        AbstractC1000i k10;
        AbstractC3557B.c0("descriptor", abstractC1013w);
        if (!AbstractC4842i.a(abstractC1013w)) {
            List<AbstractC1146d> d02 = abstractC1013w.d0();
            AbstractC3557B.b0("getContextReceiverParameters(...)", d02);
            if (!d02.isEmpty()) {
                for (AbstractC1146d abstractC1146d : d02) {
                    A type = abstractC1146d.getType();
                    AbstractC3557B.b0("getType(...)", type);
                    if (AbstractC4842i.f(type)) {
                        break;
                    }
                }
            }
            List<h0> S = abstractC1013w.S();
            AbstractC3557B.b0("getValueParameters(...)", S);
            if (!S.isEmpty()) {
                for (h0 h0Var : S) {
                    A type2 = ((c0) h0Var).getType();
                    AbstractC3557B.b0("getType(...)", type2);
                    if (AbstractC4842i.f(type2)) {
                        break;
                    }
                }
            }
            A returnType = abstractC1013w.getReturnType();
            if ((returnType == null || (k10 = returnType.y0().k()) == null || !AbstractC4842i.b(k10)) && ((E10 = E(abstractC1013w)) == null || !AbstractC4842i.f(E10))) {
                return gVar;
            }
        }
        return new Hf.D(gVar, abstractC1013w, z10);
    }

    public static final boolean v(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean w(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int x(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public static final void y(long j6, String str) {
        throw new IllegalArgumentException("Long value " + j6 + " of " + str + " doesn't fit into 32-bit integer");
    }

    public static String z(int i10, String str) {
        String str2;
        switch (i10) {
            case 12288:
                str2 = "EGL_SUCCESS";
                break;
            case 12289:
                str2 = "EGL_NOT_INITIALIZED";
                break;
            case 12290:
                str2 = "EGL_BAD_ACCESS";
                break;
            case 12291:
                str2 = "EGL_BAD_ALLOC";
                break;
            case 12292:
                str2 = "EGL_BAD_ATTRIBUTE";
                break;
            case 12293:
                str2 = "EGL_BAD_CONFIG";
                break;
            case 12294:
                str2 = "EGL_BAD_CONTEXT";
                break;
            case 12295:
                str2 = "EGL_BAD_CURRENT_SURFACE";
                break;
            case 12296:
                str2 = "EGL_BAD_DISPLAY";
                break;
            case 12297:
                str2 = "EGL_BAD_MATCH";
                break;
            case 12298:
                str2 = "EGL_BAD_NATIVE_PIXMAP";
                break;
            case 12299:
                str2 = "EGL_BAD_NATIVE_WINDOW";
                break;
            case 12300:
                str2 = "EGL_BAD_PARAMETER";
                break;
            case 12301:
                str2 = "EGL_BAD_SURFACE";
                break;
            case 12302:
                str2 = "EGL_CONTEXT_LOST";
                break;
            default:
                str2 = R.a.r("0x", Integer.toHexString(i10));
                break;
        }
        return android.gov.nist.core.a.j(str, " failed: ", str2);
    }

    public abstract void S(W3.f fVar, W3.f fVar2);

    public abstract void T(W3.f fVar, Thread thread);

    public abstract f d(Object obj);

    public abstract int f(int i10, Z0.l lVar, d0 d0Var, int i11);

    public Integer h(d0 d0Var) {
        return null;
    }

    public abstract boolean i(W3.g gVar, W3.c cVar, W3.c cVar2);

    public abstract boolean j(W3.g gVar, Object obj, Object obj2);

    public abstract boolean k(W3.g gVar, W3.f fVar, W3.f fVar2);

    public M t(T2.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f48641j0;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        return u(aVar, byteBuffer);
    }

    public abstract M u(T2.a aVar, ByteBuffer byteBuffer);
}
