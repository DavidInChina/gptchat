package y2;

import android.content.Context;
import android.os.Looper;
import p2.C5052e;
import s2.AbstractC5530A;
import s2.AbstractC5532b;

/* renamed from: y2.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6531s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f50680a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.w f50681b;

    /* renamed from: c  reason: collision with root package name */
    public final w8.l f50682c;

    /* renamed from: d  reason: collision with root package name */
    public w8.l f50683d;

    /* renamed from: e  reason: collision with root package name */
    public final w8.l f50684e;

    /* renamed from: f  reason: collision with root package name */
    public final w8.l f50685f;

    /* renamed from: g  reason: collision with root package name */
    public final w8.l f50686g;

    /* renamed from: h  reason: collision with root package name */
    public final w8.f f50687h;

    /* renamed from: i  reason: collision with root package name */
    public final Looper f50688i;

    /* renamed from: j  reason: collision with root package name */
    public C5052e f50689j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f50690k;

    /* renamed from: l  reason: collision with root package name */
    public final int f50691l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f50692m;

    /* renamed from: n  reason: collision with root package name */
    public final l0 f50693n;

    /* renamed from: o  reason: collision with root package name */
    public final C6522i f50694o;

    /* renamed from: p  reason: collision with root package name */
    public final long f50695p;

    /* renamed from: q  reason: collision with root package name */
    public final long f50696q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f50697r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f50698s;

    public C6531s(Context context, w8.l lVar, w8.l lVar2) {
        C6529p c6529p = new C6529p(context, 2);
        r rVar = new r(0);
        C6529p c6529p2 = new C6529p(context, 3);
        p2.Y y10 = new p2.Y(0);
        context.getClass();
        this.f50680a = context;
        this.f50682c = lVar;
        this.f50683d = lVar2;
        this.f50684e = c6529p;
        this.f50685f = rVar;
        this.f50686g = c6529p2;
        this.f50687h = y10;
        int i10 = AbstractC5530A.f45131a;
        Looper myLooper = Looper.myLooper();
        this.f50688i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f50689j = C5052e.f42005l0;
        this.f50691l = 1;
        this.f50692m = true;
        this.f50693n = l0.f50651c;
        this.f50694o = new C6522i(AbstractC5530A.C(20L), AbstractC5530A.C(500L), 0.999f);
        this.f50681b = AbstractC5532b.f45146a;
        this.f50695p = 500L;
        this.f50696q = 2000L;
        this.f50697r = true;
    }
}
