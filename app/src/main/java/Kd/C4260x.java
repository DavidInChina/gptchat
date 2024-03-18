package kd;

import ge.C3257a;
import id.AbstractC3557B;
import j0.C3885a;
import java.util.concurrent.TimeUnit;

/* renamed from: kd.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4260x extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4260x f37366Z = new C4260x(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4260x f37367h0 = new C4260x(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37368Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4260x(int i10) {
        super(1);
        this.f37368Y = i10;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.o, wf.k] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f37368Y) {
            case 0:
                ke.d dVar = (ke.d) obj;
                AbstractC3557B.c0("$this$engine", dVar);
                Wh.v vVar = new Wh.v();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                AbstractC3557B.c0("unit", timeUnit);
                vVar.f21263A = Xh.b.b("interval", 20L, timeUnit);
                dVar.f37380b = new Wh.w(vVar);
                return yVar;
            default:
                ge.f fVar = (ge.f) obj;
                AbstractC3557B.c0("$this$config", fVar);
                fVar.f31609d = new C3885a(fVar.f31609d, f37366Z, 4);
                fVar.a(se.j.f45568d, C3257a.f31583i0);
                return yVar;
        }
    }
}
