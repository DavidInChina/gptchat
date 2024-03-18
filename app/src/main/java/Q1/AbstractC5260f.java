package q1;

import A.AbstractC0044t0;
import Cd.C0325j;
import Cd.X;
import Cf.l;
import Df.H;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0424h;
import E.G;
import E.p0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Gf.C0627b;
import H0.Z;
import H1.o;
import Hd.j;
import Kg.m;
import L3.s;
import Lg.n;
import M3.A;
import M3.C0932a;
import Ng.F;
import S0.D;
import Sf.AbstractC1385d;
import W.C1550f3;
import W.C1631w0;
import W.G3;
import W.j4;
import W.p4;
import W.q4;
import X1.h;
import X1.i;
import X1.p;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.l1;
import Z.m1;
import Z.o1;
import Z0.g;
import Z1.B0;
import Z1.C0;
import Z1.C1750a;
import Z1.C1752b;
import Z1.C1763g0;
import Z1.D0;
import Z1.E;
import Z1.H0;
import Z1.j0;
import Z1.n0;
import Z1.q0;
import Z1.r;
import Z1.u0;
import Z1.v0;
import a1.C1915c;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.util.SizeF;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.S;
import b4.AbstractC2125f;
import c2.C2280a;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import e2.C2769a;
import e2.C2770b;
import e2.C2771c;
import e2.C2777i;
import e2.C2778j;
import e2.C2779k;
import e2.C2780l;
import e2.C2781m;
import e2.C2782n;
import e2.C2790v;
import gb.C3234k;
import gb.l0;
import h0.C3288a;
import i2.C3459a;
import i2.C3464f;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j2.AbstractC3899a;
import j2.AbstractC3905g;
import j2.C3904f;
import j2.C3906h;
import j2.C3907i;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jf.C3959i;
import jf.y;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import kg.C4294f;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import nf.C4832l;
import of.C5001b;
import of.C5002c;
import of.EnumC5000a;
import p9.AbstractC5102d;
import pf.AbstractC5154a;
import pf.AbstractC5156c;
import pf.AbstractC5160g;
import s2.AbstractC5530A;
import s2.u;
import s3.C5545H;
import s3.C5557g;
import t1.AbstractC5656b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import w9.C6148e;
import wd.C6209w;
import wf.AbstractC6216a;
import wf.k;
import y.AbstractC6463a;
import y.C6477o;
import y8.AbstractC6549d;
import yf.AbstractC6583a;
import z.AbstractC6704j;
import z.C6677Q;
import z.C6686a;

/* renamed from: q1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5260f {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C5258d f43650a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile ArrayList f43651b;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f43652c;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f43653d;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f43654e;

    /* renamed from: f  reason: collision with root package name */
    public static C5953f f43655f;

    /* renamed from: g  reason: collision with root package name */
    public static C5953f f43656g;

    public static final boolean A(char c10) {
        if (c10 != '\t' && ((' ' > c10 || c10 >= '0') && ((';' > c10 || c10 >= 'A') && (('[' > c10 || c10 >= 'a') && ('{' > c10 || c10 >= '\u007f'))))) {
            return false;
        }
        return true;
    }

    public static final boolean B(char c10) {
        if ('0' > c10 || c10 >= ':') {
            return false;
        }
        return true;
    }

    public static final boolean C(char c10) {
        if ((c10 < 0 || c10 >= '\t') && (('\n' > c10 || c10 >= ' ') && (('0' > c10 || c10 >= ':') && c10 != ':' && (('a' > c10 || c10 >= '{') && (('A' > c10 || c10 >= '[') && ('\u007f' > c10 || c10 >= '\u0100')))))) {
            return false;
        }
        return true;
    }

    public static final boolean D(char c10) {
        if ((c10 >= 0 && c10 < '0') || ('J' <= c10 && c10 < '\u0100')) {
            return true;
        }
        return false;
    }

    public static final void E(Context context) {
        String str;
        AbstractC3557B.c0("context", context);
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC3557B.b0("context.getDatabasePath(WORK_DATABASE_NAME)", databasePath);
        if (databasePath.exists()) {
            s.d().a(A.f11507a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            AbstractC3557B.b0("context.getDatabasePath(WORK_DATABASE_NAME)", databasePath2);
            File file = new File(C0932a.f11563a.a(context), "androidx.work.workdb");
            String[] strArr = A.f11508b;
            int n02 = P4.a.n0(strArr.length);
            if (n02 < 16) {
                n02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
            }
            for (Map.Entry entry : AbstractC4268D.g1(linkedHashMap, new C3959i(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        s.d().g(A.f11507a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    s.d().a(A.f11507a, str);
                }
            }
        }
    }

    public static final ArrayList F(LinkedHashMap linkedHashMap, k kVar) {
        AbstractC3557B.c0("<this>", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C5557g c5557g = (C5557g) entry.getValue();
            if (c5557g != null && !c5557g.f45298b && !c5557g.f45299c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap2.keySet()) {
            if (((Boolean) kVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final long G(Af.c cVar, l lVar) {
        if (!lVar.isEmpty()) {
            long j6 = lVar.f3116Z;
            int i10 = (j6 > Long.MAX_VALUE ? 1 : (j6 == Long.MAX_VALUE ? 0 : -1));
            long j10 = lVar.f3115Y;
            if (i10 < 0) {
                return Af.d.f841Z.h(j10, j6 + 1);
            } else if (j10 > Long.MIN_VALUE) {
                return Af.d.f841Z.h(j10 - 1, j6) + 1;
            } else {
                return Af.d.f841Z.g();
            }
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + lVar);
    }

    public static float H(EdgeEffect edgeEffect, float f6, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return H1.e.c(edgeEffect, f6, f10);
        }
        H1.d.a(edgeEffect, f6, f10);
        return f6;
    }

    public static final File I(Context context, String str) {
        AbstractC3557B.c0("<this>", context);
        AbstractC3557B.c0("name", str);
        return R4.b.n0(context, AbstractC3557B.v2(str, ".preferences_pb"));
    }

    public static C4294f J(C4294f c4294f, String str, String str2, int i10) {
        boolean z10;
        char charAt;
        char charAt2;
        Object obj;
        if ((i10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!c4294f.f37508Z) {
            String c10 = c4294f.c();
            if (n.I2(c10, str, false) && c10.length() != str.length() && ('a' > (charAt = c10.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return C4294f.e(str2.concat(n.v2(str, c10)));
                }
                if (z10) {
                    String v22 = n.v2(str, c10);
                    if (v22.length() != 0 && H.d0(v22, 0)) {
                        if (v22.length() != 1 && H.d0(v22, 1)) {
                            Cf.f it = new Cf.e(0, v22.length() - 1, 1).iterator();
                            while (true) {
                                if (it.f3111h0) {
                                    obj = it.next();
                                    if (!H.d0(v22, ((Number) obj).intValue())) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            Integer num = (Integer) obj;
                            if (num != null) {
                                int intValue = num.intValue() - 1;
                                String substring = v22.substring(0, intValue);
                                AbstractC3557B.b0("substring(...)", substring);
                                String z02 = H.z0(substring);
                                String substring2 = v22.substring(intValue);
                                AbstractC3557B.b0("substring(...)", substring2);
                                v22 = z02.concat(substring2);
                            } else {
                                v22 = H.z0(v22);
                            }
                        } else if (v22.length() != 0 && 'A' <= (charAt2 = v22.charAt(0)) && charAt2 < '[') {
                            char lowerCase = Character.toLowerCase(charAt2);
                            String substring3 = v22.substring(1);
                            AbstractC3557B.b0("substring(...)", substring3);
                            v22 = lowerCase + substring3;
                        }
                    }
                    if (C4294f.f(v22)) {
                        return C4294f.e(v22);
                    }
                } else {
                    return c4294f;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, uf.a, java.io.ByteArrayOutputStream] */
    public static byte[] K(File file) {
        AbstractC3557B.c0("<this>", file);
        io.sentry.instrumentation.file.d t10 = N.t(new FileInputStream(file), file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i10 = (int) length;
                byte[] bArr = new byte[i10];
                int i11 = i10;
                int i12 = 0;
                while (i11 > 0) {
                    int read = t10.read(bArr, i12, i11);
                    if (read < 0) {
                        break;
                    }
                    i11 -= read;
                    i12 += read;
                }
                if (i11 > 0) {
                    bArr = Arrays.copyOf(bArr, i12);
                    AbstractC3557B.b0("copyOf(...)", bArr);
                } else {
                    int read2 = t10.read();
                    if (read2 != -1) {
                        ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        AbstractC3557B.o0(t10, byteArrayOutputStream);
                        int size = byteArrayOutputStream.size() + i10;
                        if (size >= 0) {
                            byte[] a5 = byteArrayOutputStream.a();
                            bArr = Arrays.copyOf(bArr, size);
                            AbstractC3557B.b0("copyOf(...)", bArr);
                            q.X2(a5, i10, bArr, 0, byteArrayOutputStream.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                th = null;
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
                Ad.l.S(t10, th2);
            }
        }
    }

    public static void L(Application application, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            G1.a.f(application.getSystemService(G1.a.g())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) v(application)).iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it.next());
        Collections.singletonList(str);
        throw null;
    }

    public static long M(long j6, long j10) {
        boolean z10;
        boolean z11;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (numberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        long j11 = ((j6 ^ j10) >>> 63) + Long.MAX_VALUE;
        boolean z12 = false;
        if (numberOfLeadingZeros < 64) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j10 == Long.MIN_VALUE) {
            z12 = true;
        }
        if (z10 | (z12 & z11)) {
            return j11;
        }
        long j12 = j6 * j10;
        if (i10 != 0 && j12 / j6 != j10) {
            return j11;
        }
        return j12;
    }

    public static final void N(View view, A3.f fVar) {
        AbstractC3557B.c0("<this>", view);
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final void O(RemoteViews remoteViews, H0 h02, C1763g0 c1763g0, ArrayList arrayList) {
        int i10 = 0;
        for (Object obj : t.G2(arrayList, 10)) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                V(remoteViews, h02.b(c1763g0, i10), (h) obj);
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
    }

    public static void P(Drawable drawable, int i10) {
        AbstractC5656b.g(drawable, i10);
    }

    public static void Q(Drawable drawable, ColorStateList colorStateList) {
        AbstractC5656b.h(drawable, colorStateList);
    }

    public static void R(Drawable drawable, PorterDuff.Mode mode) {
        AbstractC5656b.i(drawable, mode);
    }

    public static final int S(C2771c c2771c) {
        int i10 = c2771c.f28751a;
        int i11 = 8388611;
        if (!C2769a.b(i10, 0)) {
            if (C2769a.b(i10, 2)) {
                i11 = 8388613;
            } else if (C2769a.b(i10, 1)) {
                i11 = 1;
            } else {
                AbstractC3612c.r("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) C2769a.c(i10)));
            }
        }
        C1915c c1915c = C2770b.f28744b;
        int n10 = c1915c.n();
        int i12 = c2771c.f28752b;
        int i13 = 48;
        if (!C2770b.b(i12, n10)) {
            if (C2770b.b(i12, 2)) {
                i13 = 80;
            } else if (C2770b.b(i12, c1915c.k())) {
                i13 = 16;
            } else {
                AbstractC3612c.r("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) C2770b.c(i12)));
            }
        }
        return i11 | i13;
    }

    public static String T(int i10) {
        if (r(i10, 1)) {
            return "Text";
        }
        if (r(i10, 2)) {
            return "Ascii";
        }
        if (r(i10, 3)) {
            return "Number";
        }
        if (r(i10, 4)) {
            return "Phone";
        }
        if (r(i10, 5)) {
            return "Uri";
        }
        if (r(i10, 6)) {
            return "Email";
        }
        if (r(i10, 7)) {
            return "Password";
        }
        if (r(i10, 8)) {
            return "NumberPassword";
        }
        if (r(i10, 9)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public static Object U(AbstractC2125f abstractC2125f, wf.n nVar, AbstractC4825e abstractC4825e) {
        Object c10 = abstractC2125f.c(false, nVar, abstractC4825e);
        if (c10 != EnumC5000a.f41328Y) {
            return y.f36177a;
        }
        return c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0301, code lost:
        if (id.AbstractC3557B.K(r4, r3) != false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void V(RemoteViews remoteViews, H0 h02, h hVar) {
        q0 q0Var;
        AbstractC3905g abstractC3905g;
        q0 q0Var2;
        q0 q0Var3;
        if (hVar instanceof C2778j) {
            C2778j c2778j = (C2778j) hVar;
            C1763g0 b10 = n0.b(remoteViews, h02, q0.f23067h0, c2778j.f21751c.size(), c2778j.f28772d, new C2769a(c2778j.f28773e.f28751a), new C2770b(c2778j.f28773e.f28752b));
            A7.b.Y(h02, remoteViews, c2778j.f28772d, b10);
            ArrayList arrayList = c2778j.f21751c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h hVar2 = (h) it.next();
                hVar2.b(hVar2.c().d(new C1750a(c2778j.f28773e)));
            }
            O(remoteViews, h02, b10, arrayList);
            return;
        }
        boolean z10 = hVar instanceof C2780l;
        r rVar = r.f23092m0;
        if (z10) {
            C2780l c2780l = (C2780l) hVar;
            if (Build.VERSION.SDK_INT >= 31 && c2780l.f28777d.b(rVar)) {
                q0Var3 = q0.f23062G0;
            } else {
                q0Var3 = q0.f23065Y;
            }
            C1763g0 b11 = n0.b(remoteViews, h02, q0Var3, c2780l.f21751c.size(), c2780l.f28777d, null, new C2770b(c2780l.f28779f));
            int S = S(new C2771c(c2780l.f28778e, c2780l.f28779f));
            AbstractC3557B.c0("<this>", remoteViews);
            remoteViews.setInt(b11.f22961a, "setGravity", S);
            A7.b.Y(H0.a(h02, 0, false, null, null, null, 0L, true, null, 28671), remoteViews, c2780l.f28777d, b11);
            ArrayList arrayList2 = c2780l.f21751c;
            O(remoteViews, h02, b11, arrayList2);
            if (c2780l.f28777d.b(rVar)) {
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        h hVar3 = (h) it2.next();
                    }
                }
            }
        } else if (hVar instanceof C2779k) {
            C2779k c2779k = (C2779k) hVar;
            if (Build.VERSION.SDK_INT >= 31 && c2779k.f28774d.b(rVar)) {
                q0Var2 = q0.f23063H0;
            } else {
                q0Var2 = q0.f23066Z;
            }
            C1763g0 b12 = n0.b(remoteViews, h02, q0Var2, c2779k.f21751c.size(), c2779k.f28774d, new C2769a(c2779k.f28776f), null);
            int S10 = S(new C2771c(c2779k.f28776f, c2779k.f28775e));
            AbstractC3557B.c0("<this>", remoteViews);
            remoteViews.setInt(b12.f22961a, "setGravity", S10);
            A7.b.Y(H0.a(h02, 0, false, null, null, null, 0L, true, null, 28671), remoteViews, c2779k.f28774d, b12);
            ArrayList arrayList3 = c2779k.f21751c;
            O(remoteViews, h02, b12, arrayList3);
            if (c2779k.f28774d.b(rVar)) {
                if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        h hVar4 = (h) it3.next();
                    }
                }
            }
        } else {
            boolean z11 = false;
            if (hVar instanceof C3459a) {
                C3459a c3459a = (C3459a) hVar;
                C1763g0 c10 = n0.c(remoteViews, h02, q0.f23068i0, c3459a.f32592a);
                CharSequence charSequence = c3459a.f32593b;
                C3464f c3464f = c3459a.f32594c;
                int i10 = c3459a.f32595d;
                int i11 = c10.f22961a;
                if (i10 != Integer.MAX_VALUE) {
                    AbstractC3557B.c0("<this>", remoteViews);
                    remoteViews.setInt(i11, "setMaxLines", i10);
                }
                if (c3464f == null) {
                    remoteViews.setTextViewText(i11, charSequence);
                } else {
                    SpannableString spannableString = new SpannableString(charSequence);
                    int length = spannableString.length();
                    Z0.n nVar = c3464f.f32611b;
                    if (nVar != null) {
                        long j6 = nVar.f22811a;
                        if ((1095216660480L & j6) == 4294967296L) {
                            remoteViews.setTextViewTextSize(i11, 2, Z0.n.c(j6));
                        } else {
                            throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
                        }
                    }
                    Iterator it4 = new ArrayList().iterator();
                    while (it4.hasNext()) {
                        spannableString.setSpan((ParcelableSpan) it4.next(), 0, length, 17);
                    }
                    remoteViews.setTextViewText(i11, spannableString);
                    AbstractC3899a abstractC3899a = c3464f.f32610a;
                    if (abstractC3899a instanceof C3906h) {
                        remoteViews.setTextColor(i11, androidx.compose.ui.graphics.a.s(((C3906h) abstractC3899a).f36008a));
                    } else if (abstractC3899a instanceof C3907i) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            o.g(remoteViews, i11, "setTextColor", ((C3907i) abstractC3899a).f36009a);
                        } else {
                            remoteViews.setTextColor(i11, androidx.compose.ui.graphics.a.s(abstractC3899a.a(h02.f22835a)));
                        }
                    } else {
                        AbstractC3612c.r("GlanceAppWidget", "Unexpected text color: " + abstractC3899a);
                    }
                }
                A7.b.Y(h02, remoteViews, c3459a.f32592a, c10);
            } else if (hVar instanceof C2781m) {
                C2781m c2781m = (C2781m) hVar;
                A7.b.Y(h02, remoteViews, c2781m.f28780a, n0.c(remoteViews, h02, q0.f23073n0, c2781m.f28780a));
            } else if (hVar instanceof i) {
                i iVar = (i) hVar;
                boolean g02 = P4.a.g0(iVar);
                int i12 = iVar.f21748c;
                if (C2777i.a(i12, 0)) {
                    if (g02) {
                        q0Var = q0.f23057B0;
                    } else {
                        q0Var = q0.f23084y0;
                    }
                } else {
                    boolean a5 = C2777i.a(i12, 1);
                    q0 q0Var4 = q0.f23085z0;
                    if (a5) {
                        if (g02) {
                            q0Var = q0.f23058C0;
                        }
                        q0Var = q0Var4;
                    } else if (C2777i.a(i12, 2)) {
                        if (g02) {
                            q0Var = q0.f23059D0;
                        } else {
                            q0Var = q0.f23056A0;
                        }
                    } else {
                        AbstractC3612c.r("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) C2777i.b(iVar.f21748c)));
                        q0Var = q0Var4;
                    }
                }
                C1763g0 c11 = n0.c(remoteViews, h02, q0Var, iVar.f21746a);
                p pVar = iVar.f21747b;
                if (pVar instanceof X1.a) {
                    int i13 = ((X1.a) pVar).f21723a;
                    int i14 = c11.f22961a;
                    remoteViews.setImageViewResource(i14, i13);
                    A7.b.Y(h02, remoteViews, iVar.f21746a, c11);
                    if (C2777i.a(iVar.f21748c, 1)) {
                        AbstractC3905g abstractC3905g2 = null;
                        C2790v c2790v = (C2790v) iVar.f21746a.a(null, C2280a.f26116Z);
                        if (c2790v != null) {
                            abstractC3905g = c2790v.f28797b;
                        } else {
                            abstractC3905g = null;
                        }
                        C3904f c3904f = C3904f.f36007a;
                        if (!AbstractC3557B.K(abstractC3905g, c3904f)) {
                            C2782n c2782n = (C2782n) iVar.f21746a.a(null, C2280a.f26117h0);
                            if (c2782n != null) {
                                abstractC3905g2 = c2782n.f28781b;
                            }
                        }
                        z11 = true;
                    }
                    remoteViews.setBoolean(i14, "setAdjustViewBounds", z11);
                    return;
                }
                throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
            } else if (hVar instanceof E) {
                E e10 = (E) hVar;
                int size = e10.f21751c.size();
                ArrayList arrayList4 = e10.f21751c;
                if (size <= 1) {
                    h hVar5 = (h) t.h2(arrayList4);
                    if (hVar5 != null) {
                        V(remoteViews, h02, hVar5);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList4.size() + ". The normalization of the composition tree failed.").toString());
            } else {
                throw new IllegalArgumentException("Unknown element type " + hVar.getClass().getCanonicalName());
            }
        }
    }

    public static final RemoteViews W(Context context, int i10, v0 v0Var, j0 j0Var, int i11, long j6, ComponentName componentName) {
        boolean z10;
        RemoteViews remoteViews;
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H0 h02 = new H0(context, i10, z10, j0Var, -1, false, new AtomicInteger(1), new C1763g0(0, 0, null, 7), new AtomicBoolean(false), j6, -1, -1, false, null, componentName);
        ArrayList arrayList = v0Var.f21751c;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((h) it.next()) instanceof E)) {
                    h hVar = (h) t.B2(arrayList);
                    u0 a5 = n0.a(h02, hVar.c(), i11);
                    H0 a10 = H0.a(h02.b(a5.f23116b, 0), 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, false, null, 32447);
                    RemoteViews remoteViews2 = a5.f23115a;
                    V(remoteViews2, a10, hVar);
                    return remoteViews2;
                }
            }
        }
        Object f22 = t.f2(arrayList);
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox", f22);
        D0 d02 = ((E) f22).f22827e;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox", hVar2);
            long j10 = ((E) hVar2).f22826d;
            u0 a11 = n0.a(h02, hVar2.c(), i11);
            H0 a12 = H0.a(h02.b(a11.f23116b, 0), 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), j10, false, null, 31935);
            RemoteViews remoteViews3 = a11.f23115a;
            V(remoteViews3, a12, hVar2);
            arrayList2.add(new C3959i(new SizeF(g.b(j10), g.a(j10)), remoteViews3));
        }
        if (d02 instanceof C0) {
            return (RemoteViews) ((C3959i) t.B2(arrayList2)).f36156Z;
        }
        if (AbstractC3557B.K(d02, B0.f22818a)) {
            if (Build.VERSION.SDK_INT >= 31) {
                return C1752b.f22941a.a(AbstractC4268D.k1(arrayList2));
            }
            if (arrayList2.size() != 1 && arrayList2.size() != 2) {
                throw new IllegalArgumentException("unsupported views size".toString());
            }
            ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add((RemoteViews) ((C3959i) it3.next()).f36156Z);
            }
            int size = arrayList3.size();
            if (size != 1) {
                if (size == 2) {
                    remoteViews = new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
                } else {
                    throw new IllegalArgumentException("There must be between 1 and 2 views.");
                }
            } else {
                remoteViews = (RemoteViews) arrayList3.get(0);
            }
            return remoteViews;
        }
        throw new RuntimeException();
    }

    public static final void X(C5545H c5545h, boolean z10, boolean z11, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-2071393061);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        AbstractC1710f0 g02 = AbstractC4828h.g0(Boolean.valueOf(z10), rVar);
        AbstractC1710f0 g03 = AbstractC4828h.g0(Boolean.valueOf(z11), rVar);
        S h10 = ((AbstractC2086v) rVar.m(Z.f6890d)).h();
        AbstractC3557B.b0("LocalLifecycleOwner.current.lifecycle", h10);
        AbstractC1734s.a(h10, c5545h, new C6686a(c5545h, h10, g02, g03, 18), rVar);
        rVar.t(false);
    }

    public static Object Y(Object obj, AbstractC4825e abstractC4825e, wf.n nVar) {
        Object obj2;
        AbstractC3557B.c0("<this>", nVar);
        AbstractC4831k context = abstractC4825e.getContext();
        if (context == C4832l.f40334Y) {
            obj2 = new AbstractC5160g(abstractC4825e);
        } else {
            obj2 = new AbstractC5156c(abstractC4825e, context);
        }
        Ad.l.M(2, nVar);
        return nVar.invoke(obj, obj2);
    }

    public static final void a(Qg.D0 d02, AbstractC4326r abstractC4326r, float f6, String str, AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        float f10;
        String str2;
        boolean z10;
        Z.r rVar;
        X x10;
        F f11;
        AbstractC3557B.c0("stateFlow", d02);
        AbstractC3557B.c0("onWindowClick", abstractC6216a);
        AbstractC4326r a5 = io.sentry.compose.b.a("DebugVoiceContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-291551594);
        if ((i11 & 2) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        if ((i11 & 4) != 0) {
            f10 = 0;
        } else {
            f10 = f6;
        }
        if ((i11 & 8) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        X x11 = (X) AbstractC4828h.z(d02, rVar2).getValue();
        C1550f3 v12 = A7.b.v1(6, 2, rVar2, false);
        C1550f3 v13 = A7.b.v1(6, 2, rVar2, false);
        Object i12 = AbstractC6463a.i(rVar2, 773894976, -492369756);
        if (i12 == C1723m.f22654Y) {
            C c10 = new C(AbstractC1734s.k(rVar2));
            rVar2.h0(c10);
            i12 = c10;
        }
        rVar2.t(false);
        F f12 = ((C) i12).f22442Y;
        rVar2.t(false);
        AbstractC4326r abstractC4326r3 = abstractC4326r2;
        G3.a(AbstractC4194d.a((G0.X) a5, androidx.compose.foundation.layout.a.r(abstractC4326r2, p9.r.f42841e)), null, r0.r.b(r0.r.f44256d, 0.8f), 0L, 0.0f, 0.0f, null, R4.b.X(rVar2, -955471567, new Hd.f(f10, abstractC6216a, x11, str2, f12, v12, v13)), rVar2, 12583296, 122);
        rVar2.W(944187382);
        if (v12.c()) {
            f11 = f12;
            rVar = rVar2;
            z10 = false;
            x10 = x11;
            AbstractC4344b.E(Ng.H.v(R.string.voice_debug_messages_received, rVar2), x11.f3038m.f7630u, new Hd.d(f11, v12, 2), a5, null, rVar, 64, 24);
        } else {
            f11 = f12;
            rVar = rVar2;
            z10 = false;
            x10 = x11;
        }
        rVar.t(z10);
        if (v13.c()) {
            AbstractC4344b.E(Ng.H.v(R.string.voice_debug_messages_sent, rVar), x10.f3038m.f7631v, new Hd.d(f11, v13, 3), a5, null, rVar, 64, 24);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new Hd.i(d02, abstractC4326r3, f10, str2, abstractC6216a, i10, i11);
        }
    }

    public static final void b(Qg.D0 d02, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        float f6;
        String u10;
        AbstractC3557B.c0("stateFlow", d02);
        AbstractC4326r a5 = io.sentry.compose.b.a("DebugVoiceWidget");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-991071412);
        if ((i11 & 2) != 0) {
            abstractC4326r = a5;
        }
        rVar.W(3625361);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            rVar.h0(K10);
        }
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar.t(false);
        if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
            f6 = Hd.l.f7665a;
        } else {
            f6 = Hd.l.f7666b;
        }
        l1 a10 = AbstractC6704j.a(f6, null, "", rVar, 384, 10);
        if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
            u10 = AbstractC4194d.u(rVar, 3625594, R.string.voice_debug_shrink_view_description, rVar, false);
        } else {
            u10 = AbstractC4194d.u(rVar, 3625676, R.string.voice_debug_expand_view_description, rVar, false);
        }
        String str = u10;
        rVar.W(-49441252);
        WeakHashMap weakHashMap = E.B0.f3736v;
        E.B0 c10 = G.c(rVar);
        rVar.t(false);
        AbstractC4326r a11 = AbstractC4194d.a((G0.X) a5, E.D0.a(abstractC4326r, c10.f3747k));
        float f10 = ((Z0.e) a10.getValue()).f22788Y;
        rVar.W(3625968);
        Object K11 = rVar.K();
        if (K11 == iVar) {
            K11 = new id.o(abstractC1710f0, 1);
            rVar.h0(K11);
        }
        rVar.t(false);
        a(d02, a11, f10, str, (AbstractC6216a) K11, rVar, 24584, 0);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new j(d02, abstractC4326r, i10, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, String str2, AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, boolean z11, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        AbstractC6216a abstractC6216a2;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        int i16;
        int i17;
        boolean z14;
        boolean z15;
        AbstractC6216a abstractC6216a3;
        Z.r rVar;
        Hd.k kVar;
        boolean z16;
        boolean z17;
        long j6;
        Object K10;
        io.sentry.hints.i iVar;
        AbstractC1710f0 abstractC1710f0;
        int i18;
        boolean z18;
        AbstractC1710f0 abstractC1710f02;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        AbstractC3557B.c0("title", str);
        AbstractC3557B.c0("value", str2);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("DevSection");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-751726942);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.g(str2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        int i24 = i11 & 4;
        if (i24 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i12 |= i21;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                abstractC6216a2 = abstractC6216a;
                if (rVar2.i(abstractC6216a2)) {
                    i20 = 2048;
                } else {
                    i20 = 1024;
                }
                i12 |= i20;
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    z12 = z10;
                    if (rVar2.h(z12)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i12 |= i19;
                    i15 = i11 & 32;
                    if (i15 == 0) {
                        i12 |= 196608;
                        z13 = z11;
                    } else {
                        z13 = z11;
                        if ((i10 & 458752) == 0) {
                            if (rVar2.h(z13)) {
                                i16 = 131072;
                            } else {
                                i16 = 65536;
                            }
                            i12 |= i16;
                        }
                    }
                    i17 = i12;
                    if ((i17 & 374491) != 74898 && rVar2.B()) {
                        rVar2.P();
                        abstractC6216a3 = abstractC6216a2;
                        z15 = z12;
                        z14 = z13;
                        rVar = rVar2;
                    } else {
                        if (i24 != 0) {
                            abstractC4326r2 = a5;
                        }
                        if (i13 == 0) {
                            kVar = Hd.k.f7664Y;
                        } else {
                            kVar = abstractC6216a2;
                        }
                        if (i14 == 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i15 == 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        Context context = (Context) rVar2.m(Z.f6888b);
                        if (!z16) {
                            j6 = r0.r.f44261i;
                        } else {
                            j6 = r0.r.f44258f;
                        }
                        long j10 = j6;
                        rVar2.W(-572408393);
                        K10 = rVar2.K();
                        iVar = C1723m.f22654Y;
                        if (K10 == iVar) {
                            K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                            rVar2.h0(K10);
                        }
                        abstractC1710f0 = (AbstractC1710f0) K10;
                        rVar2.t(false);
                        if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = 1;
                        }
                        AbstractC4326r abstractC4326r3 = abstractC4326r2;
                        AbstractC4326r h10 = androidx.compose.foundation.a.h(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f), 0.0f, p9.r.f42839c, 1), new C6677Q(context, str, str2, kVar, 8));
                        C0424h c0424h = AbstractC0429m.f3912f;
                        rVar2.W(693286680);
                        E0.N a10 = p0.a(c0424h, C4310b.f37702o0, rVar2);
                        rVar2.W(-1323940314);
                        int i25 = rVar2.P;
                        AbstractC1732q0 p10 = rVar2.p();
                        AbstractC0584m.f5811i.getClass();
                        C0582k c0582k = C0583l.f5804b;
                        C3288a i26 = androidx.compose.ui.layout.a.i(h10);
                        z18 = rVar2.f22696a instanceof AbstractC1707e;
                        if (!z18) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            C0581j c0581j = C0583l.f5808f;
                            U3.f.n0(rVar2, a10, c0581j);
                            C0581j c0581j2 = C0583l.f5807e;
                            U3.f.n0(rVar2, p10, c0581j2);
                            C0581j c0581j3 = C0583l.f5809g;
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i25))) {
                                AbstractC6463a.q(i25, rVar2, i25, c0581j3);
                            }
                            AbstractC6463a.r(0, i26, new L0(rVar2), rVar2, 2058660585);
                            if (1.0f > 0.0d) {
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(N.l(1.0f, Float.MAX_VALUE), true);
                                rVar2.W(-483455358);
                                E0.N a11 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                                rVar2.W(-1323940314);
                                int i27 = rVar2.P;
                                AbstractC1732q0 p11 = rVar2.p();
                                C3288a i28 = androidx.compose.ui.layout.a.i(layoutWeightElement);
                                if (z18) {
                                    rVar2.Z();
                                    if (rVar2.f22695O) {
                                        rVar2.o(c0582k);
                                    } else {
                                        rVar2.k0();
                                    }
                                    U3.f.n0(rVar2, a11, c0581j);
                                    U3.f.n0(rVar2, p11, c0581j2);
                                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i27))) {
                                        AbstractC6463a.q(i27, rVar2, i27, c0581j3);
                                    }
                                    AbstractC6463a.r(0, i28, new L0(rVar2), rVar2, 2058660585);
                                    AbstractC4326r a12 = io.sentry.compose.b.a("DevSection");
                                    m1 m1Var = q4.f20361a;
                                    j4.b(str, a12, j10, 0L, null, D.f15974m0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(m1Var)).f20310k, rVar2, (i17 & 14) | 196608, 0, 65498);
                                    j4.b(str2, a12, r0.r.f44258f, 0L, null, null, null, 0L, null, null, 0L, 2, false, i18, 0, null, ((p4) rVar2.m(m1Var)).f20311l, rVar2, ((i17 >> 3) & 14) | 384, 48, 55290);
                                    rVar = rVar2;
                                    AbstractC6463a.v(rVar, false, true, false, false);
                                    rVar.W(-572407326);
                                    if (z17) {
                                        rVar.W(-566688439);
                                        Object K11 = rVar.K();
                                        if (K11 == iVar) {
                                            abstractC1710f02 = abstractC1710f0;
                                            K11 = new id.o(abstractC1710f02, 2);
                                            rVar.h0(K11);
                                        } else {
                                            abstractC1710f02 = abstractC1710f0;
                                        }
                                        rVar.t(false);
                                        R4.b.o((AbstractC6216a) K11, androidx.compose.foundation.layout.e.j(c4323o, p9.r.f42841e), false, null, null, R4.b.X(rVar, 359419078, new C6148e(abstractC1710f02, 3)), rVar, 196614, 28);
                                    }
                                    AbstractC6463a.v(rVar, false, false, true, false);
                                    rVar.t(false);
                                    abstractC6216a3 = kVar;
                                    z15 = z16;
                                    z14 = z17;
                                    abstractC4326r2 = abstractC4326r3;
                                } else {
                                    R4.b.r1();
                                    throw null;
                                }
                            } else {
                                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                            }
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                    C1741v0 v10 = rVar.v();
                    if (v10 != null) {
                        v10.f22739d = new C1631w0(str, str2, abstractC4326r2, abstractC6216a3, z15, z14, i10, i11);
                        return;
                    }
                    return;
                }
                z12 = z10;
                i15 = i11 & 32;
                if (i15 == 0) {
                }
                i17 = i12;
                if ((i17 & 374491) != 74898) {
                }
                if (i24 != 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                Context context2 = (Context) rVar2.m(Z.f6888b);
                if (!z16) {
                }
                long j102 = j6;
                rVar2.W(-572408393);
                K10 = rVar2.K();
                iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                }
                abstractC1710f0 = (AbstractC1710f0) K10;
                rVar2.t(false);
                if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                }
                AbstractC4326r abstractC4326r32 = abstractC4326r2;
                AbstractC4326r h102 = androidx.compose.foundation.a.h(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f), 0.0f, p9.r.f42839c, 1), new C6677Q(context2, str, str2, kVar, 8));
                C0424h c0424h2 = AbstractC0429m.f3912f;
                rVar2.W(693286680);
                E0.N a102 = p0.a(c0424h2, C4310b.f37702o0, rVar2);
                rVar2.W(-1323940314);
                int i252 = rVar2.P;
                AbstractC1732q0 p102 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i262 = androidx.compose.ui.layout.a.i(h102);
                z18 = rVar2.f22696a instanceof AbstractC1707e;
                if (!z18) {
                }
            }
            abstractC6216a2 = abstractC6216a;
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            z12 = z10;
            i15 = i11 & 32;
            if (i15 == 0) {
            }
            i17 = i12;
            if ((i17 & 374491) != 74898) {
            }
            if (i24 != 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            Context context22 = (Context) rVar2.m(Z.f6888b);
            if (!z16) {
            }
            long j1022 = j6;
            rVar2.W(-572408393);
            K10 = rVar2.K();
            iVar = C1723m.f22654Y;
            if (K10 == iVar) {
            }
            abstractC1710f0 = (AbstractC1710f0) K10;
            rVar2.t(false);
            if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
            }
            AbstractC4326r abstractC4326r322 = abstractC4326r2;
            AbstractC4326r h1022 = androidx.compose.foundation.a.h(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f), 0.0f, p9.r.f42839c, 1), new C6677Q(context22, str, str2, kVar, 8));
            C0424h c0424h22 = AbstractC0429m.f3912f;
            rVar2.W(693286680);
            E0.N a1022 = p0.a(c0424h22, C4310b.f37702o0, rVar2);
            rVar2.W(-1323940314);
            int i2522 = rVar2.P;
            AbstractC1732q0 p1022 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k22 = C0583l.f5804b;
            C3288a i2622 = androidx.compose.ui.layout.a.i(h1022);
            z18 = rVar2.f22696a instanceof AbstractC1707e;
            if (!z18) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        abstractC6216a2 = abstractC6216a;
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        z12 = z10;
        i15 = i11 & 32;
        if (i15 == 0) {
        }
        i17 = i12;
        if ((i17 & 374491) != 74898) {
        }
        if (i24 != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        Context context222 = (Context) rVar2.m(Z.f6888b);
        if (!z16) {
        }
        long j10222 = j6;
        rVar2.W(-572408393);
        K10 = rVar2.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        abstractC1710f0 = (AbstractC1710f0) K10;
        rVar2.t(false);
        if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
        }
        AbstractC4326r abstractC4326r3222 = abstractC4326r2;
        AbstractC4326r h10222 = androidx.compose.foundation.a.h(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f), 0.0f, p9.r.f42839c, 1), new C6677Q(context222, str, str2, kVar, 8));
        C0424h c0424h222 = AbstractC0429m.f3912f;
        rVar2.W(693286680);
        E0.N a10222 = p0.a(c0424h222, C4310b.f37702o0, rVar2);
        rVar2.W(-1323940314);
        int i25222 = rVar2.P;
        AbstractC1732q0 p10222 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k222 = C0583l.f5804b;
        C3288a i26222 = androidx.compose.ui.layout.a.i(h10222);
        z18 = rVar2.f22696a instanceof AbstractC1707e;
        if (!z18) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Af.e, Af.d] */
    public static final Af.e d(long j6) {
        int i10 = (int) j6;
        int i11 = (int) (j6 >> 32);
        int i12 = ~i10;
        ?? dVar = new Af.d();
        dVar.f842h0 = i10;
        dVar.f843i0 = i11;
        dVar.f844j0 = 0;
        dVar.f845k0 = 0;
        dVar.f846l0 = i12;
        dVar.f847m0 = (i10 << 10) ^ (i11 >>> 4);
        if ((i11 | i10 | i12) != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                dVar.d();
            }
            return dVar;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    public static final void e(X x10, Qg.D0 d02, AbstractC6216a abstractC6216a, k kVar, AbstractC4326r abstractC4326r, C1550f3 c1550f3, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        C1550f3 c1550f32;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC3557B.c0("voiceState", x10);
        AbstractC3557B.c0("messagesStateFlow", d02);
        AbstractC3557B.c0("onDismissRequest", abstractC6216a);
        AbstractC3557B.c0("onMessagesIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("VoiceAttachmentsBottomSheet");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(320280202);
        if ((i11 & 16) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        if ((i11 & 32) != 0) {
            i12 = (-458753) & i10;
            c1550f32 = A7.b.v1(6, 2, rVar, false);
        } else {
            c1550f32 = c1550f3;
            i12 = i10;
        }
        l0 l0Var = (l0) AbstractC4828h.z(d02, rVar).getValue();
        float f6 = 10;
        A7.b.f(abstractC6216a, abstractC4326r2, K.f.b(f6, f6), AbstractC5102d.f42768e, c1550f32, null, R4.b.X(rVar, -1668331465, new C0325j(x10, 0, kVar)), rVar, ((i12 >> 6) & 14) | 1769472 | ((i12 >> 9) & 112) | ((i12 >> 3) & 57344), 0);
        C3959i c3959i = l0Var.f31480b;
        if (c3959i != null) {
            Iterable<C3234k> iterable = (Iterable) c3959i.f36155Y;
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
            for (C3234k c3234k : iterable) {
                arrayList.add(new C6209w(c3234k.f31470a));
            }
            int intValue = ((Number) c3959i.f36156Z).intValue();
            rVar.W(685035863);
            int i13 = (i10 & 7168) ^ 3072;
            if ((i13 > 2048 && rVar.g(kVar)) || (i10 & 3072) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object K10 = rVar.K();
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (z10 || K10 == iVar) {
                K10 = AbstractC0044t0.z(13, kVar, rVar);
            }
            AbstractC6216a abstractC6216a2 = (AbstractC6216a) K10;
            rVar.t(false);
            rVar.W(685035943);
            if ((i13 > 2048 && rVar.g(kVar)) || (i10 & 3072) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object K11 = rVar.K();
            if (z11 || K11 == iVar) {
                K11 = AbstractC0044t0.v(27, kVar, rVar);
            }
            k kVar2 = (k) K11;
            rVar.t(false);
            rVar.W(685036021);
            if ((i13 > 2048 && rVar.g(kVar)) || (i10 & 3072) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object K12 = rVar.K();
            if (z12 || K12 == iVar) {
                K12 = AbstractC0044t0.v(28, kVar, rVar);
            }
            rVar.t(false);
            K8.d.G(arrayList, intValue, l0Var.f31481c, abstractC6216a2, kVar2, (k) K12, rVar, 8);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6477o(x10, d02, abstractC6216a, kVar, abstractC4326r2, c1550f32, i10, i11);
        }
    }

    public static final String f(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC3557B.b0("getParameterTypes(...)", parameterTypes);
        sb2.append(q.r3(parameterTypes, "", Separators.LPAREN, Separators.RPAREN, C0627b.f6395r0, 24));
        Class<?> returnType = method.getReturnType();
        AbstractC3557B.b0("getReturnType(...)", returnType);
        sb2.append(AbstractC1385d.b(returnType));
        return sb2.toString();
    }

    public static void g(String str) {
        if (AbstractC5530A.f45131a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static final String h(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void i(int i10, int i11) {
        throw new EOFException(AbstractC0044t0.y("Unable to discard ", i10, " bytes: only ", i11, " available for writing"));
    }

    public static final Nf.i j(Nf.i iVar, Nf.i iVar2) {
        AbstractC3557B.c0("first", iVar);
        AbstractC3557B.c0("second", iVar2);
        if (iVar.isEmpty()) {
            return iVar2;
        }
        if (!iVar2.isEmpty()) {
            return new Nf.j(new Nf.i[]{iVar, iVar2});
        }
        return iVar;
    }

    public static void k(long j6, u uVar, L2.G[] gArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (uVar.a() > 1) {
                int i12 = 0;
                while (true) {
                    if (uVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int u10 = uVar.u();
                    i12 += u10;
                    if (u10 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (uVar.a() == 0) {
                        i13 = -1;
                        break;
                    }
                    int u11 = uVar.u();
                    i13 += u11;
                    if (u11 != 255) {
                        break;
                    }
                }
                int i14 = uVar.f45194b + i13;
                if (i13 != -1 && i13 <= uVar.a()) {
                    if (i10 == 4 && i13 >= 8) {
                        int u12 = uVar.u();
                        int z12 = uVar.z();
                        if (z12 == 49) {
                            i11 = uVar.g();
                        } else {
                            i11 = 0;
                        }
                        int u13 = uVar.u();
                        if (z12 == 47) {
                            uVar.G(1);
                        }
                        if (u12 == 181 && ((z12 == 49 || z12 == 47) && u13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z12 == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            l(j6, uVar, gArr);
                        }
                    }
                } else {
                    s2.p.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = uVar.f45195c;
                }
                uVar.F(i14);
            } else {
                return;
            }
        }
    }

    public static void l(long j6, u uVar, L2.G[] gArr) {
        int u10 = uVar.u();
        if ((u10 & 64) != 0) {
            uVar.G(1);
            int i10 = (u10 & 31) * 3;
            int i11 = uVar.f45194b;
            for (L2.G g10 : gArr) {
                uVar.F(i11);
                g10.a(i10, uVar);
                if (j6 != -9223372036854775807L) {
                    g10.e(j6, 1, i10, 0, null);
                }
            }
        }
    }

    public static Handler m(Looper looper) {
        Throwable e10;
        if (Build.VERSION.SDK_INT >= 28) {
            return r.d.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e11) {
            e10 = e11;
            AbstractC3612c.s("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
            return new Handler(looper);
        } catch (InstantiationException e12) {
            e10 = e12;
            AbstractC3612c.s("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
            return new Handler(looper);
        } catch (NoSuchMethodException e13) {
            e10 = e13;
            AbstractC3612c.s("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
            return new Handler(looper);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static AbstractC4825e n(Object obj, AbstractC4825e abstractC4825e, wf.n nVar) {
        AbstractC3557B.c0("<this>", nVar);
        AbstractC3557B.c0("completion", abstractC4825e);
        if (nVar instanceof AbstractC5154a) {
            return ((AbstractC5154a) nVar).create(obj, abstractC4825e);
        }
        AbstractC4831k context = abstractC4825e.getContext();
        if (context == C4832l.f40334Y) {
            return new C5001b(obj, abstractC4825e, nVar);
        }
        return new C5002c(abstractC4825e, context, nVar, obj);
    }

    public static final void o(int i10, int i11) {
        throw new EOFException(AbstractC0044t0.y("Unable to discard ", i10, " bytes: only ", i11, " available for reading"));
    }

    public static long p(long j6, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j6 / j10;
        long j12 = j6 - (j10 * j11);
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i10 == 0) {
            return j11;
        }
        int i11 = ((int) ((j6 ^ j10) >> 63)) | 1;
        switch (AbstractC6549d.f50837a[roundingMode.ordinal()]) {
            case 1:
                if (i10 == 0) {
                    return j11;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j11;
            case 3:
                if (i11 >= 0) {
                    return j11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return j11;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j12);
                int i12 = ((abs - (Math.abs(j10) - abs)) > 0L ? 1 : ((abs - (Math.abs(j10) - abs)) == 0L ? 0 : -1));
                if (i12 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (i12 <= 0) {
                    return j11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j11 + i11;
    }

    public static void q() {
        if (AbstractC5530A.f45131a >= 18) {
            Trace.endSection();
        }
    }

    public static final boolean r(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static long s(long j6, long j10) {
        U3.f.n(j6, "a");
        U3.f.n(j10, "b");
        if (j6 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j6;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
        long j11 = j6 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static final A3.f t(View view) {
        AbstractC3557B.c0("<this>", view);
        return (A3.f) m.j1(m.o1(Kg.p.c1(view, A3.g.f647Z), A3.g.f648h0));
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return H1.e.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List v(Application application) {
        Bundle bundle;
        if (f43651b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = application.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(application.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
                    String string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl");
                    if (string != null) {
                        try {
                            AbstractC2469q0.p(Class.forName(string, false, AbstractC5260f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, application));
                            arrayList.add(null);
                        } catch (Exception unused) {
                        }
                    }
                    while (r3.hasNext()) {
                    }
                }
            }
            if (f43651b == null) {
                f43651b = arrayList;
            }
        }
        return f43651b;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [q1.d, java.lang.Object] */
    public static C5258d w(Application application) {
        if (f43650a == null) {
            try {
                f43650a = (C5258d) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, AbstractC5260f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, application);
            } catch (Exception unused) {
            }
            if (f43650a == null) {
                f43650a = new Object();
            }
        }
        return f43650a;
    }

    public static final C5953f x() {
        C5953f c5953f = f43655f;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p p10 = R.a.p(0, 12.0f, 6.0f);
        p10.h(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        p10.h(-0.59f, 1.22f, -1.42f, 2.27f, -2.41f, 3.12f);
        p10.o(1.41f, 1.41f);
        p10.h(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        p10.g(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        p10.h(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        p10.o(1.65f, 1.65f);
        p10.g(10.66f, 6.09f, 11.32f, 6.0f, 12.0f, 6.0f);
        p10.f();
        p10.p(10.93f, 7.14f);
        p10.n(13.0f, 9.21f);
        p10.h(0.57f, 0.25f, 1.03f, 0.71f, 1.28f, 1.28f);
        p10.o(2.07f, 2.07f);
        p10.h(0.08f, -0.34f, 0.14f, -0.7f, 0.14f, -1.07f);
        p10.g(16.5f, 9.01f, 14.48f, 7.0f, 12.0f, 7.0f);
        p10.h(-0.37f, 0.0f, -0.72f, 0.05f, -1.07f, 0.14f);
        p10.f();
        p10.p(2.01f, 3.87f);
        p10.o(2.68f, 2.68f);
        p10.g(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        p10.g(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        p10.h(1.52f, 0.0f, 2.98f, -0.29f, 4.32f, -0.82f);
        p10.o(3.42f, 3.42f);
        p10.o(1.41f, -1.41f);
        E9.f.C(p10, 3.42f, 2.45f, 2.01f, 3.87f);
        p10.p(9.51f, 11.37f);
        p10.o(2.61f, 2.61f);
        p10.h(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f);
        p10.h(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        p10.h(0.0f, -0.05f, 0.01f, -0.08f, 0.01f, -0.13f);
        p10.f();
        p10.p(6.11f, 7.97f);
        p10.o(1.75f, 1.75f);
        p10.h(-0.23f, 0.55f, -0.36f, 1.15f, -0.36f, 1.78f);
        p10.h(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f);
        p10.h(0.63f, 0.0f, 1.23f, -0.13f, 1.77f, -0.36f);
        p10.o(0.98f, 0.98f);
        p10.h(-0.88f, 0.24f, -1.8f, 0.38f, -2.75f, 0.38f);
        p10.h(-3.79f, 0.0f, -7.17f, -2.13f, -8.82f, -5.5f);
        p10.h(0.7f, -1.43f, 1.72f, -2.61f, 2.93f, -3.53f);
        p10.f();
        C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f43655f = c10;
        return c10;
    }

    public static final int y(RemoteViews remoteViews, H0 h02, int i10, int i11, Integer num) {
        int i12;
        if (i10 != -1) {
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = h02.f22841g.incrementAndGet();
            }
            if (i12 != -1) {
                AbstractC3557B.c0("<this>", remoteViews);
                remoteViews.setInt(i10, "setInflatedId", i12);
            }
            if (i11 != 0) {
                AbstractC3557B.c0("<this>", remoteViews);
                remoteViews.setInt(i10, "setLayoutResource", i11);
            }
            remoteViews.setViewVisibility(i10, 0);
            return i12;
        }
        throw new IllegalArgumentException("viewStubId must not be View.NO_ID".toString());
    }

    public static AbstractC4825e z(AbstractC4825e abstractC4825e) {
        AbstractC5156c abstractC5156c;
        AbstractC4825e intercepted;
        AbstractC3557B.c0("<this>", abstractC4825e);
        if (abstractC4825e instanceof AbstractC5156c) {
            abstractC5156c = (AbstractC5156c) abstractC4825e;
        } else {
            abstractC5156c = null;
        }
        if (abstractC5156c != null && (intercepted = abstractC5156c.intercepted()) != null) {
            return intercepted;
        }
        return abstractC4825e;
    }
}
