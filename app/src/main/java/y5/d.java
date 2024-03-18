package y5;

import M5.j;
import Wh.C1663h;
import Wh.w;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.AbstractC4194d;
import o5.EnumC4919c;
import p5.AbstractC5091c;
import wf.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: G  reason: collision with root package name */
    public static final long f50774G;

    /* renamed from: H  reason: collision with root package name */
    public static final long f50775H;

    /* renamed from: I  reason: collision with root package name */
    public static final C1663h[] f50776I = {C1663h.f21204r, C1663h.f21205s, C1663h.f21206t, C1663h.f21200n, C1663h.f21201o, C1663h.f21198l, C1663h.f21199m};

    /* renamed from: A  reason: collision with root package name */
    public File f50777A;

    /* renamed from: B  reason: collision with root package name */
    public M5.a f50778B;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f50783a;

    /* renamed from: b  reason: collision with root package name */
    public final k f50784b;

    /* renamed from: l  reason: collision with root package name */
    public w f50794l;

    /* renamed from: m  reason: collision with root package name */
    public X8.a f50795m;

    /* renamed from: y  reason: collision with root package name */
    public ScheduledThreadPoolExecutor f50807y;

    /* renamed from: z  reason: collision with root package name */
    public ExecutorService f50808z;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f50785c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f50786d = new WeakReference(null);

    /* renamed from: e  reason: collision with root package name */
    public D5.a f50787e = new D5.a(kf.w.f37484Y);

    /* renamed from: f  reason: collision with root package name */
    public E5.e f50788f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public j f50789g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public O5.d f50790h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public K5.a f50791i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public P5.b f50792j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public AbstractC6542a f50793k = new Object();

    /* renamed from: n  reason: collision with root package name */
    public String f50796n = "";

    /* renamed from: o  reason: collision with root package name */
    public String f50797o = "";

    /* renamed from: p  reason: collision with root package name */
    public M5.b f50798p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public String f50799q = "";

    /* renamed from: r  reason: collision with root package name */
    public String f50800r = "android";

    /* renamed from: s  reason: collision with root package name */
    public String f50801s = "2.6.2";

    /* renamed from: t  reason: collision with root package name */
    public boolean f50802t = true;

    /* renamed from: u  reason: collision with root package name */
    public String f50803u = "";

    /* renamed from: v  reason: collision with root package name */
    public String f50804v = "";

    /* renamed from: D  reason: collision with root package name */
    public int f50780D = 2;

    /* renamed from: E  reason: collision with root package name */
    public int f50781E = 2;

    /* renamed from: F  reason: collision with root package name */
    public final int f50782F = 2;

    /* renamed from: w  reason: collision with root package name */
    public d6.d f50805w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public EnumC4919c f50806x = EnumC4919c.US1;

    /* renamed from: C  reason: collision with root package name */
    public final ConcurrentHashMap f50779C = new ConcurrentHashMap();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f50774G = timeUnit.toMillis(45L);
        f50775H = timeUnit.toMillis(5L);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [d6.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [E5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [M5.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [O5.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, K5.a] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, P5.b] */
    /* JADX WARN: Type inference failed for: r2v9, types: [y5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, M5.b] */
    public d(AbstractC5091c abstractC5091c, k kVar) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        AbstractC3557B.c0("persistenceExecutorServiceFactory", kVar);
        this.f50783a = abstractC5091c;
        this.f50784b = kVar;
    }

    public final G5.e a() {
        return new G5.e(AbstractC4194d.r(this.f50780D), 4194304L, 524288L, 500, 64800000L, 536870912L, 1000L);
    }

    public final ExecutorService b() {
        ExecutorService executorService = this.f50808z;
        if (executorService != null) {
            return executorService;
        }
        AbstractC3557B.C2("persistenceExecutorService");
        throw null;
    }

    public final File c() {
        File file = this.f50777A;
        if (file != null) {
            return file;
        }
        AbstractC3557B.C2("storageDir");
        throw null;
    }
}
