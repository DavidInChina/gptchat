package y2;

import E2.AbstractC0491x;

/* renamed from: y2.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6530q implements w8.l {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50677Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f50678Z;

    public /* synthetic */ C6530q(int i10, Object obj) {
        this.f50677Y = i10;
        this.f50678Z = obj;
    }

    @Override // w8.l
    public final Object get() {
        int i10 = this.f50677Y;
        Object obj = this.f50678Z;
        switch (i10) {
            case 0:
                return (k0) obj;
            case 1:
                return Boolean.valueOf(((C6510M) obj).f50412D0);
            default:
                try {
                    return (AbstractC0491x) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
