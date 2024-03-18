package Kd;

import id.AbstractC3557B;

/* renamed from: Kd.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0825a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0825a f9724Z = new C0825a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0825a f9725h0 = new C0825a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9726Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0825a(int i10) {
        super(1);
        this.f9726Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f9726Y) {
            case 0:
                AbstractC3557B.c0("it", (byte[]) obj);
                return jf.y.f36177a;
            default:
                Wd.h hVar = (Wd.h) obj;
                AbstractC3557B.c0("it", hVar);
                return hVar.a();
        }
    }
}
