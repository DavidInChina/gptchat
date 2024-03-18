package x3;

import de.C2631f;
import id.AbstractC3557B;

/* renamed from: x3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6272b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48669Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f48670Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6272b(int i10, int i11) {
        super(1);
        this.f48669Y = i11;
        this.f48670Z = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f48669Y;
        int i11 = this.f48670Z;
        switch (i10) {
            case 0:
                B3.b bVar = (B3.b) obj;
                AbstractC3557B.c0("db", bVar);
                bVar.s(i11);
                return null;
            case 1:
                int intValue = ((Number) obj).intValue();
                return new C2631f(intValue % i11, (intValue / i11) + 1);
            case 2:
                ((Number) obj).intValue();
                switch (i10) {
                    case 2:
                        return Integer.valueOf(i11);
                    default:
                        return Integer.valueOf(i11);
                }
            case 3:
                ((Number) obj).intValue();
                switch (i10) {
                    case 2:
                        return Integer.valueOf(i11);
                    default:
                        return Integer.valueOf(i11);
                }
            default:
                ((Number) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i11 + '.');
        }
    }
}
