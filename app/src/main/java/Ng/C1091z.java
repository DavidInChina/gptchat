package Ng;

import nf.AbstractC4829i;

/* renamed from: Ng.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091z extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1091z f12997Z = new C1091z(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1091z f12998h0 = new C1091z(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12999Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1091z(int i10) {
        super(1);
        this.f12999Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f12999Y) {
            case 0:
                AbstractC4829i abstractC4829i = (AbstractC4829i) obj;
                if (!(abstractC4829i instanceof B)) {
                    return null;
                }
                return (B) abstractC4829i;
            default:
                AbstractC4829i abstractC4829i2 = (AbstractC4829i) obj;
                if (!(abstractC4829i2 instanceof AbstractC1055c0)) {
                    return null;
                }
                return (AbstractC1055c0) abstractC4829i2;
        }
    }
}
