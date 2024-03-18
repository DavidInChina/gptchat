package Qd;

import Ng.C1057d0;
import Sg.C1394f;
import id.AbstractC3557B;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l8.AbstractC4344b;

/* renamed from: Qd.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1182a implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final Li.q f14585Y = new Li.q();

    /* renamed from: Z  reason: collision with root package name */
    public final C1394f f14586Z = Ad.l.g(AbstractC4344b.Q0(Bi.c.z(), new S0.x(1)));

    /* renamed from: h0  reason: collision with root package name */
    public final C1057d0 f14587h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1057d0 f14588i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1057d0 f14589j0;

    public C1182a() {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC3557B.b0("newCachedThreadPool()", newCachedThreadPool);
        this.f14587h0 = new C1057d0(newCachedThreadPool);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("newSingleThreadExecutor()", newSingleThreadExecutor);
        this.f14588i0 = new C1057d0(newSingleThreadExecutor);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        AbstractC3557B.b0("newFixedThreadPool(2)", newFixedThreadPool);
        this.f14589j0 = new C1057d0(newFixedThreadPool);
    }

    @Override // Qd.m
    public final Ng.B a() {
        return this.f14588i0;
    }

    @Override // Qd.m
    public final Ng.F b() {
        return this.f14586Z;
    }

    @Override // Qd.m
    public final Ng.B c() {
        return this.f14589j0;
    }

    @Override // Qd.m
    public final Ng.B d() {
        return this.f14587h0;
    }

    @Override // Qd.m
    public final Li.q e() {
        return this.f14585Y;
    }
}
