package Ii;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final x f8699Z = new x(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final x f8700h0 = new x(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final x f8701i0 = new x(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final x f8702j0 = new x(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final x f8703k0 = new x(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final x f8704l0 = new x(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final x f8705m0 = new x(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8706Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10) {
        super(2);
        this.f8706Y = i10;
    }

    public final Hi.c a(Hi.c cVar, Hi.b bVar) {
        switch (this.f8706Y) {
            case 0:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, null, null, bVar, null, null, null, null, null, -16777217);
            case 1:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, null, null, null, bVar, null, null, null, null, -33554433);
            case 2:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, null, null, null, null, bVar, null, null, null, -67108865);
            case 3:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, null, null, null, null, null, bVar, null, null, -134217729);
            case 4:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, null, null, null, null, null, null, bVar, null, -268435457);
            case 5:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, null, bVar, null, null, null, null, null, null, -8388609);
            default:
                AbstractC3557B.c0("appStart", cVar);
                AbstractC3557B.c0("activityEvent", bVar);
                return Hi.c.a(cVar, null, null, null, null, null, null, bVar, null, null, null, null, null, null, null, -4194305);
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f8706Y) {
            case 0:
                return a((Hi.c) obj, (Hi.b) obj2);
            case 1:
                return a((Hi.c) obj, (Hi.b) obj2);
            case 2:
                return a((Hi.c) obj, (Hi.b) obj2);
            case 3:
                return a((Hi.c) obj, (Hi.b) obj2);
            case 4:
                return a((Hi.c) obj, (Hi.b) obj2);
            case 5:
                return a((Hi.c) obj, (Hi.b) obj2);
            default:
                return a((Hi.c) obj, (Hi.b) obj2);
        }
    }
}
