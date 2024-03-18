package C5;

import Lg.m;
import M3.H;
import id.AbstractC3557B;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import u5.k;
import y.AbstractC6463a;
import y5.h;
import z5.C6774a;

/* loaded from: classes2.dex */
public final class b implements c, B5.b {

    /* renamed from: Y  reason: collision with root package name */
    public final C6774a f2685Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G5.e f2686Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5091c f2687h0;

    /* renamed from: i0  reason: collision with root package name */
    public final O5.d f2688i0;

    /* renamed from: j0  reason: collision with root package name */
    public final S5.d f2689j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f2690k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AtomicBoolean f2691l0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r3.equals(r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r3.equals(r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        r3 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(String str, C6774a c6774a, G5.e eVar, AbstractC5091c abstractC5091c, O5.d dVar) {
        String str2;
        String str3;
        S5.c cVar = new S5.c(15.0f);
        AbstractC3557B.c0("featureName", str);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        AbstractC3557B.c0("dateTimeProvider", dVar);
        this.f2685Y = c6774a;
        this.f2686Z = eVar;
        this.f2687h0 = abstractC5091c;
        this.f2688i0 = dVar;
        this.f2689j0 = cVar;
        switch (str.hashCode()) {
            case -1067396926:
                if (str.equals("tracing")) {
                    str2 = "trace";
                    break;
                }
                str2 = null;
                break;
            case 113290:
                str3 = "rum";
                break;
            case 3327407:
                str3 = "logs";
                break;
            case 456014590:
                if (str.equals("session-replay")) {
                    str2 = "sr";
                    break;
                }
                str2 = null;
                break;
            default:
                str2 = null;
                break;
        }
        this.f2690k0 = str2;
        this.f2691l0 = new AtomicBoolean(true);
    }

    public static Long e(File file, AbstractC5091c abstractC5091c) {
        String name = file.getName();
        AbstractC3557B.b0("this.name", name);
        Long X12 = m.X1(name);
        if (X12 == null) {
            P4.a.m0(abstractC5091c, 5, EnumC5090b.f42739Z, new u5.e(file, 1), null, false, 56);
        }
        return X12;
    }

    public static String f(File file) {
        String str;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            str = parentFile.getName();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (H5.d.f7457n0.b(str)) {
            Locale locale = Locale.US;
            return AbstractC6463a.j("US", locale, "PENDING", locale, "this as java.lang.String).toLowerCase(locale)");
        } else if (!H5.d.f7456m0.b(str)) {
            return null;
        } else {
            Locale locale2 = Locale.US;
            return AbstractC6463a.j("US", locale2, "GRANTED", locale2, "this as java.lang.String).toLowerCase(locale)");
        }
    }

    @Override // C5.c
    public final void N(File file, a aVar) {
        r5.d dVar;
        AbstractC5368c h10;
        String str = this.f2690k0;
        if (str != null && ((S5.c) this.f2689j0).b()) {
            AbstractC5091c abstractC5091c = this.f2687h0;
            if (AbstractC4344b.g0(file, abstractC5091c)) {
                Long e10 = e(file, abstractC5091c);
                Map map = null;
                if (e10 != null) {
                    long longValue = aVar.f2682a - e10.longValue();
                    if (longValue >= 0) {
                        map = AbstractC4268D.a1(new C3959i("track", str), new C3959i("metric_type", "batch closed"), new C3959i("batch_duration", Long.valueOf(longValue)), new C3959i("uploader_window", Long.valueOf(this.f2686Z.f6055a)), new C3959i("batch_size", Long.valueOf(AbstractC4344b.D0(file, abstractC5091c))), new C3959i("batch_events_count", Long.valueOf(aVar.f2684c)), new C3959i("forced_new", Boolean.valueOf(aVar.f2683b)), new C3959i("consent", f(file)), new C3959i("filename", file.getName()), new C3959i("thread", Thread.currentThread().getName()));
                    }
                }
                if (map != null && (dVar = ((k) abstractC5091c).f46444b) != null && (h10 = dVar.h("rum")) != null) {
                    ((h) h10).a(AbstractC4268D.a1(new C3959i("type", "mobile_metric"), new C3959i("message", "[Mobile Metric] Batch Closed"), new C3959i("additionalProperties", map)));
                }
            }
        }
    }

    @Override // C5.c
    public final void O(File file, H h10) {
        r5.d dVar;
        AbstractC5368c h11;
        AbstractC3557B.c0("batchFile", file);
        String str = this.f2690k0;
        if (str != null && ((S5.c) this.f2689j0).b()) {
            AbstractC5091c abstractC5091c = this.f2687h0;
            Long e10 = e(file, abstractC5091c);
            Map map = null;
            if (e10 != null) {
                long z10 = this.f2688i0.z() - e10.longValue();
                if (z10 >= 0) {
                    C3959i c3959i = new C3959i("track", str);
                    C3959i c3959i2 = new C3959i("metric_type", "batch deleted");
                    C3959i c3959i3 = new C3959i("batch_age", Long.valueOf(z10));
                    C6774a c6774a = this.f2685Y;
                    map = AbstractC4268D.a1(c3959i, c3959i2, c3959i3, new C3959i("uploader_delay", AbstractC4268D.a1(new C3959i("min", Long.valueOf(c6774a.f51738c)), new C3959i("max", Long.valueOf(c6774a.f51739d)))), new C3959i("uploader_window", Long.valueOf(this.f2686Z.f6055a)), new C3959i("batch_removal_reason", h10.toString()), new C3959i("in_background", Boolean.valueOf(this.f2691l0.get())), new C3959i("consent", f(file)), new C3959i("filename", file.getName()), new C3959i("thread", Thread.currentThread().getName()));
                }
            }
            if (map != null && (dVar = ((k) abstractC5091c).f46444b) != null && (h11 = dVar.h("rum")) != null) {
                ((h) h11).a(AbstractC4268D.a1(new C3959i("type", "mobile_metric"), new C3959i("message", "[Mobile Metric] Batch Deleted"), new C3959i("additionalProperties", map)));
            }
        }
    }

    @Override // B5.b
    public final void a() {
        this.f2691l0.set(true);
    }

    @Override // B5.b
    public final void c() {
        this.f2691l0.set(false);
    }

    @Override // B5.b
    public final void b() {
    }

    @Override // B5.b
    public final void d() {
    }
}
