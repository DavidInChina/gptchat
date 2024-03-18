package M3;

import A.AbstractC0040r0;
import A.AbstractC0044t0;
import A.C0051x;
import B0.C0189f;
import B0.C0194k;
import E.g0;
import E.i0;
import G.U;
import G0.C0571a;
import G4.C0613f;
import G4.C0617j;
import H0.AbstractC0701r0;
import H0.Y0;
import H0.Z;
import L3.C0889a;
import N.AbstractC1031o;
import N.C1019c;
import N.C1020d;
import N.C1021e;
import N.C1023g;
import N.C1026j;
import N.EnumC1027k;
import N.h0;
import N0.C1042a;
import S0.AbstractC1356q;
import S8.M;
import W.AbstractC1523a1;
import W.AbstractC1530b3;
import W.C1611s0;
import W.C1616t0;
import W.G3;
import W.O;
import W.P0;
import W.R0;
import X.AbstractC1677k;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1705d;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import a7.C1933b;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowMetrics;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.play_billing.AbstractC2486z0;
import com.google.android.gms.internal.play_billing.C0;
import com.google.android.gms.internal.play_billing.C2437a0;
import com.google.android.gms.internal.play_billing.C2470r0;
import com.google.android.gms.internal.play_billing.Q;
import com.google.android.gms.internal.play_billing.S;
import com.google.android.gms.internal.play_billing.X;
import com.openai.chatgpt.R;
import d1.AbstractC2575j;
import d1.C2587v;
import ee.C2881B;
import ee.C2882C;
import ee.C2888f;
import h.C3287m;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jf.AbstractC3953c;
import k.C4145a;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import o0.C4869d;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q0.C5251c;
import q0.C5252d;
import q5.C5271a;
import r.ExecutorC5333a;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import r0.C5339c;
import r0.C5341e;
import r0.N;
import r5.AbstractC5368c;
import t0.AbstractC5648g;
import t0.C5642a;
import t0.C5644c;
import u5.C5843c;
import u8.C5859i;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v4.C5971a;
import wf.AbstractC6216a;
import x8.L;
import x8.k0;
import y.C6477o;
import y.P;
import y3.AbstractC6540b;
import y5.AbstractC6542a;
import yf.AbstractC6583a;
import z8.C6779a;

/* loaded from: classes2.dex */
public abstract class H {

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences f11528b = null;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f11529c = null;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f11530d = null;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f11531e = null;

    /* renamed from: f  reason: collision with root package name */
    public static C5953f f11532f = null;

    /* renamed from: g  reason: collision with root package name */
    public static C3636c1 f11533g = null;

    /* renamed from: h  reason: collision with root package name */
    public static C5953f f11534h = null;

    /* renamed from: i  reason: collision with root package name */
    public static final int f11535i = 9;

    public static final void A(int i10, int i11, int[] iArr) {
        boolean z10;
        if (i11 >= 0 && i11 < 67108863) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1734s.o(z10);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final String A0(float f6) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f10 = f6 * pow;
        int i10 = (int) f10;
        if (f10 - i10 >= 0.5f) {
            i10++;
        }
        float f11 = i10 / pow;
        if (max > 0) {
            return String.valueOf(f11);
        }
        return String.valueOf((int) f11);
    }

    public static final boolean B(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public static void B0(AbstractC5368c abstractC5368c, wf.n nVar) {
        y5.h hVar = (y5.h) abstractC5368c;
        AbstractC6542a abstractC6542a = hVar.f50812a.f50793k;
        if (!(abstractC6542a instanceof y5.f)) {
            C5271a context = abstractC6542a.getContext();
            hVar.f50817f.I(context, false, new s3.r(nVar, 5, context));
        }
    }

    public static final V6.c C(InputStream inputStream, Charset charset) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        return new V6.c(bufferedReader);
    }

    public static int C0(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        int J02 = J0(bArr, i10, a5);
        int i11 = a5.f26821a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - J02) {
                if (i11 == 0) {
                    a5.f26823c = com.google.android.gms.internal.play_billing.E.f26839Z;
                    return J02;
                }
                a5.f26823c = com.google.android.gms.internal.play_billing.E.T(bArr, J02, i11);
                return J02 + i11;
            }
            throw C2437a0.d();
        }
        throw C2437a0.b();
    }

    public static final Y.b D(Activity activity, AbstractC1725n abstractC1725n) {
        Rect rect;
        int i10;
        int i11;
        WindowMetrics currentWindowMetrics;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(866044206);
        rVar.m(Z.f6887a);
        Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        K3.c.f9332a.getClass();
        AbstractC3557B.c0("activity", activity);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            AbstractC3557B.b0("activity.windowManager.currentWindowMetrics.bounds", rect);
        } else if (i12 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect = new Rect((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } catch (IllegalAccessException e10) {
                AbstractC3612c.t("a", e10);
                rect = L4.a.g0(activity);
            } catch (NoSuchFieldException e11) {
                AbstractC3612c.t("a", e11);
                rect = L4.a.g0(activity);
            } catch (NoSuchMethodException e12) {
                AbstractC3612c.t("a", e12);
                rect = L4.a.g0(activity);
            } catch (InvocationTargetException e13) {
                AbstractC3612c.t("a", e13);
                rect = L4.a.g0(activity);
            }
        } else if (i12 >= 28) {
            rect = L4.a.g0(activity);
        } else if (i12 >= 24) {
            Rect rect2 = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect2);
            if (!B1.g.x(activity)) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i11 = resources.getDimensionPixelSize(identifier);
                } else {
                    i11 = 0;
                }
                int i13 = rect2.bottom + i11;
                if (i13 == point.y) {
                    rect2.bottom = i13;
                } else {
                    int i14 = rect2.right + i11;
                    if (i14 == point.x) {
                        rect2.right = i14;
                    }
                }
            }
            rect = rect2;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            AbstractC3557B.b0("defaultDisplay", defaultDisplay2);
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect3 = new Rect();
            int i15 = point2.x;
            if (i15 != 0 && (i10 = point2.y) != 0) {
                rect3.right = i15;
                rect3.bottom = i10;
            } else {
                defaultDisplay2.getRectSize(rect3);
            }
            rect = rect3;
        }
        Rect rect4 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        long p10 = bVar.p(AbstractC4828h.i(rect4.right - rect4.left, rect4.bottom - rect4.top));
        int i16 = Y.b.f22007c;
        Y.b c10 = io.sentry.hints.i.c(p10);
        rVar.t(false);
        return c10;
    }

    public static String D0(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append(Separators.AT);
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb4), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + sb4.length() + 8 + 1);
                    sb5.append(Separators.LESS_THAN);
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(Separators.GREATER_THAN);
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static int E(long j6) {
        boolean z10;
        int i10 = (int) j6;
        if (i10 == j6) {
            z10 = true;
        } else {
            z10 = false;
        }
        P4.a.q(z10, "Out of range: %s", j6);
        return i10;
    }

    public static int E0(int i10, byte[] bArr) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static final int F(float f6) {
        double floor;
        if (f6 >= 0.0f) {
            floor = Math.ceil(f6);
        } else {
            floor = Math.floor(f6);
        }
        return ((int) floor) * (-1);
    }

    public static int F0(AbstractC2486z0 abstractC2486z0, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.play_billing.A a5) {
        Q q10 = abstractC2486z0.q();
        int N02 = N0(q10, abstractC2486z0, bArr, i10, i11, i12, a5);
        abstractC2486z0.a(q10);
        a5.f26823c = q10;
        return N02;
    }

    public static int G(int i10, int i11) {
        if (i11 <= 1073741823) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(r9.y.K0("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    public static int G0(AbstractC2486z0 abstractC2486z0, int i10, byte[] bArr, int i11, int i12, X x10, com.google.android.gms.internal.play_billing.A a5) {
        Q q10 = abstractC2486z0.q();
        int O02 = O0(q10, abstractC2486z0, bArr, i11, i12, a5);
        abstractC2486z0.a(q10);
        a5.f26823c = q10;
        x10.add(q10);
        while (O02 < i12) {
            int J02 = J0(bArr, O02, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            Q q11 = abstractC2486z0.q();
            int O03 = O0(q11, abstractC2486z0, bArr, J02, i12, a5);
            abstractC2486z0.a(q11);
            a5.f26823c = q11;
            x10.add(q11);
            O02 = O03;
        }
        return O02;
    }

    public static final int H(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int H0(byte[] bArr, int i10, X x10, com.google.android.gms.internal.play_billing.A a5) {
        S s10 = (S) x10;
        int J02 = J0(bArr, i10, a5);
        int i11 = a5.f26821a + J02;
        while (J02 < i11) {
            J02 = J0(bArr, J02, a5);
            s10.s(a5.f26821a);
        }
        if (J02 == i11) {
            return J02;
        }
        throw C2437a0.d();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [nf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [nf.h, java.lang.Object] */
    public static AbstractC4828h I(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static int I0(int i10, byte[] bArr, int i11, int i12, C0 c02, com.google.android.gms.internal.play_billing.A a5) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                c02.c(i10, Integer.valueOf(E0(i11, bArr)));
                                return i11 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i14 = (i10 & (-8)) | 4;
                        C0 b10 = C0.b();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int J02 = J0(bArr, i11, a5);
                            int i16 = a5.f26821a;
                            i15 = i16;
                            if (i16 != i14) {
                                int I02 = I0(i15, bArr, J02, i12, b10, a5);
                                i15 = i16;
                                i11 = I02;
                            } else {
                                i11 = J02;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            c02.c(i10, b10);
                            return i11;
                        }
                        throw C2437a0.c();
                    }
                    int J03 = J0(bArr, i11, a5);
                    int i17 = a5.f26821a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - J03) {
                            if (i17 == 0) {
                                c02.c(i10, com.google.android.gms.internal.play_billing.E.f26839Z);
                            } else {
                                c02.c(i10, com.google.android.gms.internal.play_billing.E.T(bArr, J03, i17));
                            }
                            return J03 + i17;
                        }
                        throw C2437a0.d();
                    }
                    throw C2437a0.b();
                }
                c02.c(i10, Long.valueOf(P0(i11, bArr)));
                return i11 + 8;
            }
            int M02 = M0(bArr, i11, a5);
            c02.c(i10, Long.valueOf(a5.f26822b));
            return M02;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static f8.e J() {
        return new f8.e(0);
    }

    public static int J0(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            a5.f26821a = b10;
            return i11;
        }
        return K0(b10, bArr, i11, a5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 > r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r0.z K(C4869d c4869d, float f6) {
        C5339c c5339c;
        C5644c c5644c;
        int ceil = ((int) Math.ceil(f6)) * 2;
        r0.z zVar = h0.f12346b;
        AbstractC5352p abstractC5352p = h0.f12347c;
        C5644c c5644c2 = h0.f12348d;
        if (zVar != null && abstractC5352p != null) {
            Bitmap bitmap = ((C5341e) zVar).f44234a;
            if (ceil <= bitmap.getWidth()) {
                c5339c = abstractC5352p;
            }
        }
        zVar = androidx.compose.ui.graphics.a.e(ceil, ceil, 1);
        h0.f12346b = zVar;
        Canvas canvas = AbstractC5340d.f44233a;
        C5339c c5339c2 = new C5339c();
        c5339c2.f44230a = new Canvas(androidx.compose.ui.graphics.a.j(zVar));
        h0.f12347c = c5339c2;
        c5339c = c5339c2;
        r0.z zVar2 = zVar;
        AbstractC5352p abstractC5352p2 = c5339c;
        if (c5644c2 == null) {
            c5644c = new C5644c();
            h0.f12348d = c5644c;
        } else {
            c5644c = c5644c2;
        }
        Z0.l layoutDirection = c4869d.f40415Y.getLayoutDirection();
        Bitmap bitmap2 = ((C5341e) zVar2).f44234a;
        long i10 = AbstractC4828h.i(bitmap2.getWidth(), bitmap2.getHeight());
        C5642a c5642a = c5644c.f45611Y;
        Z0.b bVar = c5642a.f45605a;
        Z0.l lVar = c5642a.f45606b;
        AbstractC5352p abstractC5352p3 = c5642a.f45607c;
        long j6 = c5642a.f45608d;
        c5642a.f45605a = c4869d;
        c5642a.f45606b = layoutDirection;
        c5642a.f45607c = abstractC5352p2;
        c5642a.f45608d = i10;
        abstractC5352p2.h();
        AbstractC5648g.k(c5644c, r0.r.f44254b, 0L, c5644c.g(), 0.0f, 58);
        AbstractC5648g.k(c5644c, androidx.compose.ui.graphics.a.c(4278190080L), C5251c.f43619b, AbstractC4828h.i(f6, f6), 0.0f, 120);
        AbstractC5648g.c(c5644c, androidx.compose.ui.graphics.a.c(4278190080L), f6, R4.b.r(f6, f6), null, 120);
        abstractC5352p2.q();
        c5642a.f45605a = bVar;
        c5642a.f45606b = lVar;
        c5642a.f45607c = abstractC5352p3;
        c5642a.f45608d = j6;
        return zVar2;
    }

    public static int K0(int i10, byte[] bArr, int i11, com.google.android.gms.internal.play_billing.A a5) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            a5.f26821a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            a5.f26821a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            a5.f26821a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            a5.f26821a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                a5.f26821a = i20;
                return i21;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03fc A[LOOP:6: B:113:0x03ca->B:124:0x03fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0406 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final F L(Context context, C0889a c0889a) {
        x3.x xVar;
        int i10;
        String str;
        int i11;
        AbstractC3557B.c0("context", context);
        X3.b bVar = new X3.b(c0889a.f10685b);
        final Context applicationContext = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext);
        V3.n nVar = bVar.f21779a;
        AbstractC3557B.b0("workTaskExecutor.serialTaskExecutor", nVar);
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        R4.a aVar = c0889a.f10686c;
        AbstractC3557B.c0("clock", aVar);
        if (z10) {
            xVar = new x3.x(applicationContext, null);
            xVar.f48742j = true;
        } else if (!Lg.n.n2("androidx.work.workdb")) {
            x3.x xVar2 = new x3.x(applicationContext, "androidx.work.workdb");
            xVar2.f48741i = new B3.e() { // from class: M3.y
                @Override // B3.e
                public final B3.f P(B3.d dVar) {
                    Context context2 = applicationContext;
                    AbstractC3557B.c0("$context", context2);
                    B3.c cVar = dVar.f1833c;
                    AbstractC3557B.c0("callback", cVar);
                    String str2 = dVar.f1832b;
                    if (str2 != null && str2.length() != 0) {
                        return new C3.f(context2, str2, cVar, true, true);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
            };
            xVar = xVar2;
        } else {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
        }
        xVar.f48739g = nVar;
        C0933b c0933b = new C0933b(aVar);
        ArrayList arrayList = xVar.f48736d;
        arrayList.add(c0933b);
        xVar.a(C0940i.f11570c);
        xVar.a(new r(applicationContext, 2, 3));
        xVar.a(C0941j.f11571c);
        xVar.a(k.f11572c);
        xVar.a(new r(applicationContext, 5, 6));
        xVar.a(l.f11573c);
        xVar.a(m.f11574c);
        xVar.a(n.f11575c);
        xVar.a(new r(applicationContext));
        xVar.a(new r(applicationContext, 10, 11));
        xVar.a(C0936e.f11566c);
        xVar.a(C0937f.f11567c);
        xVar.a(C0938g.f11568c);
        xVar.a(C0939h.f11569c);
        xVar.f48744l = false;
        xVar.f48745m = true;
        Executor executor = xVar.f48739g;
        if (executor == null && xVar.f48740h == null) {
            ExecutorC5333a executorC5333a = r.b.f44149h;
            xVar.f48740h = executorC5333a;
            xVar.f48739g = executorC5333a;
        } else if (executor != null && xVar.f48740h == null) {
            xVar.f48740h = executor;
        } else if (executor == null) {
            xVar.f48739g = xVar.f48740h;
        }
        HashSet hashSet = xVar.f48749q;
        LinkedHashSet linkedHashSet = xVar.f48748p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                    throw new IllegalArgumentException(android.gov.nist.core.a.e("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        B3.e eVar = xVar.f48741i;
        B3.e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = new Object();
        }
        if (xVar.f48746n > 0) {
            if (xVar.f48735c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        boolean z11 = xVar.f48742j;
        int i12 = xVar.f48743k;
        if (i12 != 0) {
            Context context2 = xVar.f48733a;
            AbstractC3557B.c0("context", context2);
            if (i12 != 1) {
                i10 = i12;
            } else {
                Object systemService = context2.getSystemService("activity");
                AbstractC3557B.a0("null cannot be cast to non-null type android.app.ActivityManager", systemService);
                if (!((ActivityManager) systemService).isLowRamDevice()) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
            }
            Executor executor2 = xVar.f48739g;
            if (executor2 != null) {
                Executor executor3 = xVar.f48740h;
                if (executor3 != null) {
                    x3.e eVar3 = new x3.e(context2, xVar.f48735c, eVar2, xVar.f48747o, arrayList, z11, i10, executor2, executor3, xVar.f48744l, xVar.f48745m, linkedHashSet, xVar.f48737e, xVar.f48738f);
                    Class cls = xVar.f48734b;
                    AbstractC3557B.c0("klass", cls);
                    Package r12 = cls.getPackage();
                    AbstractC3557B.Z(r12);
                    String name = r12.getName();
                    String canonicalName = cls.getCanonicalName();
                    AbstractC3557B.Z(canonicalName);
                    AbstractC3557B.b0("fullPackage", name);
                    if (name.length() != 0) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                        AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", canonicalName);
                    }
                    String concat = Lg.n.z2(canonicalName, '.', '_').concat("_Impl");
                    try {
                        if (name.length() == 0) {
                            str = concat;
                        } else {
                            str = name + '.' + concat;
                        }
                        Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
                        AbstractC3557B.a0("null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>", cls2);
                        x3.y yVar = (x3.y) cls2.newInstance();
                        yVar.getClass();
                        yVar.f48752c = yVar.e(eVar3);
                        Set h10 = yVar.h();
                        BitSet bitSet = new BitSet();
                        Iterator it2 = h10.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            LinkedHashMap linkedHashMap = yVar.f48756g;
                            List list = eVar3.f48685o;
                            if (hasNext) {
                                Class cls3 = (Class) it2.next();
                                int size = list.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i13 = size - 1;
                                        if (cls3.isAssignableFrom(list.get(size).getClass())) {
                                            bitSet.set(size);
                                            break;
                                        } else if (i13 < 0) {
                                            break;
                                        } else {
                                            size = i13;
                                        }
                                    }
                                }
                                size = -1;
                                if (size >= 0) {
                                    linkedHashMap.put(cls3, list.get(size));
                                } else {
                                    throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                                }
                            } else {
                                int size2 = list.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i14 = size2 - 1;
                                        if (bitSet.get(size2)) {
                                            if (i14 < 0) {
                                                break;
                                            }
                                            size2 = i14;
                                        } else {
                                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                                        }
                                    }
                                }
                                for (AbstractC6540b abstractC6540b : yVar.f(linkedHashMap)) {
                                    int i15 = abstractC6540b.f50712a;
                                    androidx.lifecycle.D d10 = eVar3.f48674d;
                                    Map map = d10.f25290b;
                                    if (map.containsKey(Integer.valueOf(i15))) {
                                        Map map2 = (Map) map.get(Integer.valueOf(i15));
                                        if (map2 == null) {
                                            map2 = kf.w.f37484Y;
                                        }
                                        if (!map2.containsKey(Integer.valueOf(abstractC6540b.f50713b))) {
                                        }
                                    }
                                    d10.b(abstractC6540b);
                                }
                                boolean z12 = true;
                                x3.C c10 = (x3.C) x3.y.o(x3.C.class, yVar.g());
                                x3.d dVar = (x3.d) x3.y.o(x3.d.class, yVar.g());
                                x3.n nVar2 = yVar.f48753d;
                                if (eVar3.f48677g != 3) {
                                    z12 = false;
                                }
                                yVar.g().setWriteAheadLoggingEnabled(z12);
                                yVar.f48755f = eVar3.f48675e;
                                yVar.f48751b = eVar3.f48678h;
                                AbstractC3557B.c0("executor", eVar3.f48679i);
                                new ArrayDeque();
                                yVar.f48754e = eVar3.f48676f;
                                Intent intent = eVar3.f48680j;
                                if (intent != null) {
                                    String str2 = eVar3.f48672b;
                                    if (str2 != null) {
                                        nVar2.getClass();
                                        Context context3 = eVar3.f48671a;
                                        AbstractC3557B.c0("context", context3);
                                        Executor executor4 = nVar2.f48697a.f48751b;
                                        if (executor4 != null) {
                                            new x3.s(context3, str2, intent, nVar2, executor4);
                                        } else {
                                            AbstractC3557B.C2("internalQueryExecutor");
                                            throw null;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                                Map i16 = yVar.i();
                                BitSet bitSet2 = new BitSet();
                                Iterator it3 = i16.entrySet().iterator();
                                while (true) {
                                    boolean hasNext2 = it3.hasNext();
                                    List list2 = eVar3.f48684n;
                                    if (hasNext2) {
                                        Map.Entry entry = (Map.Entry) it3.next();
                                        Class cls4 = (Class) entry.getKey();
                                        for (Class cls5 : (List) entry.getValue()) {
                                            int size3 = list2.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i17 = size3 - 1;
                                                    if (cls5.isAssignableFrom(list2.get(size3).getClass())) {
                                                        bitSet2.set(size3);
                                                        i11 = size3;
                                                        break;
                                                    } else if (i17 < 0) {
                                                        break;
                                                    } else {
                                                        size3 = i17;
                                                    }
                                                }
                                                if (i11 < 0) {
                                                    yVar.f48760k.put(cls5, list2.get(i11));
                                                } else {
                                                    throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                                                }
                                            }
                                            i11 = -1;
                                            if (i11 < 0) {
                                            }
                                        }
                                    } else {
                                        int size4 = list2.size() - 1;
                                        if (size4 >= 0) {
                                            while (true) {
                                                int i18 = size4 - 1;
                                                if (bitSet2.get(size4)) {
                                                    if (i18 < 0) {
                                                        break;
                                                    }
                                                    size4 = i18;
                                                } else {
                                                    throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                }
                                            }
                                        }
                                        WorkDatabase workDatabase = (WorkDatabase) yVar;
                                        Context applicationContext2 = context.getApplicationContext();
                                        AbstractC3557B.b0("context.applicationContext", applicationContext2);
                                        S3.m mVar = new S3.m(applicationContext2, bVar);
                                        q qVar = new q(context.getApplicationContext(), c0889a, bVar, workDatabase);
                                        return new F(context.getApplicationContext(), c0889a, bVar, workDatabase, (List) G.f11527Y.k(context, c0889a, bVar, workDatabase, mVar, qVar), qVar, mVar);
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                        throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist");
                    } catch (IllegalAccessException unused2) {
                        throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
                    } catch (InstantiationException unused3) {
                        throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw null;
        }
    }

    public static int L0(int i10, byte[] bArr, int i11, int i12, X x10, com.google.android.gms.internal.play_billing.A a5) {
        S s10 = (S) x10;
        int J02 = J0(bArr, i11, a5);
        s10.s(a5.f26821a);
        while (J02 < i12) {
            int J03 = J0(bArr, J02, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            J02 = J0(bArr, J03, a5);
            s10.s(a5.f26821a);
        }
        return J02;
    }

    public static void M(String str, String str2, Object obj) {
        String W6 = W(str);
        if (Log.isLoggable(W6, 3)) {
            Log.d(W6, String.format(str2, obj));
        }
    }

    public static int M0(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        byte b10;
        long j6 = bArr[i10];
        int i11 = i10 + 1;
        if (j6 >= 0) {
            a5.f26822b = j6;
            return i11;
        }
        int i12 = i10 + 2;
        byte b11 = bArr[i11];
        long j10 = (j6 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        a5.f26822b = j10;
        return i12;
    }

    public static void N(String str, String str2, Exception exc) {
        String W6 = W(str);
        if (Log.isLoggable(W6, 6)) {
            AbstractC3612c.d(W6, str2, exc);
        }
    }

    public static int N0(Object obj, AbstractC2486z0 abstractC2486z0, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.play_billing.A a5) {
        int t10 = ((C2470r0) abstractC2486z0).t(obj, bArr, i10, i11, i12, a5);
        a5.f26823c = obj;
        return t10;
    }

    public static boolean O(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int O0(Object obj, AbstractC2486z0 abstractC2486z0, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A a5) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = K0(i13, bArr, i12, a5);
            i13 = a5.f26821a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            abstractC2486z0.g(obj, bArr, i14, i15, a5);
            a5.f26823c = obj;
            return i15;
        }
        throw C2437a0.d();
    }

    public static boolean P(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static long P0(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    public static final C5953f Q() {
        C5953f c5953f = f11531e;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        N n10 = new N(r0.r.f44254b);
        Wh.p pVar = new Wh.p(0);
        pVar.p(16.0f, 9.0f);
        pVar.x(10.0f);
        pVar.l(8.0f);
        pVar.w(9.0f);
        pVar.m(8.0f);
        pVar.q(-1.5f, -6.0f);
        pVar.m(-5.0f);
        pVar.o(-1.0f, 1.0f);
        pVar.l(5.0f);
        pVar.x(2.0f);
        pVar.m(14.0f);
        pVar.w(4.0f);
        pVar.m(-3.5f);
        pVar.o(-1.0f, -1.0f);
        pVar.f();
        pVar.p(18.0f, 7.0f);
        pVar.l(6.0f);
        pVar.x(12.0f);
        pVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pVar.m(8.0f);
        pVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pVar.w(7.0f);
        pVar.f();
        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f11531e = c10;
        return c10;
    }

    public static Object R(AbstractCollection abstractCollection) {
        Object next;
        if (abstractCollection instanceof List) {
            List list = (List) abstractCollection;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = abstractCollection.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static U3.n S(Window window) {
        be.i iVar;
        U3.n nVar;
        synchronized (be.i.f25964l0) {
            try {
                WeakHashMap weakHashMap = be.i.f25963k0;
                WeakReference weakReference = (WeakReference) weakHashMap.get(window);
                if (weakReference != null) {
                    iVar = (be.i) weakReference.get();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    return iVar.f25965Z;
                }
                Window.Callback callback = window.getCallback();
                if (callback == null) {
                    nVar = new U3.n(10);
                } else {
                    be.i iVar2 = new be.i(callback);
                    window.setCallback(iVar2);
                    weakHashMap.put(window, new WeakReference(iVar2));
                    nVar = iVar2.f25965Z;
                }
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Object T(k0 k0Var) {
        L listIterator = k0Var.listIterator(0);
        Object next = listIterator.next();
        if (!listIterator.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && listIterator.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(listIterator.next());
        }
        if (listIterator.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final long U(double d10) {
        return b0((float) d10, 4294967296L);
    }

    public static final long V(int i10) {
        return b0(i10, 4294967296L);
    }

    public static String W(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static final C5953f X() {
        C5953f c5953f = f11534h;
        if (c5953f != null) {
            return c5953f;
        }
        float f6 = (float) 24.0d;
        C5952e c5952e = new C5952e("ThumbDown", f6, f6, 24.0f, 24.0f, 0L, 0, false, 224);
        N n10 = new N(androidx.compose.ui.graphics.a.b(0));
        N n11 = new N(androidx.compose.ui.graphics.a.c(4278190080L));
        Wh.p pVar = new Wh.p(0);
        pVar.p(16.0f, 14.0f);
        pVar.n(11.0f, 21.0f);
        pVar.n(10.5463f, 20.9433f);
        pVar.g(8.6959f, 20.712f, 7.5026f, 18.8665f, 8.051f, 17.0842f);
        pVar.n(9.0f, 14.0f);
        pVar.l(6.9278f);
        pVar.g(4.9496f, 14.0f, 3.513f, 12.1191f, 4.0335f, 10.2107f);
        pVar.n(5.3971f, 5.2107f);
        pVar.g(5.7531f, 3.9055f, 6.9385f, 3.0f, 8.2914f, 3.0f);
        pVar.l(17.0f);
        pVar.g(18.6569f, 3.0f, 20.0f, 4.3432f, 20.0f, 6.0f);
        pVar.n(20.0f, 11.0f);
        pVar.g(20.0f, 12.6569f, 18.6569f, 14.0f, 17.0f, 14.0f);
        pVar.l(16.0f);
        pVar.f();
        pVar.p(16.0f, 14.0f);
        pVar.w(8.5f);
        pVar.w(6.0f);
        pVar.g(16.0f, 4.3432f, 14.6569f, 3.0f, 13.0f, 3.0f);
        pVar.l(9.0f);
        C5952e.b(c5952e, pVar.f21239a, 0, n10, n11, 2.0f, 0, 1, 4.0f);
        C5953f c10 = c5952e.c();
        f11534h = c10;
        return c10;
    }

    public static final boolean Y(q5.g gVar) {
        AbstractC3557B.c0("<this>", gVar);
        if (gVar.f43937a != null || gVar.f43938b != null || gVar.f43939c != null || (!gVar.f43940d.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final int Z(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final boolean a0(long j6) {
        Z0.o[] oVarArr = Z0.n.f22809b;
        if ((j6 & 1095216660480L) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC4326r abstractC4326r, r0.L l10, C1611s0 c1611s0, C1616t0 c1616t0, C0051x c0051x, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        r0.L l11;
        C1611s0 c1611s02;
        C1616t0 c1616t02;
        C0051x c0051x2;
        C0051x c0051x3;
        C1616t0 c1616t03;
        C1611s0 c1611s03;
        r0.L l12;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        r0.L l13;
        C0051x c0051x4;
        C1616t0 c1616t04;
        io.sentry.hints.i iVar;
        Object K10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1179621553);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                l11 = l10;
                if (rVar.g(l11)) {
                    i17 = 32;
                    i12 |= i17;
                }
            } else {
                l11 = l10;
            }
            i17 = 16;
            i12 |= i17;
        } else {
            l11 = l10;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                c1611s02 = c1611s0;
                if (rVar.g(c1611s02)) {
                    i16 = 256;
                    i12 |= i16;
                }
            } else {
                c1611s02 = c1611s0;
            }
            i16 = 128;
            i12 |= i16;
        } else {
            c1611s02 = c1611s0;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                c1616t02 = c1616t0;
                if (rVar.g(c1616t02)) {
                    i15 = 2048;
                    i12 |= i15;
                }
            } else {
                c1616t02 = c1616t0;
            }
            i15 = 1024;
            i12 |= i15;
        } else {
            c1616t02 = c1616t0;
        }
        int i20 = i11 & 16;
        if (i20 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            c0051x2 = c0051x;
            if (rVar.g(c0051x2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
            if ((i11 & 32) == 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (rVar.i(oVar)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i12 |= i13;
            }
            if ((74899 & i12) != 74898 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                l12 = l11;
                c1611s03 = c1611s02;
                c1616t03 = c1616t02;
                c0051x3 = c0051x2;
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    abstractC4326r3 = abstractC4326r2;
                    l13 = l11;
                } else {
                    if (i19 == 0) {
                        abstractC4326r3 = C4323o.f37719b;
                    } else {
                        abstractC4326r3 = abstractC4326r2;
                    }
                    if ((i11 & 2) == 0) {
                        rVar.W(1266660211);
                        l13 = AbstractC1530b3.a(X.n.f21600b, rVar);
                        rVar.t(false);
                        i12 &= -113;
                    } else {
                        l13 = l11;
                    }
                    if ((i11 & 4) != 0) {
                        rVar.W(-1876034303);
                        C1611s0 f6 = AbstractC1523a1.f((P0) rVar.m(R0.f19593a));
                        rVar.t(false);
                        i12 &= -897;
                        c1611s02 = f6;
                    }
                    if ((i11 & 8) != 0) {
                        rVar.W(-574898487);
                        C1616t0 c1616t05 = new C1616t0(X.n.f21599a, X.n.f21606h, X.n.f21604f, X.n.f21605g, X.n.f21603e, X.n.f21602d);
                        rVar.t(false);
                        i12 &= -7169;
                        c1616t02 = c1616t05;
                    }
                    if (i20 != 0) {
                        c0051x4 = null;
                        c1616t04 = c1616t02;
                        C1611s0 c1611s04 = c1611s02;
                        int i21 = i12;
                        rVar.u();
                        long j6 = c1611s04.f20398a;
                        float f10 = c1616t04.f20418a;
                        rVar.W(-1763481333);
                        rVar.W(-1409178619);
                        iVar = C1723m.f22654Y;
                        rVar.W(-1409178567);
                        K10 = rVar.K();
                        if (K10 == iVar) {
                            K10 = AbstractC4828h.Z(new Z0.e(c1616t04.f20418a), o1.f22665a);
                            rVar.h0(K10);
                        }
                        rVar.t(false);
                        rVar.t(false);
                        rVar.t(false);
                        int i22 = (i21 & 14) | 12582912 | (i21 & 112) | ((i21 << 6) & 3670016);
                        G3.a(abstractC4326r3, l13, j6, c1611s04.f20399b, f10, ((Z0.e) ((AbstractC1710f0) K10).getValue()).f22788Y, c0051x4, R4.b.X(rVar, 664103990, new O(oVar, 2)), rVar, i22, 0);
                        l12 = l13;
                        c1611s03 = c1611s04;
                        c1616t03 = c1616t04;
                        c0051x3 = c0051x4;
                    }
                }
                c1616t04 = c1616t02;
                c0051x4 = c0051x2;
                C1611s0 c1611s042 = c1611s02;
                int i212 = i12;
                rVar.u();
                long j62 = c1611s042.f20398a;
                float f102 = c1616t04.f20418a;
                rVar.W(-1763481333);
                rVar.W(-1409178619);
                iVar = C1723m.f22654Y;
                rVar.W(-1409178567);
                K10 = rVar.K();
                if (K10 == iVar) {
                }
                rVar.t(false);
                rVar.t(false);
                rVar.t(false);
                int i222 = (i212 & 14) | 12582912 | (i212 & 112) | ((i212 << 6) & 3670016);
                G3.a(abstractC4326r3, l13, j62, c1611s042.f20399b, f102, ((Z0.e) ((AbstractC1710f0) K10).getValue()).f22788Y, c0051x4, R4.b.X(rVar, 664103990, new O(oVar, 2)), rVar, i222, 0);
                l12 = l13;
                c1611s03 = c1611s042;
                c1616t03 = c1616t04;
                c0051x3 = c0051x4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C6477o(abstractC4326r3, l12, c1611s03, c1616t03, c0051x3, oVar, i10, i11);
                return;
            }
            return;
        }
        c0051x2 = c0051x;
        if ((i11 & 32) == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i19 == 0) {
        }
        if ((i11 & 2) == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        if (i20 != 0) {
        }
        c1616t04 = c1616t02;
        c0051x4 = c0051x2;
        C1611s0 c1611s0422 = c1611s02;
        int i2122 = i12;
        rVar.u();
        long j622 = c1611s0422.f20398a;
        float f1022 = c1616t04.f20418a;
        rVar.W(-1763481333);
        rVar.W(-1409178619);
        iVar = C1723m.f22654Y;
        rVar.W(-1409178567);
        K10 = rVar.K();
        if (K10 == iVar) {
        }
        rVar.t(false);
        rVar.t(false);
        rVar.t(false);
        int i2222 = (i2122 & 14) | 12582912 | (i2122 & 112) | ((i2122 << 6) & 3670016);
        G3.a(abstractC4326r3, l13, j622, c1611s0422.f20399b, f1022, ((Z0.e) ((AbstractC1710f0) K10).getValue()).f22788Y, c0051x4, R4.b.X(rVar, 664103990, new O(oVar, 2)), rVar, i2222, 0);
        l12 = l13;
        c1611s03 = c1611s0422;
        c1616t03 = c1616t04;
        c0051x3 = c0051x4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final long b0(float f6, long j6) {
        long floatToIntBits = j6 | (Float.floatToIntBits(f6) & 4294967295L);
        Z0.o[] oVarArr = Z0.n.f22809b;
        return floatToIntBits;
    }

    public static final void c(M m10, boolean z10, wf.p pVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("children", pVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-669923173);
        if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(z10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            C4323o c4323o = C4323o.f37719b;
            if (!z10) {
                rVar.W(-1315612531);
                pVar.h(m10, androidx.compose.foundation.a.k(c4323o, androidx.compose.foundation.a.l(rVar)), rVar, Integer.valueOf((i11 & 896) | (i11 & 14)));
                rVar.t(false);
            } else {
                rVar.W(-1315612423);
                pVar.h(m10, c4323o, rVar, Integer.valueOf((i11 & 896) | (i11 & 14) | 48));
                rVar.t(false);
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1021e(m10, z10, pVar, i10, 2);
        }
    }

    public static C4.a c0(H4.b bVar, C5971a c5971a) {
        return new C4.a(0, G4.s.a(bVar, c5971a, 1.0f, C0613f.f6003Y, false));
    }

    public static final void d(AbstractC4326r abstractC4326r, r0.L l10, C1611s0 c1611s0, C1616t0 c1616t0, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        r0.L l11;
        C1611s0 c1611s02;
        C1616t0 c1616t02;
        C1616t0 c1616t03;
        C1611s0 c1611s03;
        r0.L l12;
        AbstractC4326r abstractC4326r3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(895940201);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                l11 = l10;
                if (rVar.g(l11)) {
                    i16 = 32;
                    i12 |= i16;
                }
            } else {
                l11 = l10;
            }
            i16 = 16;
            i12 |= i16;
        } else {
            l11 = l10;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                c1611s02 = c1611s0;
                if (rVar.g(c1611s02)) {
                    i15 = 256;
                    i12 |= i15;
                }
            } else {
                c1611s02 = c1611s0;
            }
            i15 = 128;
            i12 |= i15;
        } else {
            c1611s02 = c1611s0;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                c1616t02 = c1616t0;
                if (rVar.g(c1616t02)) {
                    i14 = 2048;
                    i12 |= i14;
                }
            } else {
                c1616t02 = c1616t0;
            }
            i14 = 1024;
            i12 |= i14;
        } else {
            c1616t02 = c1616t0;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (rVar.i(oVar)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((i12 & 9363) == 9362 && rVar.B()) {
            rVar.P();
            abstractC4326r3 = abstractC4326r2;
            l12 = l11;
            c1611s03 = c1611s02;
            c1616t03 = c1616t02;
        } else {
            rVar.R();
            if ((i10 & 1) != 0 && !rVar.A()) {
                rVar.P();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                abstractC4326r3 = abstractC4326r2;
                l12 = l11;
            } else {
                if (i18 != 0) {
                    abstractC4326r3 = C4323o.f37719b;
                } else {
                    abstractC4326r3 = abstractC4326r2;
                }
                if ((i11 & 2) != 0) {
                    rVar.W(-133496185);
                    l12 = AbstractC1530b3.a(AbstractC1677k.f21578b, rVar);
                    rVar.t(false);
                    i12 &= -113;
                } else {
                    l12 = l11;
                }
                if ((i11 & 4) != 0) {
                    rVar.W(1610137975);
                    P0 p02 = (P0) rVar.m(R0.f19593a);
                    c1611s02 = p02.P;
                    if (c1611s02 == null) {
                        float f6 = AbstractC1677k.f21577a;
                        c1611s02 = new C1611s0(R0.d(p02, 35), R0.a(p02, R0.d(p02, 35)), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, AbstractC1677k.f21579c), 0.38f), R0.g(p02, AbstractC1677k.f21580d)), r0.r.b(R0.a(p02, R0.d(p02, 35)), 0.38f));
                        p02.P = c1611s02;
                    }
                    rVar.t(false);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    rVar.W(1154241939);
                    c1616t03 = new C1616t0(AbstractC1677k.f21577a, AbstractC1677k.f21584h, AbstractC1677k.f21582f, AbstractC1677k.f21583g, AbstractC1677k.f21581e, AbstractC1677k.f21580d);
                    rVar.t(false);
                    i12 &= -7169;
                    rVar.u();
                    b(abstractC4326r3, l12, c1611s02, c1616t03, null, oVar, rVar, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 0);
                    c1611s03 = c1611s02;
                }
            }
            c1616t03 = c1616t02;
            rVar.u();
            b(abstractC4326r3, l12, c1611s02, c1616t03, null, oVar, rVar, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 0);
            c1611s03 = c1611s02;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new P(abstractC4326r3, (Object) l12, (Object) c1611s03, (Object) c1616t03, (AbstractC3953c) oVar, i10, i11, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [C4.g, C4.b] */
    public static C4.b d0(H4.a aVar, C5971a c5971a, boolean z10) {
        float f6;
        if (z10) {
            f6 = I4.g.c();
        } else {
            f6 = 1.0f;
        }
        return new C4.g(G4.s.a(aVar, c5971a, f6, C0617j.f6014Y, false));
    }

    public static final void e(AbstractC1031o abstractC1031o, EnumC1027k enumC1027k, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(345017889);
        if ((i10 & 14) == 0) {
            if (rVar.g(abstractC1031o)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(enumC1027k)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(nVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            int i15 = i11 << 3;
            rVar.W(511388516);
            boolean g10 = rVar.g(enumC1027k) | rVar.g(abstractC1031o);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = new C1026j(enumC1027k, abstractC1031o);
                rVar.h0(K10);
            }
            rVar.t(false);
            AbstractC2575j.a((C1026j) K10, null, new C2587v(false, true, 15), nVar, rVar, (i15 & 7168) | 384, 2);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new U(abstractC1031o, enumC1027k, nVar, i10, 3);
        }
    }

    public static C4.a e0(H4.b bVar, C5971a c5971a) {
        return new C4.a(2, G4.s.a(bVar, c5971a, 1.0f, G4.p.f6024Y, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(AbstractC4326r abstractC4326r, C2881B c2881b, g0 g0Var, ee.q qVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Object obj;
        Object obj2;
        Object obj3;
        int i13;
        Object obj4;
        ee.q qVar2;
        g0 g0Var2;
        C2881B c2881b2;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        int i14;
        Object obj5;
        Object K10;
        Object w10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC3557B.c0("content", kVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-925251078);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            obj = abstractC4326r;
        } else if ((i10 & 14) == 0) {
            obj = abstractC4326r;
            if (rVar.g(obj)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            obj = abstractC4326r;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                obj2 = c2881b;
                if (rVar.g(obj2)) {
                    i18 = 32;
                    i12 |= i18;
                }
            } else {
                obj2 = c2881b;
            }
            i18 = 16;
            i12 |= i18;
        } else {
            obj2 = c2881b;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            obj3 = g0Var;
            if (rVar.g(obj3)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                obj4 = qVar;
                if (rVar.g(obj4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (rVar.i(kVar)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 46811) != 9362 && rVar.B()) {
                    rVar.P();
                    abstractC4326r2 = obj;
                    c2881b2 = obj2;
                    g0Var2 = obj3;
                    qVar2 = obj4;
                } else {
                    rVar.R();
                    i14 = i10 & 1;
                    obj5 = C1723m.f22654Y;
                    if (i14 == 0 && !rVar.A()) {
                        rVar.P();
                        abstractC4326r2 = obj;
                        c2881b2 = obj2;
                    } else {
                        if (i20 != 0) {
                            abstractC4326r2 = C4323o.f37719b;
                        } else {
                            abstractC4326r2 = obj;
                        }
                        if ((i11 & 2) != 0) {
                            rVar.W(-1133314101);
                            C2882C c2882c = C2882C.f29290Y;
                            rVar.W(-492369756);
                            Object K11 = rVar.K();
                            if (K11 == obj5) {
                                K11 = new C2881B(c2882c);
                                rVar.h0(K11);
                            }
                            rVar.t(false);
                            c2881b2 = (C2881B) K11;
                            rVar.t(false);
                        } else {
                            c2881b2 = obj2;
                        }
                        if (i21 != 0) {
                            float f6 = 0;
                            obj3 = new i0(f6, f6, f6, f6);
                        }
                        if (i13 != 0) {
                            qVar2 = ee.q.f29338Y;
                            g0Var2 = obj3;
                            rVar.u();
                            rVar.W(773894976);
                            rVar.W(-492369756);
                            K10 = rVar.K();
                            if (K10 == obj5) {
                                Object c10 = new Z.C(AbstractC1734s.k(rVar));
                                rVar.h0(c10);
                                K10 = c10;
                            }
                            rVar.t(false);
                            Ng.F f10 = ((Z.C) K10).f22442Y;
                            rVar.t(false);
                            rVar.W(266535486);
                            Z0.l lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                            Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                            C5252d c5252d = new C5252d(bVar.R(g0Var2.b(lVar)), bVar.R(g0Var2.d()), bVar.R(g0Var2.c(lVar)), bVar.R(g0Var2.a()));
                            rVar.t(false);
                            rVar.W(-207387068);
                            ee.p pVar = new ee.p();
                            kVar.invoke(pVar);
                            C2888f c2888f = new C2888f(pVar.f29337b);
                            w10 = AbstractC0044t0.w(rVar, false, -492369756);
                            if (w10 == obj5) {
                                w10 = AbstractC4828h.Z(null, o1.f22665a);
                                rVar.h0(w10);
                            }
                            rVar.t(false);
                            Gi.e.a(c2888f, B0.I.a(androidx.compose.ui.draw.a.c(abstractC4326r2), jf.y.f36177a, new ee.j(qVar2, c2881b2, null)), null, new W.I(c2881b2, c2888f, c5252d, f10, (AbstractC1710f0) w10), rVar, 0, 4);
                        }
                    }
                    g0Var2 = obj3;
                    qVar2 = obj4;
                    rVar.u();
                    rVar.W(773894976);
                    rVar.W(-492369756);
                    K10 = rVar.K();
                    if (K10 == obj5) {
                    }
                    rVar.t(false);
                    Ng.F f102 = ((Z.C) K10).f22442Y;
                    rVar.t(false);
                    rVar.W(266535486);
                    Z0.l lVar2 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                    Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                    C5252d c5252d2 = new C5252d(bVar2.R(g0Var2.b(lVar2)), bVar2.R(g0Var2.d()), bVar2.R(g0Var2.c(lVar2)), bVar2.R(g0Var2.a()));
                    rVar.t(false);
                    rVar.W(-207387068);
                    ee.p pVar2 = new ee.p();
                    kVar.invoke(pVar2);
                    C2888f c2888f2 = new C2888f(pVar2.f29337b);
                    w10 = AbstractC0044t0.w(rVar, false, -492369756);
                    if (w10 == obj5) {
                    }
                    rVar.t(false);
                    Gi.e.a(c2888f2, B0.I.a(androidx.compose.ui.draw.a.c(abstractC4326r2), jf.y.f36177a, new ee.j(qVar2, c2881b2, null)), null, new W.I(c2881b2, c2888f2, c5252d2, f102, (AbstractC1710f0) w10), rVar, 0, 4);
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new P(abstractC4326r2, (Object) c2881b2, (Object) g0Var2, (Object) qVar2, (AbstractC3953c) kVar, i10, i11, 23);
                    return;
                }
                return;
            }
            obj4 = qVar;
            if ((i11 & 16) != 0) {
            }
            if ((i12 & 46811) != 9362) {
            }
            rVar.R();
            i14 = i10 & 1;
            obj5 = C1723m.f22654Y;
            if (i14 == 0) {
            }
            if (i20 != 0) {
            }
            if ((i11 & 2) != 0) {
            }
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            g0Var2 = obj3;
            qVar2 = obj4;
            rVar.u();
            rVar.W(773894976);
            rVar.W(-492369756);
            K10 = rVar.K();
            if (K10 == obj5) {
            }
            rVar.t(false);
            Ng.F f1022 = ((Z.C) K10).f22442Y;
            rVar.t(false);
            rVar.W(266535486);
            Z0.l lVar22 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
            Z0.b bVar22 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
            C5252d c5252d22 = new C5252d(bVar22.R(g0Var2.b(lVar22)), bVar22.R(g0Var2.d()), bVar22.R(g0Var2.c(lVar22)), bVar22.R(g0Var2.a()));
            rVar.t(false);
            rVar.W(-207387068);
            ee.p pVar22 = new ee.p();
            kVar.invoke(pVar22);
            C2888f c2888f22 = new C2888f(pVar22.f29337b);
            w10 = AbstractC0044t0.w(rVar, false, -492369756);
            if (w10 == obj5) {
            }
            rVar.t(false);
            Gi.e.a(c2888f22, B0.I.a(androidx.compose.ui.draw.a.c(abstractC4326r2), jf.y.f36177a, new ee.j(qVar2, c2881b2, null)), null, new W.I(c2881b2, c2888f22, c5252d22, f1022, (AbstractC1710f0) w10), rVar, 0, 4);
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        obj3 = g0Var;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        obj4 = qVar;
        if ((i11 & 16) != 0) {
        }
        if ((i12 & 46811) != 9362) {
        }
        rVar.R();
        i14 = i10 & 1;
        obj5 = C1723m.f22654Y;
        if (i14 == 0) {
        }
        if (i20 != 0) {
        }
        if ((i11 & 2) != 0) {
        }
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        g0Var2 = obj3;
        qVar2 = obj4;
        rVar.u();
        rVar.W(773894976);
        rVar.W(-492369756);
        K10 = rVar.K();
        if (K10 == obj5) {
        }
        rVar.t(false);
        Ng.F f10222 = ((Z.C) K10).f22442Y;
        rVar.t(false);
        rVar.W(266535486);
        Z0.l lVar222 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
        Z0.b bVar222 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        C5252d c5252d222 = new C5252d(bVar222.R(g0Var2.b(lVar222)), bVar222.R(g0Var2.d()), bVar222.R(g0Var2.c(lVar222)), bVar222.R(g0Var2.a()));
        rVar.t(false);
        rVar.W(-207387068);
        ee.p pVar222 = new ee.p();
        kVar.invoke(pVar222);
        C2888f c2888f222 = new C2888f(pVar222.f29337b);
        w10 = AbstractC0044t0.w(rVar, false, -492369756);
        if (w10 == obj5) {
        }
        rVar.t(false);
        Gi.e.a(c2888f222, B0.I.a(androidx.compose.ui.draw.a.c(abstractC4326r2), jf.y.f36177a, new ee.j(qVar2, c2881b2, null)), null, new W.I(c2881b2, c2888f222, c5252d222, f10222, (AbstractC1710f0) w10), rVar, 0, 4);
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static C4.a f0(H4.b bVar, C5971a c5971a) {
        return new C4.a(3, G4.s.a(bVar, c5971a, I4.g.c(), G4.x.f6039Y, true));
    }

    public static C1042a g(String str, N0.E e10, long j6, Z0.b bVar, S0.r rVar, kf.v vVar, int i10, int i11) {
        kf.v vVar2;
        int i12 = i11 & 32;
        kf.v vVar3 = kf.v.f37483Y;
        if (i12 != 0) {
            vVar2 = vVar3;
        } else {
            vVar2 = vVar;
        }
        return new C1042a(new V0.c(e10, rVar, bVar, str, vVar2, vVar3), i10, false, j6);
    }

    public static I8.r g0(P8.b bVar) {
        boolean z10 = bVar.f13851Z;
        z10 = true;
        try {
            try {
                try {
                    return K8.d.J0(bVar);
                } catch (StackOverflowError e10) {
                    throw new RuntimeException("Failed parsing JSON source: " + bVar + " to Json", e10);
                }
            } catch (OutOfMemoryError e11) {
                throw new RuntimeException("Failed parsing JSON source: " + bVar + " to Json", e11);
            }
        } finally {
            bVar.f13851Z = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(AbstractC1031o abstractC1031o, boolean z10, Y0.h hVar, boolean z11, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        boolean z12;
        EnumC1027k enumC1027k;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-626955031);
        if ((i10 & 14) == 0) {
            if (rVar.g(abstractC1031o)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(z10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 896) == 0) {
            if (rVar.g(hVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 7168) == 0) {
            if (rVar.h(z11)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        }
        if ((57344 & i10) == 0) {
            if (rVar.g(abstractC4326r)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i11 |= i12;
        }
        if ((46811 & i11) == 9362 && rVar.B()) {
            rVar.P();
        } else {
            boolean z13 = false;
            Y0.h hVar2 = Y0.h.f22028Z;
            Y0.h hVar3 = Y0.h.f22027Y;
            if (z10) {
                if ((hVar == hVar3 && !z11) || (hVar == hVar2 && z11)) {
                    z13 = true;
                }
            } else if ((hVar != hVar3 || z11) && (hVar != hVar2 || !z11)) {
                z12 = true;
                if (!z12) {
                    enumC1027k = EnumC1027k.f12360Z;
                } else {
                    enumC1027k = EnumC1027k.f12359Y;
                }
                e(abstractC1031o, enumC1027k, R4.b.X(rVar, 1868300064, new C1019c((Y0) rVar.m(AbstractC0701r0.f7013p), abstractC4326r, z12, abstractC1031o, z10)), rVar, (i11 & 14) | 384);
            }
            z12 = z13;
            if (!z12) {
            }
            e(abstractC1031o, enumC1027k, R4.b.X(rVar, 1868300064, new C1019c((Y0) rVar.m(AbstractC0701r0.f7013p), abstractC4326r, z12, abstractC1031o, z10)), rVar, (i11 & 14) | 384);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1020d(abstractC1031o, z10, hVar, z11, abstractC4326r, i10);
        }
    }

    public static I8.r h0(String str) {
        try {
            P8.b bVar = new P8.b(new StringReader(str));
            I8.r g02 = g0(bVar);
            g02.getClass();
            if (!(g02 instanceof I8.t) && bVar.R0() != 10) {
                throw new RuntimeException("Did not consume the entire document.");
            }
            return g02;
        } catch (P8.d e10) {
            throw new RuntimeException(e10);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final void i(AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(2111672474);
        if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(abstractC6216a)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.h(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            androidx.compose.foundation.layout.a.d(U3.f.o(androidx.compose.foundation.layout.e.k(abstractC4326r, N.P.f12237a, N.P.f12238b), new C1023g(abstractC6216a, z10, 0)), rVar);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1021e(abstractC4326r, abstractC6216a, z10, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [P4.a, java.lang.Object] */
    public static final a7.d i0(List list, AbstractC1725n abstractC1725n) {
        AbstractC3557B.c0("permissions", list);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-57132327);
        C1933b c1933b = C1933b.f23902Y;
        rVar.W(-2044770427);
        rVar.W(992349447);
        Context context = (Context) rVar.m(Z.f6888b);
        Activity h02 = AbstractC4344b.h0(context);
        rVar.W(1157296644);
        boolean g10 = rVar.g(list);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        ArrayList arrayList = K10;
        if (g10 || K10 == iVar) {
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a7.g((String) it.next(), context, h02));
            }
            rVar.h0(arrayList2);
            arrayList = arrayList2;
        }
        rVar.t(false);
        List<a7.g> list2 = arrayList;
        for (a7.g gVar : list2) {
            rVar.T(-1458104076, gVar.f23916a);
            C4145a c4145a = new C4145a(1);
            rVar.W(1157296644);
            boolean g11 = rVar.g(gVar);
            Object K11 = rVar.K();
            if (g11 || K11 == iVar) {
                K11 = new C0571a(26, gVar);
                rVar.h0(K11);
            }
            rVar.t(false);
            C3287m G10 = kotlin.jvm.internal.m.G(c4145a, (wf.k) K11, rVar);
            AbstractC1734s.b(G10, new a7.f(gVar, G10, 0), rVar);
            rVar.t(false);
        }
        rVar.t(false);
        AbstractC4344b.J(list2, null, rVar, 8, 2);
        rVar.W(1157296644);
        boolean g12 = rVar.g(list);
        Object K12 = rVar.K();
        if (g12 || K12 == iVar) {
            K12 = new a7.d(list2);
            rVar.h0(K12);
        }
        rVar.t(false);
        a7.d dVar = (a7.d) K12;
        ?? obj = new Object();
        rVar.W(511388516);
        boolean g13 = rVar.g(dVar) | rVar.g(c1933b);
        Object K13 = rVar.K();
        if (g13 || K13 == iVar) {
            K13 = new s3.r(dVar, 9, c1933b);
            rVar.h0(K13);
        }
        rVar.t(false);
        C3287m G11 = kotlin.jvm.internal.m.G(obj, (wf.k) K13, rVar);
        AbstractC1734s.a(dVar, G11, new s3.r(dVar, 8, G11), rVar);
        rVar.t(false);
        rVar.t(false);
        return dVar;
    }

    public static final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5859i c5859i = (C5859i) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", c5859i.f46492a);
            bundle.putLong("event_timestamp", c5859i.f46493b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static TypedValue j0(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final boolean k(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static boolean k0(Context context, int i10, boolean z10) {
        TypedValue j02 = j0(context, i10);
        if (j02 != null && j02.type == 18) {
            if (j02.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static final int l(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    public static TypedValue l0(int i10, Context context, String str) {
        TypedValue j02 = j0(context, i10);
        if (j02 != null) {
            return j02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static final int m(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static int m0(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static final boolean n(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static final void n0(ScheduledExecutorService scheduledExecutorService, String str, long j6, TimeUnit timeUnit, AbstractC5091c abstractC5091c, Runnable runnable) {
        AbstractC3557B.c0("<this>", scheduledExecutorService);
        AbstractC3557B.c0("unit", timeUnit);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        AbstractC3557B.c0("runnable", runnable);
        try {
            scheduledExecutorService.schedule(runnable, j6, timeUnit);
        } catch (RejectedExecutionException e10) {
            P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new C5843c(str, 22), e10, 48);
        }
    }

    public static final boolean o(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static final int o0(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((C1705d) arrayList.get(i13)).f22611a;
            if (i14 < 0) {
                i14 += i11;
            }
            int e02 = AbstractC3557B.e0(i14, i10);
            if (e02 < 0) {
                i12 = i13 + 1;
            } else if (e02 > 0) {
                size = i13 - 1;
            } else {
                return i13;
            }
        }
        return -(i12 + 1);
    }

    public static final Object[] p(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kf.q.a3(objArr, objArr2, 0, i10, 6);
        kf.q.W2(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final AbstractC4326r p0(AbstractC4326r abstractC4326r, boolean z10, D.m mVar, AbstractC0040r0 abstractC0040r0, boolean z11, L0.g gVar, AbstractC6216a abstractC6216a) {
        return H0.Q.s(abstractC4326r, L0.l.a(androidx.compose.foundation.a.g(C4323o.f37719b, mVar, abstractC0040r0, z11, gVar, abstractC6216a, 8), false, new J.c(0, z10)));
    }

    public static final boolean q(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public static AbstractC4326r q0(AbstractC4326r abstractC4326r, boolean z10, L0.g gVar, AbstractC6216a abstractC6216a, int i10) {
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return U3.f.o(abstractC4326r, new J.b(z10, true, gVar, abstractC6216a));
    }

    public static final int r(ArrayList arrayList, int i10, int i11) {
        int o02 = o0(arrayList, i10, i11);
        if (o02 < 0) {
            return -(o02 + 1);
        }
        return o02;
    }

    public static final byte[] r0(R5.b bVar, Object obj, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("<this>", bVar);
        AbstractC3557B.c0("model", obj);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        try {
            String e10 = bVar.e(obj);
            if (e10 == null) {
                return null;
            }
            byte[] bytes = e10.getBytes(Lg.a.f11131a);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
            return bytes;
        } catch (Throwable th2) {
            P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new R5.c(0, obj), th2, 48);
            return null;
        }
    }

    public static final int s(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    public static void s0(View view, f8.g gVar) {
        Z7.a aVar = gVar.f29688Y.f29666b;
        if (aVar != null && aVar.f23231a) {
            float f6 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = D1.Z.f3247a;
                f6 += D1.N.i((View) parent);
            }
            f8.f fVar = gVar.f29688Y;
            if (fVar.f29677m != f6) {
                fVar.f29677m = f6;
                gVar.n();
            }
        }
    }

    public static final void t(C2881B c2881b, B0.u uVar, long j6, C0.d dVar, Ng.F f6) {
        uVar.a();
        dVar.a(uVar.f1671b, uVar.f1672c);
        Ad.l.O0(f6, null, null, new ee.k(c2881b, j6, null), 3);
    }

    public static void t0(List list, w8.g gVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (gVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.A, java.lang.Object] */
    public static final void u(C2881B c2881b, C0.d dVar, ee.q qVar, Ng.F f6) {
        long j6;
        ?? obj = new Object();
        dVar.getClass();
        obj.f37621Y = dVar.b(AbstractC4828h.l(Float.MAX_VALUE, Float.MAX_VALUE));
        int ordinal = qVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    j6 = AbstractC4828h.l(0.0f, Z0.p.c(obj.f37621Y));
                } else {
                    throw new RuntimeException();
                }
            } else {
                j6 = AbstractC4828h.l(Z0.p.b(obj.f37621Y), 0.0f);
            }
        } else {
            j6 = obj.f37621Y;
        }
        obj.f37621Y = j6;
        Ad.l.O0(f6, null, null, new ee.l(c2881b, obj, null), 3);
    }

    public static int u0(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static final int v(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    public static int v0(Object obj) {
        int i10;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return u0(i10);
    }

    public static final Object[] w(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kf.q.a3(objArr, objArr2, 0, i10, 6);
        kf.q.W2(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void w0(ExecutorService executorService, String str, AbstractC5091c abstractC5091c, Runnable runnable) {
        AbstractC3557B.c0("<this>", executorService);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        try {
            executorService.submit(runnable);
        } catch (RejectedExecutionException e10) {
            P4.a.l0(abstractC5091c, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new C5843c(str, 23), e10, 48);
        }
    }

    public static final Object[] x(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kf.q.a3(objArr, objArr2, 0, i10, 6);
        kf.q.W2(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x0(int i10, Object obj, AbstractC1356q abstractC1356q, S0.D d10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        int i13 = 1;
        if (S0.A.a(i10, 1) || S0.A.a(i10, 2)) {
            S0.I i14 = (S0.I) abstractC1356q;
            if (!AbstractC3557B.K(i14.f15980b, d10)) {
                S0.D d11 = S0.D.f15970i0;
                if (d10.compareTo(d11) >= 0 && AbstractC3557B.e0(i14.f15980b.f15975Y, d11.f15975Y) < 0) {
                    z10 = true;
                    if ((!S0.A.a(i10, 1) || S0.A.a(i10, 3)) && !S0.z.a(i11, ((S0.I) abstractC1356q).f15981c)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && !z10) {
                        return obj;
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (z11 && S0.z.a(i11, 1)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 && z10) {
                            i13 = 3;
                        } else if (!z10) {
                            if (z13) {
                                i13 = 2;
                            } else {
                                i13 = 0;
                            }
                        }
                        return Typeface.create((Typeface) obj, i13);
                    }
                    if (z10) {
                        i12 = d10.f15975Y;
                    } else {
                        i12 = ((S0.I) abstractC1356q).f15980b.f15975Y;
                    }
                    if (z11) {
                        z12 = S0.z.a(i11, 1);
                    } else {
                        z12 = S0.z.a(((S0.I) abstractC1356q).f15981c, 1);
                    }
                    return S0.L.f15985a.a((Typeface) obj, i12, z12);
                }
            }
        }
        z10 = false;
        if (!S0.A.a(i10, 1)) {
        }
        z11 = true;
        if (z11) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }

    public static final int y(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return H(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static int[] y0(Collection collection) {
        if (collection instanceof C6779a) {
            C6779a c6779a = (C6779a) collection;
            return Arrays.copyOfRange(c6779a.f51755Y, c6779a.f51756Z, c6779a.f51757h0);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void z(int i10, int i11, int[] iArr) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1734s.o(z10);
        iArr[(i10 * 5) + 3] = i11;
    }

    public static final void z0(C0194k c0194k, long j6, wf.k kVar, boolean z10) {
        MotionEvent motionEvent;
        C0189f c0189f = c0194k.f1653b;
        if (c0189f != null) {
            motionEvent = c0189f.f1634b.f1687b;
        } else {
            motionEvent = null;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (z10) {
                motionEvent.setAction(3);
            }
            motionEvent.offsetLocation(-C5251c.d(j6), -C5251c.e(j6));
            kVar.invoke(motionEvent);
            motionEvent.offsetLocation(C5251c.d(j6), C5251c.e(j6));
            motionEvent.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
