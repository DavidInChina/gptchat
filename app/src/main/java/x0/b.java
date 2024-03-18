package X0;

import Ad.l;
import G0.C0571a;
import H5.f;
import H5.i;
import M1.AbstractC0928i;
import M1.J;
import T1.g;
import U3.u;
import Wh.F;
import Z1.C1771m;
import Z1.P;
import Z1.T;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import androidx.lifecycle.U;
import androidx.lifecycle.e0;
import d1.C2584s;
import g2.C3151i;
import g2.C3153k;
import g4.C3188p;
import h4.C3322b;
import h4.j;
import h4.k;
import h4.m;
import h4.n;
import h4.p;
import id.AbstractC3557B;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jf.y;
import jh.L1;
import ji.AbstractC4143r;
import ji.C4116E;
import k6.C4199i;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import n.C4696g;
import o6.C4920A;
import o6.L;
import o6.a0;
import p.AbstractC5028d;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import q0.C5254f;
import r4.h;
import s3.AbstractC5568s;
import s3.C5545H;
import s3.X;
import u5.e;
import wf.AbstractC6216a;
import y6.d;
import z4.AbstractC6763b;
import z4.C6770i;

/* loaded from: classes2.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21717Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f21718Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj) {
        super(0);
        this.f21717Y = i10;
        this.f21718Z = obj;
    }

    private File c() {
        File file = (File) ((J) this.f21718Z).f11417a.mo122invoke();
        String absolutePath = file.getAbsolutePath();
        synchronized (J.f11416k) {
            LinkedHashSet linkedHashSet = J.f11415j;
            if (!linkedHashSet.contains(absolutePath)) {
                AbstractC3557B.b0("it", absolutePath);
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a() {
        File[] E02;
        int i10 = this.f21717Y;
        boolean z10 = false;
        Object obj = this.f21718Z;
        switch (i10) {
            case 1:
                C2584s c2584s = (C2584s) obj;
                if (C2584s.h(c2584s) != null && c2584s.m71getPopupContentSizebOM6tXw() != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 18:
                f fVar = (f) obj;
                G5.c cVar = fVar.f7465h0;
                cVar.getClass();
                File file = fVar.f7463Y;
                AbstractC3557B.c0("srcDir", file);
                File file2 = fVar.f7464Z;
                AbstractC3557B.c0("destDir", file2);
                AbstractC5091c abstractC5091c = cVar.f6054a;
                boolean g02 = AbstractC4344b.g0(file, abstractC5091c);
                EnumC5090b enumC5090b = EnumC5090b.f42739Z;
                if (!g02) {
                    P4.a.m0(cVar.f6054a, 3, enumC5090b, new e(file, 9), null, false, 56);
                } else {
                    Boolean bool = Boolean.FALSE;
                    G5.a aVar = G5.a.f6046k0;
                    boolean booleanValue = ((Boolean) AbstractC4344b.a1(file, bool, abstractC5091c, aVar)).booleanValue();
                    EnumC5090b enumC5090b2 = EnumC5090b.f42740h0;
                    if (!booleanValue) {
                        P4.a.l0(cVar.f6054a, 5, AbstractC4344b.G0(enumC5090b, enumC5090b2), new e(file, 10), null, 56);
                    } else if (!AbstractC4344b.g0(file2, abstractC5091c)) {
                        if (!AbstractC4344b.M0(file2, abstractC5091c)) {
                            P4.a.l0(cVar.f6054a, 5, AbstractC4344b.G0(enumC5090b, enumC5090b2), new e(file, 11), null, 56);
                        }
                        E02 = AbstractC4344b.E0(file, abstractC5091c);
                        if (E02 == null) {
                            E02 = new File[0];
                        }
                        for (File file3 : E02) {
                            if (((Boolean) AbstractC4344b.a1(file3, Boolean.FALSE, abstractC5091c, new C0571a(21, new File(file2, file3.getName())))).booleanValue()) {
                            }
                        }
                    } else {
                        if (!((Boolean) AbstractC4344b.a1(file2, bool, abstractC5091c, aVar)).booleanValue()) {
                            P4.a.l0(cVar.f6054a, 5, AbstractC4344b.G0(enumC5090b, enumC5090b2), new e(file2, 12), null, 56);
                        }
                        E02 = AbstractC4344b.E0(file, abstractC5091c);
                        if (E02 == null) {
                        }
                        while (r7 < r2) {
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
            default:
                i iVar = (i) obj;
                return Boolean.valueOf(iVar.f7472Z.a(iVar.f7471Y));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
        if (h4.n.f31895a.contains(r10) != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Type inference failed for: r6v1, types: [h4.b, ji.r, ji.K] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo122invoke() {
        AbstractC0928i abstractC0928i;
        C3.e eVar;
        j jVar;
        Exception exc;
        Context context;
        j jVar2;
        boolean z10;
        int i10;
        C3322b c3322b;
        Bitmap bitmap;
        int i11;
        int i12;
        int i13;
        double d10;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        ColorSpace colorSpace;
        long j6;
        long startElapsedRealtime;
        switch (this.f21717Y) {
            case 0:
                c cVar = (c) this.f21718Z;
                if (((C5254f) cVar.f21721c.getValue()).f43640a == C5254f.f43638c || C5254f.f(((C5254f) cVar.f21721c.getValue()).f43640a)) {
                    return null;
                }
                return cVar.f21719a.b(((C5254f) cVar.f21721c.getValue()).f43640a);
            case 1:
                return a();
            case 2:
                return c();
            case 3:
                mo122invoke();
                return y.f36177a;
            case 4:
                T t10 = (T) this.f21718Z;
                P p10 = T.f22899d;
                t10.getClass();
                synchronized (T.f22899d) {
                    abstractC0928i = T.f22901f;
                    if (abstractC0928i == null) {
                        abstractC0928i = (AbstractC0928i) T.f22900e.a(t10.f22903a, P.f22893a[0]);
                        T.f22901f = abstractC0928i;
                    }
                }
                return abstractC0928i;
            case 5:
                mo122invoke();
                return y.f36177a;
            case 6:
                e0 e0Var = (e0) this.f21718Z;
                AbstractC3557B.c0("<this>", e0Var);
                return (U) new u(e0Var, new L1(0)).m(U.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 7:
                AbstractC5568s abstractC5568s = (AbstractC5568s) this.f21718Z;
                abstractC5568s.getClass();
                Context context2 = abstractC5568s.f45340a;
                X x10 = abstractC5568s.f45361v;
                AbstractC3557B.c0("context", context2);
                AbstractC3557B.c0("navigatorProvider", x10);
                return new Object();
            case 8:
                mo122invoke();
                return y.f36177a;
            case 9:
                return ((AbstractC5028d) this.f21718Z).d();
            case 10:
                C3.f fVar = (C3.f) this.f21718Z;
                if (fVar.f2659Z != null && fVar.f2661i0) {
                    Context context3 = fVar.f2658Y;
                    AbstractC3557B.c0("context", context3);
                    File noBackupFilesDir = context3.getNoBackupFilesDir();
                    AbstractC3557B.b0("context.noBackupFilesDir", noBackupFilesDir);
                    eVar = new C3.e(fVar.f2658Y, new File(noBackupFilesDir, fVar.f2659Z).getAbsolutePath(), new J0.a((Object) null), fVar.f2660h0, fVar.f2662j0);
                } else {
                    eVar = new C3.e(fVar.f2658Y, fVar.f2659Z, new J0.a((Object) null), fVar.f2660h0, fVar.f2662j0);
                }
                eVar.setWriteAheadLoggingEnabled(fVar.f2664l0);
                return eVar;
            case 11:
                return (q4.j) ((C3188p) this.f21718Z).f31250x0.getValue();
            case 12:
                h4.e eVar2 = (h4.e) this.f21718Z;
                BitmapFactory.Options options = new BitmapFactory.Options();
                F f6 = eVar2.f31875a;
                ?? abstractC4143r = new AbstractC4143r(f6.i());
                C4116E J10 = R4.b.J(abstractC4143r);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(J10.peek().Q0(), null, options);
                Exception exc2 = abstractC4143r.f31867Z;
                if (exc2 == null) {
                    options.inJustDecodeBounds = false;
                    Paint paint = m.f31894a;
                    String str = options.outMimeType;
                    Set set = n.f31895a;
                    int ordinal = eVar2.f31878d.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (str != null) {
                                break;
                            }
                        } else if (ordinal != 2) {
                            throw new RuntimeException();
                        }
                        g gVar = new g(new k(J10.peek().Q0(), 0));
                        int c10 = gVar.c();
                        jVar = new j(gVar.l(), c10 == 2 || c10 == 7 || c10 == 4 || c10 == 5);
                        exc = abstractC4143r.f31867Z;
                        if (exc != null) {
                            options.inMutable = false;
                            int i14 = Build.VERSION.SDK_INT;
                            q4.n nVar = eVar2.f31876b;
                            if (i14 >= 26 && (colorSpace = nVar.f43871c) != null) {
                                options.inPreferredColorSpace = colorSpace;
                            }
                            options.inPremultiplied = nVar.f43876h;
                            Bitmap.Config config4 = nVar.f43870b;
                            int i15 = jVar.f31888b;
                            boolean z11 = jVar.f31887a;
                            if ((z11 || i15 > 0) && (config4 == null || R4.b.w1(config4))) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            if (nVar.f43875g && config4 == Bitmap.Config.ARGB_8888 && AbstractC3557B.K(options.outMimeType, "image/jpeg")) {
                                config4 = Bitmap.Config.RGB_565;
                            }
                            if (i14 >= 26) {
                                config = options.outConfig;
                                config2 = Bitmap.Config.RGBA_F16;
                                if (config == config2) {
                                    config3 = Bitmap.Config.HARDWARE;
                                    if (config4 != config3) {
                                        config4 = Bitmap.Config.RGBA_F16;
                                    }
                                }
                            }
                            options.inPreferredConfig = config4;
                            r.f h10 = f6.h();
                            boolean z12 = h10 instanceof p;
                            Context context4 = nVar.f43869a;
                            h hVar = nVar.f43872d;
                            if (z12 && AbstractC3557B.K(hVar, h.f44440c)) {
                                options.inSampleSize = 1;
                                options.inScaled = true;
                                options.inDensity = ((p) h10).f31902f;
                                options.inTargetDensity = context4.getResources().getDisplayMetrics().densityDpi;
                                c3322b = abstractC4143r;
                                context = context4;
                                jVar2 = jVar;
                                i10 = i15;
                                z10 = z11;
                            } else {
                                int i16 = options.outWidth;
                                if (i16 > 0) {
                                    int i17 = options.outHeight;
                                    if (i17 <= 0) {
                                        c3322b = abstractC4143r;
                                        context = context4;
                                        i11 = 1;
                                        jVar2 = jVar;
                                        i10 = i15;
                                        z10 = z11;
                                    } else {
                                        int i18 = jVar.f31888b;
                                        int i19 = (i18 == 90 || i18 == 270) ? i17 : i16;
                                        if (i18 != 90 && i18 != 270) {
                                            i16 = i17;
                                        }
                                        h hVar2 = h.f44440c;
                                        boolean K10 = AbstractC3557B.K(hVar, hVar2);
                                        r4.g gVar2 = nVar.f43873e;
                                        int e10 = K10 ? i19 : u4.e.e(hVar.f44441a, gVar2);
                                        int e11 = AbstractC3557B.K(hVar, hVar2) ? i16 : u4.e.e(hVar.f44442b, gVar2);
                                        int highestOneBit = Integer.highestOneBit(i19 / e10);
                                        int highestOneBit2 = Integer.highestOneBit(i16 / e11);
                                        int ordinal2 = gVar2.ordinal();
                                        if (ordinal2 != 0) {
                                            jVar2 = jVar;
                                            i12 = 1;
                                            if (ordinal2 != 1) {
                                                throw new RuntimeException();
                                            }
                                            i13 = Math.max(highestOneBit, highestOneBit2);
                                        } else {
                                            jVar2 = jVar;
                                            i12 = 1;
                                            i13 = Math.min(highestOneBit, highestOneBit2);
                                        }
                                        if (i13 < i12) {
                                            i13 = 1;
                                        }
                                        options.inSampleSize = i13;
                                        i10 = i15;
                                        z10 = z11;
                                        double d11 = i13;
                                        c3322b = abstractC4143r;
                                        context = context4;
                                        double d12 = i16 / d11;
                                        double d13 = e10 / (i19 / d11);
                                        double d14 = e11 / d12;
                                        int ordinal3 = gVar2.ordinal();
                                        if (ordinal3 == 0) {
                                            d10 = Math.max(d13, d14);
                                        } else if (ordinal3 != 1) {
                                            throw new RuntimeException();
                                        } else {
                                            d10 = Math.min(d13, d14);
                                        }
                                        if (nVar.f43874f && d10 > 1.0d) {
                                            d10 = 1.0d;
                                        }
                                        boolean z13 = !(d10 == 1.0d);
                                        options.inScaled = z13;
                                        if (z13) {
                                            if (d10 > 1.0d) {
                                                options.inDensity = AbstractC4344b.X0(Integer.MAX_VALUE / d10);
                                                options.inTargetDensity = Integer.MAX_VALUE;
                                            } else {
                                                options.inDensity = Integer.MAX_VALUE;
                                                options.inTargetDensity = AbstractC4344b.X0(Integer.MAX_VALUE * d10);
                                            }
                                        }
                                    }
                                } else {
                                    c3322b = abstractC4143r;
                                    context = context4;
                                    jVar2 = jVar;
                                    i10 = i15;
                                    z10 = z11;
                                    i11 = 1;
                                }
                                options.inSampleSize = i11;
                                options.inScaled = false;
                            }
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(J10.Q0(), null, options);
                                l.S(J10, null);
                                Exception exc3 = c3322b.f31867Z;
                                if (exc3 != null) {
                                    throw exc3;
                                }
                                if (decodeStream != null) {
                                    decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                    if (z10 || i10 > 0) {
                                        Matrix matrix = new Matrix();
                                        float width = decodeStream.getWidth() / 2.0f;
                                        float height = decodeStream.getHeight() / 2.0f;
                                        if (z10) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i10 > 0) {
                                            matrix.postRotate(i10, width, height);
                                        }
                                        RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        float f10 = rectF.left;
                                        if (f10 != 0.0f || rectF.top != 0.0f) {
                                            matrix.postTranslate(-f10, -rectF.top);
                                        }
                                        int i20 = jVar2.f31888b;
                                        if (i20 != 90 && i20 != 270) {
                                            int width2 = decodeStream.getWidth();
                                            int height2 = decodeStream.getHeight();
                                            Bitmap.Config config5 = decodeStream.getConfig();
                                            if (config5 == null) {
                                                config5 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmap = Bitmap.createBitmap(width2, height2, config5);
                                        } else {
                                            int height3 = decodeStream.getHeight();
                                            int width3 = decodeStream.getWidth();
                                            Bitmap.Config config6 = decodeStream.getConfig();
                                            if (config6 == null) {
                                                config6 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmap = Bitmap.createBitmap(height3, width3, config6);
                                        }
                                        new Canvas(bitmap).drawBitmap(decodeStream, matrix, m.f31894a);
                                        decodeStream.recycle();
                                        decodeStream = bitmap;
                                    }
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeStream);
                                    boolean z14 = true;
                                    if (options.inSampleSize <= 1 && !options.inScaled) {
                                        z14 = false;
                                    }
                                    return new h4.g(bitmapDrawable, z14);
                                }
                                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    l.S(J10, th2);
                                    throw th3;
                                }
                            }
                        }
                        throw exc;
                    }
                    jVar = j.f31886c;
                    exc = abstractC4143r.f31867Z;
                    if (exc != null) {
                    }
                } else {
                    throw exc2;
                }
                break;
            case 13:
                return Float.valueOf(((Number) ((C6770i) ((AbstractC6763b) this.f21718Z)).getValue()).floatValue());
            case 14:
                return ((com.auth0.android.request.internal.b) this.f21718Z).b();
            case 15:
                u5.f fVar2 = (u5.f) this.f21718Z;
                AbstractC5091c abstractC5091c = fVar2.f46438i;
                fVar2.r();
                AbstractC3557B.c0("internalLogger", abstractC5091c);
                return new I5.k(abstractC5091c);
            case 16:
                return mo122invoke();
            case 17:
                return mo122invoke();
            case 18:
                return a();
            case 19:
                return a();
            case 20:
                return mo122invoke();
            case 21:
                return mo122invoke();
            case 22:
                ((R4.a) this.f21718Z).getClass();
                if (Build.VERSION.SDK_INT >= 24) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    startElapsedRealtime = Process.getStartElapsedRealtime();
                    j6 = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(elapsedRealtime - startElapsedRealtime);
                } else {
                    j6 = C4199i.f37138C;
                }
                return Long.valueOf(j6);
            case 23:
                return mo122invoke();
            case 24:
                return mo122invoke();
            case 25:
                return mo122invoke();
            case 26:
                return new N5.a(((d) this.f21718Z).d());
            case 27:
                return mo122invoke();
            case 28:
                return ((V6.b) this.f21718Z).b();
            default:
                return new C4696g(2, (Z6.a) this.f21718Z);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        String str;
        int i10 = this.f21717Y;
        Object obj = this.f21718Z;
        switch (i10) {
            case 16:
                return String.format(Locale.US, "Feature \"%s\" has no event receiver registered, ignoring event.", Arrays.copyOf(new Object[]{((y5.h) obj).f50813b.getName()}, 1));
            case 17:
                A5.b bVar = (A5.b) obj;
                String property = System.getProperty("http.agent");
                bVar.getClass();
                if (property != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = property.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        char charAt = property.charAt(i11);
                        if (charAt == '\t' || (' ' <= charAt && charAt < '\u007f')) {
                            sb2.append(charAt);
                        }
                    }
                    str = sb2.toString();
                    AbstractC3557B.b0("filterTo(StringBuilder(), predicate).toString()", str);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (!Lg.n.n2(str)) {
                    return str;
                }
                M5.a aVar = bVar.f664j0;
                String G10 = aVar.G();
                String D6 = aVar.D();
                String u10 = aVar.u();
                StringBuilder sb3 = new StringBuilder("Datadog/");
                android.gov.nist.core.a.y(sb3, bVar.f663i0, " (Linux; U; Android ", G10, "; ");
                sb3.append(D6);
                sb3.append(" Build/");
                sb3.append(u10);
                sb3.append(Separators.RPAREN);
                return sb3.toString();
            case 18:
            case 19:
            case 22:
            default:
                return String.format(Locale.US, "Already seen telemetry event with identity=%s, rejecting.", Arrays.copyOf(new Object[]{(A6.d) obj}, 1));
            case 20:
                return R.a.r("Unable to clear the NDK crash report file: ", ((d6.b) obj).f28019o0.getAbsolutePath());
            case 21:
                return String.format(Locale.US, "No RumMonitor for the SDK instance with name %s found, returning no-op implementation.", Arrays.copyOf(new Object[]{((AbstractC5092d) obj).getName()}, 1));
            case 23:
                return String.format(Locale.US, "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.", Arrays.copyOf(new Object[]{((L) obj).f40671b}, 1));
            case 24:
                C4920A c4920a = (C4920A) obj;
                return String.format(Locale.US, "RUM Action (%s on %s) was dropped, because another action is still active for the same view", Arrays.copyOf(new Object[]{c4920a.f40610j, c4920a.f40611k}, 2));
            case 25:
                return String.format(Locale.US, "The computed duration for the view: %s was 0 or negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{((a0) obj).f40782c.f40687c}, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.A, java.lang.Object] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        switch (this.f21717Y) {
            case 3:
                ((C1771m) this.f21718Z).f23007g.getValue();
                return;
            case 4:
            default:
                ((C5545H) this.f21718Z).p();
                return;
            case 5:
                C3153k c3153k = (C3153k) this.f21718Z;
                long longValue = ((Number) c3153k.f31104j0.mo122invoke()).longValue();
                ?? obj = new Object();
                ?? obj2 = new Object();
                synchronized (c3153k.f31106l0) {
                    obj.f37621Y = longValue - c3153k.f31108n0;
                    obj2.f37621Y = 1000000000 / c3153k.f31107m0;
                }
                l.O0(c3153k.f31100Y, null, null, new C3151i(obj, obj2, c3153k, longValue, null), 3);
                return;
        }
    }
}
