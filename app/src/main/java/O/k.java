package O;

import jf.y;
import kotlin.jvm.internal.o;
import z.C6681V;

/* loaded from: classes.dex */
public final class k extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final k f13264Z = new k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final k f13265h0 = new k(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13266Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(1);
        this.f13266Y = i10;
    }

    public final void a(C6681V c6681v) {
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        switch (this.f13266Y) {
            case 0:
                c6681v.f51194a = 1332;
                c6681v.a(0, valueOf2).f51192b = l.f13268b;
                c6681v.a(666, valueOf);
                return;
            default:
                c6681v.f51194a = 1332;
                c6681v.a(666, valueOf2).f51192b = l.f13268b;
                c6681v.a(c6681v.f51194a, valueOf);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f13266Y) {
            case 0:
                a((C6681V) obj);
                return yVar;
            default:
                a((C6681V) obj);
                return yVar;
        }
    }
}
