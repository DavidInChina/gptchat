package u5;

import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import o5.AbstractC4918b;

/* renamed from: u5.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5842b extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5842b f46415Z = new C5842b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5842b f46416h0 = new C5842b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46417Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5842b(int i10) {
        super(1);
        this.f46417Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10 = false;
        int i10 = this.f46417Y;
        switch (i10) {
            case 0:
                r5.d dVar = (r5.d) obj;
                AbstractC3557B.c0("it", dVar);
                return new k(dVar);
            case 1:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 1:
                        return Boolean.TRUE;
                    default:
                        if (intValue >= AbstractC4918b.f40605c) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                }
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i10) {
                    case 1:
                        return Boolean.TRUE;
                    default:
                        if (intValue2 >= AbstractC4918b.f40605c) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                }
        }
    }
}
