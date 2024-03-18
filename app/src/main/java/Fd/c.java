package Fd;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f5239Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f5240h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f5241i0 = new c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final c f5242j0 = new c(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5243Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f5243Y = i10;
    }

    public final Boolean a(u uVar) {
        switch (this.f5243Y) {
            case 0:
                AbstractC3557B.c0("it", uVar);
                return Boolean.valueOf(uVar.f5284d);
            case 1:
                AbstractC3557B.c0("it", uVar);
                return uVar.f5282b;
            default:
                AbstractC3557B.c0("it", uVar);
                return Boolean.valueOf(uVar.f5285e);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f5243Y) {
            case 0:
                return a((u) obj);
            case 1:
                return a((u) obj);
            case 2:
                return a((u) obj);
            default:
                Ed.m mVar = (Ed.m) obj;
                return jf.y.f36177a;
        }
    }
}
