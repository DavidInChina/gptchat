package N7;

import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import y.AbstractC6463a;
import ze.AbstractC6848g;

/* loaded from: classes.dex */
public final class a extends IllegalStateException {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ int f12722Y = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, String str, Exception exc) {
        super(str, exc);
        if (i10 != 3) {
            return;
        }
        AbstractC3557B.c0("message", str);
        super(str, exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i10) {
        super(str);
        if (i10 == 3) {
            AbstractC3557B.c0("message", str);
            this(3, str, null);
        } else if (i10 != 4) {
            AbstractC3557B.c0("message", str);
        } else {
            AbstractC3557B.c0("message", str);
            super(str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(AbstractC6848g abstractC6848g) {
        super(AbstractC6463a.m(C.f37623a, abstractC6848g.getClass(), r0));
        StringBuilder sb2 = new StringBuilder("Failed to write body: ");
    }
}
