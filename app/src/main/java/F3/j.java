package f3;

import L2.G;
import L2.s;
import s2.u;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final f f29563a;

    /* renamed from: b  reason: collision with root package name */
    public G f29564b;

    /* renamed from: c  reason: collision with root package name */
    public s f29565c;

    /* renamed from: d  reason: collision with root package name */
    public h f29566d;

    /* renamed from: e  reason: collision with root package name */
    public long f29567e;

    /* renamed from: f  reason: collision with root package name */
    public long f29568f;

    /* renamed from: g  reason: collision with root package name */
    public long f29569g;

    /* renamed from: h  reason: collision with root package name */
    public int f29570h;

    /* renamed from: i  reason: collision with root package name */
    public int f29571i;

    /* renamed from: j  reason: collision with root package name */
    public U3.l f29572j = new U3.l((R.a) null);

    /* renamed from: k  reason: collision with root package name */
    public long f29573k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f29574l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f29575m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f3.f] */
    public j() {
        ?? obj = new Object();
        obj.f29551d = new g();
        obj.f29552e = new u(0, new byte[65025]);
        obj.f29549b = -1;
        this.f29563a = obj;
    }

    public void a(long j6) {
        this.f29569g = j6;
    }

    public abstract long b(u uVar);

    public abstract boolean c(u uVar, long j6, U3.l lVar);

    public void d(boolean z10) {
        if (z10) {
            this.f29572j = new U3.l((R.a) null);
            this.f29568f = 0L;
            this.f29570h = 0;
        } else {
            this.f29570h = 1;
        }
        this.f29567e = -1L;
        this.f29569g = 0L;
    }
}
