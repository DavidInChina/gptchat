package Zg;

import bh.C2211a;
import dh.C2686L;
import dh.S;
import id.AbstractC3557B;
import jf.y;
import kf.v;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class d extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f23739Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f23740h0 = new d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f23741i0 = new d(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23742Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f23742Y = i10;
    }

    public final void a(C2211a c2211a) {
        v vVar = v.f37483Y;
        switch (this.f23742Y) {
            case 0:
                AbstractC3557B.c0("$this$buildClassSerialDescriptor", c2211a);
                C2686L c2686l = C2686L.f28406a;
                c2211a.a("days", C2686L.f28407b, vVar, false);
                return;
            case 1:
                AbstractC3557B.c0("$this$buildClassSerialDescriptor", c2211a);
                C2686L c2686l2 = C2686L.f28406a;
                c2211a.a("months", C2686L.f28407b, vVar, false);
                return;
            default:
                AbstractC3557B.c0("$this$buildClassSerialDescriptor", c2211a);
                S s10 = S.f28417a;
                c2211a.a("nanoseconds", S.f28418b, vVar, false);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f23742Y) {
            case 0:
                a((C2211a) obj);
                return yVar;
            case 1:
                a((C2211a) obj);
                return yVar;
            default:
                a((C2211a) obj);
                return yVar;
        }
    }
}
